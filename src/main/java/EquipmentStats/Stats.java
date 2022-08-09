package EquipmentStats;

import Attribute.PrimaryAttribute;

public class Stats {
     String name;
     int health;
     int level;
     PrimaryAttribute primaryAttribute;
     PrimaryAttribute totalAttribute;
     int Strength;
     int Dexterity;
     int Intelligence;

    public Stats(int level, String name, PrimaryAttribute primaryAttribute) {
        this.name = name;
        this.level = level;
        this.primaryAttribute = primaryAttribute;
        this.totalAttribute = new PrimaryAttribute(
                this.primaryAttribute.getStrength(),
                this.primaryAttribute.getDexterity(),
                this.primaryAttribute.getIntelligence()
        );
    }


    public void levelUp(PrimaryAttribute primaryAttribute){
        this.setLevel(this.level + 1);
        this.primaryAttribute.setStrength(primaryAttribute.getStrength() + this.totalAttribute.getStrength());
        this.primaryAttribute.setDexterity(primaryAttribute.getDexterity() + this.totalAttribute.getDexterity());
        this.primaryAttribute.setIntelligence(primaryAttribute.getIntelligence()+ this.totalAttribute.getIntelligence());

    }

    public void setLevel(int level){
        this.level=level;
    }



    @Override

    public String toString() {

        return "Stats { " +

                ", level = " + level +
                ", name = '" + name + '\'' +
                ", baseAttribute = " + primaryAttribute +
                ", totalAttribute = " + totalAttribute +
                " }";
    }

}

