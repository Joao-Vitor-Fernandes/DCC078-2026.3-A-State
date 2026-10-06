package padroescomportamentais.state;

public class ChamadaEstadoRecusada extends ChamadaEstado {

    private ChamadaEstadoRecusada() {}
    private static final ChamadaEstadoRecusada instance = new ChamadaEstadoRecusada();
    public static ChamadaEstadoRecusada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Recusada";
    }
}
