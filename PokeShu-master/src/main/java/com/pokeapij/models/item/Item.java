package com.pokeapij.models.item;

import java.util.ArrayList;

import com.pokeapij.models.common.GenerationGameIndex;
import com.pokeapij.models.common.MachineVersionDetail;
import com.pokeapij.models.common.Name;
import com.pokeapij.models.common.VerboseEffect;
import com.pokeapij.models.common.VersionGroupFlavorText;
import com.pokeapij.models.resources.APIResource;
import com.pokeapij.models.resources.NamedAPIResource;


public class Item {

    int id;
    String name;
    int cost;
    int fling_power;
    NamedAPIResource fling_effect;
    ArrayList<NamedAPIResource> attributes;
    ItemCategory category;
    ArrayList<VerboseEffect> effect_entries;
    ArrayList<VersionGroupFlavorText> flavor_text_entries;
    ArrayList<GenerationGameIndex> game_indices;
    ArrayList<Name> names;
    ItemSprites sprites;
    ArrayList<ItemHolderPokemon> held_by_pokemon;
    APIResource baby_trigger_for;
    ArrayList<MachineVersionDetail> machines;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getFlingPower() {
        return fling_power;
    }

    public NamedAPIResource getFlingEffect() {
        return fling_effect;
    }

    public ArrayList<NamedAPIResource> getAttributes() {
        return attributes;
    }

    public ItemCategory getCategory() {
        return category;
    }

    public ArrayList<VerboseEffect> getEffectEntries() {
        return effect_entries;
    }

    public ArrayList<VersionGroupFlavorText> getFlavorTextEntries() {
        return flavor_text_entries;
    }

    public ArrayList<GenerationGameIndex> getGameIndices() {
        return game_indices;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    public ItemSprites getSprites() {
        return sprites;
    }

    public ArrayList<ItemHolderPokemon> getHeldByPokemon() {
        return held_by_pokemon;
    }

    public APIResource getBabyTriggerFor() {
        return baby_trigger_for;
    }

    public ArrayList<MachineVersionDetail> getMachines() {
        return machines;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", cost=" + cost + ", fling_power=" + fling_power + ", fling_effect=" + fling_effect + ", attributes=" + attributes + ", category=" + category + ", effect_entries=" + effect_entries + ", flavor_text_entries=" + flavor_text_entries + ", game_indices=" + game_indices + ", names=" + names + ", sprites=" + sprites + ", held_by_pokemon=" + held_by_pokemon + ", baby_trigger_for=" + baby_trigger_for + ", machines=" + machines + '}';
    }

    public class ItemSprites {

        String Default;

        public ItemSprites(String Default) {
            this.Default = Default;
        }

        public String getDefault() {
            return Default;
        }

        @Override
        public String toString() {
            return "ItemSprites{" + "Default=" + Default + '}';
        }

    }

    public class ItemHolderPokemon {

        String pokemon;
        ArrayList<ItemHolderPokemonVersionDetail> version_details;

        public String getPokemon() {
            return pokemon;
        }

        public ArrayList<ItemHolderPokemonVersionDetail> getVersionDetails() {
            return version_details;
        }

        @Override
        public String toString() {
            return "ItemHolderPokemon{" + "pokemon=" + pokemon + ", version_details=" + version_details + '}';
        }

    }

    public class ItemHolderPokemonVersionDetail {

        String rarity;
        NamedAPIResource version;

        public String getRarity() {
            return rarity;
        }

        public NamedAPIResource getVersion() {
            return version;
        }

        @Override
        public String toString() {
            return "ItemHolderPokemonVersionDetail{" + "rarity=" + rarity + ", version=" + version + '}';
        }

    }

}
