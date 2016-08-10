package com.training.jpa.inheritence.mappedsuperclass;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BillingDetails {

    //@NotNull
    protected String owner;

    // ...

    protected BillingDetails() {
    }

    protected BillingDetails(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
