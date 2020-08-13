/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author duck1
 */
import Interface.Interfaz;

public class ClsCirculo implements Interfaz {
    private double pii = 3.14;

    @Override
    public String descripcion() {
        return "Es un circulo";
    }

    @Override
    public double area(ClsSetFigura fig) {
        return pii * (Math.pow(fig.getRadio(), 2));
    }

    @Override
    public double perimetro(ClsSetFigura fig) {
        return (2 * pii) * fig.getRadio();
    }
}
