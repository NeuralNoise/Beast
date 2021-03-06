package model.universe.beast.neuralnetwork;

import model.universe.beast.neuralnetwork.action.Attacker;
import model.universe.beast.neuralnetwork.action.Harvester;
import model.universe.beast.neuralnetwork.action.Mover;
import model.universe.beast.neuralnetwork.action.Rotator;
import model.universe.beast.neuralnetwork.perception.AttackSensor;
import model.universe.beast.neuralnetwork.perception.BeastSensor;
import model.universe.beast.neuralnetwork.perception.NeedSensor;
import model.universe.beast.neuralnetwork.perception.ResourceSensor;

public class NeuronFactory {
	
	public static Neuron getCopy(Neuron other, Brain newBrain){
		Class<? extends Neuron> c = other.getClass();
		if(c == Neuron.class)
			return new Neuron(other, newBrain);
		else if(c == NeedSensor.class)
			return new NeedSensor((NeedSensor)other, newBrain);
		else if(c == ResourceSensor.class)
			return new ResourceSensor((ResourceSensor)other, newBrain);
		else if(c == BeastSensor.class)
			return new BeastSensor((BeastSensor)other, newBrain);
		else if(c == AttackSensor.class)
			return new AttackSensor((AttackSensor)other, newBrain);
		
		else if(c == Harvester.class)
			return new Harvester((Harvester)other, newBrain);
		else if(c == Mover.class)
			return new Mover((Mover)other, newBrain);
		else if(c == Rotator.class)
			return new Rotator((Rotator)other, newBrain);
		else if(c == Attacker.class)
			return new Attacker((Attacker)other, newBrain);
		
		throw new RuntimeException("Neuron "+other+" has unsupported type");
	}

}
