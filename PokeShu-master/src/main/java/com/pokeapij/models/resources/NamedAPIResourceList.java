/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pokeapij.models.resources;

import java.util.ArrayList;

/**
 *
 * @author Adam
 */
public class NamedAPIResourceList {

    int count;
    String next;
    boolean previous;
    ArrayList<NamedAPIResource> results;

    public int getCount() {
        return count;
    }

    public String getNext() {
        return next;
    }

    public boolean isPrevious() {
        return previous;
    }

    public ArrayList<NamedAPIResource> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "NamedAPIResourceList{" + "count=" + count + ", next=" + next + ", previous=" + previous + ", results=" + results + '}';
    }

}
