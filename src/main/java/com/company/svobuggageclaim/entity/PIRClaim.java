package com.company.svobuggageclaim.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "PIR_CLAIM", indexes = {
        @Index(name = "IDX_PIRCLAIM_COUNTRY_ID", columnList = "COUNTRY_ID")
})
@Entity
public class PIRClaim {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_PIR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date datePIR;

    @Column(name = "COPY_AIR_TICKETS", nullable = false, length = 1024)
    private FileRef copyAirTickets;

    @Column(name = "TYPE_CLAIM", nullable = false)
    private String typeClaim;

    @Column(name = "CUSTOMER_NAME", nullable = false, length = 1000)
    private String customerName;

    @Column(name = "ADDRESS")
    @Lob
    private String address;

    @Column(name = "POST_CODE", length = 10)
    private String postCode;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "COUNTRY_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Country country;

    @Email(message = "Please check the customer email for correct feedback!")
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "TEMP_ADDRESS")
    @Lob
    private String tempAddress;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private String phoneNumber;

    @Column(name = "TICKET_CLASS", nullable = false)
    private String ticketClass;

    @Composition
    @OneToMany(mappedBy = "pIRClaim")
    private List<ListOfFlight> listOfFligjts;

    @Column(name = "STATUS", nullable = false)
    private String status;

    public ClaimStatus getStatus() {
        return status == null ? null : ClaimStatus.fromId(status);
    }

    public void setStatus(ClaimStatus status) {
        this.status = status == null ? null : status.getId();
    }

    public List<ListOfFlight> getListOfFligjts() {
        return listOfFligjts;
    }

    public void setListOfFligjts(List<ListOfFlight> listOfFligjts) {
        this.listOfFligjts = listOfFligjts;
    }

    public TicketClass getTicketClass() {
        return ticketClass == null ? null : TicketClass.fromId(ticketClass);
    }

    public void setTicketClass(TicketClass ticketClass) {
        this.ticketClass = ticketClass == null ? null : ticketClass.getId();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTempAddress() {
        return tempAddress;
    }

    public void setTempAddress(String tempAddress) {
        this.tempAddress = tempAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public TypeClaim getTypeClaim() {
        return typeClaim == null ? null : TypeClaim.fromId(typeClaim);
    }

    public void setTypeClaim(TypeClaim typeClaim) {
        this.typeClaim = typeClaim == null ? null : typeClaim.getId();
    }

    public FileRef getCopyAirTickets() {
        return copyAirTickets;
    }

    public void setCopyAirTickets(FileRef copyAirTickets) {
        this.copyAirTickets = copyAirTickets;
    }

    public Date getDatePIR() {
        return datePIR;
    }

    public void setDatePIR(Date datePIR) {
        this.datePIR = datePIR;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"datePIR", "customerName", "email"})
    public String getInstanceName() {
        return String.format("%s %s %s", datePIR, customerName, email);
    }
}