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

public class ClsRectangulo implements Interfaz {
    @Override
    public double perimetro(ClsSetFigura fig) {
        return fig.getLado() * 4;
    }

    @Override
    public double area(ClsSetFigura fig) {
        return fig.getLado() * fig.getAltura();
    }

    @Override
    public String descripcion() {
        return "Es un rectangulo";
    }
}
