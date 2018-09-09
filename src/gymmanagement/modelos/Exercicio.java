/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

import gymmanagement.controladores.ControladorPrincipal;
import gymmanagement.interfaces.IObjectID;
import java.io.Serializable;

/**
 *
 * @author bruno
 */
public class Exercicio implements Serializable, IObjectID {
    private static final long serialVersionUID = 1L;
    private String nome;
    private int id;

    public Exercicio(String none) {
        this.nome = none;
        ControladorPrincipal.getInstance().contadorEntidades++;
        this.id = ControladorPrincipal.getInstance().contadorEntidades;
    }

    @Override
    public int getID() {
        return this.id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
