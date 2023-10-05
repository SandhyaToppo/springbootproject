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
@Table(name = "billingParameter")
public class BillingParameter {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "bill_id")
	    private Long bid;

	    private String billNumber;
	    private String billMonth;
	    private	String billIssueDate;
	    private String duedate;
	    private String dateOfPrevReading;
	    private double prevKWH;
	    private String dateOfCurrentReading;
	    private double currentKWH;
	    private double differenceKWHXMF;
	    private int Period;
	    private double totalAssessment;
	    
	    //private Long consumer_id;
	    
	    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinColumn(name = "cid") //single way
	    Consumer cr;
	    
//	    
//	    @Column(name = "bill_number")
//	    private String billNumber;
//
//	    @Column(name = "bill_issue_date")
//	    @Temporal(TemporalType.DATE)
//	    private String billIssueDate;
//
//	    @Column(name = "date_of_prev_reading")
//	    @Temporal(TemporalType.DATE)
//	    private String  dateOfPrevReading;
//
//	    @Column(name = "prev_kwh")
//	    private double prevKWH;
//
//	    @Column(name = "date_of_curr_reading")
//	    @Temporal(TemporalType.DATE)
//	    private String  dateOfCurrReading;
//
//	    @Column(name = "current_kwh")
//	    private double currentKWH;
//
//	    @Column(name = "difference_kwh_xmf")
//	    private double differenceKWHXMF;
//
//	    @Column(name = "total_assessment")
//	    private double totalAssessment;

}
