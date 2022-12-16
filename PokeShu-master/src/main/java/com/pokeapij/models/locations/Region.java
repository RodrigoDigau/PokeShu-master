package com.pokeapij.models.locations;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

public class Region {

    int id;
    ArrayList<NamedAPIResource> locations;
    String name;
    ArrayList<Name> names;
    NamedAPIResource main_generation;
    ArrayList<NamedAPIResource> pokedexes;
    ArrayList<NamedAPIResource> version_groups;

    public int getID() {
        return id;
    }

    public ArrayList<NamedAPIResource> getLocations() {
        return locations;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public NamedAPIResource getMainGeneration() {
        return main_generation;
    }

    public ArrayList<NamedAPIResource> getPokedexes() {
        return pokedexes;
    }

    public ArrayList<NamedAPIResource> getVersionGroups() {
        return version_groups;
    }

    @Override
    public String toString() {
        return "Region{" + "id=" + id + ", locations=" + locations + ", name=" + name + ", names=" + names + ", main_generation=" + main_generation + ", pokedexes=" + pokedexes + ", version_groups=" + version_groups + '}';
    }

}
