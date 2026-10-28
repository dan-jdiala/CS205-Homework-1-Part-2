package edu.monmouth.vehicle;

public class Boat implements Vehicle {

	private int boatLength;
    private PowerTypes powerSource;

    public Boat(PowerTypes powerSource, int boatLength) throws BoatException {
            setPowerSource(powerSource);
            setBoatLength(boatLength);
    }

    public int getBoatLength() {
            return this.boatLength;
    }

    public void setBoatLength(int boatLength) throws BoatException {
    	
    	if (boatLength < VehicleConstants.MIN_BOAT_LENGTH || boatLength > VehicleConstants.MAX_BOAT_LENGTH) {
    		throw new BoatException("Invalid boat length " + boatLength + ": must be between " + VehicleConstants.MIN_BOAT_LENGTH + " and " + VehicleConstants.MAX_BOAT_LENGTH);
        }
        
    	this.boatLength = boatLength;
    }

    public PowerTypes getPowerSource() {
            return this.powerSource;
    }

    public void setPowerSource(PowerTypes powerSource) {
            this.powerSource = powerSource;
    }

    @Override
    public void go() {
            System.out.println("Sailing...");
    }

    @Override
    public void stop() {
            System.out.println("Stopping...");
    }

    @Override
    public PowerTypes powerBy() {
            return this.powerSource;
    }

    @Override
    public String toString() {
            return "Boat - Boat Length: " + getBoatLength() + " | Power Source: " + getPowerSource();
    }

}
