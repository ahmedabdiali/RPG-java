package ItemModel;

import java.util.HashMap;

public class Items {
    private String Name;
    private int RequiredLevel;
    public Slot slot;

    public Items(String name, int requiredLevel, Slot slot) {
        Name = name;
        RequiredLevel = requiredLevel;
        this.slot = slot;
    }
/*
* getters and setters for slot,requiredLevel and Name
* */
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRequiredLevel() {
        return RequiredLevel;
    }

    public void setRequiredLevel(int requiredLevel) {
        RequiredLevel = requiredLevel;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }
}
