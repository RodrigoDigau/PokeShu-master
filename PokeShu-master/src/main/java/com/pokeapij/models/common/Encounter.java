
package com.pokeapij.models.common;

import java.util.ArrayList;

import com.pokeapij.models.resources.NamedAPIResource;


public class Encounter {

    int min_level;
    int max_level;
    ArrayList<NamedAPIResource> condition_values;
    int chance;
    NamedAPIResource method;

    public int getMinLevel() {
        return min_level;
    }

    public int getMaxLevel() {
        return max_level;
    }

    public ArrayList<NamedAPIResource> getConditionValues() {
        return condition_values;
    }

    public int getChance() {
        return chance;
    }

    public NamedAPIResource getMethod() {
        return method;
    }

    @Override
    public String toString() {
        return "Encounter{" + "min_level=" + min_level + ", max_level=" + max_level + ", condition_values=" + condition_values + ", chance=" + chance + ", method=" + method + '}';
    }

}
