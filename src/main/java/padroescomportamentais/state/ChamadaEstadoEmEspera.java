package padroescomportamentais.state;

public class ChamadaEstadoEmEspera extends ChamadaEstado {

    private ChamadaEstadoEmEspera() {}
    private static final ChamadaEstadoEmEspera instance = new ChamadaEstadoEmEspera();
    public static ChamadaEstadoEmEspera getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em espera";
    }

    public boolean retomar(ChamadaTelefonica chamada) {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        return true;
    }

    public boolean encerrar(ChamadaTelefonica chamada) {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        return true;
    }
}
