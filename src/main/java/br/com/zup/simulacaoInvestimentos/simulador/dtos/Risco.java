package br.com.zup.simulacaoInvestimentos.simulador.dtos;

public enum Risco {
    BAIXO(0.025),
    MEDIO(0.015),
    ALTO(0.025);

    private double taxa;

    Risco(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
}
