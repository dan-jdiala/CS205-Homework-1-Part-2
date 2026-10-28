package edu.monmouth.hw1;
import edu.monmouth.vehicle.Vehicle;

public class VehicleList {
	
	private VehicleNode head;
	
	public VehicleList() {
		
	}
	
	public void insert(Vehicle vehicle) {
		VehicleNode newNode = new VehicleNode(vehicle);
		
		if (isEmpty()) {
			head = newNode;
		}
		
		else {
			VehicleNode current = head;
			head = newNode;
			newNode.setNext(current);
		}
		
	}
	
	public void insertEnd(Vehicle vehicle) {
		
		VehicleNode newNode = new VehicleNode(vehicle);
		
		if (isEmpty()) {
			head = newNode;
		}
		
		else {
			VehicleNode current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			
			current.setNext(newNode);
		}
		
	}
	
	public Vehicle first() {
		
		if (isEmpty()) {
			return null;
		}
		
		return head.getVehicle();
	}
	
	public Vehicle last() {
		
		if (isEmpty()) {
			return null;
		}
		
		VehicleNode current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		return current.getVehicle();
	}
	
	public Vehicle removeFirst() {
		
		if (isEmpty()) {
			return null;
		}
		
		VehicleNode current = head;
		head = current.getNext();
		return current.getVehicle();
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	public int size() {
		
		int incrementer = 0;
		
		if (head == null) {
			return incrementer;
		}
		
		VehicleNode current = head;
		while (current != null) {
			current = current.getNext();
			incrementer++;
		}
		
		return incrementer;
	}
	
	@Override
	public String toString() {
		
		StringBuilder result = new StringBuilder();
		
		if (isEmpty()) {
			return "Empty List";
		}
		
		VehicleNode current = head;
		int index = 1;
		while (current != null) {
			result.append(" ").append(index++).append(". ").append(current).append("\n");
			
			current = current.getNext();
		}
		
		return result.toString();
	}

}
