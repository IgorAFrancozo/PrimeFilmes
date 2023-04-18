package br.com.primefilmes.modelos;

import br.com.primefilmes.logicas.Classificacao;

public class Episodio implements Classificacao {
    private String nome;
    private int numero;
    private int totalAvaliacoes;
    private Serie serie;

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getAvaliador() {
        if (totalAvaliacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}