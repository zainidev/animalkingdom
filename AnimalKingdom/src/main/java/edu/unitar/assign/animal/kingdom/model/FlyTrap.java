package edu.unitar.assign.animal.kingdom.model;

//This defines a simple class of critters that infect whenever they can and
//otherwise just spin around, looking for critters to infect.  This simple
//strategy turns out to be surpisingly successful.
import java.awt.Color;

import edu.unitar.assign.animal.kingdom.services.Critter;
import edu.unitar.assign.animal.kingdom.services.CritterInfo;

public class FlyTrap extends Critter {

	@Override
	public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else {
            return Action.LEFT;
        }
    }

    @Override
	public Color getColor() {
        return Color.RED;
    }

    @Override
	public String toString() {
        return "T";
    }


}
