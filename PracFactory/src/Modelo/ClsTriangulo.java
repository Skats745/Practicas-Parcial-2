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

public class ClsTriangulo implements Interfaz {
    @Override
    public double perimetro(ClsSetFigura fig) {
        return fig.getBase() * 3;
    }

    @Override
    public double area(ClsSetFigura fig) {
        return (fig.getBase() * fig.getAltura()) / 2;
    }

    @Override
    public String descripcion() {
        return "Es un trinagulo";
    }
}
