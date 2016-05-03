package com.kasun.transport.api.carpool.service;

import com.kasun.transport.api.carpool.dto.Carpool;
import com.kasun.transport.common.genaric.ServiceRequest;
import com.kasun.transport.common.genaric.ServiceResponse;

/**
 * Created by kasunk on 5/3/16.
 */
public interface CarpoolService {

    ServiceResponse<Carpool> createCarpool(ServiceRequest<Carpool> carpoolServiceRequest);
}
