package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class VersionGameIndex {

    int game_index;
    NamedAPIResource version;

    public int getGameIndex() {
        return game_index;
    }

    public NamedAPIResource getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "VersionGameIndex{" + "game_index=" + game_index + ", version=" + version + '}';
    }

}
