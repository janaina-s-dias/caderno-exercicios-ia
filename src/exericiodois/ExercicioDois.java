package exericiodois;

public class ExercicioDois {

	
	public static void main (String[] args){
		
		
		String cadeiaA = "PALAVRA1";
		String cadeiaB = "PALAVRA2";
		
		
		int x = 0;
		
		if(cadeiaA.equals(cadeiaB)){
			System.out.println("Iguais");
		}else{
			
			for (int i = 0; i < cadeiaA.length(); i++) {
				
				if(cadeiaA.charAt(i) == cadeiaB.charAt(i)){
					x++;
				}
			}
			
			if(x > 0){
				System.out.println("Pontos: " + x);
			}
			else{
				System.out.println("Nada");
			}

		}
		
	}	
	
	/*
	 * Crie uma classe Java e defina um m�todo que compara duas cadeias de caracteres (A e B).
		Utilize os crit�rios a seguir:
			a. Se as cadeias de caracteres forem iguais, a fun��o dever� retornar 1.0 (100%);
			b. Se n�o forem, os aspectos apresentados na Tabela 2 devem ser considerados*/
	
	/*
	 * Pontua��o Caracter�stica
		Soma um ponto Para cada caractere de A que constar na palavra B.
		Soma dois pontos Para cada caractere de A que constar na mesma
		propor��o em B.
		Soma tr�s pontos Para cada caractere de A que constar na mesma posi��o em B.*/
	
	/*
	 * ATEN��O: Observe que a pontua��o N�O deve ser o retorno do m�todo, pois a fun��o deve retornar 1.0 
	 * se a palavra comparada atingir a pontua��o m�xima para todas as caracter�sticas.*/
	
	
}
