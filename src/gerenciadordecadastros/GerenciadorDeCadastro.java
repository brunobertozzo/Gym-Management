/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciadordecadastros;

import gerenciadordepersistencia.PersistenciaDeDados;
import gymmanagement.excecoes.CpfInvalidoException;
import gymmanagement.excecoes.DataDeNascimentoInvalidaException;
import gymmanagement.excecoes.EnderecoInvalidoException;
import gymmanagement.excecoes.LoginInvalidoException;
import gymmanagement.excecoes.NomeInvalidoException;
import gymmanagement.excecoes.RgInvalidoException;
import gymmanagement.excecoes.SenhaInvalidaException;
import gymmanagement.excecoes.TelefoneInvalidoException;
import gymmanagement.modelos.Aluno;
import gymmanagement.modelos.Cargo;
import gymmanagement.modelos.Exercicio;
import gymmanagement.modelos.Funcionario;
import gymmanagement.modelos.Treino;
import java.util.ArrayList;

/**
 *
 * @author bruno.bertozzo
 */
public class GerenciadorDeCadastro {

    public static GerenciadorDeCadastro gerenciadorDeCadastro;
	
    public static GerenciadorDeCadastro getInstance() {
        if (gerenciadorDeCadastro == null) {
            gerenciadorDeCadastro = new GerenciadorDeCadastro();
        }
        return gerenciadorDeCadastro;
    }
	
    public Funcionario cadastraFuncionario(String nome, String cpf, String rg,
                    String dataNascimento, String telefone, String endereco,
                    String login, String senha, Cargo cargo
    ) throws Exception {
        validaNome(nome);
        validaCpf(cpf);
        validaRg(rg);
        validaDataNascimento(dataNascimento);
        validaTelefone(telefone);
        validaEndereco(endereco);
        validaLogin(login);
        validaSenha(senha);

        Funcionario funcionario = new Funcionario(nome, cpf, rg, dataNascimento,
                                        telefone, endereco, login, senha, cargo);
        PersistenciaDeDados.getInstance().put(funcionario);
        return funcionario;
    }

	
    public void removeFuncionario(int index) {
        if(index != -1) {

        } else {
                //TODO CHAMAR MODAL ERRO
        }
    }
	
    public Aluno cadastraAluno(String nome,String cpf,String rg,String dataNascimento,
                            String telefone,String endereco
    ) throws Exception {
        validaNome(nome);
        validaCpf(cpf);
        validaRg(rg);
        validaDataNascimento(dataNascimento);
        validaTelefone(telefone);
        validaEndereco(endereco);

        Aluno aluno = new Aluno(nome, cpf, rg, dataNascimento, telefone, endereco);

        PersistenciaDeDados.getInstance().put(aluno);
        return aluno;	
    }
	
    public void removeAluno(int index) {
            if(index != -1) {

            } else {
                //TODO CHAMAR MODAL ERRO
            }
    }
	
    public Treino cadastraTreino(String nome, ArrayList<Exercicio> exercicios) throws Exception {
        validaNome(nome);

        Treino treino = new Treino(nome, exercicios);

        PersistenciaDeDados.getInstance().put(treino);
        return treino;
    };
        
    public void removeTreino(int index) {
        if(index != -1) {

        } else {
        //TODO CHAMAR MODAL ERRO
        }
    }
    
     /**   
    VALIDAÇÕES
    **/
    public void validaNome(String nome) throws Exception {
        if (nome.length() > 2) {
            for (int i = 0; i < nome.length(); i++) {
                char letraAnalisada = nome.charAt(i);
                if (!Character.isLetter(letraAnalisada)) {
                    if (!Character.isSpace(letraAnalisada)) {
                        throw new NomeInvalidoException();
                    }
                }
            }
        } else {
            throw new NomeInvalidoException();
        }
    }
	
    public void validaCpf(String cpf) throws Exception {
        if (cpf.length() == 11) {
            for (int i = 0; i < cpf.length(); i++) {
                char charAnalisado = cpf.charAt(i);
                if (Character.isLetter(charAnalisado) || Character.isSpace(charAnalisado)) {
                    throw new CpfInvalidoException();
                }
            }
        } else {
            throw new CpfInvalidoException();
        }
    }
	
    public void validaRg(String rg) throws Exception {
        if (rg.length() == 7) {
            for (int i = 0; i < rg.length(); i++) {
                char charAnalisado = rg.charAt(i);
                if (Character.isLetter(charAnalisado) || Character.isSpace(charAnalisado)) {
                    throw new RgInvalidoException();
                }
            }
        } else {
            throw new RgInvalidoException();
        }
    }
	
    public void validaDataNascimento(String dataNascimento) throws Exception {
        if (dataNascimento.length() == 8) {
            for (int i = 0; i < dataNascimento.length(); i++) {
                char charAnalisado = dataNascimento.charAt(i);
                if (Character.isLetter(charAnalisado) || Character.isSpace(charAnalisado)) {
                    throw new DataDeNascimentoInvalidaException();
                }
            }
        } else {
            throw new DataDeNascimentoInvalidaException();
        }
    }
	
    public void validaTelefone(String telefone) throws Exception {
        if (telefone.length() == 8 || telefone.length() == 9) {
            for (int i = 0; i < telefone.length(); i++) {
                char charAnalisado = telefone.charAt(i);
                if (Character.isLetter(charAnalisado) || Character.isSpace(charAnalisado)) {
                    throw new TelefoneInvalidoException();
                }
            }
        } else {
            throw new TelefoneInvalidoException();
        }
    }	

    public void validaEndereco(String endereco) throws Exception {
        if(endereco.length() < 3) throw new EnderecoInvalidoException();
    }

    public void validaLogin(String login) throws Exception {
        if(login.length() < 3) throw new LoginInvalidoException();
    }

    public void validaSenha(String senha) throws Exception {
        if(senha.length() < 3) throw new SenhaInvalidaException();
    }
}
