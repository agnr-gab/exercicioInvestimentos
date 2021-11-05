package br.com.zup.simulacaoInvestimentos.simulador.dtos;

public class SimuladorDTO {
    private double valorInvestimento;
    private double lucro;
    private double valorFinal;

    public SimuladorDTO(double valorInvestimento, double lucro, double valorFinal) {
        this.valorInvestimento = valorInvestimento;
        this.lucro = lucro;
        this.valorFinal = valorFinal;
    }

    public SimuladorDTO() {
    }

    public double getValorInvestimento() {
        return valorInvestimento;
    }

    public void setValorInvestimento(double valorInvestimento) {
        this.valorInvestimento = valorInvestimento;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
}
