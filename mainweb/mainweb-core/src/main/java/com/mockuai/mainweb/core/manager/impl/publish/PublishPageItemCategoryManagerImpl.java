package com.mockuai.mainweb.core.manager.impl.publish;

import com.mockuai.mainweb.common.constant.ResponseCode;
import com.mockuai.mainweb.core.dao.publish.PublishPageItemCategoryDAO;
import com.mockuai.mainweb.core.domain.PageItemCategoryDO;
import com.mockuai.mainweb.core.exception.MainWebException;
import com.mockuai.mainweb.core.manager.publish.PublishPageItemCategoryManager;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016/9/21.
 */
@Service
public class PublishPageItemCategoryManagerImpl implements PublishPageItemCategoryManager {


    @Resource
    private PublishPageItemCategoryDAO pageItemCategoryDAO;


    @Override
    public Long addPageItemCategory(PageItemCategoryDO pageItemCategoryDO) throws MainWebException {
        try {
            return pageItemCategoryDAO.addPageItemCategory(pageItemCategoryDO);
        } catch (SQLException e) {
            throw  new MainWebException(ResponseCode.SYS_E_DB_INSERT,  e);
        }
    }



    @Override
    public PageItemCategoryDO getPageItemCategory(Long pageBlockId) throws MainWebException {
        try {
            return pageItemCategoryDAO.getPageItemCategory(pageBlockId);
        } catch (SQLException e) {
            throw  new MainWebException(ResponseCode.SYS_E_DB_QUERY,  e);
        }
    }

    @Override
    public Integer deleteByPageId(Long id) throws MainWebException {
        try {
            return pageItemCategoryDAO.deleteByPageId(id);
        } catch (SQLException e) {
            throw  new MainWebException(ResponseCode.SYS_E_DB_DELETE,  e);
        }
    }
}
