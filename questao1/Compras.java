package questao1;

public class Compras implements AreaInteressada {
    private static final int LIMITE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < LIMITE_MINIMO) {
            System.out.println("[Compras] ALERTA: " + nomeProduto + " com estoque baixo (" + novaQuantidade + " unidades)");
        }
    }
}
