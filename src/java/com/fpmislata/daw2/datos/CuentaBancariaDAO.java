/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.datos;

import com.fpmislata.daw2.modelo.CuentaBancaria;
import java.util.List;

/**
 *
 * @author alumno
 */
public interface CuentaBancariaDAO extends GenericDAO<CuentaBancaria, Integer>{

  public List<CuentaBancaria> findbyCif(String nombre);

    
}

    

