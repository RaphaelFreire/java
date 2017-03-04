package model;

/**
 * @author raphaelmachadofreire 
 * Melhorando Applet para o Banner
 * Capítulo 22 - Página 694
 */

//Um banner parametrizado
import java.awt.*;
import java.applet.*;

/*
    <APPLET code="ParamBanner" width=300 height=50>
    <PARAM name="message" value="Java makes the web move!">
    </APPLET>
*/

public class ParamBanner extends Applet implements Runnable{
    
    String msg;
    Thread t = null;
    int state;
    volatile boolean stopFlag;
    
    //Configura as cores e inicializa o applet.
    
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
    }
    
    //Inicia a thread
    
    public void start(){
    
        msg = getParameter("message");
        
        if(msg == null) msg = "Mensagem não encontrada.";
        msg = " " + msg;
        
        t= new Thread(this);
        stopFlag = false;
        t.start();
    
    }
    
    //Ponto de entrada para a thread que roda o banner
    
   public void run(){
       
       //Re-exibe o banner
       for( ; ; ){
           try{
               repaint();
               Thread.sleep(250);
               if(stopFlag)
                   break;
           
           }catch(InterruptedException e){}
            }
        }       
       //Pausa o banner
       
       public void stop(){
           stopFlag = true;
           t = null;
        }
       
       //Exibe o banner.
       public void paint(Graphics g){
           char ch;
           ch = msg.charAt(0);
           msg = msg.substring(1, msg.length());
           msg += ch;
           
           g.drawString(msg, 50, 30);
       
       
       }
   
   }
    
