package Equipment;

import Attribute.PrimaryAttribute;
import ItemModel.Items;
import ItemModel.Slot;
/*
* getters and setters for Armor, level, PrimaryAttribute
* */
public class RequiredArmor extends Items {
    public Armor armor;
    public PrimaryAttribute primaryAttribute;
    public int level;

    public RequiredArmor(String name, int requiredLevel, Slot slot) {
        super(name, requiredLevel, slot);
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public PrimaryAttribute getPrimaryAttribute() {
        return primaryAttribute;
    }

    public void setPrimaryAttribute(PrimaryAttribute primaryAttribute) {
        this.primaryAttribute = primaryAttribute;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
