import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {

    public static  void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("puppy", "preto", 1.5, 5, 8, "feliz" );
        Cachorro cachorro2 = new Cachorro("rex", "preto", 1.5, 5, 8, "feliz" );
        System.out.println("este canil tem " + cachorro1.getNumeroDeCachorros() + " cachorros");
        Gato gato1 = new Gato("felix", "preto", "feliz", 1, 1.5);
        Passaro passsaro1 = new Passaro("frajola", "azul", 1, 5.00, "feliz");

        System.out.println(cachorro1.toString());
        System.out.println(cachorro2.toString());


        System.out.println("O cachorro pegou uma " + cachorro1.pegar());//se nao tivesse dentro do system out iria retornar mas n escreveria na tela

        System.out.println("o cachorro está " + cachorro1.interagir("pisou na patinha"));

        cachorro1.soar();
        passsaro1.soar();
        gato1.soar();
    }
}