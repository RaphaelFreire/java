package model;

/**
 * @author raphaelmachadofreire 
 * Demonstra uma classe adaptadora
 * Capítulo 23 - Página 722
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
    <applet code="AdapterDemo" width=300 height=100>
    </applet>
*/

public class AdapterDemo extends Applet {
    
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
     }
}


class MyMouseAdapter extends MouseAdapter{

    AdapterDemo adapterDemo;
    public MyMouseAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }
    
    //manipula o clique do Mouse
    public void mouseClicked(MouseEvent me){
        adapterDemo.showStatus("Mouse clicked");
    }
}


class MyMouseMotionAdapter extends MouseMotionAdapter{
    AdapterDemo adapterDemo;
    public MyMouseMotionAdapter(AdapterDemo adapterDemo){
        this.adapterDemo = adapterDemo;
    }
    
    //manipula o arrastar do mouse
    public void mouseDragged(MouseEvent me){
        adapterDemo.showStatus("Mouse dragged");
    }

}