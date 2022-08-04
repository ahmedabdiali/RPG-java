package Model;

import Attribute.PrimaryAttribute;

public class Rogue extends Character {

    public Rogue(String Name, int Level, PrimaryAttribute primaryAttribute, PrimaryAttribute totalAttribute, int Strength, int Dexterity, int Intelligence) {
        super(Name, Level, primaryAttribute, totalAttribute, Strength, Dexterity, Intelligence);
    }

    public Rogue() {
    }
}
