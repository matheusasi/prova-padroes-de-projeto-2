package questao2;

public class Rotativo implements EstrategiaCobranca {
    private static final double VALOR_HORA = 10.0;

    @Override
    public double calcular(int minutos) {
        int horas = (int) Math.ceil(minutos / 60.0);
        return horas * VALOR_HORA;
    }
}
