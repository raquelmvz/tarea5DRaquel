/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;



/**
 *
 * @author raquel
 */
public class Prueba {
    
    public static void main(String[] args) {
        
        
        Domino fichasDomino = new Domino();
        
        //prueba del metodo num fichas
        System.out.println("Numero de fichas: (Está vacío inicialmente)");
        System.out.println(fichasDomino.numeroFichas());
        System.out.println("....................");
        
        //prueba del metodo añadir ficha
        FichaDomino ficha1 = new FichaDomino(2, 4);
        fichasDomino.anadirFicha(ficha1);
        System.out.println("Fichas despues de añadir: ");
        System.out.println(fichasDomino.toString());
        System.out.println(".......................");
        
        
        //prueba metodo hay fichas dentro
        System.out.println("¿Hay fichas dentro?");
        System.out.println(fichasDomino.hayFichasDentro());
        System.out.println(".........................");
        
        //prueba metodo ficha esta en el conjunto
        //añado mas fichas para rellenar un poco el domino
        FichaDomino ficha2 = new FichaDomino(3, 6);
        FichaDomino ficha3 = new FichaDomino(1, 4);
        FichaDomino ficha4 = new FichaDomino(5, 5);
        
        fichasDomino.anadirFicha(ficha2);
        fichasDomino.anadirFicha(ficha3);
        fichasDomino.anadirFicha(ficha4);
        
        System.out.println("La ficha 1/4 está en el dominó?");
        System.out.println(fichasDomino.fichaEnConjunto(ficha3));
        System.out.println("...................");
        
        //prueba eliminar ficha
        System.out.println("Elimino la ficha 5/5");
        fichasDomino.eliminaFicha(ficha4);
        System.out.println(".........................");
       
        //prueba metodo sacar fichas
        System.out.println("Array con las fichas que se han sacado: ");
        System.out.println(fichasDomino.sacarFichas());
        
        
        
        
        
        
        
    }
    
}
