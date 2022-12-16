
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class Description {

    String description;
    NamedAPIResource language;

    public String getDescription() {
        return description;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Description{" + "description=" + description + ", language=" + language + '}';
    }

}
