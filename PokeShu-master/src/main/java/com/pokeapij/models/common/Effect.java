
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class Effect {

    String effect;
    NamedAPIResource language;

    public String getEffect() {
        return effect;
    }

    public NamedAPIResource getLanguage() {
        return language;
    }

    @Override
    public String toString() {
        return "Effect{" + "effect=" + effect + ", language=" + language + '}';
    }

}
