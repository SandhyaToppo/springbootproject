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
@Table(name = "notification")
public class Notification {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "notification_id")
	    private int nid;
	   
	    private String notice;
	    private String timestamp;
	    
	    //private Long utilitycompany_id;
	    
	    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    @JoinColumn(name = "ucid") //single way
	    UtilityCompany uc;
	    
	   // @ManyToMany(cascade = CascadeType.ALL,mappedBy = "notification")
	   // private List<UtilityCompany> utilityCompanys;

	    
//	    
//	    @Column(name = "consumer_id")
//	    private Long consumerId;
//
//	    @Column(name = "notification_content", length = 1000)
//	    private String notificationContent;
//
//	    @Column(name = "timestamp")
//	    @Temporal(TemporalType.TIMESTAMP)
//	    private String timestamp;
	      


}
