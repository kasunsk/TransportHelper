package com.kasun.transport.carpool.services;

import com.kasun.transport.api.carpool.dto.Carpool;
import com.kasun.transport.api.carpool.service.CarpoolService;
import com.kasun.transport.carpool.logic.CarpoolCreationLogic;
import com.kasun.transport.common.genaric.ServiceRequest;
import com.kasun.transport.common.genaric.ServiceResponse;
import com.kasun.transport.common.genaric.util.ServiceResponseAssembler;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by kasunk on 5/3/16.
 */
public class CarpoolServiceImpl implements CarpoolService {

    private CarpoolCreationLogic carpoolCreationLogic;

    @Override
    public ServiceResponse<Carpool> createCarpool(ServiceRequest<Carpool> carpoolServiceRequest) {
        return ServiceResponseAssembler.assemble(carpoolCreationLogic, carpoolServiceRequest);
    }

    @Required
    public void setCarpoolCreationLogic(CarpoolCreationLogic carpoolCreationLogic) {
        this.carpoolCreationLogic = carpoolCreationLogic;
    }
}
