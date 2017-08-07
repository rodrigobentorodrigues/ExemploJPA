/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpb.ads.loader;

import com.ifpb.ads.entidades.Aluno;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author ifpb
 */
public class Main {

    public static void main(String[] args) {
        EntityManager manager = Persistence.createEntityManagerFactory("Persistencia").
                createEntityManager();

        EntityTransaction transaction = manager.getTransaction();
        
        transaction.begin();
        Aluno aluno = new Aluno("Rodrigo", "222-222");
        manager.persist(aluno);
        transaction.commit();
    }

}
