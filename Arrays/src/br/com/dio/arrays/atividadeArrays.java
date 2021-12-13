package br.com.dio.arrays;

import java.util.Random;
import java.util.Scanner;
public class atividadeArrays {
    public static void main(String[] args) {

        //Atividade vetores reversos

        /*int[] vetor = {0, -5, 15, 50, 8, 4};

        for(int i=(vetor.length-1); i>=0; i-- ){

            System.out.println("["+i+"]" + " = " + vetor[i]);

        }*/

        //Atividade quantidade consoantes
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Escreva a palavra para verificar o numero de consoantes");
        String palavra = scan.next();
        String letra;
        int count=0;

        for(int i=0; i<palavra.length(); i++){
            letra = palavra[i];
            if(!(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u"))){

                count++;
            }
        }

        System.out.println("A quntidade de consoantes é : " + count);*/

        //Atividade Consoantes

        /*Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0, count=0;

        do{
            System.out.println("Letra : ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                qtdConsoantes++;
            }
            count++;

        }while (count < consoantes.length);

        System.out.println("Consoantes digitadas: ");
        for (String consoante : consoantes) {

            if (consoante != null){

                System.out.println(consoante + "  ");
            }

        }*/

        //Array Multidimensional - Matriz

        /*Random random = new Random();

        int [][] Matriz = new int[4][4];

        for (int i = 0; i < Matriz.length; i++){

            for (int j = 0; j < Matriz[i].length; j++){

                Matriz[i][j] = random.nextInt(9);

            }

        }

        for ( int[] linha : Matriz ) {

            for (int coluna : linha ) {

                System.out.print(coluna + " ");

            }

            System.out.println();

        }*/

        int i, num = 5;

        for (i = 0; i < 3; i++) {

            num += i;

            System.out.print(i);

        }









    }
}
