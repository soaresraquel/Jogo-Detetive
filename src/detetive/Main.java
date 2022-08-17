package detetive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, faça um programa que faça 5 perguntas para 
 * uma pessoa sobre um crime. As perguntas são:
 * 1. Telefonou para a vítima?
 * 2. Esteve no local do crime?
 * 3. Mora perto da * vítima?
 * 4. Devia para a vítima?
 * 5. Já trabalhou com a vítima? 
 * Se a pessoa responder positivamente a 2 questões ela
 * deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice"
 * e 5 como "Assassina". Caso contrário, ela será classificado como
 * "Inocente".
*/

public class Main {

	public static void main(String[] args) {
		List<String> respostas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in); // Criando o leitor de dados
		
		System.out.println("Bem vindx ao interrogatório do Detetive. Serão feitas 5 perguntas com respostas de 's'(para sim) e 'n' (para não)");
		
		System.out.println("(1). Você telefonou para a vítima?");
		String resposta = scanner.next(); // Lendo o dado
        respostas.add(resposta.toLowerCase()); // Guardando o dado na list em letra minúscula
        
        System.out.println("(2). Você esteve no local do crime?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase()); 
        System.out.println("(3). Você mora perto da vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        
        System.out.println("(4). Você devia para a vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        
        System.out.println("(5). Você já trabalhou com a vítima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        int count = 0; // Criação da variável count para contar a quantidade das respostas 's'
        Iterator<String> contador = respostas.iterator(); // Criação da variável contador recebe as respostas da list
        
        while(contador.hasNext()) { // Se o contador tiver próximo
        	String resp = contador.next(); // Criação da variável resp recebe o próximo
        	if(resp.contains("s")) { // Se resp contém 's'
        		count++; // Variável count recebe +1
        	}
        }
        switch(count) { 
        case 2:{ // Se count for igual a 2
        	System.out.println("\nSUSPEITA");
        	break;
        }
        case 3:{ // Se count for igual a 3
        	System.out.println("\nCÚMPLICE");
        	break;
        }
        case 4:{ // Se count for igual a 4
        	System.out.println("\nCÚMPLICE");
        	break;
        }
        case 5:{ // Se count for igual a 5
        	System.out.println("\nASSASSINA");
        	break;
        }
        default: // Se count for igual a 1
        	System.out.println("\nINOCENTE");
        	break;
        }
        scanner.close(); // Fechando o leitor de dados
	}
}
