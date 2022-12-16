
package com.pokeapij.models.berries;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;


public class BerryFirmness {

    int id;
    String name;
    ArrayList<NamedAPIResource> berries;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getBerries() {
        return berries;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "BerryFirmness{" + "id=" + id + ", name=" + name + ", berries=" + berries + ", names=" + names + '}';
    }

}
