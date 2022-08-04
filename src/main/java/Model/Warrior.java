package Model;

import Attribute.PrimaryAttribute;

public class Warrior extends Character{
    public Warrior(String Name, int Level, PrimaryAttribute primaryAttribute, PrimaryAttribute totalAttribute, int Strength, int Dexterity, int Intelligence) {
        super(Name, Level, primaryAttribute, totalAttribute, Strength, Dexterity, Intelligence);
    }

    public Warrior() {
    }
}
