package br.com.primeentretenimento.modelos;

import br.com.primeentretenimento.logicas.Classificacao;

public class Episodio implements Classificacao {
    private String nome;
    private int numero;
    private int totalAvaliacoes;
    private Serie serie;

    public int getTotalDasAvaliacoes() {
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
        if (getTotalDasAvaliacoes() > 100) {
            return 4;
        } else if (getTotalDasAvaliacoes() > 50){
            return 2;
        }else {
            return 0;
        }
    }
}