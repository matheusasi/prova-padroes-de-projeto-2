package questao2;

public class Conveniado implements EstrategiaCobranca {
    private static final double VALOR_HORA = 10.0;
    private static final int MINUTOS_GRATIS = 30;
    private static final double DESCONTO = 0.20;

    @Override
    public double calcular(int minutos) {
        if (minutos <= MINUTOS_GRATIS) {
            return 0;
        }
        int horas = (int) Math.ceil((minutos - MINUTOS_GRATIS) / 60.0);
        return horas * VALOR_HORA * (1 - DESCONTO);
    }
}
