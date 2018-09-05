/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gymmanagement.telas.CadastroDeAlunoUI;
import gymmanagement.telas.CadastroDeFuncionarioUI;
import gymmanagement.telas.CadastroTreinoUI;
import gymmanagement.telas.GerenciarAlunosUI;

/**
 *
 * @author LabTIC
 */
public class ControladorAluno {
    public static ControladorAluno controladorAluno;
    private GerenciarAlunosUI gerenciarAlunosUI;
    private CadastroDeAlunoUI cadastroDeAlunoUI;
    private CadastroTreinoUI cadastroTreinoUI;
 

    private ControladorAluno() {
        this.gerenciarAlunosUI = new GerenciarAlunosUI();
        this.cadastroDeAlunoUI = new CadastroDeAlunoUI();
        this.cadastroTreinoUI = new CadastroTreinoUI();
    }

    public static ControladorAluno getInstance() {
        if (controladorAluno == null) {
            controladorAluno = new ControladorAluno();
        }
        return controladorAluno;
    }
    
    public void mostrar() {
        this.gerenciarAlunosUI.mostrar();
        
    }
    
    public void mostrarCadastroAluno() {
        this.cadastroDeAlunoUI.mostrar();
    }
    
    public void mostrarTreino() {
        this.cadastroTreinoUI.mostrar();
    }
}
