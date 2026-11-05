package questao1;

import java.util.HashSet;
import java.util.Set;

public class Vendas implements AreaInteressada {
    private Set<String> produtosZerados = new HashSet<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            produtosZerados.add(nomeProduto);
        } else if (produtosZerados.remove(nomeProduto)) {
            System.out.println("[Vendas] ALERTA: " + nomeProduto + " voltou a ter estoque (" + novaQuantidade + " unidades)");
        }
    }
}
