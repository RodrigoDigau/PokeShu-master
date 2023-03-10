/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import java.util.ArrayList;

import com.pokeapij.models.resources.NamedAPIResource;

/**
 *
 * @author Adam
 */
public class Gender {

    int id;
    String name;
    ArrayList<PokemonSpeciesGender> pokemon_species_details;
    ArrayList<NamedAPIResource> required_for_evolution;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<PokemonSpeciesGender> getPokemonSpeciesDetails() {
        return pokemon_species_details;
    }

    public ArrayList<NamedAPIResource> getRequiredForEvolution() {
        return required_for_evolution;
    }

    @Override
    public String toString() {
        return "Gender{" + "id=" + id + ", name=" + name + ", pokemon_species_details=" + pokemon_species_details + ", required_for_evolution=" + required_for_evolution + '}';
    }

    public class PokemonSpeciesGender {

        int rate;
        NamedAPIResource pokemon_species;

        public int getRate() {
            return rate;
        }

        public NamedAPIResource getPokemonSpecies() {
            return pokemon_species;
        }

        @Override
        public String toString() {
            return "PokemonSpeciesGender{" + "rate=" + rate + ", pokemon_species=" + pokemon_species + '}';
        }

    }

}
