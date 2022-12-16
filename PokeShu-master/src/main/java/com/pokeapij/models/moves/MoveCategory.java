package com.pokeapij.models.moves;

import java.util.ArrayList;

import com.pokeapij.models.common.Description;
import com.pokeapij.models.resources.NamedAPIResource;

public class MoveCategory {

    int id;
    String name;
    ArrayList<NamedAPIResource> moves;
    ArrayList<Description> descriptions;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    public ArrayList<Description> getDescriptions() {
        return descriptions;
    }

    @Override
    public String toString() {
        return "MoveCategory{" + "id=" + id + ", name=" + name + ", moves=" + moves + ", descriptions=" + descriptions + '}';
    }

}
