/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.controller;

import com.milica.dao.GostDao;
import com.milica.dao.SobaDao;
import com.milica.entities.Gost;
import com.milica.entities.Soba;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Milica
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    private SobaDao sobaDao;
    
    @Autowired
    private GostDao gostDao;
    
    @RequestMapping(value = "/sobe", method = RequestMethod.GET)
    public ResponseEntity<List<Soba>> getSobe() {
        System.out.println("Fetching products");
        List<Soba> sobe = sobaDao.getSobe();
        if (sobe.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(sobe, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/soba/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Soba> getSoba(@PathVariable("id") int id) {
        System.out.println("Fetching product with id " + id);
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(soba, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/addsoba/", method = RequestMethod.POST)
    public ResponseEntity<Void> addSoba(@RequestBody Soba soba) {
        sobaDao.addSoba(soba);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/soba/{id}", method =  RequestMethod.PUT)
    public ResponseEntity<Soba> updateSoba(@PathVariable("id") int id, @RequestBody Soba soba) {
        soba.setSobaId(id);
        sobaDao.editSoba(soba);
        return new ResponseEntity<>(soba, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/soba/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Soba> deleteSoba(@PathVariable("id") int id) {
        Soba soba = sobaDao.getSobaById(id);
        if (soba == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        sobaDao.deleteSoba(soba);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    @RequestMapping(value = "/gosti", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Gost>> getGosti() {
        List<Gost> gosti = gostDao.getGosti();
        if (gosti.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(gosti, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/gost/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Gost> getGost(@PathVariable("id") int id) {
        Gost gost = gostDao.getGostById(id);
        if (gost == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(gost, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/addgost/", method = RequestMethod.POST)
    public ResponseEntity<Void> addGostt(@RequestBody Gost gost) {
        gostDao.addGost(gost);
        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }
    
    @RequestMapping(value = "/gost/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Gost> updateGost(@PathVariable("id") int id, @RequestBody Gost gost) {
        gost.setGostId(id);
        gostDao.editGost(gost);
        return new ResponseEntity<>(gost, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/gost/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Gost> deleteGost(@PathVariable("id") int id) {
        Gost gost = gostDao.getGostById(id);
        if (gost == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        gostDao.deleteGost(gost);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
