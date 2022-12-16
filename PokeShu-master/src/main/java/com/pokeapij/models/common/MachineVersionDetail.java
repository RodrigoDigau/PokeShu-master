
package com.pokeapij.models.common;

import com.pokeapij.models.resources.APIResource;
import com.pokeapij.models.resources.NamedAPIResource;


public class MachineVersionDetail {

    APIResource machine;
    NamedAPIResource version_group;

    public APIResource getMachine() {
        return machine;
    }

    public NamedAPIResource getVersionGroup() {
        return version_group;
    }

    @Override
    public String toString() {
        return "MachineVersionDetail{" + "machine=" + machine + ", version_group=" + version_group + '}';
    }

}
