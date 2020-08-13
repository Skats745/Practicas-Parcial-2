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

public class ClsFactory {
    public static Interfaz getinsfig(String figura) {
        switch (figura) {
            case "Cuadrado":
                return new ClsCuadrado();
            case "Rectangulo":
                return new ClsRectangulo();
            case "Triangulo":
                return new ClsTriangulo();
            case "Circulo":
                return new ClsCirculo();
            default:
                return null;
        }

    }
}
