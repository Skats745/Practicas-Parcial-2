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


public class Controladr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FormFig formfig = new FormFig();
        VOCuadrado vocua = new VOCuadrado();
        VORectangulo vorect = new VORectangulo();
        VOTriangulo votri = new VOTriangulo();

        DAOCuadrado daocua = new DAOCuadrado();
        DAORectangul daorect = new DAORectangul();
        DAOTriangulo daotri = new DAOTriangulo();

        Figura figuras = new Figura(formfig, vocua, vorect, votri, daocua, daorect, daotri);
        formfig.setVisible(true);
    }
    
}
