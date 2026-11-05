package questao2;

public class Mensalista implements EstrategiaCobranca {
    private static final double VALOR_FIXO = 200.0;

    @Override
    public double calcular(int minutos) {
        return VALOR_FIXO;
    }
}
