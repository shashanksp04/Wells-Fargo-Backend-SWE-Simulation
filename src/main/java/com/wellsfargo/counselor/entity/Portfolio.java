package com.wellsfargo.counselor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    // client ID
    @OneToOne
    @JoinColumn( 
            name = "clientId", // foreign key column in the database
            referencedColumnName = "portfolioId" // primary key 
    )
    private Client clientID;

    public Portfolio() {
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Client getClientID(){
        return this.clientID;
    }

    public void setClientID(Client client){
        this.clientID = client;
    }

}
