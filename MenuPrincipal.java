package ModeloHotel;

import java.util.Scanner;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		int continuar=1;
		Hospede[] hospedes = new Hospede[5];
		
		do {
			System.out.println("==================== MENU PRINCIPAL =========================");
			System.out.println("1 - Cadastrar Cliente");
			System.out.println("2 - Mostrar Todos os Clientes");
			System.out.println("3 - Selecionar Cliente");
			System.out.println("4 - Alterar Cliente");
			System.out.println("5 - Sair");
			System.out.println("Digite a opção desejada: ");
			int opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("******************************************************");
				System.out.println("                     CADASTRANDO O CLIENTE");
				System.out.println("******************************************************");
				
				for(int i=0;i<hospedes.length;i++) {
				System.out.print("Nome: ");
				String nome = leitor.next();
				
				System.out.print("RG: ");
				String rg = leitor.next();
				
				System.out.print("CPF: ");
				String cpf = leitor.next();
				
				System.out.print("Reserva: ");
				String Reserva = leitor.next();
				
				System.out.println("Forma de Pagamento: ");
				String formaDePagamento = leitor.next();
				
				System.out.println("Numero do Quarto: ");
				double numeroDoQuarto = leitor.nextDouble();
				
				hospedes[i] = new Hospede(nome,rg,cpf,Reserva,formaDePagamento,numeroDoQuarto);
				System.out.println();
				}
				
				break;
			case 2:
				System.out.println("******************************************************");
				System.out.println("                      MOSTRANDO O CLIENTE");
				System.out.println("******************************************************");
				
				for(int i=0;i<hospedes.length;i++) {
					System.out.println("Nome: " + hospedes[i].getNome());
					System.out.println("RG: " + hospedes[i].getRg());
					System.out.println("CPF: " + hospedes[i].getCpf());
					System.out.println("Reserva: " + hospedes[i].getReserva());
					System.out.println("Forma de Pagamento: " + hospedes[i].getFormaDePagamento());
					System.out.println("Numero do Quarto: " + hospedes[i].getNumeroDoQuarto());
					System.out.println();
					
				}
				
				break;
			case 3:
				System.out.println("******************************************************");
				System.out.println("          SELECIONANDO O CLIENTE DESEJADO");
				System.out.println("******************************************************");
				
				System.out.println("Cliente: ");
				String nome = leitor.next();
				
				for(int i=0;i<hospedes.length;i++) {
						
					if(hospedes[i].getNome().equals(nome)){
						System.out.print("Nome:" + hospedes[i].getNome());
						System.out.println("RG: " + hospedes[i].getRg());
						System.out.println("CPF: " + hospedes[i].getCpf());
						System.out.println("Reserva: " + hospedes[i].getReserva());
						System.out.println("Forma de Pagamento: " + hospedes[i].getFormaDePagamento());
						System.out.println("Numero do Quarto: " + hospedes[i].getNumeroDoQuarto());
						
				}
			}		
					
			case 4:
				System.out.println("******************************************************");
				System.out.println("                      ALTERAR DADOS DO CLIENTE");
				System.out.println("******************************************************");
				
				System.out.println("Cliente: ");
				String cliente = leitor.next();
				
				for(int i=0;i<hospedes.length;i++) {
					
					if(hospedes[i].getNome().equals(cliente)){
					
						System.out.print("Nome: ");
						hospedes[i].setNome(leitor.next());
						System.out.println("RG: ");
						hospedes[i].setRg(leitor.next());
						System.out.println("CPF: ");
						hospedes[i].setCpf(leitor.next());
						System.out.println("Reserva: ");
						hospedes[i].setReserva(leitor.next());
						System.out.println("Forma de Pagamento: ");
						hospedes[i].setFormaDePagamento(leitor.next());
						System.out.println("Numero do Quarto: ");
						hospedes[i].setNumeroDoQuarto(leitor.nextDouble());
				
				break;
					}
				}	
				
			case 5:
				System.out.println("****************************************************");
				System.out.println("     FINALIZANDO O SISTEMA       ");
				System.out.println("****************************************************");
				
				default:
					System.out.println("******************************************************");
					System.out.println("                  OPÇÃO INVÁLIDA!");
					System.out.println("******************************************************");
		}
		}while(continuar!=4);
		
		leitor.close();

	}

}


