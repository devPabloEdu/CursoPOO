package Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    public String estadoDeEspirito;

    public void comer(){}
    public void Latir(){
        System.out.println("AU! AU! AU!");
    }
    public String pegar(){
        return "bolinha";
    }

    public String interagir(String acao) {
        if(acao.equals("carinho")){
            this.estadoDeEspirito ="feliz, pois voce fez carinho nele";
        } else if(acao.equals("vai dormir")) {
            this.estadoDeEspirito = "bravo, pois voce o mandou dormir";
        } else {
            this.estadoDeEspirito = "neutro, pois voce não interagiu com ele";
        }
        return  estadoDeEspirito;
    }
}
