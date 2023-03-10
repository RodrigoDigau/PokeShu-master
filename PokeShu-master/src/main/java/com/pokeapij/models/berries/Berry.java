package com.pokeapij.models.berries;

import java.util.ArrayList;

import com.pokeapij.models.resources.NamedAPIResource;


public class Berry {

    int id;
    String name;
    int growth_time;
    int max_harvest;
    int natural_gift_power;
    int size;
    int smoothness;
    int soil_dryness;
    NamedAPIResource firmness;
    ArrayList<BerryFlavorMap> flavors;
    NamedAPIResource item;
    NamedAPIResource natural_gift_type;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrowthTime() {
        return growth_time;
    }

    public int getMaxHarvest() {
        return max_harvest;
    }

    public int getNaturalGiftPower() {
        return natural_gift_power;
    }

    public int getSize() {
        return size;
    }

    public int getSmoothness() {
        return smoothness;
    }

    public int getSoilDryness() {
        return soil_dryness;
    }

    public NamedAPIResource getFirmness() {
        return firmness;
    }

    public ArrayList<BerryFlavorMap> getFlavors() {
        return flavors;
    }

    public NamedAPIResource getItem() {
        return item;
    }

    public NamedAPIResource getNaturalGiftType() {
        return natural_gift_type;
    }

    @Override
    public String toString() {
        return "Berry{" + "id=" + id + ", name=" + name + ", growth_time=" + growth_time + ", max_harvest=" + max_harvest + ", natural_gift_power=" + natural_gift_power + ", size=" + size + ", smoothness=" + smoothness + ", soil_dryness=" + soil_dryness + ", firmness=" + firmness + ", flavors=" + flavors + ", item=" + item + ", natural_gift_type=" + natural_gift_type + '}';
    }

    public class BerryFlavorMap {

        int potency;
        NamedAPIResource flavor;

        public int getPotency() {
            return potency;
        }

        public NamedAPIResource getFlavor() {
            return flavor;
        }

        @Override
        public String toString() {
            return "BerryFlavorMap{" + "potency=" + potency + ", flavor=" + flavor + '}';
        }

    }

}
