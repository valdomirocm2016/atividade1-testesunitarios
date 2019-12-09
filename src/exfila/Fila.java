/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfila;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Valdomiro
 */
public class Fila {
    
    private ArrayList<Paciente> lista = new ArrayList<Paciente>();
    private ArrayList<Paciente> fila = new ArrayList<Paciente>();
    
    public boolean insert(Paciente paciente){
        return lista.add(paciente);
    }
    public ArrayList<Paciente> lista5(){
        
        Collections.sort(lista);
        for(int contador=0;contador<5;contador++){
            fila.add(lista.get(contador));
            //fila.add(it.getPaciente());
        }
        return fila;
    }
    
}
