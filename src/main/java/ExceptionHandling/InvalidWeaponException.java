package ExceptionHandling;
/*
 * exception for weapons that will be used
 * */
public class InvalidWeaponException extends Exception {
    public String WeaponException (){
        return "This character cant equip this Weapon";
    }
}
