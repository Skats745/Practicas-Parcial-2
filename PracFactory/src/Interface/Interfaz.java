/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author duck1
 */
import Modelo.ClsSetFigura;

public interface Interfaz {
    
    public double area(ClsSetFigura fig);

    public double perimetro(ClsSetFigura fig);

    public String descripcion();
}
