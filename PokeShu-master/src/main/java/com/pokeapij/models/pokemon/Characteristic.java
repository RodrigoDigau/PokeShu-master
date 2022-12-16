/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.pokemon;

import java.util.ArrayList;

import com.pokeapij.models.berries.Berry;

/**
 *
 * @author Adam
 */
public class Characteristic {

    int id;
    int gene_modulo;
    ArrayList<Integer> possible_values;

    public int getID() {
        return id;
    }

    public int getGeneModulo() {
        return gene_modulo;
    }

    public ArrayList<Integer> getPossibleValues() {
        return possible_values;
    }

    @Override
    public String toString() {
        return "Characteristic{" + "id=" + id + ", gene_modulo=" + gene_modulo + ", possible_values=" + possible_values + '}';
    }

	public Berry getHighestStat() {
		// TODO Auto-generated method stub
		return null;
	}

}
