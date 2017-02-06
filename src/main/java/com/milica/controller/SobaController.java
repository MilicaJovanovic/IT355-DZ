/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.milica.controller;

import com.milica.dao.SobaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Milica
 */
@Controller
@RequestMapping("/soba")
public class SobaController {
    @Autowired
    private MessageSource messageSource;
    
    @Autowired
    private SobaDao sobaDao;
   
}
