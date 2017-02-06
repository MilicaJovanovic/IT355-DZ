/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Milica
 */
@Entity
@Table(name="soba")
public class Soba {
    private int sobaId;
    private int brojKreveta;
    private double velicina;
    private String kupatilo;
    private String tv;
    private String klima;
    private double cenaPoDanu;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "soba_id")
    public int getSobaId() {
        return sobaId;
    }
    public void setSobaId(int sobaId) {
        this.sobaId = sobaId;
    }
    
    @Column(name = "broj_kreveta")
    public int getBrojKreveta() {
        return brojKreveta;
    }
    public void setBrojKreveta(int brojKreveta) {
        this.brojKreveta = brojKreveta;
    }
    
    @Column(name = "velicina")
    public double getVelicina() {
        return velicina;
    }
    public void setVelicina(double velicina) {
        this.velicina = velicina;
    }
    
    @Column(name = "kupatilo")
    public String getKupatilo() {
        return kupatilo;
    }
    public void setKupatilo(String kupatilo) {
        this.kupatilo = kupatilo;
    }

    @Column(name = "tv")
    public String getTv() {
        return tv;
    }
    public void setTv(String tv) {
        this.tv = tv;
    }
    
    @Column(name = "klima")
    public String getKlima() {
        return klima;
    }
    public void setKlima(String klima) {
        this.klima = klima;
    }
    
    @Column(name = "cena_po_danu")
    public double getCenaPoDanu() {
        return cenaPoDanu;
    }
    public void setCenaPoDanu(double cenaPoDanu) {
        this.cenaPoDanu = cenaPoDanu;
    }

    @Override
    public String toString() {
        return "Soba{" + "sobaId=" + sobaId + ", brojKreveta=" + brojKreveta + ", velicina=" + velicina + ", kupatilo=" + kupatilo + ", tv=" + tv + ", klima=" + klima + ", cenaPoDanu=" + cenaPoDanu + '}';
    } 
}
