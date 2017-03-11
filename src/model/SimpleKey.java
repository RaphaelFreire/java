package model;

/**
 * @author raphaelmachadofreire 
 * Demonstra a manipulaçao de eventos teclado
 * Capítulo 23 - Página 718
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
    <applet code="SimpleKey" width=300 height=100>
    <applet>
*/


public class SimpleKey extends Applet implements KeyListener {
    
    String msg = "";
    int X = 10, Y = 20; // coordenadas de saída
    
    public void init(){
        addKeyListener(this);
    }
    
    public void keyPressed(KeyEvent ke){
        showStatus("Key Down");
    }
    
    public void keyReleased(KeyEvent ke){
        showStatus("Key Up");
    }
    
    public void keyTyped(KeyEvent ke){
        msg += ke.getKeyChar();
        repaint();
    }
    
    //Exibe os caracteres digitados
    public void paint(Graphics g){
        g.drawString(msg, X, Y);
    }
}
