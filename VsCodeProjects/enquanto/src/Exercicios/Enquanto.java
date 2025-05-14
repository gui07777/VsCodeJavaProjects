package Exercicios;

public class Enquanto {

    public static void main (String[]args){
        int cont = 0;
        while(cont <= 5){
           if(cont % 2 == 0){
            System.out.println(cont+ "par");
           }else{
            System.out.println(cont+ "impar");
           }
    }
}}