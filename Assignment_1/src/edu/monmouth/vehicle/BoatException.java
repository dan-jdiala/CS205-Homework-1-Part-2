package edu.monmouth.vehicle;

public class BoatException extends Exception {
	
	private BoatException() {
		super();
	}

	public BoatException(String message) {
        super(message);
	}
	
}
