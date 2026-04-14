package proyecto.simprocesos;
import com.murcia.utils.*;
public class SimProcesos {
    private static ColaEnlazada<proceso> colaProcesos;
    public static void main(String[] args) {
        //opciones menu
        final char salir = '4';
        String[] opciones = {
            "1-Crear proceso.",
            "2-Ejecutar ciclo.",
            "3-Ver cola.",
            "4-Salir."
        };
        //crecion de objeto menu
        Menu menu = new Menu(opciones,'V' , "", "simulador CPU");
        char opcion;
        do{
            Consola.clrscr();
            Consola.gotoxy(0, 0);
            opcion = menu.select("Opcion[1-4]: ");
            Input.nextLine("");//opcion para reemplazar el scanner
            if (opcion == '1'); //crearProceso();<--pendiente
            if (opcion == '2'); //ejecutarCiclo();<--pendiente
            if (opcion == '3'); //mostrarCola();<--pendiente
         } while(opcion != salir);
        //mostrarEstadisticas();<--pendiente 
    }
    public static void crearProceso(){
        
    }
    public static void ejecutarCiclo(){
        
    }
    public static void mostrarCola(){
        
    }
    public static void mostrarEstadisticas(){
        
    }
    
}
