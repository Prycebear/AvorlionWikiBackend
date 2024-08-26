package com.example.dndavorionwikibackend.DTO.ItemsDTO;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;

import java.util.Set;

public class WeaponCardDTO {

    private long itemId;

    private String itemName;

    private String itemImageURL;

    private ItemSuper.itemRarity rarity;

    private int weaponDamageType;

    private int weaponDiceDamage;

    private Set<Integer> weaponProperties;

    private int weaponType;

    private int weaponSize;

//    private Weapon.WeaponDamageType weaponDamageType;
//
//    private Weapon.WeaponDiceDamage weaponDiceDamage;
//
//    private Set<Weapon.WeaponProperties> weaponProperties;
//
//    private Weapon.WeaponType weaponType;
//
//    private Weapon.WeaponSize weaponSize;

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemImageURL() {
        return itemImageURL;
    }

    public void setItemImageURL(String itemImageURL) {
        this.itemImageURL = itemImageURL;
    }

    public ItemSuper.itemRarity getRarity() {
        return rarity;
    }

    public void setRarity(ItemSuper.itemRarity rarity) {
        this.rarity = rarity;
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

    public int getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(int weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponSize() {
        return weaponSize;
    }

    public void setWeaponSize(int weaponSize) {
        this.weaponSize = weaponSize;
    }
}
