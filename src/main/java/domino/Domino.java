/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author raquel
 */
public class Domino {

    //debe de contener todas las fichas de un domino
    //el orden no importa -- no es sorted set
    //no hay fichas duplicadas -- hashset
    Set<FichaDomino> fichasDomino; //lo inicializamos luego en el constructor

    public Domino() {
        //inicializacion
        this.fichasDomino = new HashSet<>();

    }

    //numero de fichas que tiene
    public int numeroFichas() {
        return fichasDomino.size();
    }

    //metodo para introducir una ficha
    //la ficha se pasa por parametro
    public void anadirFicha(FichaDomino ficha) {
        fichasDomino.add(ficha);
    }

    //metodo para saber si hay fichas dentro
    public boolean hayFichasDentro() {
        //.isempty
        return fichasDomino.size() > 0;
    }

    //metodo para saber si una ficha esta en el conjunto
    public boolean fichaEnConjunto(FichaDomino ficha) {
        //return true si contiene la ficha
        return fichasDomino.contains(ficha);
    }

    //metodo para sacar todas las fichas
    //tiene que estar en forma de array list
    public ArrayList<FichaDomino> sacarFichas() {
        ArrayList<FichaDomino> listaFichas = new ArrayList<>();

        //recorremos con un for todo el set y vamos añadiendo
        for (FichaDomino ficha : fichasDomino) {
            listaFichas.add(ficha);

        }

        //hay que vaciar la lista original
        //el metodo clear borra todos los elementos
        fichasDomino.clear();

        return listaFichas;

    }

    //metodo que elimina una ficha en concreto
    public void eliminaFicha(FichaDomino ficha) {
        //controlar que la lista no esta vacia
        if (!fichasDomino.isEmpty()) {
            fichasDomino.remove(ficha);
        }

    }

    @Override
    public String toString() {
        return "Domino{" + "fichasDomino=" + fichasDomino + '}';
    }
    
    

}
