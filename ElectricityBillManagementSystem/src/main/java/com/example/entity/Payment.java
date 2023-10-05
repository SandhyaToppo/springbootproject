package com.example.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment")

public class Payment {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "payment_id")
	    private int pid;
	    
	    private String paymentDate;
	    private double currentPaymentAmount;
	    private double lastPaymentAmount;
	    private String beneficiaryName;
	    private String bankName;
	    private String paymentMethod;
	    
	   // private Long consumer_id;
	    
		@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinColumn(name = "cid") //single way
	    Consumer cr;
		

	   // @ManyToMany(cascade = CascadeType.ALL, mappedBy = "payment") 
	    //List<Payment> payments;

	    
		
		
	    
//	    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
//	    private String consumer;
//
//	    @Column(name = "payment_date")
//	    //@Temporal(TemporalType.DATE)
//	    private String paymentDate;
//	    
//	    @Column(name = "current_payment_amount")
//	    private double currentPaymentAmount;
//
//	    @Column(name = "last_payment_amount")
//	    private double lastPaymentAmount;
//
//	    @Column(name = "beneficiary_name")
//	    private String beneficiaryName;
//
//	    @Column(name = "bank_name")
//	    private String bankName;
//
//	    @Column(name = "payment_method")
//	    private String paymentMethod;

}
