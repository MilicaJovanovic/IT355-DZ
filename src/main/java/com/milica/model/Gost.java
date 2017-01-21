package com.milica.model;

import java.io.Serializable;

/**
 *
 * @author Milica
 */
@SuppressWarnings("serial")
public class Gost implements Serializable {
    private int id;
    private String ime;
    private String prezime;
    private String telefon;
    
    public Gost() {}

    public Gost(int id, String ime, String prezime, String telefon) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Gost{" + "id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", telefon=" + telefon + '}';
    }
}
