package Equipment;

import Attribute.PrimaryAttribute;
import ItemModel.Items;
import ItemModel.Slot;

public class RequiredWeapon extends Items {
    public Weapons weapons;
    public PrimaryAttribute primaryAttribute;
    public int level;

    public RequiredWeapon(String name, int requiredLevel, Slot slot) {
        super(name, requiredLevel, slot);
    }


    public Weapons getWeapons() {
        return weapons;
    }

    public void setWeapons(Weapons weapons) {
        this.weapons = weapons;
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
