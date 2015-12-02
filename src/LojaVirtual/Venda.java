package LojaVirtual;

public class Venda extends Operacao {

    public Venda() {
    }

    @Override
    public void calcularValor() {
        for (Produto iten : itens) {
            valor += iten.getValor();
        }
    }

    @Override
    public String mostrarPedido() {
        return null;
    }

    @Override
    public String getPrazoValor() {
        return "O valor total é: R$" + String.format("%.2f", valor);
    }

    @Override
    public boolean isDevolvido() {
        throw new UnsupportedOperationException("");
    }
}
