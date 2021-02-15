/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.Random;

/**
 *
 * @author raquel
 */
public class FichaDomino {

    //Clase que modela las fichas de domino
    private int parteUno;
    private int parteDos;

    //Constructor parametrizado
    public FichaDomino(int parteUno, int parteDos) {

        this.parteUno = parteUno;
        this.parteDos = parteDos;

        if (valorNoValido(parteUno)) {
            if (valorEsPar(parteUno)) {
                this.parteUno = 6;
            } else if (valorEsImpar(parteUno)) {
                this.parteUno = 5;
            }

        }

        if (valorNoValido(parteDos)) {
            if (valorEsPar(parteDos)) {
                this.parteDos = 6;
            } else if (valorEsImpar(parteDos)) {
                this.parteDos = 5;
            }

        }

    }

    //Constructor sin parametros que crea blanca doble
    public FichaDomino() {

        this.parteUno = 0;
        this.parteDos = 0;
    }

    //Metodos getters
    public int getParteUno() {
        return parteUno;
    }

    public int getParteDos() {
        return parteDos;
    }

    //Metodos setters
    public void setParteUno(int parteUno) {

        this.parteUno = parteUno;

        if (valorNoValido(parteUno)) {
            if (valorEsPar(parteUno)) {
                this.parteUno = 6;
            } else if (valorEsImpar(parteUno)) {
                this.parteUno = 5;
            }

        }

    }

    public void setParteDos(int parteDos) {

        this.parteDos = parteDos;

        if (valorNoValido(parteDos)) {
            if (valorEsPar(parteDos)) {
                this.parteDos = 6;
            } else if (valorEsImpar(parteDos)) {
                this.parteDos = 5;
            }

        }

    }

    //Metodo que devuelve si un valor no es valido
    private static boolean valorNoValido(int valor) {
        if (valor < 0 || valor > 6) {
            return true;
        } else {
            return false;
        }
    }

//    //Metodo que devuelve si un valor es par
    private static boolean valorEsPar(int valor) {
        if (valor % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
//
//    //Metodo que devuelve si un valor es impar

    private static boolean valorEsImpar(int valor) {
        if (valor % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "[" + parteUno + "|" + parteDos + "]";
    }

    //Metodo que devuelve la suma de ambas partes de la ficha
    public byte getValorTotal() {

        return (byte) (this.parteUno + this.parteDos);
    }

    //Metodo de clase publico que genera una ficha aleatoria
    public static FichaDomino generaFichaAleatoria() {

        FichaDomino fichaAleatoria = new FichaDomino();

        int parteUnoAleatoria = aleatorio();
        int parteDosAleatoria = aleatorio();

        if (valorNoValido(parteUnoAleatoria)) {
            if (valorEsPar(parteUnoAleatoria)) {
                parteUnoAleatoria = 6;
            } else if (valorEsImpar(parteUnoAleatoria)) {
                parteUnoAleatoria = 5;
            }

        }

        if (valorNoValido(parteDosAleatoria)) {
            if (valorEsPar(parteDosAleatoria)) {
                parteDosAleatoria = 6;
            } else if (valorEsImpar(parteDosAleatoria)) {
                parteDosAleatoria = 5;
            }

        }

        fichaAleatoria.parteUno = parteUnoAleatoria;
        fichaAleatoria.parteDos = parteDosAleatoria;

        return fichaAleatoria;

    }

    //Metodo que devuelve un aleatorio
    private static int aleatorio() {

        Random random = new Random();
        int numeroAleatorio;

        //El numero de la ficha debe de estar entre 0 y 6
        do {
            numeroAleatorio = random.nextInt();
        } while (numeroAleatorio < 0 || numeroAleatorio > 6);

        return numeroAleatorio;
    }

}
