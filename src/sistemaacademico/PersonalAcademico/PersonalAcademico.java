
package sistemaacademico.PersonalAcademico;

import sistemaacademico.Empleados.Empleado;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class PersonalAcademico extends Empleado {


 private String dedicacion;

    public PersonalAcademico(String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.dedicacion = dedicacion;
    }

   /* @Override
    public String toString() {
        return "PersonalAcademico{" +super.toString()+ "dedicacion=" + dedicacion + '}';
    } */  
    
}

