/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo_DAO;

/**
 *
 * @author duck1
 */
import Modelo_VO.VOCuadrado;
public class DAOCuadrado {
    public String Area(VOCuadrado x) {
        String Res = "";

        double Areas = x.getLado() * x.getLado();

        Res = "El area del cuadrado es de: " + Areas;
        return Res;
    }

    public String Perimetro(VOCuadrado x) {
        String Res = "";

        double Peri = x.getLado() * 4;

        Res = "El Perimetro del cuadrado es de: " + Peri;
        return Res;
    }
}
