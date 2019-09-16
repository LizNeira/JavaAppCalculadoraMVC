/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador {

    private Vista view;
    private Modelo mod;

    public Controlador(Vista view, Modelo mod) {
        this.view = view;
        this.mod = mod;
        view.JButtonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarSuma();
            }
        });
        view.JButtonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ejecutarMultiplicacion();
            }
        }
        );
    }

    public void iniciar() {
        view.setTitle("Operar");
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    public void ejecutarSuma() {
        // el controlador le pasa al modelo los dos numeros que obtiene de la vista
        mod.setNum1(Integer.parseInt(view.jTextFieldNum1.getText().toString()));
        mod.setNum2(Integer.parseInt(view.jTextFieldNum2.getText().toString()));

        // el controlador le pasa a la vista el resultado de sumar que obtiene del modelo
        view.jTextFieldResultado.setText(String.valueOf(mod.sumar()));
    }

    public void ejecutarMultiplicacion() {
        mod.setNum1(Integer.parseInt(view.jTextFieldNum1.getText().toString()));
        mod.setNum2(Integer.parseInt(view.jTextFieldNum2.getText().toString()));
        view.jTextFieldResultado.setText(String.valueOf(mod.multiplicar()));
    }
}
