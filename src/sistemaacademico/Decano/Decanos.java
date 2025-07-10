
package sistemaacademico.Decano;


public class Decanos extends Decano{

     private Decano[] listaDecanos;
    private int contador;
    private Object Cedula;

    public Decanos(String nivel, String dedicacion, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(nivel, dedicacion, sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
    }

   public String agregarDecano(Decano decano){
   if (contador >= listaDecanos.length) {
            return "Error:";
        }
listaDecanos[contador] = decano;
        contador++;
        return "Decano agregado correctamente.";
        // Verificar 
       
   }
     public boolean eliminarDecano(){
    for (int i = 0; i < contador; i++) {
            if (listaDecanos[i].getCedula().equals(Cedula)) {
                
                for (int j = i; j < contador - 1; j++) {
                    listaDecanos[j] = listaDecanos[j + 1];
                }
                listaDecanos[contador - 1] = null; 
                contador--;
                return true;
            }
        }
        return false;
    }
   public boolean actualizarDecano(Decano decano) {
        for (int i = 0; i < contador; i++) {
            if (listaDecanos[i].getCedula().equals(decano.getCedula())) {
                listaDecanos[i] = decano; 
                return true;
            }
        }
        return false;
    }
   public String guardarDecanos(){
    return "Decanos guardados correctamente. Total: " + contador;
    }
    public Decano[] obtenerTodosDecanos() {
        Decano[] copia = new Decano[contador];
        System.arraycopy(listaDecanos, 0, copia, 0, contador);
        return copia;
    }
}
