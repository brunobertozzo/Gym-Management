/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gerenciadordepersistencia.PersistenciaDeDados;
import gymmanagement.modelos.Cargo;
import gymmanagement.modelos.Funcionario;

/**
 *
 * @author bruno
 */
public class ControladorPrincipal {
    
    public static ControladorPrincipal controladorPrincipal;
    public static int contadorEntidades = 0;

    
    public ControladorPrincipal() {
    }
    public static ControladorPrincipal getInstance() {
        if (controladorPrincipal == null) {
            controladorPrincipal = new ControladorPrincipal();
        }
        return controladorPrincipal;
    }
    
    public void boot() {
        //Cargos e funcionarios hard-coded
        //admin hard-code
        Cargo adminPadrao = new Cargo("Administrador", 7000, true);
        Funcionario admin = new Funcionario("Ademir",  "083.192.239-70", "99888778",
                                "25/12/1990", "984441000", "Av. Madre Benvenuta", 
				"admin", "admin", adminPadrao);
        //funcionario hard-code
        Cargo treinadorPadrao = new Cargo("Treinador", 4500, false);
        Funcionario treinador = new Funcionario("Funcionario normal",  "08319223970", "99888778",
                                "25/12/1990", "984441000", "Av. Madre Benvenuta",
				"func", "func", treinadorPadrao);
                                
        PersistenciaDeDados.getInstance().put(adminPadrao);
        PersistenciaDeDados.getInstance().put(admin);
		
        PersistenciaDeDados.getInstance().put(treinadorPadrao);
        PersistenciaDeDados.getInstance().put(treinador);
        
        ControladorLogin.getInstance().mostrar();
    }
   
}
