package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tariff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	public int tid;
	public String tariffcode;
	public String Service;
	public String connection;
	public String charge;
	public String tariffExcluding;
	public String subsidy;
	public String tariffPayable;

	//private Long consumer_id;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "cid") //single way
    Consumer cr;
}
