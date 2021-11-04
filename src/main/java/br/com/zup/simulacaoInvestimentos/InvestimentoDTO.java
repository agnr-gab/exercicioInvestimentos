package br.com.zup.simulacaoInvestimentos;

import org.hibernate.validator.constraints.br.CPF;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class InvestimentoDTO {
    @Email (message = "Email informado é inválido")
    private String email;
    @Size(min = 5, max = 15, message = "O nome inserido deve ter no mínimo 5 caracteres e no máximo 15")
    @NotBlank
    private String nome;
    @CPF(message = "CPF inválido")
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
