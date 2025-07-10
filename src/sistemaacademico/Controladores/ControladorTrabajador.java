
package sistemaacademico.Controladores;

import sistemaacademico.Vistas.VistaTrabajador;


public class ControladorTrabajador {
    private VistaTrabajador  vistaTrabajador;

public ControladorTrabajador(VistaTrabajador vistaTrabajador){
this.vistaTrabajador=vistaTrabajador;
 

}
public void procesoConroladorDecano(){
    try{
        String IdTrabajador=vistaTrabajador.getIdTrabajador();
        String cedulaTrabajador=vistaTrabajador.getCedulaTrabajador();
        String nombreTrabajador=vistaTrabajador.getNombreTrabajador();
        int  sueldoTrabajador=vistaTrabajador.getSueldoTrabajador();
        String correoPersonalTrabajador=vistaTrabajador.getCorreoPersonalTrabajador();
        String correoInstitucionalTrabajador=vistaTrabajador.getCorreoInstitucionalTrabajador();
    }catch (Exception e){
        e.printStackTrace(); 
}
}

    private static class ControladorTrabajadortaTrabajador {

        public ControladorTrabajadortaTrabajador() {
        }
    }

}
