
package Libreria;

import java.util.Scanner;

public class LibreriaMatematicas {
    
   //Comprueba si los numeros de una cadena son primos
       public static String primo(String cadenaDivisores) {
        int aux, cont;
        String cadenaFinal = " ";
        Scanner sc = new Scanner(cadenaDivisores);

        while (sc.hasNext()) {
            aux = Integer.parseInt(sc.next());
            cont=0;
            for (int i = 1; i <= aux; i++) {
                if (aux % i == 0) {
                    cont++;                   
                }
            }
            if (cont == 2) {
                cadenaFinal = cadenaFinal + aux + " ";
            }
        }
        return cadenaFinal;
    }
    

//Numero maximo de una cadena de nums
    public static int maximo(String numerosMenosFin){       
        int numFinal=0, x;
        Scanner sc = new Scanner(numerosMenosFin);
        
        
         while (sc.hasNext()) {
            x =Integer.parseInt(sc.next()); 
             if (x>numFinal) {
                 numFinal= x;
             }
             
         }
            
        
        return numFinal;
    }


//Una tabla dde multiplicar recursiva
     public static void tablaN (int n, int cont){
        int result;
        
        if (cont==0) {
            result=0;
            System.out.println(n+" x " + cont + " = " + result);
        }else{
            tablaN(n, cont-1);
            result=n*cont;
            System.out.println(n+" x " + cont + " = " + result);
            
        }
    }
    
    
  //Potencia de un numero de forma recursiva
    public static int baseElevadoA(int a, int b){
        int resultado;
        
        if (b==0) {
            resultado=1;
        }else{
            resultado=a*baseElevadoA(a, b-1);
        }
          
        return resultado;
    }
    
    
    
   //Hace la suma de los n numeros que pasen en forma de string 
    public static int sumaDe(String numeros){       
        int sumaTotal=0;
        Scanner sc = new Scanner(numeros);
        while (sc.hasNext()) {
            sumaTotal=sumaTotal+ Integer.parseInt(sc.next());   
        
        }
        return sumaTotal;
    }
    
   //Hace la media de los n numeros que pasen en forma de string 
    public static float mediaDe (String numeros){        
        Scanner sc = new Scanner(numeros);
        float media;
        int sumar, cont=0;
       
        sumar=sumaDe(numeros);
        while (sc.hasNext()) {
            sc.next();
            cont++;           
        }
        media = (float)sumar/cont;
        
        return media;
    }
    
//Comprobar si b es divisor de a
    public static boolean esDivisor (int a,int b){               
        return a%b==0;        
    }
    
//Suma de divisores de un numero, utiliza internamente el metodo esDivisor
    public static int sumaDivisores(int num){
        int acc=0;
        
        for (int i = 1; i <= num; i++) {
                      
            if (esDivisor(num, i)) {
                acc+=i;
            }
        }
        return acc;
    }
   
    
//Comparar numero mayor
    public static int numMayor(int n1, int n2){
        int aux;
        aux=n1>n2?n1:n2;
        return aux;       
    }
    


//Funcion para calcular el factorial de cualquier numero positivo, incluido 0, si es negativo, devuelve -1
    public static int numFact(int num){
        int acc=1;
        if (num==0) {
            return 1;
        }else if(num<0){
            return -1;
        }else{
            for (int i = num; i >0; i--) {
                acc=acc*i;              
            }
            return acc;
        }
    }
    
    //Num factorial desde el introducido hasta el 0, recursiva
        public static String numFactHasta(int num){      
       String r=" ";
        if (num==0) {
            r= r + "\n" + numFact(0) ;
        }else{           
            r=r + "\n" + numFact(num)+ numFactHasta(num-1);          
        }
        return r;
    }
    
    //Introducir 3 numeros y comprobar cual es el mayor de los 3
    public static int numMayor(int num1, int num2, int num3){
        
        if (num1 > num2 && num1 > num3) { //caso 1 
            return num1;
        }else if (num2 > num3 && num2 > num1){ //caso 2
            return num2;  
        } else{//caso 3
            return num3;
        }   
    } 
    
    //Introducir 2 numeros y comprobar cual es el mayor de los 2
    public static int numMayor2(int n1, int n2){
        int aux;
        
        aux=n1>n2?n1:n2;
        
        return aux;       
    }
  
    
    //area de un cilindro
     public static float areaCilindro (float altura, float radio) {
         float area;
         
         area = 2*(float)(Math.PI) * radio * (altura+radio);
         return area;
    }
    
     //volumen de un cilindro
    public static float volumenCilindro (float altura, float radio) {
         float volumen;
         
         volumen =(float)(Math.PI)* radio * radio * altura;
         return volumen;
    }
    
    //introduces un numero en decimal y te lo devuelve en binario
      public static void numBinario (int num){
        
        if (num==1||num==0) {
            System.out.print(num);
            
        }else{
            numBinario(num/2);
            System.out.print(num%2);                  
        }      
    }
    
    //devuelve el fibonacci de un numero  
    public static int fibonacci(int nUs){
        if (nUs==0||nUs==1) {
            return nUs;
        }else{
            return fibonacci(nUs-1)+fibonacci(nUs-2);
        }
    }
    
}
