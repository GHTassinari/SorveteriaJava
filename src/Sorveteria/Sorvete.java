package Sorveteria;

public class Sorvete {
    private double preco;
    private Sabor sabor;
    private Tamanho tamanho;
    private Adicional adicional;

    public Sorvete(double preco, String nomeSabor, String nomeTamanho, String nomeAdicional){
        this.preco = preco;
        this.sabor = new Sabor(nomeSabor);
        this.tamanho = new Tamanho(nomeTamanho);
        this.adicional = new Adicional(nomeAdicional);
    }

    public double getPreco() {
        return preco;
    }

    public Sabor getSabor() {
        return sabor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public Adicional getAdicional() {
        return adicional;
    }
}
