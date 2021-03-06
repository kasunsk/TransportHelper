package com.kasun.app.transport.application.common.genaric;

import com.kasun.app.transport.application.common.dto.TenantMassage;
import com.kasun.app.transport.application.common.exceptions.ServiceError;

/**
 * Created by kasunk on 5/3/16.
 */
public class ServiceResponse<T> extends TenantMassage {

    private T payload;
    private ServiceError error;

    public ServiceResponse() {
    }

    public ServiceResponse(T payload) {
        this.payload = payload;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public ServiceError getError() {
        return error;
    }

    public void setError(ServiceError error) {
        this.error = error;
    }
}
