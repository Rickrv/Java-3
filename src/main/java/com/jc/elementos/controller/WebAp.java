<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return  new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebApConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/servicios/*"};
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author T107
 */
public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println(">>>>>>>>>>>>>> CARGANDO CLASES DE CONFIGURACION");
       return new Class<?>[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
           System.out.println(">>>>>>>>>>>>>> CARGANDO CONFIGURACION DE SERVLETS"); 
      return  new Class<?>[]{webApConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
       System.out.println(">>>>>>>>>>>>>> CARGANDO CONFIGURACION DE SERVICIOS"); 
       return new String[]{"/servicios/*"};
    }
    
}
>>>>>>> origin/master
