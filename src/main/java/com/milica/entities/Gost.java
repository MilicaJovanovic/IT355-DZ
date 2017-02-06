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
@Table(name="gost")
public class Gost {
    private int gostId;
    private String ime;
    private String prezime;
    private String telefon;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "gost_id")
    public int getGostId() {
        return gostId;
    }
    public void setGostId(int gostId) {
        this.gostId = gostId;
    }
    
    @Column(name = "ime")
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    
    @Column(name = "prezime")
    public String getPrezime() {
        return prezime;
    }
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    
    @Column(name = "telefon")
    public String getTelefon() {
        return telefon;
    }
    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Gost{" + "gostId=" + gostId + ", ime=" + ime + ", prezime=" + prezime + ", telefon=" + telefon + '}';
    }
}
