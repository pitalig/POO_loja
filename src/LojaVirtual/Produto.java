package LojaVirtual;

import java.util.ArrayList;

public class Produto {

    String nome;

    private double valor;

    private int quantidadeEstoque;

    public static ArrayList<Produto> produtos = new ArrayList<>();

    public Produto() {
        produtos.add(this);
    }

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        produtos.add(this);
    }

    public Produto(String nome, double valor, int quantidadeEstoque) {
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
        produtos.add(this);
    }

    public void addEstoque(int quantidade) {
        quantidadeEstoque = quantidadeEstoque + quantidade;
    }

    public void remEstoque(int quantidade) {
        quantidadeEstoque -= quantidade;
    }

    public static Object[] toObject() {
        Object[] prod = new Object[produtos.size()];
        for (int i = 0; i < produtos.size(); i++) {
            prod[i] = produtos.get(i).nome;
        }
        return prod;
    }

    //GETTERS
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    //SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

}
