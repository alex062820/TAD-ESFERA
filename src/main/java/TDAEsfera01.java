/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Alex Santos
 */
public class TDAEsfera01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               TDAEsfera esfera=new TDAEsfera(3);
       System.out.println("Radio: " + esfera.getRadio());
       System.out.println("Diametro: " + esfera.getDiametro());
       System.out.println("Cicunferencia: " + esfera.getCircunferencia());
       System.out.println("Area: " + esfera.getArea());
       System.out.println("Volumen: " + esfera.getVolumen());

    }
    
}
