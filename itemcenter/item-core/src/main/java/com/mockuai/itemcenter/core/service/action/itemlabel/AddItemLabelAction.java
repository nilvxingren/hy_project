package com.mockuai.itemcenter.core.service.action.itemlabel;

import com.mockuai.itemcenter.common.api.ItemResponse;
import com.mockuai.itemcenter.common.constant.ActionEnum;
import com.mockuai.itemcenter.common.constant.ResponseCode;
import com.mockuai.itemcenter.common.domain.dto.ItemLabelDTO;
import com.mockuai.itemcenter.common.domain.dto.ValueAddedServiceTypeDTO;
import com.mockuai.itemcenter.core.exception.ItemException;
import com.mockuai.itemcenter.core.manager.ItemLabelManager;
import com.mockuai.itemcenter.core.manager.ItemManager;
import com.mockuai.itemcenter.core.manager.ValueAddedServiceManager;
import com.mockuai.itemcenter.core.service.ItemRequest;
import com.mockuai.itemcenter.core.service.RequestContext;
import com.mockuai.itemcenter.core.service.action.TransAction;
import com.mockuai.itemcenter.core.util.ExceptionUtil;
import com.mockuai.itemcenter.core.util.ResponseUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yindingyu on 15/12/7.
 */
@Service
public class AddItemLabelAction extends TransAction{

    @Resource
    private ItemLabelManager itemLabelManager;

    @Resource
    private ItemManager itemManager;

    @Override
    protected ItemResponse doTransaction(RequestContext context) throws ItemException {

        ItemRequest request = context.getRequest();

        String bizCode = (String)context.get("bizCode");

        if(request.getObject("itemLabelDTO")==null){
            throw ExceptionUtil.getException(ResponseCode.PARAM_E_MISSING,"itemLabelDTO不能为空");
        }

        ItemLabelDTO itemLabelDTO = request.getObject("itemLabelDTO",ItemLabelDTO.class);

        itemLabelDTO.setBizCode(bizCode);

        Long result = itemLabelManager.addItemLabel(itemLabelDTO);



        return ResponseUtil.getSuccessResponse(result);

    }



    @Override
    public String getName() {
        return ActionEnum.ADD_ITEM_LABEL.getActionName();
    }
}
