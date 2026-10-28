package edu.monmouth.vehicle;

public class Car implements Vehicle {

	private int engineSize;
    private PowerTypes powerSource;

    public Car(PowerTypes powerSource, int engineSize) throws CarException {
            setPowerSource(powerSource);
            setEngineSize(engineSize);
    }

    public int getEngineSize() {
            return this.engineSize;
    }

    public void setEngineSize(int engineSize) throws CarException {
    	
    	if (engineSize < VehicleConstants.MIN_ENGINE_SIZE || engineSize > VehicleConstants.MAX_ENGINE_SIZE) {
    		throw new CarException("Invalid engine size " + engineSize + ": must be between " + VehicleConstants.MIN_ENGINE_SIZE + " and " + VehicleConstants.MAX_ENGINE_SIZE);
        }
    	
    	this.engineSize = engineSize;
    }

    public PowerTypes getPowerSource() {
            return this.powerSource;
    }

    public void setPowerSource(PowerTypes powerSource) {
            this.powerSource = powerSource;
    }

    @Override
    public void go() {
            System.out.println("Going...");
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
            return "Car - Engine Size: " + getEngineSize() + " | Power Source " + getPowerSource();
    }

}
