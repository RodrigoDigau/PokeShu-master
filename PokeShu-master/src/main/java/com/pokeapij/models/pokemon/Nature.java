/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import java.util.ArrayList;

import com.pokeapij.models.common.Name;
import com.pokeapij.models.resources.NamedAPIResource;

/**
 *
 * @author Adam
 */
public class Nature {

    int id;
    String name;
    NamedAPIResource decreased_stat;
    NamedAPIResource increased_stat;
    NamedAPIResource hates_flavor;
    NamedAPIResource likes_flavor;
    ArrayList<NatureStatChange> pokeathlon_stat_changes;
    ArrayList<MoveBattleStylePreference> move_battle_style_preferences;
    ArrayList<Name> names;

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public NamedAPIResource getDecreasedStat() {
        return decreased_stat;
    }

    public NamedAPIResource getIncreasedStat() {
        return increased_stat;
    }

    public NamedAPIResource getHatesFlavor() {
        return hates_flavor;
    }

    public NamedAPIResource getLikesFlavor() {
        return likes_flavor;
    }

    public ArrayList<NatureStatChange> getPokeathlonStatChanges() {
        return pokeathlon_stat_changes;
    }

    public ArrayList<MoveBattleStylePreference> getMoveBattleStylePreferences() {
        return move_battle_style_preferences;
    }

    public ArrayList<Name> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "Nature{" + "id=" + id + ", name=" + name + ", decreased_stat=" + decreased_stat + ", increased_stat=" + increased_stat + ", hates_flavor=" + hates_flavor + ", likes_flavor=" + likes_flavor + ", pokeathlon_stat_changes=" + pokeathlon_stat_changes + ", move_battle_style_preferences=" + move_battle_style_preferences + ", names=" + names + '}';
    }

    public class NatureStatChange {

        int max_change;
        NamedAPIResource pokeathlon_stat;

        public int getMaxChange() {
            return max_change;
        }

        public NamedAPIResource getPokeathlonStat() {
            return pokeathlon_stat;
        }

        @Override
        public String toString() {
            return "NatureStatChange{" + "max_change=" + max_change + ", pokeathlon_stat=" + pokeathlon_stat + '}';
        }

    }

    public class MoveBattleStylePreference {

        int low_hp_preference;
        int high_hp_preference;
        NamedAPIResource move_battle_style;

        public int getLowHPPreference() {
            return low_hp_preference;
        }

        public int getHighHPPreference() {
            return high_hp_preference;
        }

        public NamedAPIResource getMoveBattleStyle() {
            return move_battle_style;
        }

        @Override
        public String toString() {
            return "MoveBattleStylePreference{" + "low_hp_preference=" + low_hp_preference + ", high_hp_preference=" + high_hp_preference + ", move_battle_style=" + move_battle_style + '}';
        }

    }

}
