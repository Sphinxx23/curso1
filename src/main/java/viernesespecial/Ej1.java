/*

 */
package viernesespecial;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.*;
import javax.swing.*;

public class Ej1 {

//Atributos
    private JFrame v;
    private JLabel jlbEtiqueta, jlbEtiqueta2, jlbEtiqueta3;  
    private Color[] colores = {Color.CYAN, Color.GRAY, Color.GREEN, Color.RED, Color.ORANGE, Color.YELLOW, Color.pink};

    public Ej1() {
        Scanner sc = new Scanner(System.in);
        int rec, aux, aux2;
        
        System.out.println("Introduce un numero de etiquetas");
        rec = sc.nextInt();

        v = new JFrame("Titulo de la ventana");
        v.setSize(800, 600);

        jlbEtiqueta = new JLabel("Hola Pepe");
        jlbEtiqueta2 = new JLabel(" Adios pepe");

        v.add(jlbEtiqueta);
        v.add(jlbEtiqueta2);

        jlbEtiqueta.setForeground(Color.red);
        v.add(jlbEtiqueta);
        jlbEtiqueta2.setForeground(Color.blue);

        jlbEtiqueta.setBackground(Color.green);
        jlbEtiqueta2.setBackground(Color.pink);

        jlbEtiqueta.setOpaque(true);
        jlbEtiqueta2.setOpaque(true);
        

      
        for (int i = 0; i < rec; i++) {
            jlbEtiqueta3 = new JLabel("Etiqueta " + i);
            aux = (int) (Math.random() * 7);
            aux2 = (int) (Math.random() * 7);

            jlbEtiqueta3.setForeground(colores[aux]);
            jlbEtiqueta3.setBackground(colores[aux2]);
            jlbEtiqueta3.setOpaque(true);

            v.add(jlbEtiqueta3);
        }

        v.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
        
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Permite cerrar con la X
        v.setLocationRelativeTo(null);//Hace que la ventana salga en el centro de la pantalla
        v.setExtendedState(JFrame.MAXIMIZED_BOTH); //Para hacer que la ventana salga pantalla completa

        v.setVisible(true);
    }

    public static void main(String[] args) {

        Ej1 ventana = new Ej1();
    }

}
