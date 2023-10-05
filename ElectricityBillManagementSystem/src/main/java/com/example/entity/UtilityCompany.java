package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utility_company")

public class UtilityCompany {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long uid;

	    private String companyName;
	    private String contactEmail;
	    private String contactNo;
	    private String address;
	    private String city;
	    private String state;
	    private String postalCode;
	    private String country;

	    @OneToMany(cascade = CascadeType.ALL, mappedBy = "uc")
		@JsonIgnore
		List<Notification> notification;

	   


}
