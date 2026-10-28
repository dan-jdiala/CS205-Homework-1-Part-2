package edu.monmouth.vehicle;

public class Bus implements Vehicle{
	
	private int busLength;
    private PowerTypes powerSource;

    public Bus(PowerTypes powerSource, int busLength) throws BusException {
            setPowerSource(powerSource);
            setEngineSize(busLength);
    }

    public int getEngineSize() {
            return this.busLength;
    }

    public void setEngineSize(int busLength) throws BusException {
    	
    	if (busLength < VehicleConstants.MIN_BUS_LENGTH || busLength > VehicleConstants.MAX_BUS_LENGTH) {
    		throw new BusException("Invalid bus length " + busLength + ": must be between " + VehicleConstants.MIN_BUS_LENGTH + " and " + VehicleConstants.MAX_BUS_LENGTH);
        }
    	
    	this.busLength = busLength;
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
            return getPowerSource();
    }

    @Override
    public String toString() {
            return "Bus - Bus Length: " + getEngineSize() + " | Power Source " + getPowerSource();
    }

}
