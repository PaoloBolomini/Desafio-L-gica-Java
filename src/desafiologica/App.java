package desafiologica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();

        // Adicionando as pessoas
        pessoas.add(new Pessoa("Ana Silva", "Assistente Administrativo", 28, "São Paulo"));
        pessoas.add(new Pessoa("João Pereira", "Desenvolvedor de Software", 32, "Rio de Janeiro"));
        pessoas.add(new Pessoa("Natan Oliveira", "QA", 25, "Santa Catarina"));
        pessoas.add(new Pessoa("Carlos Santos", "Desenvolvedor de Software", 35, "Espírito Santo"));
        pessoas.add(new Pessoa("Fernanda Costa", "QA", 30, "Paraná"));
        pessoas.add(new Pessoa("Lucas Almeida", "Engenheiro Civil", 29, "Rio Grande do Sul"));
        pessoas.add(new Pessoa("Juliana Rocha", "Desenvolvedor de Software", 34, "São Paulo"));
        pessoas.add(new Pessoa("Tiago Mendes", "Analista de Dados", 27, "Espírito Santo"));
        pessoas.add(new Pessoa("Douglas Costa", "Mobile", 32, "Piauí"));
        pessoas.add(new Pessoa("Felipe Martins", "Consultor Financeiro", 31, "Santa Catarina"));

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // Exibir menu
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Calcular porcentagem de candidatos por vaga");
            System.out.println("2. Calcular idade média de candidatos por vaga");
            System.out.println("3. Encontrar idade do candidato mais velho por vaga");
            System.out.println("4. Encontrar idade do candidato mais novo por vaga");
            System.out.println("5. Calcular soma das idades de candidatos por vaga");
            System.out.println("6. Contar estados distintos");
            System.out.println("7. Mostrar instrutor de QA");
            System.out.println("8. Mostrar instrutor de Mobile");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            opcao = scanner.nextInt();

            // Chamar o método correspondente
            switch (opcao) {
                case 1:
                    Tarefas.calcularPorcentagemPorVaga(pessoas);
                    esperarEnter(scanner);
                    break;
                case 2:
                    Tarefas.calcularIdadeMediaPorVaga(pessoas);
                    esperarEnter(scanner);
                    break;
                case 3:
                    Tarefas.encontrarIdadeMaisVelhoPorVaga(pessoas);
                    esperarEnter(scanner);
                    break;
                case 4:
                    Tarefas.encontrarIdadeMaisNovoPorVaga(pessoas);
                    esperarEnter(scanner);
                    break;
                case 5:
                    Tarefas.calcularSomaIdadesPorVaga(pessoas);
                    esperarEnter(scanner);
                    break;
                case 6:
                    Tarefas.contarEstadosDistintos(pessoas);
                    esperarEnter(scanner);
                    break;
                case 7:
                    Tarefas.mostrarInstrutorQA();
                    esperarEnter(scanner);
                    break;
                case 8:
                    Tarefas.mostrarInstrutorMobile();
                    esperarEnter(scanner);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    esperarEnter(scanner);
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }

    private static void esperarEnter(Scanner scanner) {
        System.out.println("Pressione Enter para continuar...");
        scanner.nextLine(); // Consome a nova linha restante
        scanner.nextLine(); // Espera pela entrada do usuário
    }
}
