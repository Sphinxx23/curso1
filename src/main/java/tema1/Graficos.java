package tema1;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Graficos extends JFrame {

    private JPanel contentPane;

    public Graficos() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setBounds(0, 0, 800, 600);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Graficos frame = new Graficos();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void paint(Graphics g) {
 	super.paint(g);

        g.setColor(Color.blue);
        g.drawRect(150, 200, 80, 70);
        g.drawOval(175, 165, 30, 30);
        int[] vx1 = {150, 190, 230};
        int[] vy1 = {200, 130, 200};
        g.drawPolygon(vx1, vy1, 3);
        g.fillRect(180, 240, 20, 30);

	g.setColor(Color.yellow);
	g.fillOval(230, 100, 40, 40);

	g.setColor(Color.gray);
	g.fillRect(300, 200, 20, 70);

	
	g.setColor(Color.green);
	g.fillOval(285, 160, 50, 50);

	g.setColor(Color.red);
	g.drawLine(20, 270, 380, 270);

	g.setColor(Color.yellow);
	g.drawLine(240, 115, 215, 90);
	g.drawLine(240, 115, 215, 140);
	g.drawLine(240, 115, 215, 115);
        
    }

}