import br.com.primefilmes.logicas.CalculadoraDeTempo;
import br.com.primefilmes.logicas.FiltroRecomendacao;
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
        lost.setDuracaoEmMinutos(2000);
        System.out.println("Duração da serie " + lost.getNome() + " é de: " + lost.getDuracaoEmMinutos() + " Minutos.");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.somaTempoDeTitulo(meuFilme);
        calculadora.somaTempoDeTitulo(outroFilme);
        calculadora.somaTempoDeTitulo(lost);
        System.out.println("Os Títulos adicionados totalizam: " + calculadora.getTempoTotal() + " Minutos.");
        System.out.println("As aspas duplas ficam assim: \"\"");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtraTitulo(lost);
        filtro.filtraTitulo(meuFilme);
        filtro.filtraTitulo(outroFilme);
    }
}