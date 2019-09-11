/*
Este es un proyecto que va a incluir muchas clases para explicar
las relaciones existentes entre ellas. P.e.: alumnos, personas, clientes,
empleados, etc...
*/
package po;

/**
 *
 * @author Jose Luis Calvo Benitez
 */
public class PO {

    public static void main(String[] args) {
        Persona p = new Persona("Jose Luis","Calvo","Benitez",'H',43, "Calle de aqui");
        
        Empleado e = new Empleado(p,"45088217Y",1000,10,5.0,'S',2);
     
        Empleado.setPagoPorHoraExtra(30.0);
        
        System.out.println(e);
        
    }
    
}
