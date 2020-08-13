/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author duck1
 */

import Modelo_DAO.DAOCuadrado;
import Modelo_DAO.DAORectangul;
import Modelo_DAO.DAOTriangulo;
import Modelo_VO.VOCuadrado;
import Modelo_VO.VORectangulo;
import Modelo_VO.VOTriangulo;
import Vista.FormFig;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Figura implements ActionListener {
    FormFig Figura;
    VOCuadrado vocua;
    VORectangulo vorec;
    VOTriangulo votri;

    DAOCuadrado daocua;
    DAORectangul daorec;
    DAOTriangulo daotri;
    public Figura(FormFig Figura, VOCuadrado vocua, VORectangulo vorec, VOTriangulo votri, DAOCuadrado daocua, DAORectangul daorec, DAOTriangulo daotri) {
        this.Figura = Figura;
        this.vocua = vocua;
//        this.vorec = vorec;
        this.votri = votri;
        this.daocua = daocua;
        this.daorec = daorec;
        this.daotri = daotri;

        this.Figura.btnidenti.addActionListener(this);

        this.Figura.combo_figura.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

                if ("Cuadrado".equals(Figura.combo_figura.getSelectedItem().toString())) {

                    Figura.lbl1.setVisible(true);
                    Figura.lbl2.setVisible(false);
                    Figura.lbl3.setVisible(false);
                    Figura.lbl4.setVisible(false);
                    Figura.lbl5.setVisible(false);

                    Figura.txtl1.setVisible(true);
                    Figura.txtl2.setVisible(false);
                    Figura.txtl3.setVisible(false);
                    Figura.txtancho.setVisible(false);
                    Figura.txtlargo.setVisible(false);
            
                    

                } else {
                    if ("Triangulo".equals(Figura.combo_figura.getSelectedItem().toString())) {

                        Figura.lbl1.setVisible(true);
                        Figura.lbl2.setVisible(true);
                        Figura.lbl3.setVisible(true);
                        Figura.lbl4.setVisible(false);
                        Figura.lbl5.setVisible(false);

                        Figura.txtl1.setVisible(true);
                        Figura.txtl2.setVisible(true);
                        Figura.txtl3.setVisible(true);
                        Figura.txtancho.setVisible(false);
                        Figura.txtlargo.setVisible(false);

                    } else {
                        if ("Rectangulo".equals(Figura.combo_figura.getSelectedItem().toString())) {

                            Figura.lbl1.setVisible(false);
                            Figura.lbl2.setVisible(false);
                            Figura.lbl3.setVisible(false);
                            Figura.lbl4.setVisible(true);
                            Figura.lbl5.setVisible(true);

                            Figura.txtl1.setVisible(false);
                            Figura.txtl2.setVisible(false);
                            Figura.txtl3.setVisible(false);
                            Figura.txtancho.setVisible(true);
                            Figura.txtlargo.setVisible(true);

                        }
                    }
                }
            }
        });
        
    }
    public void CalcularCuadrado() {

        this.vocua.setLado(Double.parseDouble(this.Figura.txtl1.getText()));

        this.Figura.txtresultado.setText(this.daocua.Area(vocua) + " \n " + this.daocua.Perimetro(vocua));

        }

        public void CalcularRectangulo() {

        this.vorec.setBase(Double.parseDouble(this.Figura.txtancho.getText()));
        this.vorec.setAltura(Double.parseDouble(this.Figura.txtlargo.getText()));

        this.Figura.txtresultado.setText(this.daorec.Area(vorec) + " \n " + this.daorec.Perimetro(vorec));

        }

        public void CalcularTriangulo() {

        this.votri.setLadoa(Double.parseDouble(this.Figura.txtl1.getText()));
        this.votri.setLadob(Double.parseDouble(this.Figura.txtl2.getText()));
        this.votri.setLadoc(Double.parseDouble(this.Figura.txtl3.getText()));
      

        this.votri.setAltura(Math.sqrt((Math.pow(this.votri.getLadoc(), 2))));

        this.Figura.txtresultado.setText(this.daotri.Area(votri) + " \n " + this.daotri.Perimetro(votri));

        }

        @Override
        public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Figura.btnidenti) {
            if ("Cuadrado".equals(Figura.combo_figura.getSelectedItem().toString())) {
                CalcularCuadrado();
            }
            if ("Triangulo".equals(Figura.combo_figura.getSelectedItem().toString())) {
                CalcularTriangulo();
            }
            if ("Rectangulo".equals(Figura.combo_figura.getSelectedItem().toString())) {
                CalcularRectangulo();
            }
        }

    }
}