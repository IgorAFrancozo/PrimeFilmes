import br.com.primefilmes.calculo.CalculadoraDeTempo;
import br.com.primefilmes.modelos.Filme;
import br.com.primefilmes.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Top Igão");
        meuFilme.setDescricao("Filmaço de ação!");
        meuFilme.setGenero("Ação");
        meuFilme.setDirecao("Tarantino");
        meuFilme.setAtores("Tom Cruise");
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7.5);

        System.out.println(meuFilme.obterMediaDasAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDasAvaliacoes());

        Filme outroFilme = new Filme();
        outroFilme.setNome("O Poderoso Chefão");
        outroFilme.setDuracaoEmMinutos(123);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setGenero("Fantasia");
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(22);
        lost.setDuracaoEmMinutos(23);
        System.out.println("Duração da serie " + lost.getNome() + " é de: " + lost.getDuracaoEmMinutos() + " Minutos.");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        System.out.println("Os filmes " + meuFilme.getNome() + " e " + outroFilme.getNome() + " possuem " + calculadora.getTempoTotal() + " Minutos.");
        System.out.println("As aspas duplas ficam assim: """);
    }
}