package model;

/**
 * @author raphaelmachadofreire 
 * A Classe Applet 
 * Usando a janela de Status
 * Capítulo 22 - Página 691
 */

import java.awt.*;
import java.applet.*;

/*
    <applet code="StatusWindow" width=300 height=50>
    </applet>
*/

public class StatusWindow extends Applet {
    
    public void init(){
        setBackground(Color.cyan);
    }
    
    //Exibe uma mensagem na janela do Applet
    public void paint(Graphics g){
        g.drawString("This is int the applet window", 10, 20);
        showStatus("This is show in the status window");
    
    }
}
