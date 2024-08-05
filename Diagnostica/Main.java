import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<Carro> carros = new ArrayList<>();

        while (true) {
            System.out.printf("1-Adicionar carro\n2-Lavar carro\n3-Ver lista de carros\n4-Remover carro\n5-Sair\n");
            int opcao = ler.nextInt();
            ler.nextLine();

            if (opcao == 1) {
                System.out.print("Digite a placa do carro: ");
                String placa = ler.nextLine();
                System.out.print("Digite o ano do carro: ");
                int ano = ler.nextInt();
                ler.nextLine();
                carros.add(new Carro(placa, ano));
                System.out.println("Carro adicionado com sucesso!");
            } else if (opcao == 2) {
                System.out.print("Digite a placa do carro a ser lavado: ");
                String placa = ler.nextLine();
                for (Carro carro : carros) {
                    if (carro.getPlaca().equals(placa)) {
                        carro.setLavado();
                        System.out.println("Carro lavado com sucesso!");
                        break;
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Lista de carros:");
                for (Carro carro : carros) {
                    System.out.println("Placa: " + carro.getPlaca() + ", Ano: " + carro.getAno() + ", Lavado: " + carro.isLavado());
                }
            } else if (opcao == 4) {
                System.out.print("Digite a placa do carro a ser removido: ");
                String placa = ler.nextLine();
                carros.removeIf(carro -> carro.getPlaca().equals(placa));
                System.out.println("Carro removido com sucesso!");
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        ler.close();
    }
}
