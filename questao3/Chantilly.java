package questao3;

public class Chantilly extends Complemento {
    public Chantilly(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " + Chantilly";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + 3.5;
    }
}
