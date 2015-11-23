package LojaVirtual;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluguel extends Operacao {

    private int prazo;

    private final LocalDate dataRetirada;

    private LocalDate dataDevolucao;

    private long diasAlugado;

    private boolean devolvido;

    public Aluguel() {
        dataRetirada = LocalDate.now();
        devolvido = false;
    }

    @Override
    public void calcularValor() {
        for (Produto produto : itens) {
            this.valor += produto.getValor() * 0.2;
        }
    }

    @Override
    public String mostrarPedido() {
        return "Aluguel{" + "prazo=" + prazo + ", valor=" + valor + ", dataRetirada=" + dataRetirada + ", dataDevolucao=" + dataDevolucao + ", diasAlugado=" + diasAlugado + '}';
    }

    public void devolver() {
        devolvido = true;
        dataDevolucao = LocalDate.now();
        diasAlugado = ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);

    }

    @Override
    public void salvar(Cliente c) {
        this.cliente = c;
        this.calcularValor();
        this.prazo = 3 + itens.size();
        Operacao.operacoes.add(this);
    }

    //GETTERS
    public String getPrazo() {
        int i = Operacao.operacoes.size() - 1;
        return "Os produtos devem ser devolvidos em até " + prazo + " dias. Código de referência: " + i;
    }

    public boolean isDevolvido() {
        return devolvido;
    }
}
