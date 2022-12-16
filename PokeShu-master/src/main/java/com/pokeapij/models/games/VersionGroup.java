package com.pokeapij.models.games;

import java.util.ArrayList;

import com.pokeapij.models.resources.NamedAPIResource;

public class VersionGroup {

    int id;
    String name;
    int order;
    NamedAPIResource generation;
    ArrayList<NamedAPIResource> move_learn_methods;
    ArrayList<NamedAPIResource> pokedexes;
    ArrayList<NamedAPIResource> regions;
    ArrayList<NamedAPIResource> versions;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public NamedAPIResource getGeneration() {
        return generation;
    }

    public ArrayList<NamedAPIResource> getMoveLearnMethods() {
        return move_learn_methods;
    }

    public ArrayList<NamedAPIResource> getPokedexes() {
        return pokedexes;
    }

    public ArrayList<NamedAPIResource> getRegions() {
        return regions;
    }

    public ArrayList<NamedAPIResource> getVersions() {
        return versions;
    }

    @Override
    public String toString() {
        return "VersionGroup{" + "id=" + id + ", name=" + name + ", order=" + order + ", generation=" + generation + ", move_learn_methods=" + move_learn_methods + ", pokedexes=" + pokedexes + ", regions=" + regions + ", versions=" + versions + '}';
    }

}
