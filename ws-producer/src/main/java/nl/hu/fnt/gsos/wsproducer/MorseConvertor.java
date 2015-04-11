/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hu.fnt.gsos.wsproducer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Simon Whiteley <simonwhiteley@hotmail.com>
 */
public class MorseConvertor {

    private static HashMap<String, String> morseToText = new HashMap<String, String>();
    private static HashMap<String, String> textToMorse = new HashMap<String, String>();

    public MorseConvertor() {
        initiliaze();
    }

    public void initiliaze() {
        morseToText.put("a", ".-");
        morseToText.put("b", "-...");
        morseToText.put("c", "-.-");
        morseToText.put("d", "-..");
        morseToText.put("e", ".");
        morseToText.put("f", "..-.");
        morseToText.put("g", "--.");
        morseToText.put("h", "....");
        morseToText.put("i", "..");
        morseToText.put("j", ".---");
        morseToText.put("k", "-.");
        morseToText.put("l", ".-..");
        morseToText.put("m", "--");
        morseToText.put("n", "-.");
        morseToText.put("o", "---");
        morseToText.put("p", ".--.");
        morseToText.put("q", "--.-");
        morseToText.put("r", ".-.");
        morseToText.put("s", "...");
        morseToText.put("t", "-");
        morseToText.put("u", "..-");
        morseToText.put("v", "...-");
        morseToText.put("w", ".--");
        morseToText.put("x", "-..-");
        morseToText.put("y", "-.--");
        morseToText.put("z", "--..");
        morseToText.put("1", ".----");
        morseToText.put("2", "..---");
        morseToText.put("3", "...--");
        morseToText.put("4", "....-");
        morseToText.put("5", ".....");
        morseToText.put("6", "-....");
        morseToText.put("7", "--...");
        morseToText.put("8", "---..");
        morseToText.put("9", "----.");
        morseToText.put("0", "-----");
        morseToText.put(" ", "|");
        
        for(Map.Entry<String, String> entry : morseToText.entrySet()) {
            textToMorse.put(entry.getValue(), entry.getKey());
        }
    }

    public String encode(String text) { 
        String returnval = new String();
        String input = text.toLowerCase();
        
        for (int i = 0; i < input.length(); i++) {
            String currentCharacter = String.valueOf(input.charAt(i));
            
            String morseCode = morseToText.get(currentCharacter);
            if(i != 0) {
                returnval += " " + morseCode;
            } else { 
                returnval += morseCode;
            }
        }
        return returnval;
    }
    
    public String decode(String m) { 
        String returnval = new String();
        String input = m;
        
        String[] splitted = m.split("\\s+");
        
        for(String s : splitted) {
            returnval += textToMorse.get(s).toUpperCase();
        }
        return returnval;
    }

}
