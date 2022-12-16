
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class VersionGroupFlavorText {

    String text;
    NamedAPIResource language;
    NamedAPIResource version_group;

    public String getText() {
        return text;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    public NamedAPIResource getVersionGroup() {
        return version_group;
    }

    @Override
    public String toString() {
        return "VersionGroupFlavorText{" + "text=" + text + ", language=" + language + ", version_group=" + version_group + '}';
    }

}
