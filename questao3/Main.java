package questao3;

public class Main {
    public static void main(String[] args) {
        Pedido pedido1 = new Leite(new Espresso());
        Pedido pedido2 = new Calda(new Chantilly(new Cha()));
        Pedido pedido3 = new Leite(new Leite(new Chantilly(new Espresso())));

        imprimir(pedido1);
        imprimir(pedido2);
        imprimir(pedido3);
    }

    private static void imprimir(Pedido pedido) {
        System.out.printf("%s = R$ %.2f%n", pedido.getDescricao(), pedido.getPreco());
    }
}
