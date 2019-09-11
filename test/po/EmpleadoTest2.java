/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class EmpleadoTest2 {
    
    private Empleado instance;
    
    public EmpleadoTest2() {
        instance = new Empleado();
        
        // Datos fijos del testeo
        instance.setNif("45000111B");
        instance.setNombre("Jose Luis");
        instance.setApellidoPaterno("Calvo");
        instance.setApellidoMaterno("Benitez");
        instance.setSueldoBase(1000);
        instance.setHorasExtras(10);
        instance.setTipoIRPF(5);
        
        // datos del caso 1
        instance.setCasado('S');
        instance.setNumeroHijos(1);
        
        Empleado.setPagoPorHoraExtra(25);
        

    }
    
 
    /**
     * Test of calcularImporteHorasExtras method, of class Empleado.
     */
    @Test
    public void testCalcularImporteHorasExtras() {
        System.out.println("calcularImporteHorasExtras");
        double expResult = 250.0;
        double result = instance.calcularImporteHorasExtras();
        assertEquals(expResult, result, 0.0);
 
    }

    /**
     * Test of calcularSueldoBruto method, of class Empleado.
     */
    @Test
    public void testCalcularSueldoBruto() {
        System.out.println("calcularSueldoBruto");
        double expResult = 1250.0;
        double result = instance.calcularSueldoBruto();
        assertEquals(expResult, result, 0.0);
      
    }

    /**
     * Test of calcularRetencionIRPF method, of class Empleado.
     */
    @Test
    public void testCalcularRetencionIRPF() {
        System.out.println("calcularRetencionIRPF");
        double expResult = 25.0;
        double result = instance.calcularRetencionIRPF();
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of calcularSueldoNeto method, of class Empleado.
     */
    @Test
    public void testCalcularSueldoNeto() {
        System.out.println("calcularSueldoNeto");
        double expResult = 1225.0;
        double result = instance.calcularSueldoNeto();
        assertEquals(expResult, result, 0.0);      
    }

}
