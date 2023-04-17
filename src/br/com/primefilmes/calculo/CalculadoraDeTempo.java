package br.com.primefilmes.calculo;

import br.com.primefilmes.modelos.Filme;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Filme filme){
        tempoTotal += filme.getDuracaoEmMinutos();
    }
}
