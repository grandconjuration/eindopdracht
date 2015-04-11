/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.fnt.gsos.wsconsumer;

import nl.hu.fnt.gsos.wsinterface.DecodeRequest;
import nl.hu.fnt.gsos.wsinterface.DecodeResponse;
import nl.hu.fnt.gsos.wsinterface.EncodeRequest;
import nl.hu.fnt.gsos.wsinterface.EncodeResponse;
import nl.hu.fnt.gsos.wsinterface.MorseService;
import nl.hu.fnt.gsos.wsinterface.MorseServiceSoap;

/**
 *
 * @author Simon
 */
public class Main {
    public static void main(String[] args) {
        MorseService morseService = new MorseService();
        // Dit is de SEI
       MorseServiceSoap service = morseService.getMorseServiceSoap();
        
        EncodeRequest request = new EncodeRequest(); 
        request.setText("hi there");
        try {
           EncodeResponse response = service.encode(request);
           System.out.println(response.getMorse().toString());
        }catch(Exception e) {
            e.printStackTrace();
        }
        
        DecodeRequest request2 = new DecodeRequest();
        request2.setMorse(".... .. | - .... . .-. .");
        try {
           DecodeResponse response2 = service.decode(request2);
           System.out.println(response2.getText().toString());
        }catch(Exception e) {
            e.printStackTrace();
        }        

    }
}

