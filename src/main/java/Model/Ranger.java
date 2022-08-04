package Model;

import Attribute.PrimaryAttribute;

public class Ranger extends Character {


    public Ranger(String Name, int Level, PrimaryAttribute primaryAttribute, PrimaryAttribute totalAttribute, int Strength, int Dexterity, int Intelligence) {
        super(Name, Level, primaryAttribute, totalAttribute, Strength, Dexterity, Intelligence);
    }

    public Ranger() {
    }
}
