package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 150;

        Ticket rotativo = new Ticket("ABC1D23", minutos, new Rotativo());
        Ticket mensalista = new Ticket("DEF4G56", minutos, new Mensalista());
        Ticket conveniado = new Ticket("HIJ7K89", minutos, new Conveniado());

        System.out.println("Permanencia de " + minutos + " minutos");
        System.out.printf("Rotativo: R$ %.2f%n", rotativo.calcularValor());
        System.out.printf("Mensalista: R$ %.2f%n", mensalista.calcularValor());
        System.out.printf("Conveniado: R$ %.2f%n", conveniado.calcularValor());

        System.out.println();
        System.out.println("Trocando o perfil do ticket " + rotativo.getPlaca());
        System.out.printf("Antes (Rotativo): R$ %.2f%n", rotativo.calcularValor());
        rotativo.setEstrategia(new Conveniado());
        System.out.printf("Depois (Conveniado): R$ %.2f%n", rotativo.calcularValor());
        rotativo.setEstrategia(new Mensalista());
        System.out.printf("Depois (Mensalista): R$ %.2f%n", rotativo.calcularValor());
    }
}
