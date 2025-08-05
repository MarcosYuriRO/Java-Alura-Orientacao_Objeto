import br.com.alura.ProjetoMain.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibaFichaTecnica();
        meuFilme.avalie(7);
        meuFilme.avalie(10);
        meuFilme.avalie(3);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegueMedia());
        //System.out.println(meuFilme.totalDeAvaliacoes);
        //System.out.println(meuFilme.pegueMedia());
    }
}