
package com.pokeapij.models.common;

import com.pokeapij.models.resources.NamedAPIResource;


public class GenerationGameIndex {

    int game_index;
    NamedAPIResource generation;

    public int getGameIndex() {
        return game_index;
    }

    public NamedAPIResource getGeneration() {
        return generation;
    }

    @Override
    public String toString() {
        return "GenerationGameIndex{" + "game_index=" + game_index + ", generation=" + generation + '}';
    }

}
