package com.pokeapij.models.moves;

import java.util.ArrayList;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

public class MoveTarget {

    int id;
    String name;
    ArrayList<Description> descriptions;
    ArrayList<NamedAPIResource> moves;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "MoveTarget{" + "id=" + id + ", name=" + name + ", descriptions=" + descriptions + ", moves=" + moves + ", names=" + names + '}';
    }

}
