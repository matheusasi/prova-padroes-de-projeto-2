package questao1;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private int quantidade;
    private List<AreaInteressada> areas = new ArrayList<>();

    public Produto(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarArea(AreaInteressada area) {
        areas.add(area);
    }

    public void removerArea(AreaInteressada area) {
        areas.remove(area);
    }

    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade == quantidade) {
            return;
        }
        quantidade = novaQuantidade;
        notificarAreas();
    }

    private void notificarAreas() {
        for (AreaInteressada area : areas) {
            area.atualizar(nome, quantidade);
        }
    }
}
