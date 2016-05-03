package com.kasun.app.transport.carpool.services;

import com.kasun.app.transport.application.api.carpool.dto.Carpool;
import com.kasun.app.transport.application.api.carpool.service.CarpoolService;
import com.kasun.app.transport.application.common.genaric.ServiceRequest;
import com.kasun.app.transport.carpool.logic.CarpoolCreationLogic;
import com.kasun.app.transport.application.common.genaric.ServiceResponse;
import com.kasun.app.transport.application.common.genaric.util.ServiceResponseAssembler;
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
