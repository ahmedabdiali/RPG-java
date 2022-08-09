package Model;

import Attribute.PrimaryAttribute;
import Equipment.Armor;
import Equipment.RequiredArmor;
import Equipment.RequiredWeapon;
import Equipment.Weapons;
import EquipmentStats.Stats;
import ExceptionHandling.InvalidArmorException;
import ExceptionHandling.InvalidWeaponException;
import ItemModel.Items;
import ItemModel.Slot;

import java.io.InvalidClassException;
import java.util.HashMap;

public class  Character {
    private Stats stats;
    private final Hero hero;
    private PrimaryAttribute levelUp;
    public HashMap<Slot, Items> equipmentType = new HashMap<>();
    public HashMap<Slot, Weapons> equipmentWeapon = new HashMap<>();

    public Character(Hero hero) {
        this.hero = hero;
        try {
            this.stats = characterStatus(this.hero);
        } catch (InvalidClassException e) {
            e.printStackTrace();
        }
    }


    public Stats getStats(){
        return stats;
    }

    public PrimaryAttribute getLevelUp() {
        return levelUp;
    }


    public String SetArmor(RequiredArmor requiredArmor)throws InvalidArmorException {
        if(requiredArmor.armor == Armor.Mail || requiredArmor.armor == Armor.Plate ){
            if(requiredArmor.slot == Slot.Head){
                equipmentType.put(Slot.Head,requiredArmor);
            }
            else if(requiredArmor.slot == Slot.Body){
                equipmentType.put(Slot.Body,requiredArmor);
            }

            else if(requiredArmor.slot == Slot.Body){
                equipmentType.put(Slot.Body,requiredArmor);
            }
            else if(requiredArmor.slot == Slot.Legs){
                equipmentType.put(Slot.Legs,requiredArmor);
            }else {
                throw new InvalidArmorException();
            }
            return "equip success";
        }

        return " ";
    }
    public String setWeapon(RequiredWeapon requiredWeapon) throws InvalidWeaponException{
        if (requiredWeapon.weapons == Weapons.Wands ||
                requiredWeapon.weapons == Weapons.Axes ||
                requiredWeapon.weapons == Weapons.Bows ||
                requiredWeapon.weapons == Weapons.Daggers ||
                requiredWeapon.weapons == Weapons.Hammers ||
                requiredWeapon.weapons == Weapons.Staff ||
                requiredWeapon.weapons == Weapons.Swords){
        }else {
            throw new InvalidWeaponException();
        }
        return "Success";
    }

    public Stats characterStatus(Hero hero)throws InvalidClassException {
        int level=1;
    /*
    * getting the base and the level up for the heroes
    **/
        switch (hero){
            case Mage -> {
                PrimaryAttribute base = new PrimaryAttribute(1,1,8);
                this.levelUp = new PrimaryAttribute(1,1,5);
                return new Stats(level,"Mage",base);
            }
            case Rogue -> {
                PrimaryAttribute base = new PrimaryAttribute(2,6,1);
                this.levelUp = new PrimaryAttribute(1,4,1);
                return new Stats(level,"Rogue",base);
            }
            case Ranger -> {
                PrimaryAttribute base = new PrimaryAttribute(1,7,1);
                this.levelUp = new PrimaryAttribute(1,7,1);
                this.levelUp = new PrimaryAttribute(1,5,1);
                return new Stats(level,"Ranger",base);
            }
            case Warrior -> {
                PrimaryAttribute base = new PrimaryAttribute(5,2,1);
                this.levelUp = new PrimaryAttribute(1,4,1);
                return new Stats(level,"Warrior",base);
            }

        }
        throw new InvalidClassException("Invalid Exception");
    }
    /*
    * getting armors each hero can have
    * */
    public Armor[] getArmor(Hero hero) throws Exception {
        switch (hero){
            case Mage -> {
                return new Armor[]{Armor.Cloth};
            }
            case Ranger,Rogue -> {
                return new Armor[]{Armor.Leather,Armor.Mail};
            }
            case Warrior -> {
                return new Armor[]{Armor.Mail, Armor.Plate};
            }
            default -> throw new Exception("couldn't find Armor");
        }
    }

}
