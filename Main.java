import Animais.Cachorro;

public class Main {

    public static  void main(String[] args) {
        //System.out.println("Hello  world!");

        //byte variavelByte = 127; //o byte só vai até o 127
        //short : -32768 até o 32767
        //char :  0 a 65535
        //int : -2b a 2bilhoes
        //long de -9trilhoes a 9trilhoes

        //int variavelInt = 2147483;

       //System.out.println(variavelInt);
        //System.out.println(variavelByte);
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor = "marrom";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1.altura);
    }
}