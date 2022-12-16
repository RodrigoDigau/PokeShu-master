package com.pokeapij.models.moves;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;

public class MoveBattleStyle {

    int id;
    String name;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "MoveBattleStyle{" + "id=" + id + ", name=" + name + ", names=" + names + '}';
    }

}
