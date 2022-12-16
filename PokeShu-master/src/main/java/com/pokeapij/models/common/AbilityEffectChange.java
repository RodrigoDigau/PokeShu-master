package com.pokeapij.models.common;

import java.util.ArrayList;

import com.pokeapij.models.resources.NamedAPIResource;


public class AbilityEffectChange {

    ArrayList<Effect> effect_entries;
    NamedAPIResource version_group;

    public ArrayList<Effect> getEffectEntries() {
        return effect_entries;
    }

    public NamedAPIResource getVersionGroup() {
        return version_group;
    }

    @Override
    public String toString() {
        return "AbilityEffectChange{" + "effect_entries=" + effect_entries + ", version_group=" + version_group + '}';
    }

}
