/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import autenticacaodeusuarios.AutenticacaoDeUsuarios;
import gymmanagement.modelos.Funcionario;
import gymmanagement.telas.LoginUI;

/**
 *
 * @author bruno
 */
public class ControladorLogin {

    public static ControladorLogin controladorLogin;
    public LoginUI loginUI;

    private ControladorLogin() {
        this.loginUI = new LoginUI();
    }

    public static ControladorLogin getInstance() {
        if (controladorLogin == null) {
            controladorLogin = new ControladorLogin();
        }
        return controladorLogin;
    }
    
    public void mostrar(){
        loginUI.mostrar();
    }
    
    public void login(String login, String senha) {
        try {
            Funcionario funcionario = AutenticacaoDeUsuarios.getInstance().autentica(login, senha);
            loginUI.ocultar();
            if(funcionario.getCargo().isAdmin()) {
                ControladorNavegacao.getInstance().mostrarMenuAdmin();
            } else {
                ControladorNavegacao.getInstance().mostrarMenuComum();
            }
        } catch(Exception ex) {
            loginUI.exibeErroLogin();
        }
    }
    
    
    
}
