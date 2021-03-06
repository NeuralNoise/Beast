package model.universe.beast.neuralnetwork;

import math.MyRandom;

public class Axon {
	private static final double POLARIZATION_MIN = -50; 
	private static final double POLARIZATION_MAX = 50; 
	

	double polarizationValue;
	Neuron postSynaptic;
	int serial;
	
	public Axon(Neuron postSynaptic) {
		this.postSynaptic = postSynaptic;
		setRandomPolarisationValue();
	}
	public Axon(Axon other) {
		this.polarizationValue = other.polarizationValue;
		this.serial = other.getPostSynapticSerial();
	}
	
	public void activate(){
		postSynaptic.polarize(polarizationValue);
	}
	
	public int getPostSynapticSerial(){
		if(postSynaptic == null)
			return serial;
		else
			return postSynaptic.serial;
	}
	
	public void setRandomPolarisationValue(){
		polarizationValue = getRandomPolarisationValue();
	}
	public static double getRandomPolarisationValue(){
		return MyRandom.between(POLARIZATION_MIN, POLARIZATION_MAX);
	}

}
