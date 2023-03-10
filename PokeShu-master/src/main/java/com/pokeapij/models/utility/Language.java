package com.pokeapij.models.utility;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;

public class Language {

    int id;
    String name;
    boolean official;
    String iso639;
    String iso3166;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOfficial() {
        return official;
    }

    public String getISO639() {
        return iso639;
    }

    public String getISO3166() {
        return iso3166;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "Language{" + "id=" + id + ", name=" + name + ", official=" + official + ", iso639=" + iso639 + ", iso3166=" + iso3166 + ", names=" + names + '}';
    }

}
