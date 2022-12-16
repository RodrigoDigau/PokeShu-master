package com.pokeapij.models.moves;

import java.util.ArrayList;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

public class MoveLearnMethod {

    int id;
    String name;
    ArrayList<Description> descriptions;
    ArrayList<Name> names;
    ArrayList<NamedAPIResource> version_groups;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<NamedAPIResource> getVersionGroups() {
        return version_groups;
    }

    @Override
    public String toString() {
        return "MoveLearnMethod{" + "id=" + id + ", name=" + name + ", descriptions=" + descriptions + ", names=" + names + ", version_groups=" + version_groups + '}';
    }

}
