package com.kasun.app.transport.application.api.carpool.service;

import com.kasun.app.transport.application.api.carpool.dto.Carpool;
import com.kasun.app.transport.application.common.genaric.ServiceRequest;
import com.kasun.app.transport.application.common.genaric.ServiceResponse;

/**
 * Created by kasunk on 5/3/16.
 */
public interface CarpoolService {

    ServiceResponse<Carpool> createCarpool(ServiceRequest<Carpool> carpoolServiceRequest);
}
