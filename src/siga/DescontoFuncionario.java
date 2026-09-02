package siga;

public class DescontoFuncionario implements Desconto {
    @Override
    public double calcular(double valorBase) {
        return valorBase * 0.7;
    }
}
