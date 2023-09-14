package br.com.primeentretenimento.modelos;

public class Titulo {
    private String nome;
    private String genero;
    private String descricao;
    private String atores;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getAtores() {
        return atores;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double obterMediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Descrição: " + descricao);
        System.out.println("Atores: " + atores);
        System.out.println("Duração(min): " + duracaoEmMinutos);
        System.out.println("Nota: " + somaDasAvaliacoes);
        System.out.println("Número de Avaliações: " + totalDeAvaliacoes);
        System.out.println("Incluido no plano básico: " + incluidoNoPlano);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
    }
}
