/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticacaodeusuarios;

import gerenciadordepersistencia.PersistenciaDeDados;
import gymmanagement.excecoes.FalhaNaAutenticacaoException;
import gymmanagement.modelos.Funcionario;

/**
 *
 * @author bruno.bertozzo
 */
public class AutenticacaoDeUsuarios {
    private static AutenticacaoDeUsuarios autenticacaoDeUsuarios;
	
	public static AutenticacaoDeUsuarios getInstance() {
        if (autenticacaoDeUsuarios == null) {
            autenticacaoDeUsuarios = new AutenticacaoDeUsuarios();
        }
        return autenticacaoDeUsuarios;
    }
	
    public Funcionario autentica(String login, String senha) throws Exception {
        for(Funcionario funcionario : PersistenciaDeDados.getInstance().getListaFuncionarios()) {
            if(funcionario.getLogin().equals(login) && funcionario.getSenha().equals(senha)) {
                return funcionario;
            }
        }
        throw new FalhaNaAutenticacaoException();
    }
}
