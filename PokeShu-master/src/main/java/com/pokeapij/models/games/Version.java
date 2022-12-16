package com.pokeapij.models.games;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;


public class Version {

    int id;
    String name;
    ArrayList<Name> names;
    NamedAPIResource version_group;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public NamedAPIResource getVersionGroup() {
        return version_group;
    }

    @Override
    public String toString() {
        return "Version{" + "id=" + id + ", name=" + name + ", names=" + names + ", version_group=" + version_group + '}';
    }

}
