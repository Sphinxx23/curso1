package tema2;
import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Ej15 {
	public static void main(String[] args){
		
		//Declaramos variables
		Scanner sc = new Scanner (System.in);
		DecimalFormat df =new DecimalFormat("#.#");
		byte edad, fRep;
		float fMax, pObjt1, pObjt2, pObjt3, pObjt4;
		
		//Datos al usuario
		System.out.println("Introduzca su edad");
		edad = sc.nextByte();
		System.out.println("Introduzca su frecuencia cardiaca en reposo");
		fRep = sc.nextByte();
		
		//Calculos
		fMax = 208-(0.7F*edad);
		pObjt1=(fMax-fRep)*0.7F + fRep;
		pObjt2=(fMax-fRep)*0.8F + fRep;
		pObjt3=(fMax-fRep)*0.9F + fRep;
		pObjt4=(fMax-fRep) + fRep;
		
		//Salida en pantalla
		System.out.println("Pulsaciones objetivo al 70% es " + df.format(pObjt1));
		System.out.println("Pulsaciones objetivo al 80% es " + df.format(pObjt2));
		System.out.println("Pulsaciones objetivo al 90% es " + df.format(pObjt3));
		System.out.println("Pulsaciones objetivo al 100% es " + df.format(pObjt4));
		
		//Salga en tabla
		System.out.println("*********************************");
		System.out.println("*         70%   "+ df.format(pObjt1) +"           *");
		System.out.println("*         80%   "+ df.format(pObjt2) +"           *");
		System.out.println("*         90%   "+ df.format(pObjt3) +"           *");
		System.out.println("*        100%   "+ df.format(pObjt4) +"           *");
		System.out.println("*********************************");
	}
}