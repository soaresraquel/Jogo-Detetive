package detetive;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * Utilizando listas, fa�a um programa que fa�a 5 perguntas para 
 * uma pessoa sobre um crime. As perguntas s�o:
 * 1. Telefonou para a v�tima?
 * 2. Esteve no local do crime?
 * 3. Mora perto da * v�tima?
 * 4. Devia para a v�tima?
 * 5. J� trabalhou com a v�tima? 
 * Se a pessoa responder positivamente a 2 quest�es ela
 * deve ser classificada como "Suspeita", entre 3 e 4 como "C�mplice"
 * e 5 como "Assassina". Caso contr�rio, ela ser� classificado como
 * "Inocente".
*/

public class Main {

	public static void main(String[] args) {
		List<String> respostas = new ArrayList<>();
		Scanner scanner = new Scanner(System.in); // Criando o leitor de dados
		
		System.out.println("Bem vindx ao interrogat�rio do Detetive. Ser�o feitas 5 perguntas com respostas de 's'(para sim) e 'n' (para n�o)");
		
		System.out.println("(1). Voc� telefonou para a v�tima?");
		String resposta = scanner.next(); // Lendo o dado
        respostas.add(resposta.toLowerCase()); // Guardando o dado na list em letra min�scula
        
        System.out.println("(2). Voc� esteve no local do crime?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase()); 
        System.out.println("(3). Voc� mora perto da v�tima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        
        System.out.println("(4). Voc� devia para a v�tima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());
        
        System.out.println("(5). Voc� j� trabalhou com a v�tima?");
        resposta = scanner.next();
        respostas.add(resposta.toLowerCase());

        int count = 0; // Cria��o da vari�vel count para contar a quantidade das respostas 's'
        Iterator<String> contador = respostas.iterator(); // Cria��o da vari�vel contador recebe as respostas da list
        
        while(contador.hasNext()) { // Se o contador tiver pr�ximo
        	String resp = contador.next(); // Cria��o da vari�vel resp recebe o pr�ximo
        	if(resp.contains("s")) { // Se resp cont�m 's'
        		count++; // Vari�vel count recebe +1
        	}
        }
        switch(count) { 
        case 2:{ // Se count for igual a 2
        	System.out.println("\nSUSPEITA");
        	break;
        }
        case 3:{ // Se count for igual a 3
        	System.out.println("\nC�MPLICE");
        	break;
        }
        case 4:{ // Se count for igual a 4
        	System.out.println("\nC�MPLICE");
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
