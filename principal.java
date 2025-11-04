package br.senac.locadora;

import br.senac.locadora.modelo.*;

public class Principal {
    public static void main(String[] args) {
        // Filmes disponíveis
        Filme[] catalogo = {
            new Filme("Matrix", 5.0),
            new Filme("Inception", 6.0),
            new Filme("Vingadores", 7.0),
            new Filme("Homem de Ferro", 5.5),
            new Filme("Titanic", 4.0),
            new Filme("Avatar", 6.5),
            new Filme("Gladiador", 5.0),
            new Filme("Coringa", 6.0),
            new Filme("Interstellar", 7.5),
            new Filme("O Senhor dos Anéis", 8.0)
        };

        // Clientes e contas
        Cliente c1 = new Cliente("Ana Silva", "111.111.111-11");
        Cliente c2 = new Cliente("Bruno Souza", "222.222.222-22");
        Cliente c3 = new Cliente("Carla Pereira", "333.333.333-33");

        Conta conta1 = new Conta(c1);
        Conta conta2 = new Conta(c2);
        Conta conta3 = new Conta(c3);

        // Locações
        conta1.locarFilmes(new Filme[]{catalogo[0], catalogo[1]});
        conta1.locarFilmes(new Filme[]{catalogo[4], catalogo[5], catalogo[6]});

        conta2.locarFilmes(new Filme[]{catalogo[2], catalogo[3]});
        conta2.locarFilmes(new Filme[]{catalogo[7]});

        conta3.locarFilmes(new Filme[]{catalogo[8], catalogo[9]});
        conta3.locarFilmes(new Filme[]{catalogo[0]});

        // Pagamentos
        conta1.pagarDebito(10.0);
        conta2.pagarDebito(5.0);

        // Extratos
        System.out.println(conta1.extratoHistorico());
        System.out.println(conta2.extratoHistorico());
        System.out.println(conta3.extratoHistorico());
    }
}
