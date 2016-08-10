package com.training.jpa.inheritence.associations.manytoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

// Can not be @MappedSuperclass when it's a target class in associations!
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BillingDetails {

    protected Long id;

    //@NotNull
    protected String owner;

    protected BillingDetails() {
    }

    protected BillingDetails(String owner) {
        this.owner = owner;
    }

    // Use property instead of field access, so calling getId() doesn't initialize a proxy!
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    private void setId(Long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void pay(int amount) {
        // NOOP
    }
}