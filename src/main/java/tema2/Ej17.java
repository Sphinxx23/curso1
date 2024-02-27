/*Desarrolle un programa que calcule el desglose de una cantidad en billetes y monedas en euros tal
que se minimice la cantidad de monedas y billetes.*/
package tema2;
import java.util.Scanner;
public class Ej17{
	public static void main (String[] args){
	
	//Variables
	Scanner sc = new Scanner(System.in);
	byte op1, op2, op3, op4, op5, op6, op7, op8, op9, op10, op11, op12, op13, op14;
	float din, mod1, mod2, mod3, mod4, mod5, mod6, mod7, mod8, mod9, mod10, mod11, mod12, mod13, mod14;
	
	//Datos al usuario
	System.out.println("Introduzca cantidad de dinero ");
	din = sc.nextFloat();
	
	//Calculos
	op1= (byte)(din/500);
	mod1=din%500;
	
	op2= (byte)(mod1/100);
	mod2=mod1%100;
	
	op3= (byte)(mod2/50);
	mod3=mod2%50;
	
	op4= (byte)(mod3/20);
	mod4=mod3%20;
	
	op5= (byte)(mod4/10);
	mod5=mod4%10;
	
	op6= (byte)(mod5/5);
	mod6=mod5%5;
	
	op7= (byte)(mod6/2);
	mod7=mod6%2;
	
	op8= (byte)(mod7/1);
	mod8=mod7%1;
	
	op9= (byte)(mod8/0.5);
	mod9=mod8%0.5F;
	
	op10= (byte)(mod9/0.2);
	mod10=mod9%0.2F;
	
	op11= (byte)(mod10/0.1);
	mod11=mod10%0.1F;
	
	op12= (byte)(mod11/0.05);
	mod12=mod11%0.05F;
	
	op13= (byte)(mod12/0.02);
	mod13=mod12%0.02F;
	
	op14= (byte)(mod13/0.01);
	mod14=mod13%0.01F;
	
	//Salida pantalla
	System.out.println("Necesita " + op1 + " billetes de 500 euros");
	System.out.println("Necesita " + op2  + " billetes de 100 euros");
	System.out.println("Necesita " + op3 + " billetes de 50 euros");
	System.out.println("Necesita " + op4 + " billetes de 20 euros");
	System.out.println("Necesita " + op5 + " billetes de 10 euros");
	System.out.println("Necesita " + op6 + " billetes de 5 euros");
	System.out.println("Necesita " + op7 + " monedas de 2 euros");
	System.out.println("Necesita " + op8 + " monedas de 1 euro");
	System.out.println("Necesita " + op9 + " monedas de 50 cts");
	System.out.println("Necesita " + op10 + " monedas de 20 cts");
	System.out.println("Necesita " + op11 + " monedas de 10 cts");
	System.out.println("Necesita " + op12 + " monedas de 5 cts");
	System.out.println("Necesita " + op13 + " monedas de 2 cts");
	System.out.println("Necesita " + op14 + " monedas de 1 cts");
	
	}
}