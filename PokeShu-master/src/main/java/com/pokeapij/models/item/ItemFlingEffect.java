package com.pokeapij.models.item;

import java.util.ArrayList;

import com.pokeapij.models.common.Effect;
import com.pokeapij.models.resources.NamedAPIResource;

public class ItemFlingEffect {

    int id;
    String name;
    ArrayList<Effect> effect_entries;
    NamedAPIResource items;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Effect> getEffectEntries() {
        return effect_entries;
    }

    public NamedAPIResource getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "ItemFlingEffect{" + "id=" + id + ", name=" + name + ", effect_entries=" + effect_entries + ", items=" + items + '}';
    }

}
