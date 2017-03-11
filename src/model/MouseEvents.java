package model;

/**
 * @author raphaelmachadofreire 
 * Demonstra a manipulação de eventos de mouse
 * Capítulo 23 - Página 717
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;


/*
    <applet code="MouseEvents" width=300 height=100>
    </applet>
*/

public class MouseEvents extends Applet implements MouseListener, MouseMotionListener {
    
    String msg = "";
    int mouseX = 0, mouseY = 0; //coordenadas de mouse
    
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
     }
    
    //Manipula o clique do mouse
    public void mouseClicked(MouseEvent me){
        //salva as coordenadas
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse clicked.";
        repaint();
  
    }
    
    //Manipula a entrada do mouse
    public void mouseEntered(MouseEvent me){
        //salva as coordenadas
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse entered.";
        repaint();
    
    }
    
    //Manipula a saída do mouse.
    public void mouseExited(MouseEvent me){
       
        //salva as coordenadas
        mouseX = 0;
        mouseY = 10;
        msg = "Mouse exited.";
        repaint();
    }
    
    //Manipula botões pressionados.
    public void mousePressed(MouseEvent me){
       
        //salva as coordenadas
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Down";
        repaint();
    }
    
    //Manipula botões liberadis.
     public void mouseReleased(MouseEvent me){
        
        //salva as coordenadas
         mouseX = me.getX();
         mouseY = me.getY();
         msg = "Up";
         repaint();
    
    }
     
    //Manipula mouse arrastado
     public void mouseDragged(MouseEvent me){
         
        //salva as coordenadas
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*";
        showStatus("Dragging mouse at " + mouseX + ", " + mouseY);
        repaint();
     
     }
     
     //manipula mouse movimentado.
     public void mouseMoved(MouseEvent me){
         // Exibe o status
         showStatus("Moving mouse at" + me.getX() + ", " + me.getY());
     }
     
     //Exibe msg na janela do applet, na posição X, Y atual.
     public void paint(Graphics g){
         g.drawString(msg, mouseX, mouseY);
     
     }
     
}
