package ExceptionHandling;
/*
* exception for armor that will be used
* */
public class InvalidArmorException extends Exception {
    public String ArmorException(){
        return "This character cant equip this Armor";
    }
}
