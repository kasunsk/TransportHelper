package com.kasun.app.transport.application.common.dto;

/**
 * Created by kasunk on 5/3/16.
 */

public class TenantParam {

    private String tenantCode;

    public TenantParam(String tenantCode) {
        this.tenantCode = tenantCode;
    }

    public String getTenantCode() {
        return tenantCode;
    }

    public void setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
    }
}
