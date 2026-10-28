package edu.monmouth.hw1;

import edu.monmouth.vehicle.Vehicle;

public class VehicleNode {
	
	private Vehicle vehicle;
	private VehicleNode next;
	
	public VehicleNode(Vehicle vehicle) {
		setVehicle(vehicle);
		setNext(null);
	}
	
	public Vehicle getVehicle() {
		return this.vehicle;
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public VehicleNode getNext() {
		return this.next;
	}
	
	public void setNext(VehicleNode next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		if (vehicle == null) {
			System.out.println("None");
		}
		
		return "Vehicle: " + getVehicle();
	}

}
