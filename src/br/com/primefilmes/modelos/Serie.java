package br.com.primefilmes.modelos;

import br.com.primefilmes.logicas.Classificacao;

public class Serie extends Titulo implements Classificacao {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;
    private boolean ativa;
    private int avaliacao;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public int getAvaliador() {
        if (avaliacao >= 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
