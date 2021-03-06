package se.jola.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ParkingSpace {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private Long parkingSpaceId;

    @Column
    private String label;

    protected ParkingSpace() {
    }

    public ParkingSpace(String label, Long id) {
	this.label = label;
	this.parkingSpaceId = id;
    }

    public String getLabel() {
	return label;
    }

    public Long getId() {
	return parkingSpaceId;
    }
    
    public ParkingSpace setLabel(String label) {
	this.label = label;
	
	return this;
    }
    
    public ParkingSpace setId(Long id) {
	this.parkingSpaceId = id;
	
	return this;
    }

}
