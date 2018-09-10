/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymmanagement.controladores;

import gerenciadordepersistencia.PersistenciaDeDados;
import gymmanagement.modelos.Cargo;
import gymmanagement.modelos.Exercicio;
import gymmanagement.modelos.Funcionario;

/**
 *
 * @author bruno
 */
public class ControladorPrincipal {
    
    public static ControladorPrincipal controladorPrincipal;
    public static int contadorEntidades;

    
    private ControladorPrincipal() {
          this.contadorEntidades = PersistenciaDeDados.getInstance().getList().size() - 1;
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
        if((PersistenciaDeDados.getInstance().getList().size()) == 0) {
            Cargo adminPadrao = new Cargo("Administrador", 7000, true);
            Funcionario admin = new Funcionario("Ademir",  "083.192.239-70", "99888778",
                                    "25/12/1990", "984441000", "Av. Madre Benvenuta", 
                                    "admin", "admin", adminPadrao);
            //funcionario hard-code
            Cargo treinadorPadrao = new Cargo("Treinador", 4500, false);
            Funcionario treinador = new Funcionario("Funcionario normal",  "08319223970", "99888778",
                                    "25/12/1990", "984441000", "Av. Madre Benvenuta",
                                    "func", "func", treinadorPadrao);

            Exercicio ex1 = new Exercicio("Supino");
            Exercicio ex2 = new Exercicio("Rosca Direta");
            Exercicio ex3 = new Exercicio("Agachamento");
            Exercicio ex4 = new Exercicio("Tríceps Polia");
            Exercicio ex5 = new Exercicio("Crucifixo");
            Exercicio ex6 = new Exercicio("Bike");
            Exercicio ex7 = new Exercicio("Remada Alta");
            Exercicio ex8 = new Exercicio("Desenvolvimento com Halteres");
            Exercicio ex9 = new Exercicio("Mesa Flexora");
            Exercicio ex10 = new Exercicio("Leg Press");

            PersistenciaDeDados.getInstance().put(adminPadrao);
            PersistenciaDeDados.getInstance().put(admin);

            PersistenciaDeDados.getInstance().put(treinadorPadrao);
            PersistenciaDeDados.getInstance().put(treinador);

            PersistenciaDeDados.getInstance().put(ex1);
            PersistenciaDeDados.getInstance().put(ex2);
            PersistenciaDeDados.getInstance().put(ex3);
            PersistenciaDeDados.getInstance().put(ex4);
            PersistenciaDeDados.getInstance().put(ex5);
            PersistenciaDeDados.getInstance().put(ex6);
            PersistenciaDeDados.getInstance().put(ex7);
            PersistenciaDeDados.getInstance().put(ex8);
            PersistenciaDeDados.getInstance().put(ex9);
            PersistenciaDeDados.getInstance().put(ex10);
        }
        ControladorLogin.getInstance().mostrar();
    }
   
}
