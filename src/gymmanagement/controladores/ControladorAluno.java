/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gerenciadordecadastros.GerenciadorDeCadastro;
import gerenciadordepersistencia.PersistenciaDeDados;
import gymmanagement.modelos.Aluno;
import gymmanagement.modelos.Exercicio;
import gymmanagement.modelos.Treino;
import gymmanagement.telas.CadastroDeAlunoUI;
import gymmanagement.telas.CadastroDeFuncionarioUI;
import gymmanagement.telas.CadastroTreinoUI;
import gymmanagement.telas.GerenciarAlunosUI;
import java.util.ArrayList;

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
    
    public void mostrarTreino(Aluno aluno) {
        this.cadastroTreinoUI.mostrar(aluno);
    }
    
    public ArrayList<Aluno> getAlunos() {
        return PersistenciaDeDados.getInstance().getListaAlunos();
    }

    public ArrayList<Treino> getTreinos() {
        return PersistenciaDeDados.getInstance().getListaTreinos();
    }
    
    public ArrayList<Exercicio> getExercicios() {
        return PersistenciaDeDados.getInstance().getExercicios();
    }
	
    public void cadastrarAluno(String nome, String cpf, String rg,
                        String dataNascimento, String telefone, String endereco) {
        try {
            GerenciadorDeCadastro.getInstance().cadastraAluno( nome, cpf, rg,
                                            dataNascimento, telefone, endereco);	
        } catch(Exception ex) {
            cadastroDeAlunoUI.exibeErro(ex.getMessage());
        }
    }
	
    public void cadastrarTreino(String nome, ArrayList<Exercicio> exercicios) {
        try {
            GerenciadorDeCadastro.getInstance().cadastraTreino(nome, exercicios);
        } catch(Exception ex) {
            this.cadastroDeAlunoUI.exibeErro(ex.getMessage());
        }
    }
    
    public void updateAlunosTableData() {
        this.gerenciarAlunosUI.updateData();
    }
	
    public void updateTreinosTableData() {
        this.cadastroTreinoUI.updateData();
    }
}
