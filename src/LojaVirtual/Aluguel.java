package LojaVirtual;

import static LojaVirtual.Operacao.operacoes;
import static java.lang.Math.round;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Aluguel extends Operacao {

    private int prazo;

    private final LocalDate dataRetirada;

    private LocalDate dataDevolucao;

    private long diasAlugado;

    private boolean devolvido;

    private double multa;

    public Aluguel() {
        dataRetirada = LocalDate.now();
        devolvido = false;
    }

    //Contrutor para exemplo
    public Aluguel(LocalDate dataRetirada, Cliente c, Produto p1, Produto p2, Produto p3) {
        this.dataRetirada = dataRetirada;
        this.devolvido = false;
        this.itens.add(p1);
        this.itens.add(p2);
        this.itens.add(p3);
        this.calcularValor();
        this.salvar(c);
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

    public double devolver() {
        devolvido = true;
        dataDevolucao = LocalDate.now();
        diasAlugado = ChronoUnit.DAYS.between(dataRetirada, dataDevolucao);
        multa = (diasAlugado - prazo) * valor / 3;
        return multa;
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
    public String getPrazoValor() {
        int i = Operacao.operacoes.size() - 1;
        return "O valor total é: R$" + String.format("%.2f", valor) + ". Os produtos devem ser devolvidos em até " + prazo + " dias. Código de referência: " + i;
    }

    public boolean isDevolvido() {
        return devolvido;
    }
}
