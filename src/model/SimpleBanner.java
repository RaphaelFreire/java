package model;

/**
 * @author raphaelmachadofreire 
 * A Classe Applet 
 * Um Applet simples para um banner
 * Capítulo 22 - Página 689
 */

import java.awt.*;
import java.applet.*;

/*
 <applet code="SimpleBanner" width=300 height=50>
 </applet>
 */
public class SimpleBanner extends Applet implements Runnable {

    String msg = " A Simple Moving Banner.";
    Thread t = null;
    int state;
    volatile boolean stopFlag;

    //Configura as cores e inicializa o Applet
    public void init() {

        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    //Inicializa a Thread
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }

    //Ponto de entrada para a Thread que roda banner.
    public void run() {

        //Re-exxibe o banner
        for (;;) {
            try {
                repaint();
                Thread.sleep(300);
                if (stopFlag) {
                    break;
                }
            } catch (InterruptedException e) {

            }

        }
    }

    //Pausa o banner.
    public void stop() {

        stopFlag = true;
        t = null;
    }

    //Exibe Banner
    public void paint(Graphics g) {
        char ch;
        ch = msg.charAt(0);
        msg = msg.substring(1, msg.length());
        msg += ch;

        g.drawString(msg, 50, 30);
    }

}
