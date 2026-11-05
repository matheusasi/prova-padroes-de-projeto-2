package questao2;

public class Ticket {
    private String placa;
    private int minutos;
    private EstrategiaCobranca estrategia;

    public Ticket(String placa, int minutos, EstrategiaCobranca estrategia) {
        this.placa = placa;
        this.minutos = minutos;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaCobranca estrategia) {
        this.estrategia = estrategia;
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutos() {
        return minutos;
    }

    public double calcularValor() {
        return estrategia.calcular(minutos);
    }
}
