import br.com.primefilmes.logicas.CalculadoraDeTempo;
import br.com.primefilmes.logicas.FiltroRecomendacao;
import br.com.primefilmes.modelos.Episodio;
import br.com.primefilmes.modelos.Filme;
import br.com.primefilmes.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        Filme meuFilme = new Filme();
        meuFilme.setNome("Top Igão");
        meuFilme.setDescricao("Filmaço de ação!");
        meuFilme.setGenero("Ação");
        meuFilme.setDirecao("Tarantino");
        meuFilme.setAtores("Tom Cruise");
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setTotalDeAvaliacoes(51);
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(10);

        System.out.println("Média das avaliações: " + meuFilme.obterMediaDasAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Crepusculo");
        outroFilme.setDuracaoEmMinutos(123);
        outroFilme.setGenero("Brega");
        outroFilme.setSomaDasAvaliacoes(0);
        outroFilme.avalia(2);

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setGenero("Fantasia");
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(22);
        lost.setDuracaoEmMinutos(2000);
        System.out.println("Duração da serie " + lost.getNome() + " é de: " + lost.getDuracaoEmMinutos() + " Minutos.");

        lost.avalia(9);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.somaTempoDeTitulo(meuFilme);
        calculadora.somaTempoDeTitulo(outroFilme);
        calculadora.somaTempoDeTitulo(lost);
        System.out.println("Os Títulos adicionados totalizam: " + calculadora.getTempoTotal() + " Minutos.");
        System.out.println("As aspas duplas ficam assim: \"\"");

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalAvaliacoes(101);

        System.out.println("Primeiro Filme: ");
        filtro.filtraTitulo(meuFilme);
        System.out.println("Segundo Filme: ");
        filtro.filtraTitulo(outroFilme);
        System.out.println("Terceiro Filme: ");
        filtro.filtraTitulo(episodio);
    }
}