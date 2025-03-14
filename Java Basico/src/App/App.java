package App;

public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(
                "maria_teste",
                "senha123",
                "maria_teste123@test.com"
        );

        Usuario usuario2 = new Usuario(
                "joao_teste",
                "senha123",
                "joao_teste123@test.com"
        );

        usuario1.ativo = true;

        System.out.println(usuario1.isActive());
        System.out.println(usuario2.isActive());
        System.out.println(Usuario.getLimiteCaracteres());

    }
}
