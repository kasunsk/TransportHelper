package com.kasun.transport.common.genaric;

import com.kasun.transport.common.dto.TenantMassage;

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
