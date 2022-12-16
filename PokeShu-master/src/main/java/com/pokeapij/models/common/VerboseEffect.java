
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class VerboseEffect {

    String effect;
    String short_effect;
    NamedAPIResource language;

    public String getEffect() {
        return effect;
    }

    public String getShortEffect() {
        return short_effect;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "VerboseEffect{" + "effect=" + effect + ", short_effect=" + short_effect + ", language=" + language + '}';
    }

}
