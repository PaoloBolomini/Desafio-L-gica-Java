package desafiologica;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Tarefas {
	
	public static void calcularPorcentagemPorVaga(List<Pessoa> pessoas) {
        // Contando as inscrições por vaga
        Map<String, Integer> contadorVagas = new HashMap<>();
        for (Pessoa pessoa : pessoas) {
            contadorVagas.put(pessoa.getVaga(), contadorVagas.getOrDefault(pessoa.getVaga(), 0) + 1);
        }

        // Total de candidatos
        int totalCandidatos = pessoas.size();

        // Exibindo a porcentagem de candidatos por vaga
        System.out.println("Porcentagem de candidatos por vaga:");
        for (Map.Entry<String, Integer> entry : contadorVagas.entrySet()) {
            String vaga = entry.getKey();
            int quantidade = entry.getValue();
            double porcentagem = (double) quantidade / totalCandidatos * 100;
            System.out.printf("%s: %.2f%%\n", vaga, porcentagem);
        }
    }

	
	public static void calcularIdadeMediaPorVaga(List<Pessoa> pessoas) {
        // Mapeando as idades e contando as inscrições por vaga
        Map<String, Integer> contadorVagas = new HashMap<>();
        Map<String, Integer> somaIdades = new HashMap<>();

        for (Pessoa pessoa : pessoas) {
            String vaga = pessoa.getVaga();
            int idade = pessoa.getIdade();

            contadorVagas.put(vaga, contadorVagas.getOrDefault(vaga, 0) + 1);
            somaIdades.put(vaga, somaIdades.getOrDefault(vaga, 0) + idade);
        }

        // Exibindo a idade média de candidatos por vaga
        System.out.println("\nIdade média de candidatos por vaga:");
        for (Map.Entry<String, Integer> entry : contadorVagas.entrySet()) {
            String vaga = entry.getKey();
            int quantidade = entry.getValue();
            double somaIdade = somaIdades.get(vaga);
            double idadeMedia = somaIdade / quantidade;
            System.out.printf("%s: %.2f anos\n", vaga, idadeMedia);
        }
    }
	public static void encontrarIdadeMaisVelhoPorVaga(List<Pessoa> pessoas) {
        // Mapeando a idade máxima por vaga
        Map<String, Integer> idadeMaisVelho = new HashMap<>();

        for (Pessoa pessoa : pessoas) {
            String vaga = pessoa.getVaga();
            int idade = pessoa.getIdade();

            // Atualiza a idade mais velha se for maior
            idadeMaisVelho.put(vaga, Math.max(idadeMaisVelho.getOrDefault(vaga, 0), idade));
        }

        // Exibindo a idade do candidato mais velho por vaga
        System.out.println("\nIdade do candidato mais velho por vaga:");
        for (Map.Entry<String, Integer> entry : idadeMaisVelho.entrySet()) {
            String vaga = entry.getKey();
            int idade = entry.getValue();
            System.out.printf("%s: %d anos\n", vaga, idade);
        }
    }
	public static void encontrarIdadeMaisNovoPorVaga(List<Pessoa> pessoas) {
        Map<String, Integer> idadeMaisNovo = new HashMap<>();

        for (Pessoa pessoa : pessoas) {
            String vaga = pessoa.getVaga();
            int idade = pessoa.getIdade();

            // Atualiza a idade mais nova se for menor
            idadeMaisNovo.put(vaga, Math.min(idadeMaisNovo.getOrDefault(vaga, Integer.MAX_VALUE), idade));
        }

        System.out.println("\nIdade do candidato mais novo por vaga:");
        for (Map.Entry<String, Integer> entry : idadeMaisNovo.entrySet()) {
            String vaga = entry.getKey();
            int idade = entry.getValue();
            System.out.printf("%s: %d anos\n", vaga, idade);
        }
    }
	
	 public static void calcularSomaIdadesPorVaga(List<Pessoa> pessoas) {
	        // Mapeando a soma das idades por vaga
	        Map<String, Integer> somaIdades = new HashMap<>();

	        for (Pessoa pessoa : pessoas) {
	            String vaga = pessoa.getVaga();
	            int idade = pessoa.getIdade();

	            somaIdades.put(vaga, somaIdades.getOrDefault(vaga, 0) + idade);
	        }

	        // Exibindo a soma das idades por vaga
	        System.out.println("\nSoma das idades de candidatos por vaga:");
	        for (Map.Entry<String, Integer> entry : somaIdades.entrySet()) {
	            String vaga = entry.getKey();
	            int somaIdade = entry.getValue();
	            System.out.printf("%s: %d anos\n", vaga, somaIdade);
	        }
	    }
	 
	 public static void contarEstadosDistintos(List<Pessoa> pessoas) {
	        Set<String> estadosDistintos = new HashSet<>();

	        for (Pessoa pessoa : pessoas) {
	            estadosDistintos.add(pessoa.getEstado());
	        }

	        // Exibindo o número de estados distintos
	        System.out.printf("\nNúmero de estados distintos entre os candidatos: %d\n", estadosDistintos.size());
	    }
	 
	 public static void mostrarInstrutorQA() {
	        System.out.println("O instrutor de QA é Natan Oliveira.");
	    }
	 
	 public static void mostrarInstrutorMobile() {
	        System.out.println("O instrutor de Mobile é Douglas Costa.");
	    }
	}



