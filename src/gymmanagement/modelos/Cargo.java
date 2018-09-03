/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.modelos;

import gymmanagement.controladores.ControladorPrincipal;
import java.io.Serializable;

/**
 *
 * @author bruno
 */
public class Cargo implements Serializable{
    private static final long serialVersionUID = 1L;
    private String nome;
    private float salario;
    private int id;

    public Cargo(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    
        ControladorPrincipal.getInstance().contadorEntidades++;
        this.id = ControladorPrincipal.getInstance().contadorEntidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
