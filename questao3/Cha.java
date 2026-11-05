package questao3;

public class Cha implements Pedido {
    @Override
    public String getDescricao() {
        return "Cha";
    }

    @Override
    public double getPreco() {
        return 4.5;
    }
}
