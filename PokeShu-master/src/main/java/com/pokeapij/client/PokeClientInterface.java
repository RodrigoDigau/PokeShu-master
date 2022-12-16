package com.pokeapij.client;

import com.pokeapij.models.berries.Berry;
import com.pokeapij.models.berries.BerryFirmness;
import com.pokeapij.models.berries.BerryFlavor;
import com.pokeapij.models.contests.ContestEffect;
import com.pokeapij.models.contests.ContestType;
import com.pokeapij.models.contests.SuperContestEffect;
import com.pokeapij.models.encounters.EncounterCondition;
import com.pokeapij.models.encounters.EncounterConditionValue;
import com.pokeapij.models.encounters.EncounterMethod;
import com.pokeapij.models.evolution.EvolutionChain;
import com.pokeapij.models.evolution.EvolutionTrigger;
import com.pokeapij.models.games.Generation;
import com.pokeapij.models.games.Pokedex;
import com.pokeapij.models.games.VersionGroup;
import com.pokeapij.models.item.Item;
import com.pokeapij.models.item.ItemAttribute;
import com.pokeapij.models.item.ItemCategory;
import com.pokeapij.models.item.ItemFlingEffect;
import com.pokeapij.models.item.ItemPocket;
import com.pokeapij.models.locations.Location;
import com.pokeapij.models.locations.LocationArea;
import com.pokeapij.models.locations.PalParkArea;
import com.pokeapij.models.machines.Machine;
import com.pokeapij.models.moves.Move;
import com.pokeapij.models.moves.MoveAilment;
import com.pokeapij.models.moves.MoveBattleStyle;
import com.pokeapij.models.moves.MoveCategory;
import com.pokeapij.models.moves.MoveDamageClass;
import com.pokeapij.models.moves.MoveLearnMethod;
import com.pokeapij.models.moves.MoveTarget;
import com.pokeapij.models.pokemon.Ability;
import com.pokeapij.models.pokemon.Characteristic;
import com.pokeapij.models.pokemon.EggGroup;
import com.pokeapij.models.pokemon.Gender;
import com.pokeapij.models.pokemon.GrowthRate;
import com.pokeapij.models.pokemon.Nature;
import com.pokeapij.models.pokemon.PokeathlonStat;
import com.pokeapij.models.pokemon.Pokemon;
import com.pokeapij.models.pokemon.PokemonColor;
import com.pokeapij.models.pokemon.PokemonForm;
import com.pokeapij.models.pokemon.PokemonHabitat;
import com.pokeapij.models.pokemon.PokemonShape;
import com.pokeapij.models.pokemon.PokemonSpecies;
import com.pokeapij.models.pokemon.Stat;
import com.pokeapij.models.pokemon.Type;
import com.pokeapij.models.resources.APIResourceList;
import com.pokeapij.models.resources.NamedAPIResourceList;
import com.pokeapij.models.utility.Language;


public interface PokeClientInterface {

    void clearCache();

    void changeCacheTimeAmount(long seconds);

    long getCacheTime();

    //BERRY LISTS
    NamedAPIResourceList getBerryList(int offset, int limit);

    NamedAPIResourceList getBerryFirmnessList(int offset, int limit);

    NamedAPIResourceList getBerryFlavorList(int offset, int limit);

    //CONTEST LISTS
    NamedAPIResourceList getContestTypeList(int offset, int limit);

    APIResourceList getContestEffectList(int offset, int limit);

    APIResourceList getSuperContestEffectList(int offset, int limit);

    //ENCOUNTER LISTS
    NamedAPIResourceList getEncounterMethodList(int offset, int limit);

    NamedAPIResourceList getEncounterConditionList(int offset, int limit);

    NamedAPIResourceList getEncounterConditionValueList(int offset, int limit);

    //EVOLUTION LISTS
    APIResourceList getEvolutionChainList(int offset, int limit);

    NamedAPIResourceList getEvolutionTriggerList(int offset, int limit);

    //GAME LISTS
    NamedAPIResourceList getGenerationList(int offset, int limit);

    NamedAPIResourceList getPokedexList(int offset, int limit);

    NamedAPIResourceList getVersionList(int offset, int limit);

    NamedAPIResourceList getVersionGroupList(int offset, int limit);

    //ITEM LISTS
    NamedAPIResourceList getItemList(int offset, int limit);

    NamedAPIResourceList getItemAttributeList(int offset, int limit);

    NamedAPIResourceList getItemCategoryList(int offset, int limit);

    NamedAPIResourceList getItemFlingEffectList(int offset, int limit);

    NamedAPIResourceList getItemPocketList(int offset, int limit);

    //LOCATION LISTS
    NamedAPIResourceList getLocationList(int offset, int limit);

    NamedAPIResourceList getLocationAreaList(int offset, int limit);

    NamedAPIResourceList getPalParkAreaList(int offset, int limit);

    NamedAPIResourceList getRegionList(int offset, int limit);

    //MACHINE LISTS
    APIResourceList getMachineList(int offset, int limit);

    //MOVES LISTS
    NamedAPIResourceList getMoveList(int offset, int limit);

    NamedAPIResourceList getMoveAilmentList(int offset, int limit);

    NamedAPIResourceList getMoveBattleStyleList(int offset, int limit);

    NamedAPIResourceList getMoveCategoryList(int offset, int limit);

    NamedAPIResourceList getMoveDamageClassList(int offset, int limit);

    NamedAPIResourceList getMoveLearnMethodList(int offset, int limit);

    NamedAPIResourceList getMoveTargetList(int offset, int limit);

