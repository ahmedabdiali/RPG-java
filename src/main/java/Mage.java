
public class Mage {
   private int Strength;
   private String Dexterity;
   private String Intelligence;

   public Mage(int strength, String dexterity, String intelligence) {
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

   public String getDexterity() {
      return Dexterity;
   }

   public void setDexterity(String dexterity) {
      Dexterity = dexterity;
   }

   public String getIntelligence() {
      return Intelligence;
   }

   public void setIntelligence(String intelligence) {
      Intelligence = intelligence;
   }

}
