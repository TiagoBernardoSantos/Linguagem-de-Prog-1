import java.util.Scanner;

public class TestaClasse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instâncias de classes com atributos corrigidos
        Cachorros cachorro = new Cachorros("Buddy", "Golden Retriever", 3);
        Flor flor = new Flor("Lírio", "Branco", 45.0);
        Planeta planeta = new Planeta("Marte", 0.107, 6792.0, 227.9);
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178, "Uma jornada épica pela Terra-média");
        Cafeteria cafeteria = new Cafeteria("Café Central", 50, new String[]{"Cappuccino", "Espresso", "Latte"});
        DivasPop diva = new DivasPop("Ariana Grande", 1993, 6);
        Fruta fruta = new Fruta("Morango", "Inverno", 150.0f);
        ReservaHotel reserva = new ReservaHotel("João Silva", 203, "2024-09-10");
        Salgadinho salgadinho = new Salgadinho("Cheetos", "Queijo", 80.0f);
        LojaDeDoces lojaDeDoces = new LojaDeDoces("Candy Store", 3.50, 100);

        int opcao = 0;

        while (opcao != 11) {
            System.out.println("===== MENU DE TESTES =====");
            System.out.println("1. Testar Cachorro");
            System.out.println("2. Testar Flores");
            System.out.println("3. Testar Planetas");
            System.out.println("4. Testar Livro");
            System.out.println("5. Testar Cafeteria");
            System.out.println("6. Testar Divas Pop");
            System.out.println("7. Testar Fruta");
            System.out.println("8. Testar Reserva de Hotel");
            System.out.println("9. Testar Salgadinhos");
            System.out.println("10. Testar Loja de Doces");
            System.out.println("11. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número entre 1 e 11.");
                scanner.next();
                continue;
            }

            switch (opcao) {
                case 1:
                    cachorro.latir();
                    cachorro.comer();
                    break;
                case 2:
                    flor.florescer();
                    flor.mostrarInformacoes();
                    break;
                case 3:
                    planeta.orbitar();
                    planeta.mostrarInformacoes();
                    break;
                case 4:
                    livro.abrir();
                    livro.exibirResumo();
                    break;
                case 5:
                    cafeteria.mostrarInformacoes();
                    break;
                case 6:
                    diva.mostrarInformacoes();
                    diva.calcularIdade(2024);
                    break;
                case 7:
                    fruta.mostrarInformacoes();
                    fruta.exibirEpocaDoAno();
                    break;
                case 8:
                    reserva.mostrarReserva();
                    break;
                case 9:
                    salgadinho.mostrarInformacoes();
                    break;
                case 10:
                    lojaDeDoces.mostrarInformacoes();
                    lojaDeDoces.valorTotal();
                    break;
                case 11:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}