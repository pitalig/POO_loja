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
    public String getPrazo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isDevolvido() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
