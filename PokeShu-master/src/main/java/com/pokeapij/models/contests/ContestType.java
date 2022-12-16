package com.pokeapij.models.contests;

import java.util.ArrayList;

import com.pokeapij.models.resources.NamedAPIResource;


public class ContestType {

    int id;
    String name;
    NamedAPIResource berry_flavor;
    ArrayList<ContestName> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public NamedAPIResource getBerryFlavor() {
        return berry_flavor;
    }

    public ArrayList<ContestName> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "ContestType{" + "id=" + id + ", name=" + name + ", berry_flavor=" + berry_flavor + ", names=" + names + '}';
    }

    public class ContestName {

        String name;
        String color;
        NamedAPIResource language;

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public NamedAPIResource getLanguage() {
            return language;
        }

        @Override
        public String toString() {
            return "ContestName{" + "name=" + name + ", color=" + color + ", language=" + language + '}';
        }

    }

}
