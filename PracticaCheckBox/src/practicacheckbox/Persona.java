/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicacheckbox;

/**
 *
 * @author alberto
 */
public class Persona {
    
    private String nombre;
    private String dninie;
    private String sexo;
    enum Estado{ESTUDIANT, TREBALLADOR, ATUR};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDninie() {
        return dninie;
    }

    public void setDninie(String dninie) {
        this.dninie = dninie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Estado getEstadoPersona() {
        return estadoPersona;
    }

    public void setEstadoPersona(Estado estadoPersona) {
        this.estadoPersona = estadoPersona;
    }
    
    
    Estado estadoPersona;
    
    Persona (String nombre, String dninie, String sexo, Estado estado){
        this.nombre = nombre;
        this.dninie = dninie;
        this.sexo = sexo;
        this.estadoPersona = estado;
    }
}
