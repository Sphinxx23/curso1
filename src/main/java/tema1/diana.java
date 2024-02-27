package tema1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class diana extends JFrame {

    private JPanel contentPane;

    public diana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 1000, 1000);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    diana frame = new diana();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void paint(Graphics g) {
 	super.paint(g);

	
	//FONDO
	Color colorMorado=new Color(204, 169, 221);

	g.setColor(colorMorado);
	g.fillRect(0, 0, 650 , 625);

	
	//CIRCULOS

	g.setColor(Color.white);
	g.fillOval(75,75,500,500);  //num 1
	
	g.setColor(Color.black);
	g.drawOval(75,75,500,500);  //num 1
	g.drawOval(100,100,450,450);  //num 2
	g.fillOval(125,125,400,400);  //num 3

	g.setColor(Color.white);   
	g.drawOval(150,150,350,350);  //num 4

	g.setColor(Color.blue);
	g.fillOval(175,175,300,300);  //num 5

	g.setColor(Color.black);
	g.drawOval(200,200,250,250);  //num 6

	g.setColor(Color.red);
	g.fillOval(225,225,200,200);  //num 7

	g.setColor(Color.black); 
	g.drawOval(225,225,200,200);  //num 7
	g.drawOval(250,250,150,150);  //num 8

	g.setColor(Color.yellow);
	g.fillOval(275,275,100,100);  //num 9

	g.setColor(Color.black); 
	g.drawOval(275,275,100,100);  //num 9	
	g.drawOval(300,300,50,50);  //num 10

	
	// NUMEROS PUNTUACION

	g.setColor(Color.black);
	g.drawString("10", 330, 329);
	g.drawString("9", 360, 329);
	g.drawString("8", 385, 329);
	g.drawString("7", 410, 329);
	g.drawString("6", 435, 329);
	g.drawString("5", 460, 329);
	g.drawString("2", 535, 329);
	g.drawString("1", 560, 329 );
	
	g.setColor(Color.white);
	g.drawString("4", 485, 329);
	g.drawString("3", 510, 329);
	
    }

}



