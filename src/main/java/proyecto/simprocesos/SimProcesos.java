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
        //creacion de objeto menu
        Menu menu = new Menu(opciones,'V' , "", "simulador CPU");
        char opcion;
        do{
            Consola.clrscr();
            Consola.gotoxy(0, 0);
            opcion = menu.select("Opcion[1-4]: ");
            Input.nextLine("");//opcion para reemplazar el scanner
            if (opcion == '1') crearProceso();
            if (opcion == '2'); //ejecutarCiclo();<--pendiente
            if (opcion == '3'); //mostrarCola();<--pendiente
         } while(opcion != salir);
        //mostrarEstadisticas();<--pendiente 
    }
    public static void crearProceso(){
        if (colaProcesos == null) {
            colaProcesos = new ColaEnlazada<>();
        }
        
        String nombre = Input.nextLine("Nombre del proceso: ");
        int tiempo = Input.nextInt("Tiempo para completar la ejecución: ");

        proceso p = new proceso();//se crea el objeto para proceso
        p.setNom(nombre);
        p.setTejecucion(tiempo);
        p.setTejecucion(tiempo);

        colaProcesos.encolar(p);

        System.out.println("Proceso agregado a la cola de procesos.");
    }
    public static void ejecutarCiclo(){
        //detecta si existe una cola
        if (colaProcesos == null) {
            System.out.println("No hay procesos.");
            return;
        }
        proceso actual = colaProcesos.desencolar();//toma un objeto existente en la cola y lo guarda en una variable que va a ser el proceso actual
        //detecta si no hay elementos en la cola, buscar elemento en la libreria
        if(actual==null){
            System.out.println("La cola esta vacía.");
            return;
        }
        actual.ejecutarCiclo();
        System.out.println("Ejecutando: " + actual);
        if (!actual.terminado()) {
            colaProcesos.encolar(actual);
        } else {
            System.out.println("Proceso terminado.");
        }
    }
    public static void mostrarCola(){
        
    }
    public static void mostrarEstadisticas(){
        
    }
    
}
