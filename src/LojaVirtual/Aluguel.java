package LojaVirtual;

import static LojaVirtual.Operacao.operacoes;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

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

    public static Object[] toObject() {
        List<String> aluguel = new ArrayList<>();
        Aluguel a = new Aluguel();
        for (int i = 0; i < operacoes.size(); i++) {
            if (operacoes.get(i).getClass().equals(a.getClass()) && !operacoes.get(i).isDevolvido()) {
                aluguel.add(i + " - " + operacoes.get(i).cliente.getNome());
            }
        }
        String[] alug = aluguel.toArray(new String[aluguel.size()]);
        return alug;
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
