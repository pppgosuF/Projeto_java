package exemplo01;

import java.util.ArrayList;
import java.util.Scanner;

public class PP {

	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		boolean voltarMenuPrincipal = true;
		ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		
		while (voltarMenuPrincipal){
		
		System.out.println("========= MENU PRINCIPAL ==========");
		System.out.println("Escolha 1 - Cadastrar, 2 - Mostrar Todos, 3 - Remover Todos");
		int opcao = leitor.nextInt();
		
		switch(opcao){
			case 1:
				System.out.println("Produto: ");
				String nomeProduto = leitor.next();
				
				System.out.println("Quantidade: ");
				int quantidadeProduto = leitor.nextInt();
				
				System.out.println("Valor: ");
				double valorProduto = leitor.nextDouble();
				
				listaProdutos.add(new Produto(nomeProduto, quantidadeProduto, valorProduto));
				
				System.out.println("Cadastrado com Sucesso!!!");
				break;
			case 2: 
				if(listaProdutos.isEmpty()){
					System.out.println("n�o existe produto Cadastrado!");
				}else{
					
					System.out.println("Mostrando Todos os Produtos...");
					for(Produto produto: listaProdutos){
						System.out.println("====================");
						System.out.println("Produto: " + produto.getNomeProduto());
						System.out.println("Quantidade: " + produto.getQuantidadeProduto());
						System.out.println("Valor: " + produto.getValorProduto());
						System.out.println("====================");
					}
				}
				break;
			case 3:
				System.out.println("Produtos Removidos com Sucesso!!!");
				listaProdutos.removeAll(listaProdutos);
				break;
			default:
				System.out.println("Op��o Inv�lida");
				break;	
			
			}
		System.out.println("Digite 1 para CONTINUAR ou 2 Para SAIR");
		int voltar = leitor.nextInt();
		
		if (voltar==2){
			voltarMenuPrincipal = false;
		}
		
		}
		leitor.close();
		
		
		
	}

}
