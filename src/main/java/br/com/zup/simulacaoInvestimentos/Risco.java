package br.com.zup.simulacaoInvestimentos;

public enum Risco {
    BAIXO,
    MEDIO,
    ALTO;

    private String descricao;

    Risco(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
