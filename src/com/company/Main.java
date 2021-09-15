package com.company;
import java.util.Random;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {50, 100, 150, 200, 250, 300, 350, 400, 450, 500, 550, 600, 750, 800};
        Random gerador = new Random();

        for (int i = 0; i < array.length; i++) {
            int posicao = gerador.nextInt(array.length);
            int troca = array[posicao];

            array[posicao] = array[i];
            array[i] = troca;
        }
        System.out.println(Arrays.toString(array));
    }
}
