/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author raquel
 */
public class Loteria {

    static Random random = new Random();

    //metodo que genera un decimo aleatorio
    public static String devuelveDecimo() {

        Integer n = 0, m = 99999;
        Integer numAleatorio = random.nextInt(m - n + 1) + n;

        String numParaFormatear = numAleatorio.toString();

        String numFormateado = "00000".substring(numParaFormatear.length()) + numParaFormatear;

        return numFormateado;

    }

    //metodo que genera un premio aleatorio
    public static int devuelvePremio() {

        return random.nextInt(300000 - 20 + 1) + 20;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Map<String, Integer> loteria = new HashMap<>();

        //ingreso 1000 datos
        for (int i = 0; i < 1000; i++) {
            loteria.put(devuelveDecimo(), devuelvePremio());
        }

        //pregunto al usuario su decimo
        String decimo = "";

        while (decimo.length() != 5) {
            System.out.println("Introduce tu décimo: ");
            decimo = entrada.nextLine();
        }

        //recorremos las claves del map
        boolean gana = false;
        int premio = 0;

        for (String key : loteria.keySet()) {
            if (decimo.equals(key)) {
                gana = true;
                premio = loteria.get(key);

            }
        }

        if (gana) {
            System.out.println("¡Enhorabuena! Ha ganado " + premio + " euros");
        } else {
            System.out.println("Lo sentimos, su décimo no tiene premio");
        }

//        String decimo = devuelveDecimo();
//        System.out.println(decimo);
    }

}
