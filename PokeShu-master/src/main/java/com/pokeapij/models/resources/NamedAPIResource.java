/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.resources;

import com.pokeapij.models.berries.Berry;

/**
 *
 * @author Adam
 */
public class NamedAPIResource {

    String name;
    String url;

    public String getName() {
        return name;
    }

    public String getURL() {
        return url;
    }

    @Override
    public String toString() {
        return "NamedAPIResource{" + "name=" + name + ", URL=" + url + '}';
    }

	public Berry get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
