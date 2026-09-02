package siga;

public class DescontoBolsista implements Desconto {
        @Override
        public double calcular(double valorBase) {
            return valorBase * 0.5;
        }
    }