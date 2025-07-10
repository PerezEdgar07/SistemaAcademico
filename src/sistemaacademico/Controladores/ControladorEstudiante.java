
package sistemaacademico.Controladores;

import sistemaacademico.Vistas.VistaEstudiante;


public class ControladorEstudiante {
private VistaEstudiante vistaEstudiante;

public ControladorEstudiante (VistaEstudiante vistaEstudiante){
this.vistaEstudiante=vistaEstudiante;
 

}
public void procesoConroladorDecano(){
    try{
        String IdEstudiante=vistaEstudiante.getIdEstudiante();
        String nombreEstudiante=vistaEstudiante.getNombreEstudiante();
        String correoPersonal=vistaEstudiante.getCorreoPersonalEstudiante();
        String correoInstitucional=vistaEstudiante.getCorreoInstitucionalEstudiante();
    }catch (Exception e){
        e.printStackTrace(); 
}
}
    
    
}
