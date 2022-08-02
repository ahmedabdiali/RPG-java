public class Warrior {
    private int Strength;
    private String Dexterity;
    private String Intelligence;

    public Warrior(int strength, String dexterity, String intelligence) {
        Strength = strength;
        Dexterity = dexterity;
        Intelligence = intelligence;
    }

    public int getStrength() {
        return Strength;
    }

    public String getDexterity() {
        return Dexterity;
    }

    public String getIntelligence() {
        return Intelligence;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public void setDexterity(String dexterity) {
        Dexterity = dexterity;
    }

    public void setIntelligence(String intelligence) {
        Intelligence = intelligence;
    }
}
