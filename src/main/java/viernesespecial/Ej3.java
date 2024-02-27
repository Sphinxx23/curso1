/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viernesespecial;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Vespertino
 */
public class Ej3 {

//Atributos
    private JFrame v;
    private JLabel jlbEtiqueta, jlbEtiqueta2, jlbEtiqueta3;
    private Color[] colores = {Color.CYAN, Color.GRAY, Color.GREEN, Color.RED, Color.ORANGE, Color.YELLOW, Color.pink};

    public Ej3() {
        Scanner sc = new Scanner(System.in);
        int rec;

        System.out.println("Introduce un numero de etiquetas");
        rec = sc.nextInt();

        v = new JFrame("Titulo de la ventana");
        v.setSize(800, 600);

        for (int i = 0; i < rec; i++) {
            jlbEtiqueta3 = new JLabel();
            jlbEtiqueta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/tt.jpg")));
            v.add(jlbEtiqueta3);

        }

        v.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Permite cerrar con la X
        //v.setLocationRelativeTo(null);//Hace que la ventana salga en el centro de la pantalla
        v.setExtendedState(JFrame.MAXIMIZED_BOTH); //Para hacer que la ventana salga pantalla completa
        

        v.setVisible(true);
    }

    public static void main(String[] args) {

        Ej3 ventana = new Ej3();
    }

}
