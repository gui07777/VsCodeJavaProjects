package Exercicios;

public class enquanto {
    public static void main(String[] args) {
        int i = 0; 
        while(i <= 10) {
            if(i % 2 == 0){
            System.out.println(i + "par");
            }else{
            System.out.println(i + "ímpar");
            }
            i++;
        }
    }
}
