package padroescomportamentais.state;

public class ChamadaEstadoPerdida extends ChamadaEstado {

    private ChamadaEstadoPerdida() {}
    private static final ChamadaEstadoPerdida instance = new ChamadaEstadoPerdida();
    public static ChamadaEstadoPerdida getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Perdida";
    }
}
