package br.com.leandro.domain;

public class Produto {

    private int sku;

    private String nome;

    private Double valor;

    public Produto (Integer sku, String nome, Double valor){
        this.nome = nome;
        this.sku = sku;
        this.valor = valor;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "sku=" + sku +
                ", nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
