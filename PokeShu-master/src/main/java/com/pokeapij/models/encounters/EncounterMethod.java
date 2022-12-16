package com.pokeapij.models.encounters;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;


public class EncounterMethod {

    int id;
    String name;
    int order;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "EncounterMethod{" + "id=" + id + ", name=" + name + ", order=" + order + ", names=" + names + '}';
    }

}
