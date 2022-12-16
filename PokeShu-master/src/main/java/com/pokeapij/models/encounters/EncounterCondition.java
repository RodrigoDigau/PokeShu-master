
package com.pokeapij.models.encounters;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;


public class EncounterCondition {

    int id;
    String name;
    ArrayList<Name> names;
    ArrayList<NamedAPIResource> values;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<NamedAPIResource> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "EncounterConditions{" + "id=" + id + ", name=" + name + ", names=" + names + ", values=" + values + '}';
    }

}
