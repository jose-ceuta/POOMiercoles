/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package po;

/**
 *
 * @author Jose Luis Calvo
 * 
 */
// Esta clase heredará de la clase persona
public class Empleado extends Persona{
    // Una variable instancia es compartida por todos los objetos de la clase
    private static double pagoPorHoraExtra;

    private String nif;
    private double sueldoBase;
    private int horasExtras;
    private double tipoIRPF;
    private char casado;
    private int numeroHijos;

    public Empleado() {
        // Al invocar a un constructur ponemos super() para llamar al del padre
        super();
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad, String direccion, String nif, double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion);
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipoIRPF = tipoIRPF;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }

    public Empleado(Persona p, String nif, double sueldoBase, int horasExtras, double tipoIRPF, char casado, int numeroHijos) {
        super(p);
        this.nif = nif;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipoIRPF = tipoIRPF;
        this.casado = casado;
        this.numeroHijos = numeroHijos;
    }
    
    public Empleado(Empleado e) {
        // Asignacion de atributos a la superclase
        // super.setNombre(e.getNombre());
        // super.setApellidoPaterno(e.getApellidoMaterno());
        
        // Podemos hacer la asignación mediante el constructor del padre
        super(e.getNombre(),e.getApellidoPaterno(),e.getApellidoMaterno(),e.getSexo(),e.getEdad(),e.getDireccion());
        
        // Asignacion de atributos miembros o atributos de instancia
        this.nif = e.nif;
        this.sueldoBase = e.sueldoBase;
        this.horasExtras = e.horasExtras;
        this.tipoIRPF = e.tipoIRPF;
        this.casado = e.casado;
        this.numeroHijos = e.numeroHijos;
    }

    public String getNif() {
        return nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public char getCasado() {
        return casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public static double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public static void setPagoPorHoraExtra(double aPagoPorHoraExtra) {
        pagoPorHoraExtra = aPagoPorHoraExtra;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public void setCasado(char casado) {
        this.casado = casado;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }
    
    // Métodos propios o de instancia
    public double calcularImporteHorasExtras(){
        return this.horasExtras * getPagoPorHoraExtra();
    }
    
    public double calcularSueldoBruto(){
        return this.sueldoBase + calcularImporteHorasExtras();
    }
      
    public double calcularRetencionIRPF(){
        double tipo = this.getTipoIRPF();
        
        if (this.casado=='s' || this.casado=='S')
            tipo -= 2; // Dos puntos menos por estar casado
        
        tipo -= this.getNumeroHijos();
        
        tipo = tipo<0?0:tipo;       
        
        return calcularSueldoBruto() * (tipo / 100);
    }
    
    public double calcularSueldoNeto(){
        return calcularSueldoBruto() - calcularRetencionIRPF();
    }

    @Override
    public String toString() {
        return super.toString() + " NIF:" + nif + ", sueldoBase=" + sueldoBase + ", horasExtras=" + horasExtras + ", tipoIRPF=" + tipoIRPF + ", casado=" + casado + ", numeroHijos=" + numeroHijos ;
    }
    
    

    
}
