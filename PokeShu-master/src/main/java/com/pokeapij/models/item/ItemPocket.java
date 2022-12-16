package com.pokeapij.models.item;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;


public class ItemPocket {

    int id;
    String name;
    ArrayList<NamedAPIResource> categories;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getCategories() {
        return categories;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "ItemPocket{" + "id=" + id + ", name=" + name + ", categories=" + categories + ", names=" + names + '}';
    }

}
