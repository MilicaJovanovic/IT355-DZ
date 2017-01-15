/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.model;

/**
 *
 * @author Milica
 */
public class Soba {
    private int brojKreveta;
    private double velicina;
    private String kupatilo;
    private String tv;
    private String klima;
    private double cenaPoDanu;
    
    public Soba() {}

    public Soba(int brojKreveta, double velicina, String kupatilo, String tv, String klima, double cenaPoDanu) {
        this.brojKreveta = brojKreveta;
        this.velicina = velicina;
        this.kupatilo = kupatilo;
        this.tv = tv;
        this.klima = klima;
        this.cenaPoDanu = cenaPoDanu;
    }

    public int getBrojKreveta() {
        return brojKreveta;
    }

    public void setBrojKreveta(int brojKreveta) {
        this.brojKreveta = brojKreveta;
    }

    public double getVelicina() {
        return velicina;
    }

    public void setVelicina(double velicina) {
        this.velicina = velicina;
    }

    public String getKupatilo() {
        return kupatilo;
    }

    public void setKupatilo(String kupatilo) {
        this.kupatilo = kupatilo;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getKlima() {
        return klima;
    }

    public void setKlima(String klima) {
        this.klima = klima;
    }

    public double getCenaPoDanu() {
        return cenaPoDanu;
    }

    public void setCenaPoDanu(double cenaPoDanu) {
        this.cenaPoDanu = cenaPoDanu;
    }
}
