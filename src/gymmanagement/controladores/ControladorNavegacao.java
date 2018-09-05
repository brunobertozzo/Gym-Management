/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gymmanagement.telas.MenuAdminUI;
import gymmanagement.telas.MenuFuncionarioUI;

/**
 *
 * @author bruno
 */
public class ControladorNavegacao {
    public static ControladorNavegacao controladorNavegacao;
    private MenuAdminUI menuAdminUI;
    private MenuFuncionarioUI menuFuncionarioUI;

    private ControladorNavegacao() {
        this.menuAdminUI = new MenuAdminUI();
        this.menuFuncionarioUI = new MenuFuncionarioUI();
    }

    public static ControladorNavegacao getInstance() {
    if (controladorNavegacao == null) {
        controladorNavegacao = new ControladorNavegacao();
    }
    return controladorNavegacao;
    }
	
    public void mostrarMenuAdmin() {
        this.menuAdminUI.mostrar();
    }
    
    public void mostrarMenuComum() {
        this.menuFuncionarioUI.mostrar();
    }

    
}
