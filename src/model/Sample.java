package model;


/**
 * @author raphaelmachadofreire
 * A Classe Applet
 * Um Applet simples que configura a cor do primeiro plano e plano de fundo, e também exibe um string de saída
 * Capítulo 22 - Página 687
 */

import java.awt.*;
import java.applet.*;

/*
<applet code="Sample" width=300 height=50>
</applet>
*/

public class Sample extends Applet {
    
    String msg;
    
    //Configura as cores de plano de fundo e primeiro plano
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg = "Inside init() --";
    }
    
    //Inicializa o string para ser exibido
    public void start(){
        msg += " Inside start() --";
    }
    
    //Exibe msg na janela applet
    public void paint(Graphics g){
        msg += " Inside paint().";
        g.drawString(msg, 10, 30);
    }
    
}
