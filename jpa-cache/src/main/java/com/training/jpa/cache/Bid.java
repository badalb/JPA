package com.training.jpa.cache;

import java.math.BigDecimal;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@org.hibernate.annotations.Immutable
@Cacheable
@org.hibernate.annotations.Cache(
    usage = CacheConcurrencyStrategy.READ_ONLY
)
public class Bid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    protected Item item;

    //@NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    protected User bidder;

    //@NotNull
    protected BigDecimal amount;

    protected Bid() {
    }

    public Bid(Item item, User bidder, BigDecimal amount) {
        this.item = item;
        this.amount = amount;
        this.bidder = bidder;
    }

    public Item getItem() {
        return item;
    }

    public User getBidder() {
        return bidder;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    // ...
}
