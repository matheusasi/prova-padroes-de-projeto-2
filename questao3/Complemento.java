package questao3;

public abstract class Complemento implements Pedido {
    protected Pedido pedido;

    public Complemento(Pedido pedido) {
        this.pedido = pedido;
    }
}
