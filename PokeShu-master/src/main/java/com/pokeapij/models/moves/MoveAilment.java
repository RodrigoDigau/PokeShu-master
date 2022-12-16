
package com.pokeapij.models.moves;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

public class MoveAilment {

    int id;
    String name;
    ArrayList<NamedAPIResource> moves;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "MoveAilment{" + "id=" + id + ", name=" + name + ", moves=" + moves + ", names=" + names + '}';
    }

}
