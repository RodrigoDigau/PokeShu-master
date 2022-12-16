package com.pokeapij.models.locations;

import java.util.ArrayList;

import com.pokeapij.models.common.GenerationGameIndex;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;


public class Location {

    int id;
    String name;
    NamedAPIResource region;
    ArrayList<Name> names;
    ArrayList<GenerationGameIndex> game_indices;
    ArrayList<NamedAPIResource> areas;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public NamedAPIResource getRegion() {
        return region;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<GenerationGameIndex> getGameIndices() {
        return game_indices;
    }

    public ArrayList<NamedAPIResource> getAreas() {
        return areas;
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", name=" + name + ", region=" + region + ", names=" + names + ", game_indices=" + game_indices + ", areas=" + areas + '}';
    }

}
