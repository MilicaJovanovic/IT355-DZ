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
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Milica
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/MilicaJovanovic-servlet.xml"})
public class HelloControllerTest {
    @Autowired
    private SobaDao sobaDao;

    private Soba soba;
    
    @Autowired
    private GostDao gostDao;
    
    private Gost gost;

    @Before
    public void setUp() {
            gost = new Gost();
            gost.setGostId(3);
            gost.setIme("Milica");
            gost.setPrezime("Jovanovic");
            gost.setTelefon("065");
            
            soba = new Soba();
            soba.setSobaId(3);
            soba.setBrojKreveta(2);
            soba.setVelicina(25);
            soba.setKupatilo("Da");
            soba.setTv("Da");
            soba.setKlima("Da");
            soba.setCenaPoDanu(30);
    }

    @Test
    @Transactional
    public void testAddGost() {
            boolean result = gostDao.addGost(gost);

            assertTrue(result);
    }
    
    @Test
    @Transactional
    public void testAddSoba() {
            boolean result = sobaDao.addSoba(soba);

            assertTrue(result);
    }   
    
    @Test
    @Transactional
    public void testEditSoba() {
            boolean result = sobaDao.editSoba(soba);

            assertTrue(result);
    } 
    
    @Test
    @Transactional
    public void testEditGost() {
            boolean result = gostDao.editGost(gost);

            assertTrue(result);
    } 
}
