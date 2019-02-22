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
	 * Crie uma classe Java e defina um método que compara duas cadeias de caracteres (A e B).
		Utilize os critérios a seguir:
			a. Se as cadeias de caracteres forem iguais, a função deverá retornar 1.0 (100%);
			b. Se não forem, os aspectos apresentados na Tabela 2 devem ser considerados*/
	
	/*
	 * Pontuação Característica
		Soma um ponto Para cada caractere de A que constar na palavra B.
		Soma dois pontos Para cada caractere de A que constar na mesma
		proporção em B.
		Soma três pontos Para cada caractere de A que constar na mesma posição em B.*/
	
	/*
	 * ATENÇÃO: Observe que a pontuação NÃO deve ser o retorno do método, pois a função deve retornar 1.0 
	 * se a palavra comparada atingir a pontuação máxima para todas as características.*/
	
	
}
