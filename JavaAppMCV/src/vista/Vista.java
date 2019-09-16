/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Vista extends JFrame {

    public JButton JButtonSumar;
    public JButton JButtonMultiplicar;
    public JTextField jTextFieldNum1;
    public JTextField jTextFieldNum2;
    public JTextField jTextFieldResultado;

    public Vista() {
        super("Ventana para sumar");
        this.setLayout(new FlowLayout());
        setSize(300, 250);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jTextFieldNum1 = new JTextField(10);
        jTextFieldNum2 = new JTextField(10);
        jTextFieldResultado = new JTextField(10);
        JButtonSumar = new JButton("Sumar");
        JButtonMultiplicar = new JButton("Multiplicar");
        add(jTextFieldNum1);
        add(jTextFieldNum2);
        add(JButtonSumar);
        add(JButtonMultiplicar);
        add(jTextFieldResultado);
    }
}
