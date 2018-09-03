/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gymmanagement.Telas.LoginUI;

/**
 *
 * @author bruno
 */
public class ControladorPrincipal {
    
    public static ControladorPrincipal controladorPrincipal;
    public static int contadorEntidades = 0;

    
    public ControladorPrincipal() {
        this.LoginUI = new LoginUI();
    }
    public static ControladorPrincipal getInstance() {
        if (controladorPrincipal == null) {
            controladorPrincipal = new ControladorPrincipal();
        }
        return controladorPrincipal;
    }
    
    public void inicia() {
		Cargo cargoAdmin = new Cargo("Administrador", 10000, true);
		Funcionario admin = new Funcionario(
				"Thiago",
				123456789,
				987654321,
				"01/01/1981",
				"999092312",
				"Rua Sem Nome",
				"admin",
				"admin",
				cargoAdmin
		);
	
		GerenciadorPersistencia.getInstance().put(cargoAdmin);
		GerenciadorPersistencia.getInstance().put(admin);
		
        telaLogin.exibir();
    }
	
	public void login(String login, String senha) {
		if(GerenciadorAutenticacao.getInstance().autentica(login, senha)) {
			ControladorMenu.getInstance().exibir();
		} else {
			System.out.println("Login ou senha incorretos!");
			//EXIBIR MODAL DE SENHA LOGIN OU SENHA INCORRETOS ERRADA
		}
	}
    
}
