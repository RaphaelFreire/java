package model;


/**
 * @author raphaelmachadofreire 
 * Manipula eventos de mouse na janela do applet e na janela filha. 
 * Capítulo 24 - Página 733
 */

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
    <applet code="WindowEvents" width=300 heigh=50>
    <applet>
*/

////Cria uma subclasse de Frame
//class SampleFrame extends Frame implements MouseListener, MouseMotionListener{
//
//    String msg = "";
//    int mouseX= 10, mouseY= 40;
//    int movX= 0, movY= 0;
//    
//    SampleFrame(String title){
//        super(title);
//        
//        //Registre esse objeto para receber seus próprios eventos de mouse
//        addMouseListener(this);
//        addMouseMotionListener(this);
//        
//        //Cria um objeto para manipular eventos de janela
//        MyWindowAdapter adapter = new MyWindowAdapter(this);
//        
//        //Registra o objeto para receber tais eventos.
//        addWindowListener(adapter);
//    
//    }
//    
//    //Manipula o clique do mouse
//    public void mouseClicked(MouseEvent me){
//    
//    }
//    
//    //handle mouse entered.
//    public void mouseEntered(MouseEvent evtObj){
//        //salva as coordenadas
//        mouseX = 10;
//        mouseY = 54;
//        msg = "Mouse just entered child.";
//        repaint();
//    
//    }
//
//    //Manipula a saída do mouse
//    public void mouseExited(MouseEvent evtObj){
//        //salva as coordenadas
//        mouseX = 10;
//        mouseY = 54;
//        msg = "Mouse just left child window.";
//        repaint();
//    }
//    
//    //Manipula mouse pressionado
//    public void mousePressed(MouseEvent me){
//        //salva as coordenadas
//        mouseX = me.getX();
//        mouseY = me.getY();
//        msg = "Down";
//        repaint();
//    }
//    
//    //Manipula mouse liberado
//    public void mouseReleased(MouseEvent me){
//        //salva as coordenadas
//        mouseX = me.getX();
//        mouseY = me.getY();
//        msg = "Up";
//        repaint();
//    }
//    
//    //Manipula mouse arrastado.
//    public void mouseDragged(MouseEvent me){
//        //salva as coordenadas
//        mouseX = me.getX();
//        mouseY = me.getY();
//        movX = me.getX();
//        movY = me.getY();
//        msg = "*";
//        repaint();
//    }
//    
//    //Manipula mouse movimentado.
//    public void mouseMoved(MouseEvent me){
//        //salva as coordenadas
//        movX = me.getX();
//        movY = me.getY();
//        repaint(0, 0, 100, 60);
//    }
//    
//    public void paint(Graphics g){
//        g.drawString(msg, mouseX, mouseY);
//        g.drawString("Mouse at " + movX + ", " + movY, 10, 40);
//    
//    }
//}
//
//class MyWindowAdapter extends WindowAdapter{
//    SampleFrame sampleFrame;
//    
//    public MyWindowAdapter(SampleFrame sampleFrame){
//        this.sampleFrame = sampleFrame;
//    }
//    public void windowClosing(WindowEvent we){
//        sampleFrame.setVisible(false);
//    }
//}
//
////Janela Applet
//public class WindowEvents extends Applet implements MouseListener, MouseMotionListener {
//    
//    SampleFrame f;
//    String msg = "";
//    int mouseX = 0, mouseY = 10;
//    int movX = 0, movY = 0;
//    
//    //Cria uma janela frame.
//    public void init(){
//    
//        f = new SampleFrame("Handle Mouse Events");
//        f.setSize(300,200);
//        f.setVisible(true);
//        
//        //Registra este objeto para receber seus próprios eventos de mouse
//        addMouseListener(this);
//        addMouseMotionListener(this);
//        
//    }
//    
//    //Remove a janela frame quando parar o applet
//    public void stop(){
//        f.setVisible(false);
//    }
//    
//    //Exibe a janela frame quando iniciar o applet
//    public void start(){
//        f.setVisible(true);
//    }
//    
//    //Manipula o clique do mouse
//    public void mouseClicked(MouseEvent me){
//    }
//    
//    //Manipula a entrada do mouse.
//    public void mouseEntered(MouseEvent me){
//        //salva as coordenadas 
//        mouseX = 0;
//        mouseY = 24;
//        msg = "Mouse just entered applet window.";
//        repaint();
//    }
//    
//    //Manipula a saida do mouse.
//    public void mouseExited(MouseEvent me){
//        //salva as coordenadas
//        mouseX = 0;
//        mouseY = 24;
//        msg = "Mouse just left applet window.";
//        repaint();
//    }
//    
//    //Manipula botão pressionado
//    public void mousePressed(MouseEvent me){
//        //salva as coordenadas
//        mouseX = me.getX();
//        mouseY = me.getY();
//        msg = "Down";
//        repaint();
//     }
//    
//    //Manipula botão liberado
//    public void mouseReleased(MouseEvent me){
//        //salva as coordenadas
//        mouseX = me.getX();
//        mouseY = me.getY();
//        msg = "Up";
//        repaint();
//    }
//    
//    //Manipula mouse arrastado
//    public void mouseDragged(MouseEvent me){
//        //salva as coordenadas
//        mouseX = me.getX();
//        mouseY = me.getY();
//        movX = me.getX();
//        movY = me.getY();
//        msg = "*";
//        repaint();
//    }
//    
//    //Manipula mouse movimentado.
//    public void mouseMoved(MouseEvent me){
//        //salva as coordenadas
//        movX = me.getX();
//        movY = me.getY();
//        repaint(0,0,100,20);
//    }
//    
//    //Exibe msg na janela applet
//    public void paint(Graphics g){
//        g.drawString(msg,mouseX, mouseY);
//        g.drawString("Mouse at " + movX + ", " + movY, 0, 10);
//    
//    }
//}
