
package com.pokeapij.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.net.ssl.HttpsURLConnection;

import com.pokeapij.cache.InMemoryCache;
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
import com.pokeapij.models.games.Version;
import com.pokeapij.models.games.VersionGroup;
import com.pokeapij.models.item.Item;
import com.pokeapij.models.item.ItemAttribute;
import com.pokeapij.models.item.ItemCategory;
import com.pokeapij.models.item.ItemFlingEffect;
import com.pokeapij.models.item.ItemPocket;
import com.pokeapij.models.locations.Location;
import com.pokeapij.models.locations.LocationArea;
import com.pokeapij.models.locations.PalParkArea;
import com.pokeapij.models.locations.Region;
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

public class PokeService<gson, gson, gson, gson> implements PokeServiceInterface {

    private final InMemoryCache CACHE = new InMemoryCache();
    private final String BASEURL = "https://pokeapi.co/api/v2/";
    private String JSONSTRING = "";
    private final GsonBuilder BUILDER = new GsonBuilder();
    private final Gson gson = BUILDER.create();
    private long cacheTimeInSeconds = 600;

    @Override
    public Object getResource(String cacheID, String path, String objectName) {
        Object list = queryAPI(path, objectName);
        CACHE.add(cacheID, list, cacheTimeInSeconds * 1000);
        return list;
    }

