package model;

/**
 * @author raphaelmachadofreire 
 * Exibe a base de código e o documento da base
 * Capítulo 22 - Página 696
 */

import java.awt.*;
import java.applet.*;
import java.net.*;

/*
    <applet code="Bases" width=300 height=50>
    <applet>
*/


public class Bases extends Applet {
    
    // Exibe a base de código e o documento da base.
    
    public void paint(Graphics g){
        
        String msg;
        
        URL url = getCodeBase();
        msg = "Code base: " + url.toString();
        g.drawString(msg, 10, 20);
        
        url = getDocumentBase();
        msg = "Document base: " + url.toString();
        g.drawString(msg, 10, 40);
    
    
    }
    
}
