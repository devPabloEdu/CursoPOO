package Animais;

public class Cachorro {
//atributos
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private String estadoDeEspirito;

    //construtores

    public Cachorro(){

    }

    public Cachorro(String nome, String cor, double peso, int altura, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
        this.altura = altura;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    //metodos
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer(){}
    public void Latir(){
        System.out.println("AU! AU! AU!");
    }
    public String pegar(){
        return "bolinha";
    }

    public String interagir(String acao) {

        switch (acao){
            case "carinho" : this.estadoDeEspirito = "feliz, pois recebeu carinho";
            break;
            case "vai dormir" : this.estadoDeEspirito = "bravo, pois voce o mandou dormir";
            break;
            case "pisou na patinha" : this.estadoDeEspirito = "triste, pois voce pisou na patinha dele";
            break;
            default: this.estadoDeEspirito = "neutro, pois voce nao interagiu com ele";

        }
        return  estadoDeEspirito;




//        if(acao.equals("carinho")){
//            this.estadoDeEspirito ="feliz, pois voce fez carinho nele";
//        } else if(acao.equals("vai dormir")) {
//            this.estadoDeEspirito = "bravo, pois voce o mandou dormir";
//        } else {
//            this.estadoDeEspirito = "neutro, pois voce não interagiu com ele";
//        }
//        return  estadoDeEspirito;
    }
}
