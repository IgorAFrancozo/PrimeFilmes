package br.com.primefilmes.modelos;

import br.com.primefilmes.logicas.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String direcao;
    private int avaliacoes;

    public String getDirecao() {
        return direcao;
    }

    public void setDirecao(String direcao) {
        this.direcao = direcao;
    }

    @Override
    public int getAvaliador() {
        if (avaliacoes >= 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
