package br.com.zup.simulacaoInvestimentos.simulador.config;

public class MensagemDeErros {
    public String mensagemDeErro;
    public String campo;

    public MensagemDeErros(String mensagemDeErro, String campo) {
        this.mensagemDeErro = mensagemDeErro;
        this.campo = campo;
    }

    public String getMensagemDeErro() {
        return mensagemDeErro;
    }

    public void setMensagemDeErro(String mensagemDeErro) {
        this.mensagemDeErro = mensagemDeErro;
    }
}
