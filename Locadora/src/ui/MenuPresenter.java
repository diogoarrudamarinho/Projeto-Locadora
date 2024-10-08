package ui;

import application.PresenterFactory;
import ui.MenuView.Opcao;

public class MenuPresenter implements Presenter {

	private final MenuView view; 

	public MenuPresenter(MenuView view) {
		super();
		this.view = view;
	}
	
	@Override
	public void run() {
		Opcao opcao;
		boolean fim = false;
		
		while (! fim) {
			opcao = view.getOpcao();
			
			switch (opcao) {
				case CADASTRAR_CLIENTE 	-> { 
					var presenter = PresenterFactory.get(PresenterFactory.Type.CADASTRAR_CLIENTE);
					presenter.run();	
				}
				
				case EXCLUIR_CLIENTE 	-> { 
					System.out.println("Não implementado!"); 
				}
				
				case LISTAR_CLIENTE 	-> { 
					var presenter = PresenterFactory.get(PresenterFactory.Type.LISTAR_CLIENTE);
					presenter.run();
				}
				
				case CADASTRAR_VEICULO 	-> { System.out.println("Não implementado!"); }
				case EXCLUIR_VEICULO 	-> { System.out.println("Não implementado!"); }
				case LISTAR_VEICULO 	-> { System.out.println("Não implementado!"); }
				case LOCAR_VEICULO 		-> { System.out.println("Não implementado!"); } 
				case DEVOLVER_VEICULO 	-> { System.out.println("Não implementado!"); } 
				case LISTAR_LOCACAO 	-> { System.out.println("Não implementado!"); }
				case FIM 				-> fim = true;
			}
		}
	}
}
