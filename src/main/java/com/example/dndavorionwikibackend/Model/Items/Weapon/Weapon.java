package com.example.dndavorionwikibackend.Model.Items.Weapon;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "WEAPONS")
public class Weapon extends ItemSuper {

//    public enum WeaponDamageType{
//        SLASHING,
//        PIERCING,
//        BLUDGEONING
//    }
//
//    public enum WeaponDiceDamage{
//        D1,
//        D2,
//        D4,
//        D6,
//        D8,
//        D10,
//        D12,
//        D20
//    }
//
//    public enum WeaponSize{
//        SMALL,
//        MEDIUM,
//        LARGE,
//        COLOSSAL
//    }
//
//
//    public enum WeaponProperties{
//        LIGHT,
//        HEAVY,
//        VERSATILE,
//        ONE_HANDED,
//        TWO_HANDED,
//        REACH,
//        SWIFT,
//        CLEAVE,
//        PARRY,
//        THROWABLE,
//        RANGED
//    }
//
//    public enum WeaponType{
//        DAGGER,
//        SHORT_SWORD,
//        SWORD,
//        LONGSWORD,
//        GREATSWORD,
//        SPEAR,
//        GLAIVE,
//        HALBERD,
//        STAFF,
//        SHORTBOW,
//        BOW,
//        LONGBOW,
//        CROSSBOW
//
//    }

    private int weaponDamageType;

    private int weaponDiceDamage;

    private Set<Integer> weaponProperties;

    private int weaponType;

    private int weaponSize;


    public int getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(int weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponDamageType() {
        return weaponDamageType;
    }

    public void setWeaponDamageType(int weaponDamageType) {
        this.weaponDamageType = weaponDamageType;
    }

    public int getWeaponDiceDamage() {
        return weaponDiceDamage;
    }

    public void setWeaponDiceDamage(int weaponDiceDamage) {
        this.weaponDiceDamage = weaponDiceDamage;
    }

    public Set<Integer> getWeaponProperties() {
        return weaponProperties;
    }

    public void setWeaponProperties(Set<Integer> weaponProperties) {
        this.weaponProperties = weaponProperties;
    }

    public int getWeaponSize() {
        return weaponSize;
    }

    public void setWeaponSize(int weaponSize) {
        this.weaponSize = weaponSize;
    }
}
