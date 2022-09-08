import java.util.Scanner;

public class exercício6método {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int qnt; 
		System.out.print(" Quantas salas de aula há na universidade? " );
		qnt = teclado.nextInt();
		System.out.println("");
		
		int salas [] = new int [qnt];
		
		for(int i = 0; i < salas.length; i++) {
			System.out.print(" Quantos alunos há na sala " + (i+1) + " ? ");
			salas[i] = teclado.nextInt();
		}
			System.out.println("");
			
		notas(salas);
    }
	
	public static void notas(int[] salas) {
		
		Scanner teclado = new Scanner (System.in);
		
		 
					for(int i = 0; i < salas.length; i++) {
						System.out.println("");
						System.out.println(" DIGITE AS MÉDIAS DE CADA ALUNO DA SALA " + (i+1));
						double notas[] = new double[salas[i]]; 
						media(salas, notas);
						
						    for(int j = 0; j < salas[i]; j++) {
						    	System.out.print(" Média do aluno(a) " + (j+1) + " da sala " + (i+1) + " : ");
						    	notas[j] = teclado.nextDouble();
						    	

						    }
						    
						    					}
			    
	}
	
	public static void media(int[] salas, double[] notas) {
		
		double media = 0; 
		double acima = 0; 
		double x; 
		
		 // FOR para somar as notas de todos os alunos de uma sala
	    for(int i = 0; i < salas.length; i++) {
	       media = media + notas[i];
	      
	       for(int j = 0; j < salas[i]; j++) {
	    	   media = media / salas[j];
	       }
	       // FOR para saber quantos alunos estão acima da media (porcentagem)
		    for(int k = 0; k < salas[i]; k++) {
		    	if(notas[k] > media  ) {
		    		acima++;
		    	}
		    }
		    // porcentagem de alunos acima da média
		    
		    x = acima * 100 / salas[i];
		    
		    // média de cada sala
		    
		    System.out.println(" A média da sala " + (i + 1) + " é : " + media );
		    
		    System.out.println(" Número de alunos acima da média : " + acima);
		    
		    System.out.println(" Porcentagem de alunos acima da média : " + String.format("%.3f", x) + "%");	    
	    }  
	    
	    
	  
	    
	    
	    
	   
} 
	}

