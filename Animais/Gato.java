package Animais;

public class Gato extends  Animal{
    static  int numeroDeGatos;

    public Gato(String nome, String cor, String estadoDeEspirito, int altura, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeGatos ++;
    }



    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("miauuuuuuu miauuuuuuu");
    }
}
