package questao3;

public class Espresso implements Pedido {
    @Override
    public String getDescricao() {
        return "Espresso";
    }

    @Override
    public double getPreco() {
        return 6.0;
    }
}
