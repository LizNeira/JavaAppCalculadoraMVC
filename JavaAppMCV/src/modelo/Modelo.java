/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

public class Modelo {

    private int num1;
    private int num2;

    public int sumar() {
        int resul = num1 + num2;
        return resul;
    }

    public int multiplicar() {
        int resul = num1 * num2;
        return resul;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
