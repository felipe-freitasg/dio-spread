package br.com.diospread.no;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteudo no1");
        No<String> no2 = new No<>("Conteudo no2");

        //encadeando no2 com no1

        no1.setProximoNo(no2);


        No<String> no3 = new No<>("Conteudo no3");

        //encadeando no2 com no3
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo no4");

        //encadeando no3 com no4
        no3.setProximoNo(no4);

        //no1 -> no2 -> no3 -> no4 -> null

        System.out.println(no1);
        System.out.println(no1.getProximoNo()); //Mostrando o encadeamento com o no2
        System.out.println(no1.getProximoNo().getProximoNo());//Mostrando o encadeamento com o no3
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());//Mostrando o encadeamento com o no4




    }
}
