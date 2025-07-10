
package sistemaacademico.Decano;


public interface IDecanos {


   
   String agregarDecano(Decano decano);
    boolean eliminarDecano(String cedula);
    boolean actualizarDecano(Decano decano);
    String guardarDecanos();
}

