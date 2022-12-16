
package com.pokeapij.models.evolution;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;


public class EvolutionTrigger {

    int id;
    String name;
    ArrayList<Name> names;
    ArrayList<NamedAPIResource> pokemon_species;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<NamedAPIResource> getPokemonSpecies() {
        return pokemon_species;
    }

    @Override
    public String toString() {
        return "EvolutionTrigger{" + "id=" + id + ", name=" + name + ", names=" + names + ", pokemon_species=" + pokemon_species + '}';
    }

}
