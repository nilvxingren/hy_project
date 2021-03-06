package com.mockuai.usercenter.mop.api.action;

import com.mockuai.mop.common.constant.ActionAuthLevel;
import com.mockuai.mop.common.constant.HttpMethodLimit;
import com.mockuai.mop.common.service.action.MopResponse;
import com.mockuai.mop.common.service.action.Request;
import com.mockuai.usercenter.common.action.ActionEnum;
import com.mockuai.usercenter.common.api.BaseRequest;
import com.mockuai.usercenter.common.api.Response;
import com.mockuai.usercenter.common.constant.UserAuthType;
import com.mockuai.usercenter.common.dto.UserAuthInfoDTO;
import com.mockuai.usercenter.mop.api.util.JsonUtil;
import com.mockuai.usercenter.mop.api.util.MopApiUtil;

/**
 * Created by duanyytop on 15/5/14.
 * 修改买家认证信息。咱不对外提供修改卖家认证信息的接口
 */
public class UpdateUserAuthAction extends BaseAction{

    public MopResponse execute(Request request) {
        Long userId = (Long)request.getAttribute("user_id");
        String src = (String)request.getParam("auth_info");
        String appKey = (String)request.getParam("app_key");
        UserAuthInfoDTO userAuthInfoDTO = JsonUtil.parseJson(src, UserAuthInfoDTO.class);
        userAuthInfoDTO.setUserId(userId);
        //设置买家认证类型
        userAuthInfoDTO.setType(UserAuthType.BUYER_AUTH.getValue());
        com.mockuai.usercenter.common.api.Request userReq = new BaseRequest();
        userReq.setParam("userAuthInfoDTO", userAuthInfoDTO);
        userReq.setParam("appKey", appKey);
        userReq.setCommand(ActionEnum.UPDATE_USER_AUTH_INFO.getActionName());
        Response<UserAuthInfoDTO> userResp = this.getUserDispatchService().execute(userReq);
        return MopApiUtil.transferResp(userResp);
    }

    public String getName() {
        return "/user/auth/update";
    }

    public ActionAuthLevel getAuthLevel() {
        return ActionAuthLevel.AUTH_LOGIN;
    }

    public HttpMethodLimit getMethodLimit() {
        return HttpMethodLimit.ONLY_POST;
    }

}
