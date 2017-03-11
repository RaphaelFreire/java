package model;

/**
 * @author raphaelmachadofreire 
 * Usando o contexto de um applet, getCodeBase(), e showDocument() para exibir um arquivo HTML
 * Capítulo 22 - Página 698
 */

import java.awt.*;
import java.applet.*;
import java.net.*;

/*
<applet code="ACDemo" width=300 height=50>
<applet>
*/


public class ACDemo extends Applet{
    
    public void start(){
        AppletContext ac = getAppletContext();
        URL url = getCodeBase(); // obtém a URL deste applet
        
        try{
            ac.showDocument(new URL(url+"Test.html"));
        
        }catch(MalformedURLException e){
            showStatus("URL not found");
        }
    
    }
    
}
