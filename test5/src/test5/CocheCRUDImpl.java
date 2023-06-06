/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test5;

// Interfaz CocheCRUD

import test5.NewClass.CocheCRUD;


// Implementación CocheCRUDImpl

/**
 *
 * @author Camil
 */
public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Método save() llamado");
    }
    
    @Override
    public void findAll() {
        System.out.println("Método findAll() llamado");
    }
    
    @Override
    public void delete() {
        System.out.println("Método delete() llamado");
    }
}

// Clase Main
