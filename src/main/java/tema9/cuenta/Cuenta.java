/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema9.cuenta;

public class Cuenta {
  
    //Atributos
    private double saldo;
    private String nombre;
    
    //Constructores
    public Cuenta(){
        saldo = 0.0;
        nombre="";
    }
    
    public Cuenta(double param, String param2){
        saldo= param;
        nombre=param2;
    }
    
    //Métodos 
    public void reintegro(double param){
        if (param<saldo||param<0) {
            saldo = saldo - param;
        }else{
            System.out.println("Saldo insuficiente");
        }
        
    }
    
    public void ingreso(double param){
         if (param<0) {
             System.out.println("No es posible ingresar en negativo");
        }else{
             saldo = saldo + param;
         }             
    }
    
    public void getSaldo(){
        System.out.println("Saldo de " + getNombre() + ": " + saldo);      
    }
    
     public String getNombre(){
        return nombre;
    }
    
    public void setSaldo(double param){
        saldo=param;
       
    }
    public void setNombre(String param){
        nombre=param;
    }
}
