package com.kasun.app.transport.application.common.dto;

import java.io.Serializable;

/**
 * Created by kasunk on 5/3/16.
 */
public class TenantMassage implements Serializable{

    private String tenant;

    private String userToken;

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getUserToken() {
        return userToken;
    }

    public void setUserToken(String userToken) {
        this.userToken = userToken;
    }
}
