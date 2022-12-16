package com.pokeapij.models.item;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

public class ItemCategory {

    int id;
    String name;
    ArrayList<NamedAPIResource> items;
    ArrayList<Name> names;
    NamedAPIResource pocket;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getItems() {
        return items;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public NamedAPIResource getPocket() {
        return pocket;
    }

    @Override
    public String toString() {
        return "ItemCategory{" + "id=" + id + ", name=" + name + ", items=" + items + ", names=" + names + ", pocket=" + pocket + '}';
    }

}
