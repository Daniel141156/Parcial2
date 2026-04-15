package proyecto.simprocesos;
/**
 Esta clase va a tener los datos que se produzcan durante la ejecución
 */
public class estadistica {
    private int prFinalizados, cantProcesos,tTotal;
public estadistica(){}

    public int getCantProcesos() {
        return cantProcesos;
    }

    public void setCantProcesos(int cantProcesos) {
        this.cantProcesos = cantProcesos;
    }

    public int gettTotal() {
        return tTotal;
    }

    public void settTotal(int tTotal) {
        this.tTotal = tTotal;
    }

    public estadistica(int prFinalizados) {
        this.prFinalizados = prFinalizados;
    }

    public int getPrFinalizados() {
        return prFinalizados;
    }

    public void setPrFinalizados(int prFinalizados) {
        this.prFinalizados = prFinalizados;
    }
    public void agrPrFin(){
        prFinalizados++;
    }
     public double promedioT(){
    if(cantProcesos==0){
        return 0;
    }  
    return (double)tTotal/cantProcesos;
  }
}
