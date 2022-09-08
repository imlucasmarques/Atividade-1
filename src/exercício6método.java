import java.util.Scanner;

public class exerc�cio6m�todo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int qnt; 
		System.out.print(" Quantas salas de aula h� na universidade? " );
		qnt = teclado.nextInt();
		System.out.println("");
		
		int salas [] = new int [qnt];
		
		for(int i = 0; i < salas.length; i++) {
			System.out.print(" Quantos alunos h� na sala " + (i+1) + " ? ");
			salas[i] = teclado.nextInt();
		}
			System.out.println("");
			
		notas(salas);
    }
	
	public static void notas(int[] salas) {
		
		Scanner teclado = new Scanner (System.in);
		
		 
					for(int i = 0; i < salas.length; i++) {
						System.out.println("");
						System.out.println(" DIGITE AS M�DIAS DE CADA ALUNO DA SALA " + (i+1));
						double notas[] = new double[salas[i]]; 
						media(salas, notas);
						
						    for(int j = 0; j < salas[i]; j++) {
						    	System.out.print(" M�dia do aluno(a) " + (j+1) + " da sala " + (i+1) + " : ");
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
	       // FOR para saber quantos alunos est�o acima da media (porcentagem)
		    for(int k = 0; k < salas[i]; k++) {
		    	if(notas[k] > media  ) {
		    		acima++;
		    	}
		    }
		    // porcentagem de alunos acima da m�dia
		    
		    x = acima * 100 / salas[i];
		    
		    // m�dia de cada sala
		    
		    System.out.println(" A m�dia da sala " + (i + 1) + " � : " + media );
		    
		    System.out.println(" N�mero de alunos acima da m�dia : " + acima);
		    
		    System.out.println(" Porcentagem de alunos acima da m�dia : " + String.format("%.3f", x) + "%");	    
	    }  
	    
	    
	  
	    
	    
	    
	   
} 
	}

