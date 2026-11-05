package questao1;

public class Main {
    public static void main(String[] args) {
        Produto notebook = new Produto("Notebook", 10);

        Compras compras = new Compras();
        Vendas vendas = new Vendas();
        Auditoria auditoria = new Auditoria();

        notebook.adicionarArea(compras);
        notebook.adicionarArea(vendas);
        notebook.adicionarArea(auditoria);

        System.out.println("Alterando para 8");
        notebook.alterarQuantidade(8);

        System.out.println("Alterando para 8 de novo (nada deve acontecer)");
        notebook.alterarQuantidade(8);

        System.out.println("Alterando para 3");
        notebook.alterarQuantidade(3);

        System.out.println("Alterando para 0");
        notebook.alterarQuantidade(0);

        System.out.println("Alterando para 6");
        notebook.alterarQuantidade(6);

        System.out.println("Removendo a Auditoria");
        notebook.removerArea(auditoria);

        System.out.println("Alterando para 2");
        notebook.alterarQuantidade(2);
    }
}
