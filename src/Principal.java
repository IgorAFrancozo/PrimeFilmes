public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Top Igão";
        meuFilme.descricao = "Filmaço de ação!";
        meuFilme.genero = "Ação";

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7.5);

        System.out.println(meuFilme.obterMediaDasAvaliacoes());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDasAvaliações());
    }
}