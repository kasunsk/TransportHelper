package com.kasun.app.transport.application.common.model;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.util.Date;

/**
 * Created by kasunk on 5/3/16.
 */
public class AbstractEntity {

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "CREATED_DATE", insertable = false, updatable = false)
    protected Date createdDate;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED_DATE", insertable = false, updatable = false)
    protected Date lastModifiedDate;

    @Version
    @Column(name = "VERSION")
    protected Long version;

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
