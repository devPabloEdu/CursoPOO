import Animais.Cachorro;

public class Main {

    public static  void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("rex", "preto", 1.5, 5, 8, "feliz" );
        System.out.println(cachorro2.getNome());

        cachorro1.setNome("Puppy");
        cachorro1.setCor("marrom");
        cachorro1.setAltura(25);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoDoRabo(5);

        cachorro1.Latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());//se nao tivesse dentro do system out iria retornar mas n escreveria na tela

        System.out.println("o cachorro está " + cachorro1.interagir("pisou na patinha"));
    }
}