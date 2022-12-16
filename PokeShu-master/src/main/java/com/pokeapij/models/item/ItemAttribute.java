package com.pokeapij.models.item;

import java.util.ArrayList;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

public class ItemAttribute {

    int id;
    String name;
    ArrayList<NamedAPIResource> items;
    ArrayList<Name> names;
    ArrayList<Description> descriptions;

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

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    @Override
    public String toString() {
        return "ItemAttribute{" + "id=" + id + ", name=" + name + ", items=" + items + ", names=" + names + ", descriptions=" + descriptions + '}';
    }

}
