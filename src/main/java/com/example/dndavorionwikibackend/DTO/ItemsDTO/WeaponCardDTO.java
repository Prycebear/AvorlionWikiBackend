package com.example.dndavorionwikibackend.DTO.ItemsDTO;

import com.example.dndavorionwikibackend.Model.Items.ItemSuper;
import com.example.dndavorionwikibackend.Model.Items.Weapon.Weapon;

import java.util.Set;

public class WeaponCardDTO {

    private long itemId;

    private String itemName;

    private String itemImageURL;

    private ItemSuper.itemRarity rarity;

    private Weapon.WeaponDamageType weaponDamageType;

    private Weapon.WeaponDiceDamage weaponDiceDamage;

    private Set<Weapon.WeaponProperties> weaponProperties;

    private Weapon.WeaponType weaponType;

    private Weapon.WeaponSize weaponSize;

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

    public Weapon.WeaponDamageType getWeaponDamageType() {
        return weaponDamageType;
    }

    public void setWeaponDamageType(Weapon.WeaponDamageType weaponDamageType) {
        this.weaponDamageType = weaponDamageType;
    }

    public Weapon.WeaponDiceDamage getWeaponDiceDamage() {
        return weaponDiceDamage;
    }

    public void setWeaponDiceDamage(Weapon.WeaponDiceDamage weaponDiceDamage) {
        this.weaponDiceDamage = weaponDiceDamage;
    }

    public Set<Weapon.WeaponProperties> getWeaponProperties() {
        return weaponProperties;
    }

    public void setWeaponProperties(Set<Weapon.WeaponProperties> weaponProperties) {
        this.weaponProperties = weaponProperties;
    }

    public Weapon.WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(Weapon.WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public Weapon.WeaponSize getWeaponSize() {
        return weaponSize;
    }

    public void setWeaponSize(Weapon.WeaponSize weaponSize) {
        this.weaponSize = weaponSize;
    }
}
