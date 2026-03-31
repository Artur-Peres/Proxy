public class Main {
    public static void main(String[] args) {

        Conteudo conteudo = new FilmePremiumProxy();

        Usuario usuario1=new Usuario("Carlos", "PREMIUM");
        Usuario usuario2=new Usuario("Ana", "BASICO");
        Usuario usuario3=new Usuario("Marina", "PREMIUM");
        Usuario usuario4=new Usuario("Pedro", "BASICO");

        conteudo.assistir(usuario1);
        conteudo.assistir(usuario2);
        conteudo.assistir(usuario3);
        conteudo.assistir(usuario4);
        conteudo.assistir(null);

    }
}
