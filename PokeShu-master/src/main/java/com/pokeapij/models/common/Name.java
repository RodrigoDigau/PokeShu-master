package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class Name {

    String name;
    NamedAPIResource language;

    public String getName() {
        return name;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Name{" + "name=" + name + ", language=" + language + '}';
    }

}
