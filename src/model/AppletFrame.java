package model;

/**
 * @author raphaelmachadofreire 
 * Cria uma janela filha do tipo frame dentro de applet. 
 * Capítulo 24 - Página 731
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
 <applet code="AppletFrame" width=300 height=50>
 <applet>
*/

// Cria uma subclasse de Frame.
class SampleFrame extends Frame {

    SampleFrame(String title) {
        super(title);

        //Cria um objeto para manipular eventos de janela
        MyWindowAdapter adapter = new MyWindowAdapter(this);

        //Registra o objeto para receber tais eventos
        addWindowListener(adapter);
    }

    public void paint(Graphics g) {
        g.drawString("This is in frame window", 10, 40);
    }

}

class MyWindowAdapter extends WindowAdapter {

    SampleFrame sampleFrame;

    public MyWindowAdapter(SampleFrame sampleFrame) {
        this.sampleFrame = sampleFrame;
    }

    public void windowClosing(WindowEvent we) {
        sampleFrame.setVisible(false);
    }

}

//Cria uma janela frame 

public class AppletFrame extends Applet{

    Frame f;
    
    public void init(){
        f = new SampleFrame("A Frame Window");
        f.setSize(250,250);
        f.setVisible(true);
        
    }
    
    public void start(){
        f.setVisible(true);
    }
    
    public void stop(){
        f.setVisible(false);
    }
    
    public void paint(Graphics g){
        g.drawString("This is in applet window", 10, 20);
    }

}