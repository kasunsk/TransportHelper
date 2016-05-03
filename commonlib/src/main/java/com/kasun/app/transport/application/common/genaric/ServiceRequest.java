package com.kasun.app.transport.application.common.genaric;

import com.kasun.app.transport.application.common.dto.TenantMassage;

/**
 * Created by kasunk on 5/3/16.
 */
public class ServiceRequest<T> extends TenantMassage {

    private T payload;

    public ServiceRequest() {
    }

    public ServiceRequest(T payload) {
        this.payload = payload;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }
}
