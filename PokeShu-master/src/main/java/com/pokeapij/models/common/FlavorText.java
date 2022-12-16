
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class FlavorText {

    String flavor_text;
    NamedAPIResource language;
    NamedAPIResource version;

    public String getFlavorText() {
        return flavor_text;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "FlavorText{" + "flavor_text=" + flavor_text + ", language=" + language + ", version=" + version + '}';
    }

}
