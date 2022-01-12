package com.company.svobuggageclaim.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "LIST_OF_FLIGHT", indexes = {
        @Index(name = "IDX_LISTOFFLIGHT_AIRLINE_ID", columnList = "AIRLINE_ID")
})
@Entity
public class ListOfFlight {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "AIRLINE_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Airline airline;

    @Column(name = "FLIGHT_ID", length = 15)
    private String flightID;

    @Column(name = "DATE_FLIGHT", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateFlight;

    @Column(name = "DESTINATION_FROM")
    private String destinationFrom;

    @Column(name = "DESTINATION_TO")
    private String destinationTo;
    @JoinColumn(name = "P_IR_CLAIM_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PIRClaim pIRClaim;

    public PIRClaim getPIRClaim() {
        return pIRClaim;
    }

    public void setPIRClaim(PIRClaim pIRClaim) {
        this.pIRClaim = pIRClaim;
    }

    public String getDestinationTo() {
        return destinationTo;
    }

    public void setDestinationTo(String destinationTo) {
        this.destinationTo = destinationTo;
    }

    public String getDestinationFrom() {
        return destinationFrom;
    }

    public void setDestinationFrom(String destinationFrom) {
        this.destinationFrom = destinationFrom;
    }

    public Date getDateFlight() {
        return dateFlight;
    }

    public void setDateFlight(Date dateFlight) {
        this.dateFlight = dateFlight;
    }

    public String getFlightID() {
        return flightID;
    }

    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}