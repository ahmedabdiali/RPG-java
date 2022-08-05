package ExceptionHandling;

public class InvalidArmorException extends Exception {
    public String ArmorException(){
        return "This character cant equip this Armor";
    }
}
