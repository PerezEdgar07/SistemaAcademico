
package sistemaacademico.Estudiantes;

import sistemaacademico.personalinstitucionales.PersonalInstitucional;


public class Estudiante extends PersonalInstitucional {

    

     private int codigo;

    public Estudiante(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }
  
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +super.toString()+ "codigo=" + codigo +super.toString()+ '}';
    }
}

