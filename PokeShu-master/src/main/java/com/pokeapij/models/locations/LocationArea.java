package com.pokeapij.models.locations;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.common.VersionEncounterDetail;
import com.pokeapij.models.resources.NamedAPIResource;

public class LocationArea {

    int id;
    String name;
    int game_index;
    ArrayList<EncounterMethodRate> encounter_method_rates;
    NamedAPIResource location;
    ArrayList<Name> names;
    ArrayList<PokemonEncounter> pokemon_encounters;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGameIndex() {
        return game_index;
    }

    public ArrayList<EncounterMethodRate> getEncounterMethodRates() {
        return encounter_method_rates;
    }

    public NamedAPIResource getLocation() {
        return location;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ArrayList<PokemonEncounter> getPokemonEncounters() {
        return pokemon_encounters;
    }

    @Override
    public String toString() {
        return "LocationArea{" + "id=" + id + ", name=" + name + ", game_index=" + game_index + ", encounter_method_rates=" + encounter_method_rates + ", location=" + location + ", names=" + names + ", pokemon_encounters=" + pokemon_encounters + '}';
    }

    public class EncounterMethodRate {

        NamedAPIResource encounter_method;
        ArrayList<EncounterVersionDetails> version_details;

        public NamedAPIResource getEncounterMethod() {
            return encounter_method;
        }

        public ArrayList<EncounterVersionDetails> getVersionDetails() {
            return version_details;
        }

        @Override
        public String toString() {
            return "EncounterMethodRate{" + "encounter_method=" + encounter_method + ", version_details=" + version_details + '}';
        }

    }

    public class EncounterVersionDetails {

        int rate;
        NamedAPIResource version;

        public int getRate() {
            return rate;
        }

        public NamedAPIResource getVersion() {
            return version;
        }

        @Override
        public String toString() {
            return "EncounterVersionDetails{" + "rate=" + rate + ", version=" + version + '}';
        }

    }

    public class PokemonEncounter {

        NamedAPIResource pokemon;
        ArrayList<VersionEncounterDetail> version_details;

        public NamedAPIResource getPokemon() {
            return pokemon;
        }

        public ArrayList<VersionEncounterDetail> getVersionDetails() {
            return version_details;
        }

        @Override
        public String toString() {
            return "PokemonEncounter{" + "pokemon=" + pokemon + ", version_details=" + version_details + '}';
        }

    }

}
