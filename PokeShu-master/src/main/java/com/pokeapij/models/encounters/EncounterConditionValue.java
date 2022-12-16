
package com.pokeapij.models.encounters;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

public class EncounterConditionValue {

    int id;
    String name;
    ArrayList<NamedAPIResource> condition;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getCondition() {
        return condition;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "EncounterConditionValue{" + "id=" + id + ", name=" + name + ", condition=" + condition + ", names=" + names + '}';
    }

}
