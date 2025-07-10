
package sistemaacademico.Controladores;

import sistemaacademico.Vistas.VistaDecano;


public class ControladorDecano{
private VistaDecano vistaDecano;

public ControladorDecano(VistaDecano vistaDecano){
this.vistaDecano=vistaDecano;
 

}
public void procesoConroladorDecano(){
    try{
        String IdDecano=vistaDecano.getIdDecano();
        String cedulaDecano=vistaDecano.getCedulaDecano();
        String nombreDecano=vistaDecano.getNombreDecano();
        String correoPersonal=vistaDecano.getCorreoPersonalDecano();
        String correoInstitucional=vistaDecano.getCorreoInstitucionalDecano();
    }catch (Exception e){
        e.printStackTrace(); 
}
}
}
