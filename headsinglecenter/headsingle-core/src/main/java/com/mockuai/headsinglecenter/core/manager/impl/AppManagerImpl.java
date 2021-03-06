package com.mockuai.headsinglecenter.core.manager.impl;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.mockuai.appcenter.client.AppClient;
import com.mockuai.appcenter.common.api.Response;
import com.mockuai.appcenter.common.constant.AppTypeEnum;
import com.mockuai.appcenter.common.domain.AppInfoDTO;
import com.mockuai.appcenter.common.domain.BizInfoDTO;
import com.mockuai.headsinglecenter.common.constant.ResponseCode;
import com.mockuai.headsinglecenter.core.exception.HeadSingleException;
import com.mockuai.headsinglecenter.core.manager.AppManager;

/**
 * Created by zengzhangqiang on 6/28/15.
 */
@Component("appManager")
public class AppManagerImpl implements AppManager {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppManagerImpl.class);

    @Resource
    private AppClient appClient;

    @Override
    public BizInfoDTO getBizInfo(String bizCode) throws HeadSingleException {

        if (StringUtils.isBlank(bizCode)) {
            throw new HeadSingleException(ResponseCode.PARAMETER_NULL.getCode(), "bizCode is null");
        }

        try {
            Response<BizInfoDTO> getResult = appClient.getBizInfo(bizCode);
            if (getResult.getCode() != com.mockuai.appcenter.common.constant.ResponseCode.RESPONSE_SUCCESS.getCode()) {
                LOGGER.error("error to get bizInfo, bizCode:{}, errorCode:{}, errorMsg:{}",
                        bizCode, getResult.getCode(), getResult.getMessage());
                return null;
            }

            return getResult.getModule();
        } catch (Exception e) {
            LOGGER.error("failed when getting bizCode : {}", bizCode, e);
            throw new HeadSingleException(ResponseCode.SERVICE_EXCEPTION);
        }
    }

    @Override
    public AppInfoDTO getAppInfo(String appKey) throws HeadSingleException {

        if (StringUtils.isBlank(appKey)) {
            throw new HeadSingleException(ResponseCode.PARAMETER_NULL.getCode(), "appKey is null");
        }

        try {
            Response<AppInfoDTO> getResult = appClient.getAppInfo(appKey);
            if (getResult.getCode() != com.mockuai.appcenter.common.constant.ResponseCode.RESPONSE_SUCCESS.getCode()) {
                LOGGER.error("error to get appInfo, appKey:{}, errorCode:{}, errorMsg:{}",
                        appKey, getResult.getCode(), getResult.getMessage());
                return null;
            }

            return getResult.getModule();
        } catch (Exception e) {
            LOGGER.error("failed when getting appInfo, appKey:{}", appKey, e);
            throw new HeadSingleException(ResponseCode.SERVICE_EXCEPTION);
        }
    }

    @Override
    public String getAppKeyByBizCode(String bizCode) throws HeadSingleException {
        if (StringUtils.isBlank(bizCode)) {
            throw new HeadSingleException(ResponseCode.PARAMETER_NULL, "bizCode is null");
        }
        try {
            Response<AppInfoDTO> response = appClient.getAppInfoByType(bizCode, AppTypeEnum.APP_WAP);
            if (response.isSuccess()) {
                if (response.getModule() != null) {
                    return response.getModule().getAppKey();
                } else {
                    return null;
                }
            } else {
                LOGGER.error("error to get appInfo, bizCode : {}, errorCode {}, errorMsg : {}",
                        bizCode, response.getCode(), response.getMessage());
                throw new HeadSingleException(ResponseCode.SERVICE_EXCEPTION);
            }
        } catch (HeadSingleException e) {
            throw new HeadSingleException(ResponseCode.SERVICE_EXCEPTION);
        }
    }
}