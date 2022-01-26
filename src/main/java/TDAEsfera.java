/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex Santos
 */
public class TDAEsfera {
        private final double radio;
    // construccion de codigo
    public TDAEsfera(double radioInicial){
    
            if(radioInicial>0){
                this.radio=radioInicial;
                  }else{
                    this.radio=0.0;
            }
     
     
     }
    //creación de las operaciones del TDAEsfera
    public double getRadio(){
        return this.radio;
    }
    public double getDiametro(){
        return (2*radio);
    }
    public double getCircunferencia(){
        return (Math.PI*getDiametro());
    }
    public double getArea(){
        return (4*Math.PI*radio*radio);
    }
    public double getVolumen(){
        return (4*Math.PI*Math.pow(radio, 3))/3;
    }
    

}
