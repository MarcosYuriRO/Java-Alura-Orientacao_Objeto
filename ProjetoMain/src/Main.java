import br.com.alura.ProjetoMain.modelos.Filme;
import br.com.alura.ProjetoMain.modelos.Serie;

public class Main {
    public static void main(String[] args) {
        //meuFilme = objeto do tipo Filme:
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibaFichaTecnica();
        System.out.println("Duração do Filme em minutos: " + meuFilme.getDuracaoEmMinutos());
        meuFilme.avalie(7);
        meuFilme.avalie(10);
        meuFilme.avalie(3);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média: " + meuFilme.pegueMedia());
        //System.out.println(meuFilme.totalDeAvaliacoes);
        //System.out.println(meuFilme.pegueMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibaFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(9);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da Série: " + lost.getDuracaoEmMinutos());
    }
}