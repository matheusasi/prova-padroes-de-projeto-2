package questao1;

import java.util.ArrayList;
import java.util.List;

public class Auditoria implements AreaInteressada {
    private List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = nomeProduto + " -> " + novaQuantidade;
        registros.add(registro);
        System.out.println("[Auditoria] Registro: " + registro);
    }

    public List<String> getRegistros() {
        return registros;
    }
}