    @Override
    public Object queryAPI(String path, String ObjectName) {
        try {
            JSONSTRING = "";
            URL url = new URL(BASEURL + path);
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.connect();
            StringBuilder content = new StringBuilder();
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
            }
            JSONSTRING = content.toString();
            conn.disconnect();
        } catch (MalformedURLException ex) {
            Logger.getLogger(PokeService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ProtocolException ex) {
            Logger.getLogger(PokeService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PokeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return parseJSONtoObject(JSONSTRING, ObjectName);
    }

    @Override
    public Object parseJSONtoObject(String jsonString, String Objectname) {
        Object resource = null;
        JsonElement jsonelement = JsonParser.parseString(jsonString);
        if (jsonelement.isJsonObject()) {
            JsonObject jsonObject = jsonelement.getAsJsonObject();

            switch (Objectname) {
                case "NamedAPIResourceList":
                    resource = gson.fromJson(jsonObject.toString(), NamedAPIResourceList.class);
                    break;
                case "APIResourceList":
                    resource = gson.fromJson(jsonObject.toString(), APIResourceList.class);
                    break;
                case "Berry":
                    resource = gson.fromJson(jsonObject.toString(), Berry.class);
                    break;
                case "BerryFirmness":
                    resource = gson.fromJson(jsonObject.toString(), BerryFirmness.class);
                    break;
                case "BerryFlavor":
                    resource = gson.fromJson(jsonObject.toString(), BerryFlavor.class);
                    break;
                case "ContestType":
                    resource = gson.fromJson(jsonObject.toString(), ContestType.class);
                    break;
                case "ContestEffect":
                    resource = gson.fromJson(jsonObject.toString(), ContestEffect.class);
                    break;
                case "SuperContestEffect":
                    resource = gson.fromJson(jsonObject.toString(), SuperContestEffect.class);
                    break;
                case "EncounterMethod":
                    resource = gson.fromJson(jsonObject.toString(), EncounterMethod.class);
                    break;
                case "EncounterCondition":
                    resource = gson.fromJson(jsonObject.toString(), EncounterCondition.class);
                    break;
                case "EncounterConditionValue":
                    resource = gson.fromJson(jsonObject.toString(), EncounterConditionValue.class);
                    break;
                case "EvolutionChain":
                    resource = gson.fromJson(jsonObject.toString(), EvolutionChain.class);
                    break;
                case "EvolutionTrigger":
                    resource = gson.fromJson(jsonObject.toString(), EvolutionTrigger.class);
                    break;
                case "Generation":
                    resource = gson.fromJson(jsonObject.toString(), Generation.class);
                    break;
                case "Pokedex":
                    resource = gson.fromJson(jsonObject.toString(), Pokedex.class);
                    break;
                case "Version":
                    resource = gson.fromJson(jsonObject.toString(), Version.class);
                    break;
                case "VersionGroup":
                    resource = gson.fromJson(jsonObject.toString(), VersionGroup.class);
                    break;
                case "Item":
                    JsonObject e = jsonObject.getAsJsonObject("sprites");
                    e.addProperty("Default", e.get("default").toString());
                    e.remove("default");
                    resource = gson.fromJson(jsonObject.toString(), Item.class);
                    break;
                case "ItemAttribute":
                    resource = gson.fromJson(jsonObject.toString(), ItemAttribute.class);
                    break;
                case "ItemCategory":
                    resource = gson.fromJson(jsonObject.toString(), ItemCategory.class);
                    break;
                case "ItemFlingEffect":
                    resource = gson.fromJson(jsonObject.toString(), ItemFlingEffect.class);
                    break;
                case "ItemPocket":
                    resource = gson.fromJson(jsonObject.toString(), ItemPocket.class);
                    break;
                case "Location":
                    resource = gson.fromJson(jsonObject.toString(), Location.class);
                    break;
                case "LocationArea":
                    resource = gson.fromJson(jsonObject.toString(), LocationArea.class);
                    break;
                case "PalParkArea":
                    resource = gson.fromJson(jsonObject.toString(), PalParkArea.class);
                    break;
                case "Region":
                    resource = gson.fromJson(jsonObject.toString(), Region.class);
                    break;
                case "Machine":
                    resource = gson.fromJson(jsonObject.toString(), Machine.class);
                    break;
                case "Move":
                    resource = gson.fromJson(jsonObject.toString(), Move.class);
                    break;
                case "MoveAilment":
                    resource = gson.fromJson(jsonObject.toString(), MoveAilment.class);
                    break;
                case "MoveBattleStyle":
                    resource = gson.fromJson(jsonObject.toString(), MoveBattleStyle.class);
                    break;
                case "MoveCategory":
                    resource = gson.fromJson(jsonObject.toString(), MoveCategory.class);
                    break;
                case "MoveDamageClass":
                    resource = gson.fromJson(jsonObject.toString(), MoveDamageClass.class);
                    break;
                case "MoveLearnMethod":
                    resource = gson.fromJson(jsonObject.toString(), MoveLearnMethod.class);
                    break;
                case "MoveTarget":
                    resource = gson.fromJson(jsonObject.toString(), MoveTarget.class);
                    break;
                case "Ability":
                    resource = gson.fromJson(jsonObject.toString(), Ability.class);
                    break;
                case "Characteristic":
                    resource = gson.fromJson(jsonObject.toString(), Characteristic.class);
                    break;
                case "EggGroup":
                    resource = gson.fromJson(jsonObject.toString(), EggGroup.class);
                    break;
                case "Gender":
                    resource = gson.fromJson(jsonObject.toString(), Gender.class);
                    break;
                case "GrowthRate":
                    resource = gson.fromJson(jsonObject.toString(), GrowthRate.class);
                    break;
                case "Nature":
                    resource = gson.fromJson(jsonObject.toString(), Nature.class);
                    break;
                case "PokeathlonStat":
                    resource = gson.fromJson(jsonObject.toString(), PokeathlonStat.class);
                    break;
                case "Pokemon":
                    resource = gson.fromJson(jsonObject.toString(), Pokemon.class);
                    break;
                case "PokemonColor":
                    resource = gson.fromJson(jsonObject.toString(), PokemonColor.class);
                    break;
                case "PokemonForm":
                    resource = gson.fromJson(jsonObject.toString(), PokemonForm.class);
                    break;
                case "PokemonHabitat":
                    resource = gson.fromJson(jsonObject.toString(), PokemonHabitat.class);
                    break;
                case "PokemonShape":
                    resource = gson.fromJson(jsonObject.toString(), PokemonShape.class);
                    break;
                case "PokemonSpecies":
                    resource = gson.fromJson(jsonObject.toString(), PokemonSpecies.class);
                    break;
                case "Stat":
                    resource = gson.fromJson(jsonObject.toString(), Stat.class);
                    break;
                case "Type":
                    resource = gson.fromJson(jsonObject.toString(), Type.class);
                    break;
                case "Language":
                    resource = Gson.fromJson(jsonObject.toString(), Language.class);
                    break;
            }
        }
        return resource;
    }

    @Override
    public InMemoryCache getCache() {
        return CACHE;
    }

    @Override
    public void changeCacheTime(long seconds) {
        this.cacheTimeInSeconds = seconds;
    }

    @Override
    public long getCacheTime() {
        return this.cacheTimeInSeconds;
    }

}
