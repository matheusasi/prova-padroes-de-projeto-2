package questao3;

public class Leite extends Complemento {
    public Leite(Pedido pedido) {
        super(pedido);
    }

    @Override
    public String getDescricao() {
        return pedido.getDescricao() + " + Leite";
    }

    @Override
    public double getPreco() {
        return pedido.getPreco() + 2.0;
    }
}
