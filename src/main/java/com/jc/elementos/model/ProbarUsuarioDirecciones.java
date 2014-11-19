/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author T107
 */
public class ProbarUsuarioDirecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      SessionFactory factory = HIbernateUtilidades.getSessionFactory();
      Session sesion = factory.openSession();
      Transaction tranza= sesion.beginTransaction();
      
      Usuario u = new Usuario();
      Direccion d=new Direccion();
      
      d.setCalle("City of Evil");
      d.setColonia("Bat Country");
      d.setCp(1666);
      d.setEstado("Avenged Sevenfold");
      //Importante ligar al usuario anterior esta direccion
      d.setIdUsuario(u);
      
      u.setDireccion(d);
      u.setEdad(25);
      u.setNombre("Zacky Vengenz");
      u.setSueldo(50000f);
      
      sesion.save(u);
      sesion.save(d);
      
      tranza.commit();
      sesion.close();
      System.out.println("todo se guardo bien!!!");
      
      
    }
    
}
