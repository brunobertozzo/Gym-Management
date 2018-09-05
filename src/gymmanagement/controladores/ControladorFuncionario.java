/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gymmanagement.telas.CadastroDeFuncionarioUI;
import gymmanagement.telas.GerenciarFuncionarioUI;

/**
 *
 * @author LabTIC
 */
public class ControladorFuncionario {
    
    public static ControladorFuncionario controladorFuncionario;
    private GerenciarFuncionarioUI gerenciarFuncionarioUI;
    private CadastroDeFuncionarioUI cadastroDeFuncionarioUI;
    
    private ControladorFuncionario() {
        this.gerenciarFuncionarioUI = new GerenciarFuncionarioUI();
        this.cadastroDeFuncionarioUI = new CadastroDeFuncionarioUI();
        
    }

    public static ControladorFuncionario getInstance() {
        if (controladorFuncionario == null) {
            controladorFuncionario = new ControladorFuncionario();
        }
        return controladorFuncionario;
    }
    
    public void mostrar() {
        this.gerenciarFuncionarioUI.mostrar();
    }

    public void mostrarCadastroFuncionario() {
        this.cadastroDeFuncionarioUI.mostrar();
    }
}
