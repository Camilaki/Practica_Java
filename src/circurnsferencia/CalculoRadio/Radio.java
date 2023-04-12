/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circurnsferencia.CalculoRadio;

import java.util.Scanner;



/**
 *
 * @author Cami
 */
public class Radio {
    private double radio;
    Scanner in = new Scanner(System.in);

    public Radio(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }


    /*
    Método para crearCircunferencia(): que le pide el radio y lo guarda 
    en el atributo del objeto.
    */
    
    public void crearCircunsferencia(){
        System.out.println("Ingrese radio");
        radio = in.nextDouble();
                             
    }
   // Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    //Método Función
    public void area(){
        
       double area;
        area = Math.pow((Math.PI * radio), 2);
        System.out.println("El área es: " + area);//cálculo de área de un círculo
     
       
    }

    public Radio() {
    }
    
    public  void perimetro(){
        double perimetro;
        perimetro = 2*(Math.PI * radio);
        System.out.println("El perimetro es: " + perimetro);
   
    }
    
   
    /*
    Funciones
    public double area(){
        double area = (Math.pow((3.1416 * radio), 2));
        return area;
    }
    public double perimetro(){
        double perimetro = 2 * 3.1416 * radio;
        return perimetro;
    }
    */

}
