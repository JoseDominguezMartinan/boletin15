/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Boletin15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // creamos un obxeto de tipo notas 

        Notas nota = new Notas();
        // creamos un scanner para a inserccion de notas e outro para indicar se queremos repetir a execucion ou non 
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        // declaramos as variables que vamos usar
        String repetir = "si";
        float teorico1;
        float teorico2;
        float practica;
        // facemos a condicion de repeticion do programa e chamamos aos metodos da clase Notas, insertando os datos necesarios 
        while ("si".equals(repetir)) {
            System.out.println("Inserta a nota teorica 1");
            teorico1 = sc.nextFloat();
            System.out.println("Inserta a nota teorica 2");
            teorico2 = sc.nextFloat();
            nota.mediaTeoricos(teorico1, teorico2);
            System.out.println("Inserta a nota do exame practico");
            practica = sc.nextFloat();
            nota.notaPractica(practica);
            nota.boletins();
            nota.notaAvaliacion();
            System.out.println("Escriba si se quere insertar outro alumno.");
            System.out.println("En caso contrario inserte non ");
            repetir = sc1.nextLine();
        }

    }

}
