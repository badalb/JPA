package com.training.jpa.inheritence.associations.manytoone;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    //@NotNull
    protected String username;

    @ManyToOne(fetch = FetchType.LAZY)
    protected BillingDetails defaultBilling;

    public User() {
    }

    public User(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public BillingDetails getDefaultBilling() {
        return defaultBilling;
    }

    public void setDefaultBilling(BillingDetails defaultBilling) {
        this.defaultBilling = defaultBilling;
    }


    // ...
}
