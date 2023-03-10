/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

/**
 *
 * @author Adam
 */
public class PokemonColor {

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
        return "PokemonColor{" + "id=" + id + ", name=" + name + ", names=" + names + ", pokemon_species=" + pokemon_species + '}';
    }

}
