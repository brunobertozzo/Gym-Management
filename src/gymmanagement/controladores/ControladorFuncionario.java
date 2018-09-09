/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gerenciadordecadastros.GerenciadorDeCadastro;
import gerenciadordepersistencia.PersistenciaDeDados;
import gymmanagement.modelos.Cargo;
import gymmanagement.modelos.Funcionario;
import gymmanagement.telas.CadastroDeFuncionarioUI;
import gymmanagement.telas.GerenciarFuncionarioUI;
import java.util.ArrayList;

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
    
    public ArrayList<Funcionario> getFuncionarios() {
        return PersistenciaDeDados.getInstance().getListaFuncionarios();
    }
	
    public ArrayList<Cargo> getCargos() {
        return PersistenciaDeDados.getInstance().getListaCargos();
    }	
	
    public void cadastrarFuncionario(String nome, String cpf,String rg,
                    String dataNascimento,String telefone,String endereco,
                    String login,String senha,Cargo cargo) {
        try {
            GerenciadorDeCadastro.getInstance().cadastraFuncionario(nome,cpf,rg,
                            dataNascimento,telefone,endereco,login,senha,cargo);	
        } catch(Exception ex) {
                cadastroDeFuncionarioUI.exibeErro(ex.getMessage());
        }
    }
	
	public void removeFuncionario(int index) {
		if(index != -1) {
//			getFuncionarios()
		} else {
			//TODO CHAMAR MODAL ERRO
		}
	}
	
	public void updateTableData() {
		this.gerenciarFuncionarioUI.updateData();
	}
}
