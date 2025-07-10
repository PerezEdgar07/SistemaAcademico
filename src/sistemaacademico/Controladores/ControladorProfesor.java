
package sistemaacademico.Controladores;

import sistemaacademico.Vistas.VistaProfesor;


public class ControladorProfesor {
private VistaProfesor  vistaProfesor;

public ControladorProfesor(VistaProfesor vistaProfesor){
this.vistaProfesor=vistaProfesor;
 

}
public void procesoConroladorDecano(){
    try{
        String IdProfesor=vistaProfesor.getIdProfesor();
        String cedulaProfesor=vistaProfesor.getCedulaProfesor();
        String nombreProfesor=vistaProfesor.getNombreProfesor();
        int  sueldoProfesor=vistaProfesor.getSueldoProfesor();
        String correoPersonalProfesorr=vistaProfesor.getCorreoPersonalProfesor();
        String correoInstitucionalProfesor=vistaProfesor.getCorreoInstitucionalProfesor();
    }catch (Exception e){
        e.printStackTrace(); 
}
}

   

}
