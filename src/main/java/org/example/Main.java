package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println(verificaA("classe"));
        System.out.println(verificaA("banana"));
        System.out.println(verificaA("aaaaaa"));
    }
    public static int verificaA(String word){
        int cont = 0;
        for(int i=0; i < word.length(); i++){
            char letra = word.charAt(i);
            if(letra == 'a' || letra == 'A')
                cont++;


        }
        return cont;
    }
}