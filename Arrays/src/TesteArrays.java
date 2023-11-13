
public class TesteArrays {

	public static void main(String[] args) {
//		String[] minhasStrings = { "Melissa", "Barbosa", "Souza" };
		
//		for (int i = 0; i < minhasStrings.length; i++) {
//			System.out.println(minhasStrings[i]);
//		}
		
//		int i = 0;
		
//		while(i < minhasStrings.length) {
//			System.out.println(minhasStrings[i]);
//			i++;
//		}
		
		Pessoa[] pessoas = new Pessoa[10];
		
		System.out.println(pessoas[0]);
		System.out.println(pessoas[1]);
		System.out.println(pessoas[pessoas.length - 1]);
		
		Pessoa melissa = new Pessoa();
		melissa.nome = "Melissa";
		melissa.sobrenome = "Barbosa";
		
		pessoas[3] = melissa;
		
		for (int i = 0; i < pessoas.length; i++) {
			Pessoa pessoaAtual = pessoas[i];
			
			if (pessoaAtual != null) {
				System.out.println("posicao: " + i + "-" + pessoaAtual.getNomeCompleto());
			} else {
				System.out.println("posicao: " + i + "esta vazia");
			}
			
			
			pessoas[4].nome = "Rogerio";
			
			System.out.println(pessoas[4].getNomeCompleto());
			
			melissa.sobrenome = "Souza";
			System.out.println(pessoas[3].getNomeCompleto());
			

					
		}
		
	}

}
