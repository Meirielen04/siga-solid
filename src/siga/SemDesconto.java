package siga;

public class SemDesconto implements Desconto {
    @Override
    public double calcular(double valorBase) {
        return valorBase;
    }
}
