package com.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Courses {
    @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;

    @Column(name="customer_name")
    private String customerName;
    @Column(name = "total_amount")
    private Double totalAmount;
    @Column(name = "invoice_date", columnDefinition = "TIMESTAMP")
    private LocalDate invoiceDate;


    private String description;

    public Courses() {
    }

    public Courses(long id, String title, String customerName, Double totalAmount, LocalDate invoiceDate, String description) {
        this.id = id;
        this.title = title;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.invoiceDate = invoiceDate;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", customerName='" + customerName + '\'' +
                ", totalAmount=" + totalAmount +
                ", invoiceDate=" + invoiceDate +
                ", description='" + description + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


