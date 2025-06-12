
package sistemaacademico.Decano;

import sistemaacademico.PersonalAcademico.PersonalAcademico;


public class Decano extends PersonalAcademico {

 private String nivel;

    public Decano(String nivel, String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(dedicacion, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Decano{" +super.toString()+ "nivel=" + nivel +super.toString()+ '}';
    }
    
    
    
}

    

