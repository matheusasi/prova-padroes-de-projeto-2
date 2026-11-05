package questao3;

public class Calda extends Complemento {
    public Calda(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " + Calda";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + 2.5;
    }
}
