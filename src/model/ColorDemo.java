package model;

/**
 * @author raphaelmachadofreire 
 * Um applet de Demonstração de Cores
 * Capítulo 24 - Página 745
 */

import java.awt.*;
import java.applet.*;

/*
    <applet code="ColorDemo" width=300 height=200>
    <applet>
*/

public class ColorDemo extends Applet {
        
        //desenha linhas
        public void paint(Graphics g){
            Color c1 = new Color(255, 100, 100);
            Color c2 = new Color(100, 255, 100);
            Color c3 = new Color(100, 100, 255);
            
            g.setColor(c1);
            g.drawLine(0, 0, 100, 100);
            g.drawLine(0, 100, 100, 0);
            
            g.setColor(c2);
            g.drawLine(40, 25, 250, 180);
            g.drawLine(75, 90, 400, 400);
            
            g.setColor(c3);
            g.drawLine(20,150,400,40);
            g.drawLine(5, 290, 80, 19);
            
            g.setColor(Color.red);
            g.drawOval(10, 10, 50, 50);
            g.fillOval(70, 90, 140, 100);
            
            
        
        }
    }
    
