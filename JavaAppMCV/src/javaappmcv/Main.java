/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaappmcv;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Main {

    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista view = new Vista();
        Controlador c = new Controlador(view, mod);

        c.iniciar();
    }
}
