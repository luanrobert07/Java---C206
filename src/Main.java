import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        computador1.marca = "Positivo";
        computador1.preco = 2300;

        computador2.marca = "Acer";
        computador2.preco = 5800;

        computador3.marca = "Vaio";
        computador3.preco = 1800;

        computador1.hardwareBasico.nome = "Pentium Core i3, Memória HD";
        computador1.hardwareBasico.capacidade = 500;
        computador1.sistemaOperacional.nome = "Linux Ubuntu";
        computador1.sistemaOperacional.tipo = 32;

        computador1.memoriaUSB = new MemoriaUSB();
        computador1.memoriaUSB.nome = "Pen-drive";
        computador1.memoriaUSB.capacidade = 16;

        computador2.hardwareBasico.nome = "Pentium Core i5, Memória HD";
        computador2.hardwareBasico.capacidade = 1000;
        computador2.sistemaOperacional.nome = "Windows 8";
        computador2.sistemaOperacional.tipo = 64;

        computador2.memoriaUSB = new MemoriaUSB();
        computador2.memoriaUSB.nome = "Pen-drive";
        computador2.memoriaUSB.capacidade = 32;

        computador3.hardwareBasico.nome = "Pentium Core i7, Memória HD";
        computador3.hardwareBasico.capacidade = 2000;
        computador3.sistemaOperacional.nome = "Windows 10";
        computador3.sistemaOperacional.tipo = 64;

        computador3.memoriaUSB = new MemoriaUSB();
        computador3.memoriaUSB.nome = "HD externo";
        computador3.memoriaUSB.capacidade = 1000;

        Cliente cliente1 = new Cliente();

        cliente1.nome = "Luan";
        cliente1.cpf = 1111111111;

        int escolha;
        float totalCompra = 0;

        do {
            System.out.println();
            System.out.println("Bem-vindo à loja de computadores!");
            System.out.println("Escolha um computador para comprar:");
            System.out.println("1. " + computador1.marca + " - R$" + computador1.preco);
            System.out.println("2. " + computador2.marca + " - R$" + computador2.preco);
            System.out.println("3. " + computador3.marca + " - R$" + computador3.preco);
            System.out.println("0. Sair");

            System.out.print("Digite o número da opção desejada: ");

            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1 -> {
                        totalCompra += computador1.preco;
                        System.out.println("Informações sobre o PC comprado:");
                        System.out.println();
                        computador1.mostraPCConfigs();
                    }
                    case 2 -> {
                        totalCompra += computador2.preco;
                        System.out.println("Informações sobre o PC comprado:");
                        System.out.println();
                        computador2.mostraPCConfigs();
                    }
                    case 3 -> {
                        totalCompra += computador3.preco;
                        System.out.println("Informações sobre o PC comprado:");
                        System.out.println();
                        computador3.mostraPCConfigs();
                    }
                    case 0 -> System.out.println("Compra finalizada.");
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.next();
                escolha = -1;
            }

        } while (escolha != 0);


        System.out.println();
        System.out.println("Dados do Cliente:");
        System.out.println("Nome: " + cliente1.nome);
        System.out.println("CPF: " + cliente1.cpf);
        System.out.println();

        cliente1.calculaTotalCompra(totalCompra);

        scanner.close();
    }
}
