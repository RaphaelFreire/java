package model;

/**
 * @author raphaelmachadofreire 
 * Desenhado um polígono
 * Capítulo 24 - Página 742
 */

import java.awt.*;
import java.applet.*;


/*
    <applet code="HourGlass" width=230 height=210>
    <applet>
*/

public class HourGlass extends Applet {
    
    public void paint(Graphics g){
        
        int xpoints[] = {30,200,30,200,30};
        int ypoints[] = {30,30,200,200,30};
        int num = 5;
        
        g.drawPolygon(xpoints, ypoints, num);
    
    }
    
}
