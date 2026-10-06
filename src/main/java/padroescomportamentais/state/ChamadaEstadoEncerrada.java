package padroescomportamentais.state;

public class ChamadaEstadoEncerrada extends ChamadaEstado {

    private ChamadaEstadoEncerrada() {}
    private static final ChamadaEstadoEncerrada instance = new ChamadaEstadoEncerrada();
    public static ChamadaEstadoEncerrada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Encerrada";
    }
}
