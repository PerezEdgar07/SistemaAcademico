
package sistemaacademico;

import sistemaacademico.personalinstitucionales.PersonalInstitucional;
import sistemaacademico.personasexternas.PersonaExterna;

import sistemaacademico.Personas.Persona;


public class SistemaAcademico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //persona
        System.out.println("----DATOS PERSONA----");
      Persona persona = new Persona(1, "Edgar Perez","dider107@gmil.com","2215487351");
      System.out.println("Datos" + persona.toString());
      // personlainvitado
      System.out.println("DATOS DE OBJETO PERSONAL INVITADO");
      PersonaExterna PersonaExterna = new PersonaExterna ( "alta",3, "Drake Perez", "drake@gmail,com", "174321654");
      System.out.println("" + PersonaExterna.toString());
      // perosonalinstitucional
      System.out.println("----DATOS PERSONAL INSTITUCIONAL----");
        PersonalInstitucional personalInstitucional = new PersonalInstitucional("didier@gmsil.edu.ec", 6, "Didier Perez", "dfgdh@gmail.com", "14028564756");
        System.out.println("" + personalInstitucional.toString());
        
        
        
    }

}
