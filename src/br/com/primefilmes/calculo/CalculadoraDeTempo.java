package br.com.primefilmes.calculo;

import br.com.primefilmes.modelos.Filme;
import br.com.primefilmes.modelos.Serie;
import br.com.primefilmes.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void somaTempoDeTitulo(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//    public void somaTempoDeTitulo(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    public void somaTempoDeTitulo(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
