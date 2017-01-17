/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.dao.impl;

import com.milica.dao.SobaDao;

/**
 *
 * @author Milica
 */
public class SobaDaoImpl implements SobaDao {

    @Override
    public void addSoba() {
        System.out.println("Dodajem sobu!");
    }

    @Override
    public String addSobaRet() {
        System.out.println("Dodajem sobu i vracam vrednost!");
        return "Soba dodatata!";
    }

    @Override
    public void addSobaThrowException() throws Exception {
        System.out.println("Dodajem sobu, ali bacicu gresku!");
        throw new Exception("Generic Error!");
    }

    @Override
    public void addSobaAround(String bedNumber) {
        System.out.println("Dodajem studenta sa: " + bedNumber + " kreveta!");
    }
    
}
