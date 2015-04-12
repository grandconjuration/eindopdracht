/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.simonwhiteley.tests;

import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.TestCase;
import nl.hu.fnt.gsos.wsinterface.Applicationfault;
import nl.hu.fnt.gsos.wsinterface.DecodeRequest;
import nl.hu.fnt.gsos.wsinterface.DecodeResponse;
import nl.hu.fnt.gsos.wsinterface.EncodeRequest;
import nl.hu.fnt.gsos.wsinterface.EncodeResponse;
import nl.hu.fnt.gsos.wsinterface.MorseService;
import nl.hu.fnt.gsos.wsinterface.MorseServiceSoap;

/**
 *
 * @author Simon Whiteley <simonwhiteley@hotmail.com>
 */
public class integrationTest extends TestCase {
    
    public MorseService morseService;
    public MorseServiceSoap service;
    
    public integrationTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        morseService = new MorseService();
        // Dit is de SEI
       service = morseService.getMorseServiceSoap();        
       super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testEncode() throws Exception {
        
        EncodeRequest request = new EncodeRequest(); 
        request.setText("hi there");
        try {
           EncodeResponse response = service.encode(request);
           System.out.println(response.getMorse().toString());
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
            assertEquals("Return value of \"hi there\" must be \".... .. | - .... . .-. .\" in morse",
                    ".... .. | - .... . .-. .",
                    service.encode(request).getMorse().toString());
        } catch (Applicationfault ex) {
            Logger.getLogger(integrationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void testEncode2() throws Exception {
        
        EncodeRequest request = new EncodeRequest(); 
        request.setText("This must be returned in morse");
        try {
           EncodeResponse response = service.encode(request);
           System.out.println(response.getMorse().toString());
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
            assertEquals("Return value of \"This must be returned in morse\" must be \"- .... .. ... | -- ..- ... - | -... . | .-. . - ..- .-. -. . -.. | .. -. | -- --- .-. ... .\" in morse",
                    "- .... .. ... | -- ..- ... - | -... . | .-. . - ..- .-. -. . -.. | .. -. | -- --- .-. ... .",
                    service.encode(request).getMorse().toString());
        } catch (Applicationfault ex) {
            Logger.getLogger(integrationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
    
    public void testDecode() throws Exception {
        
        DecodeRequest request = new DecodeRequest(); 
        request.setMorse(".... .. | - .... . .-. .");
        try {
           DecodeResponse response = service.decode(request);
           System.out.println(response.getText());
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
            assertEquals("Return value of \".... .. | - .... . .-. .\" must be \"HI THERE\" in morse",
                    "HI THERE",
                    service.decode(request).getText().toString());
        } catch (Applicationfault ex) {
            Logger.getLogger(integrationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void testDecode2() throws Exception {
        
        DecodeRequest request = new DecodeRequest(); 
        request.setMorse("- .... .. ... | -- ..- ... - | -... . | .-. . - ..- .-. -. . -.. | .. -. | -- --- .-. ... .");
        try {
           DecodeResponse response = service.decode(request);
           System.out.println(response.getText());
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        try {
            assertEquals("Return value of \"- .... .. ... | -- ..- ... - | -... . | .-. . - ..- .-. -. . -.. | .. -. | -- --- .-. ... .\" must be \"THIS IS MUST BE RETURNED IN MORSE\" in morse",
                    "THIS MUST BE RETURNED IN MORSE",
                    service.decode(request).getText());
        } catch (Applicationfault ex) {
            Logger.getLogger(integrationTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }  
}