    //POKEMON LISTS
    NamedAPIResourceList getAbilityList(int offset, int limit);

    APIResourceList getCharacteristicList(int offset, int limit);

    NamedAPIResourceList getEggGroupList(int offset, int limit);

    NamedAPIResourceList getGenderList(int offset, int limit);

    NamedAPIResourceList getGrowthRateList(int offset, int limit);

    NamedAPIResourceList getNatureList(int offset, int limit);

    NamedAPIResourceList getPokeathlonStatList(int offset, int limit);

    NamedAPIResourceList getPokemonList(int offset, int limit);

    NamedAPIResourceList getPokemonColorList(int offset, int limit);

    NamedAPIResourceList getPokemonFormList(int offset, int limit);

    NamedAPIResourceList getPokemonHabitatList(int offset, int limit);

    NamedAPIResourceList getPokemonShapeList(int offset, int limit);

    NamedAPIResourceList getPokemonSpeciesList(int offset, int limit);

    NamedAPIResourceList getStatList(int offset, int limit);

    NamedAPIResourceList getTypeList(int offset, int limit);

    //UTILITY LISTS
    NamedAPIResourceList getLanguageList(int offset, int limit);

    //SINGLE BERRY
    Berry getBerry(int id);

    Berry getBerry(String name);

    BerryFirmness getBerryFirmness(int id);

    BerryFirmness getBerryFirmness(String name);

    BerryFlavor getBerryFlavor(int id);

    BerryFlavor getBerryFlavor(String name);

    //SINGLE CONTEST
    ContestType getContestType(int id);

    ContestType getContestType(String name);

    ContestEffect getContestEffect(int id);

    SuperContestEffect getSuperContestEffect(int id);

    //SINGLE ENCOUNTER
    EncounterMethod getEncounterMethod(int id);

    EncounterMethod getEncounterMethod(String name);

    EncounterCondition getEncounterCondition(int id);

    EncounterCondition getEncounterCondition(String name);

    EncounterConditionValue getEncounterConditionValue(int id);

    EncounterConditionValue getEncounterConditionValue(String name);

    //SINGLE EVOLUTION
    EvolutionChain getEvolutionChain(int id);

    EvolutionTrigger getEvolutionTrigger(int id);

    EvolutionTrigger getEvolutionTrigger(String name);

    //SINGLE GAME
    Generation getGeneration(int id);

    Generation getGeneration(String name);

    Pokedex getPokedex(int id);

    Pokedex getPokedex(String name);

    <Version> Version getVersion(int id);

    <Version> Version getVersion(String name);

    VersionGroup getVersionGroup(int id);

    VersionGroup getVersionGroup(String name);

    //SINGLE ITEM
    Item getItem(int id);

    Item getItem(String name);

    ItemAttribute getItemAttribute(int id);

    ItemAttribute getItemAttribute(String name);

    ItemCategory getItemCategory(int id);

    ItemCategory getItemCategory(String name);

    ItemFlingEffect getItemFlingEffect(int id);

    ItemFlingEffect getItemFlingEffect(String name);

    ItemPocket getItemPocket(int id);

    ItemPocket getItemPocket(String name);

    //SINGLE LOCATION
    Location getLocation(int id);

    Location getLocation(String name);

    LocationArea getLocationArea(int id);

    LocationArea getLocationArea(String name);

    PalParkArea getPalParkArea(int id);

    PalParkArea getPalParkArea(String name);

    <Region> Region getRegion(int id);

    <Region> Region getRegion(String name);

    //SINGLE MACHINE
    Machine getMachine(int id);

    //SINGLE MOVE
    Move getMove(int id);

    Move getMove(String name);

    MoveAilment getMoveAilment(int id);

    MoveAilment getMoveAilment(String name);

    MoveBattleStyle getMoveBattleStyle(int id);

    MoveBattleStyle getMoveBattleStyle(String name);

    MoveCategory getMoveCategory(int id);

    MoveCategory getMoveCategory(String name);

    MoveDamageClass getMoveDamageClass(int id);

    MoveDamageClass getMoveDamageClass(String name);

    MoveLearnMethod getMoveLearnMethod(int id);

    MoveLearnMethod getMoveLearnMethod(String name);

    MoveTarget getMoveTarget(int id);

    MoveTarget getMoveTarget(String name);

    //SINGLE POKEMON
    Ability getAbility(int id);

    Ability getAbility(String name);

    Characteristic getCharacteristic(int id);

    EggGroup getEggGroup(int id);

    EggGroup getEggGroup(String name);

    Gender getGender(int id);

    Gender getGender(String name);

    GrowthRate getGrowthRate(int id);

    GrowthRate getGrowthRate(String name);

    Nature getNature(int id);

    Nature getNature(String name);

    PokeathlonStat getPokeathlonStat(int id);

    PokeathlonStat getPokeathlonStat(String name);

    Pokemon getPokemon(int id);

    Pokemon getPokemon(String name);

    PokemonColor getPokemonColor(int id);

    PokemonColor getPokemonColor(String name);

    PokemonForm getPokemonForm(int id);

    PokemonForm getPokemonForm(String name);

    PokemonHabitat getPokemonHabitat(int id);

    PokemonHabitat getPokemonHabitat(String name);

    PokemonShape getPokemonShape(int id);

    PokemonShape getPokemonShape(String name);

    PokemonSpecies getPokemonSpecies(int id);

    PokemonSpecies getPokemonSpecies(String name);

    Stat getStat(int id);

    Stat getStat(String name);

    Type getType(int id);

    Type getType(String name);

    //SINGLE UTILITY
    Language getLanguage(int id);

    Language getLanguage(String name);

}
