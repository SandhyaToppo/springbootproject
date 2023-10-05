package com.example.entity;





import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "meter")
public class MeterDetails {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meter_id")
    private Long mid;
	private String meterOwner;
	private String meterType;
	private String phase;
	private String meterstatus;
	private String installationdate;
	private String unitConsumed;
	 
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cid") //single way
    Consumer cr;

	
	
	
//    @ManyToOne
//    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
//    private String meterOwner;
//
//    @Column(name = "meter_type")
//    private String meterType;
//
//    @Column(name = "phase")
//    private String phase;
//
//    @Column(name = "meter_status")
//    private String meterstatus;
//
//    @Column(name = "installation_date")
//    //@Temporal(TemporalType.DATE)
//    private String installationdate;
//    
//
//    @Column(name = "unit_consumed")
//    private double unitConsumed;
//

//    @OneToMany(mappedBy = "meterdetails")
//    private List<MeterReading> meterReadings;

	

}
