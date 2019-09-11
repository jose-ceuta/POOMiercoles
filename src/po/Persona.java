package po;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class Persona {
    // Como vamos a crear una clase Empleado que hereda, debemos poner como protected para que sea privado para el resto
    // y publico para las clases que heredan.
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected char sexo;
    protected int edad;
    protected String direccion;

//     CONSTRUCTORES
    public Persona() {
        this.nombre = null;
        this.apellidoMaterno = null;
        this.apellidoPaterno = null;
        this.direccion = null;
        this.edad = 0;
        this.sexo = 0;
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad, String direccion) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    // Contructor de copia. Cuando queremos que un objeto tenga los mismos
    // valores que otro del mismo tipo
    public Persona(Persona p) {
        this.nombre = p.getNombre();
        this.apellidoMaterno = p.getApellidoMaterno();
        this.apellidoPaterno = p.getApellidoPaterno();
        this.direccion = p.getDireccion();
        this.edad = p.getEdad();
        this.sexo = p.getSexo();
    }
    
    // SECCION METODOS SET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // SECCION DE METODOS GET
    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    protected void finalize() throws Throwable{
        super.finalize();
    }
    
    
    /* 
    Sobreescribimos el método toString del objeto padre.
    Si ponemos @Override utilizará siempre el método propio y si quisieramos usar el 
        del método padre tendríamos que llamarlo como super.toString
    Si no lo ponemos usará el método del padre y para que use el nuestro propio debemos
        de llamarlo como this.toString.
    */
    @Override
    public String toString() {
        // Opcion por defecto
        return "Persona{" + "nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", sexo=" + sexo + ", edad=" + edad + ", direccion=" + direccion + '}';
        // Otra opción
        //String datos ="";
        //datos += nombre+" "+apellidoPaterno+" "+apellidoMaterno;
        //return datos;
    }
    
    public boolean mayoredad (){
        boolean mayoredad;
        mayoredad = false;
        
        if (this.edad>=18)
            mayoredad = true;
        
        return mayoredad;
    }
}
