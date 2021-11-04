package br.com.zup.simulacaoInvestimentos;

public class InvestimentoDTO {
    private String email;
    private String nome;
    private String cpf;
    private String valorInvestido;
    private String periodoDeAplicacaoMeses;
    private Risco risco;

    public InvestimentoDTO(String email, String nome, String cpf, String valorInvestido, String periodoDeAplicacaoMeses, Risco risco) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.valorInvestido = valorInvestido;
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
        this.risco = risco;
    }

    public InvestimentoDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(String valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public String getPeriodoDeAplicacaoMeses() {
        return periodoDeAplicacaoMeses;
    }

    public void setPeriodoDeAplicacaoMeses(String periodoDeAplicacaoMeses) {
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }
}
