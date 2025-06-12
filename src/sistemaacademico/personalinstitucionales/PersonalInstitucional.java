
package sistemaacademico.personalinstitucionales;

import sistemaacademico.Personas.Persona;


public class PersonalInstitucional extends Persona {
private String correoInstitucional;

    public PersonalInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }

    @Override
    public String toString() {
        return "PersonalInstitucional{" + "correoInstitucional=" + correoInstitucional +super.toString()+ '}';
    }



    

}
