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
public class ClsSetFigura {
    private double Base;
    private double Altura;
    private double Lado;
    private double Radio;

    public ClsSetFigura() {
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getBase() {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }

    public double getLado() {
        return Lado;
    }

    public double getRadio() {
        return Radio;
    }
}
