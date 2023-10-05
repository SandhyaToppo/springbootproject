package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "consumer")
public class Consumer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cid;
	private String cnumber;
	private String name;
	private String fathername;
	private String address;
	private String contact;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "cr")
	@JsonIgnore
	List<BillingParameter> billingParameters;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "consumers")
	@JsonIgnore
    List<Complaint> complaints;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cr")
    @JsonIgnore
	List<Payment> payments;
	    

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cr")
    @JsonIgnore
    MeterDetails meterDetails;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cr")
	@JsonIgnore
	List<Tariff> tariffs;


	// Other fields, getters, setters, and relationships
}
