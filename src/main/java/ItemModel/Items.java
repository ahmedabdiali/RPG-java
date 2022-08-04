package ItemModel;

import java.util.HashMap;

public abstract class Items {
    private String Name;
    private int RequiredLevel;
    private Slot slot;

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
