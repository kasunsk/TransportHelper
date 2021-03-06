package com.kasun.app.transport.application.common.genaric.util;

import com.kasun.app.transport.application.common.genaric.ServiceRequest;
import com.kasun.app.transport.application.common.genaric.ServiceResponse;

/**
 * Created by kasunk on 5/3/16.
 */
public abstract class ServiceResponseAssembler {
    public ServiceResponseAssembler() {
    }

    public static <T, V> ServiceResponse<T> assemble(ServiceLogic<T, V> serviceLogic, ServiceRequest<V> serviceRequest) {
        ServiceResponse response = new ServiceResponse();
        Object result = serviceLogic.invoke(serviceRequest.getPayload());
        response.setPayload(result);
        return response;
    }
}
