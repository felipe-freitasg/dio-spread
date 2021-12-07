package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Nome_Idade {

    public static void main(String[] args) {

        //Exercício idade e nome

        /*int idade;
        String nome;
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Digite nome :");
            nome = scanner.next();

            if(nome.equals("0")) break;

            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();

        }*/

        //Exercício interrupção se não for número entre 0 e 10

        /*Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite um número entre 0 e 10: ");
        numero = scan.nextInt();

        while(numero < 0 || numero >10){
            System.out.println("Número inválido digite novamente");
            numero = scan.nextInt();
        }*/

        //Execicio ler 5 numeros, informar maior numero e a média

        /*int contador = 0, entrada , soma = 0;
        int maior = 0, media ;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Digite um número");
            entrada = scan.nextInt();
            soma = soma + entrada;

            if (maior < entrada){
                maior = entrada;
            }

            contador++;


        }while(contador < 5 );

        media = soma/5;

        System.out.println("Maior Número : " + maior);
        System.out.println("Média : " + media);*/
        
        
        //Execício numeros pares e ímpares

        /*Scanner scan = new Scanner(System.in);
        int quantidade, numero, impar=0, par=0;

        System.out.println("Digite a quantidade de numeros que deseja ler: ");
        quantidade = scan.nextInt();

        for(int i=0;i<quantidade;i++){
            System.out.println("Digite o numero: ");
            numero = scan.nextInt();

            if(numero==2 || numero%2==0){
                par++;
            }else {
                impar++;
            }

        }

        System.out.println("A quantidade de numeros impas: " + impar);
        System.out.println("A quantidade de numeros pares: " + par);*/


        //Execício numeros pares e ímpares
        /*Scanner scan = new Scanner(System.in);
        int tabuada;

        System.out.println("Digite a qual a tabuada que deseja visualizar: ");
        tabuada = scan.nextInt();

        for(int i=1; i<11;i++){
            System.out.println(i + " X " + tabuada + " = " + i*tabuada);
        }*/


        //Exercício Fatorial

        Scanner scan = new Scanner(System.in);
        int fatorial, produto, aux;

        System.out.println("Digite um numero para verificar seu fatorial: ");
        fatorial = scan.nextInt();
        aux=fatorial;


       while(fatorial>1){

           produto = aux * (fatorial-1);
           aux = produto;
           fatorial--;
       }

        System.out.println("Fatorial: " + aux);



    }


}
