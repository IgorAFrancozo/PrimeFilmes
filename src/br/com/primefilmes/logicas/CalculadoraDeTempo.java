package br.com.primefilmes.logicas;

import br.com.primefilmes.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void somaTempoDeTitulo(Filme filme){ Somente pode usar Filme
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//    public void somaTempoDeTitulo(Serie serie){ Somente pode usar Série
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    } refatorado para herdar do pai "Título" que aceita filme e série.

    public void somaTempoDeTitulo(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
