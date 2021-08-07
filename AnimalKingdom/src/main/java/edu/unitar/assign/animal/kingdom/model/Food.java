package edu.unitar.assign.animal.kingdom.model;

//This defines a simple class of critters that sit around waiting to be
//taken over by other critters.

import java.awt.*;

import edu.unitar.assign.animal.kingdom.services.Critter;
import edu.unitar.assign.animal.kingdom.services.CritterInfo;

public class Food extends Critter {
	
    public Action getMove(CritterInfo info) {
        return Action.INFECT;
    }

    public Color getColor() {
        return Color.GREEN;
    }

    public String toString() {
        return "F";
    }

}
