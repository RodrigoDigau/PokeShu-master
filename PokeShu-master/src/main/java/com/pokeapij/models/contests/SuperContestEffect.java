package com.pokeapij.models.contests;

import java.util.ArrayList;

import com.pokeapij.models.common.FlavorText;
import com.pokeapij.models.resources.NamedAPIResource;


public class SuperContestEffect {

    int id;
    int appeal;
    ArrayList<FlavorText> flavor_text_entries;
    ArrayList<NamedAPIResource> moves;

    public int getID() {
        return id;
    }

    public int getAppeal() {
        return appeal;
    }

    public ArrayList<FlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public ArrayList<NamedAPIResource> getMoves() {
        return moves;
    }

    @Override
    public String toString() {
        return "SuperContestEffect{" + "id=" + id + ", appeal=" + appeal + ", flavor_text_entries=" + flavor_text_entries + ", moves=" + moves + '}';
    }

}
