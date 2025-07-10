
package sistemaacademico.Controladores;

import sistemaacademico.Vistas.VistaEmpleado;


public class ControladorEmpleado {
private VistaEmpleado vistaEmpleado;

public ControladorEmpleado(VistaEmpleado vistaEmpleado){
this.vistaEmpleado=vistaEmpleado;
 

}
public void procesoConroladorDecano(){
    try{
        String IdEmpleado=vistaEmpleado.getIdEmpleado();
        String cedulaEmpleado=vistaEmpleado.getCedulaEmpleado();
        String nombreEmpleado=vistaEmpleado.getNombreEmpleado();
        String correoPersonalEmpleado=vistaEmpleado.getCorreoPersonalEmpleado();
        String correoInstitucionalEmpleado=vistaEmpleado.getCorreoInstitucionalEmpleado();
    }catch (Exception e){
        e.printStackTrace(); 
}
}
}
