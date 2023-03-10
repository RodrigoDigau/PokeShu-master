package com.pokeapij.models.berries;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;


public class BerryFlavor {

    int id;
    String name;
    ArrayList<FlavorBerryMap> berries;
    NamedAPIResource contest_type;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<FlavorBerryMap> getBerries() {
        return berries;
    }

    public NamedAPIResource getContestType() {
        return contest_type;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "BerryFlavor{" + "id=" + id + ", name=" + name + ", berries=" + berries + ", contest_type=" + contest_type + ", names=" + names + '}';
    }

    public class FlavorBerryMap {

        int potency;
        NamedAPIResource berry;

        public int getPotency() {
            return potency;
        }

        public NamedAPIResource getBerry() {
            return berry;
        }

        @Override
        public String toString() {
            return "FlavorBerryMap{" + "potency=" + potency + ", berry=" + berry + '}';
        }

    }

}
