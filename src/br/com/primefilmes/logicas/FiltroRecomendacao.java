package br.com.primefilmes.logicas;

import br.com.primefilmes.modelos.Titulo;

public class FiltroRecomendacao {
    public void filtraTitulo(Classificacao classificacao) {
        if (classificacao.getAvaliador() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificacao.getAvaliador() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
