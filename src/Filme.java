public class Filme {
    String nome;
    String genero;
    String descricao;
    private String direcao;
    private String atores;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double obterMediaDasAvaliacoes() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    int getTotalDasAvaliações() {
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Descrição: " + descricao);
        System.out.println("Direção: " + direcao);
        System.out.println("Atores: " + atores);
        System.out.println("Duração do Filme (min): " + duracaoEmMinutos);
        System.out.println("Nota: " + somaDasAvaliacoes);
        System.out.println("Número de Avaliações: " + totalDeAvaliacoes);
        System.out.println("Incluido no plano básico: " + incluidoNoPlano);
    }

}
