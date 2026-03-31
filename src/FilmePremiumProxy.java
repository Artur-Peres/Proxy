public class FilmePremiumProxy implements Conteudo{

    private FilmePremium filmePremium = new FilmePremium();

    @Override
    public void assistir(Usuario usuario) {
        if (usuario!=null) {
            if (usuario.getPlano().equals("PREMIUM")) {
                System.out.println("Acesso liberado para " + usuario.getNome());
                filmePremium.assistir(usuario);
            } else {
                System.out.println("Acesso negado para " + usuario.getNome() + ". Conteúdo disponível apenas para usuários PREMIUM.");
                System.out.println();
            }
        } else {throw new IllegalArgumentException("Usuário inválido.");}
    }
}
