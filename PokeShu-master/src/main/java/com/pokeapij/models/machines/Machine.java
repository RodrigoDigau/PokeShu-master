package com.pokeapij.models.machines;

import com.pokeapij.models.resources.NamedAPIResource;


public class Machine {

    int id;
    NamedAPIResource item;
    NamedAPIResource move;
    NamedAPIResource version_group;

    public int getID() {
        return id;
    }

    public NamedAPIResource getItem() {
        return item;
    }

    public NamedAPIResource getMove() {
        return move;
    }

    public NamedAPIResource getVersionGroup() {
        return version_group;
    }

    @Override
    public String toString() {
        return "Machine{" + "id=" + id + ", item=" + item + ", move=" + move + ", version_group=" + version_group + '}';
    }

}
