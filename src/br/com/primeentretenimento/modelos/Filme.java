package br.com.primeentretenimento.modelos;

import br.com.primeentretenimento.logicas.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String direcao;

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public int getAvaliador() {
        if (getTotalDeAvaliacoes() > 100) {
            return 4;
        } else if (getTotalDeAvaliacoes() > 50) {
            return 2;
        } else {
            return 0;
        }
    }
}
