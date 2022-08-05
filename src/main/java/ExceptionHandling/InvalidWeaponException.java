package ExceptionHandling;

public class InvalidWeaponException extends Exception {
    public String WeaponException (){
        return "This character cant equip this Weapon";
    }
}
