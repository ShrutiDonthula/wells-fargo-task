package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private long clientID;

    protected Portfolio() {
    }

    public Portfolio(long clientID) {
        this.clientID = clientID;
    }

    public Long getPortfolioID() {
        return portfolioID;
    }

    public Long getClientID() {
        return clientID;
    }

    public void setClientID(long clientID) {
        this.clientID = clientID;
    }

}
