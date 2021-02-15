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

        this.parteUno = estableceValor(parteUno);
        this.parteDos = estableceValor(parteDos);

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

        this.parteUno = estableceValor(parteUno);

    }

    public void setParteDos(int parteDos) {

        this.parteDos = estableceValor(parteDos);

    }

    //metodo para establecer el valor valido
    private int estableceValor(int valor) {

        if (valor < 0 || valor > 6) {
            if (valor % 2 == 0) {
                valor = 6;
            } else {
                valor = 5;
            }
        }
        return valor;
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

        //aqui no hay que comprobar el valor valido
        //porque ya lo hace el constructor
        return new FichaDomino(aleatorio(), aleatorio());

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this.parteUno;
        hash = 23 * hash + this.parteDos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FichaDomino other = (FichaDomino) obj;
        if (this.parteUno != other.parteUno) {
            return false;
        }
        if (this.parteDos != other.parteDos) {
            return false;
        }
        return true;
    }

}
