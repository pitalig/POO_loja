package LojaVirtual;

import java.util.ArrayList;
import java.util.List;

public abstract class Operacao {

    public ArrayList<Produto> itens = new ArrayList<>();

    public static ArrayList<Operacao> operacoes = new ArrayList<>();

    protected Cliente cliente;

    protected double valor;

    public abstract String mostrarPedido();

    public abstract String getPrazoValor();

    public abstract boolean isDevolvido();

    public abstract void calcularValor();

    public void addProduto(Produto p) {
        itens.add(p);
        p.remEstoque(1);
    }

    public void remProduto(Produto p) {
        itens.remove(p);
        p.addEstoque(1);
    }

    public Object[] itensToObject() {
        Object[] prod = new Object[itens.size()];
        for (int i = 0; i < itens.size(); i++) {
            prod[i] = itens.get(i).getNome();
        }
        return prod;
    }

    public void salvar(Cliente c) {
        this.cliente = c;
        this.calcularValor();
        Operacao.operacoes.add(this);
    }

}
