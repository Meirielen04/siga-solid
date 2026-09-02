package siga;

public class DescontoConvenio implements Desconto {
    @Override
    public double calcular(double valorBase) {
        return valorBase * 0.8;
    }
}