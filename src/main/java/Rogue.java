public class Rogue {
    private int Strength;
    private String Dexterity;
    private String Intelligence;

    public Rogue(int strength, String dexterity, String intelligence) {
        Strength = strength;
        Dexterity = dexterity;
        Intelligence = intelligence;
    }

    public int getStrength() {
        return Strength;
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

    public String getDexterity() {
        return Dexterity;
    }

    public String getIntelligence() {
        return Intelligence;
    }
}
