package model;

/**
 * @author raphaelmachadofreire 
 * Demonstração de classe interna
 * Capítulo 23 - Página 724
 */


import java.applet.*;
import java.awt.event.*;

/*
    <applet code="InnerClassDemo" width=200 height=100>
    <applet>
*/

public class InnerClasseDemo extends Applet {
    
    public void init(){
        addMouseListener(new MyMouseAdapter());
    }
    
    class MyMouseAdapter extends MouseAdapter{
        public void mousePressed(MouseEvent me){
            showStatus("Mouse Pressed");
        }
    }
}
