package padroescomportamentais.state;

public class ChamadaEstadoEmAndamento extends ChamadaEstado {

    private ChamadaEstadoEmAndamento() {}
    private static final ChamadaEstadoEmAndamento instance = new ChamadaEstadoEmAndamento();
    public static ChamadaEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em andamento";
    }

    public boolean colocarEmEspera(ChamadaTelefonica chamada) {
        chamada.setEstado(ChamadaEstadoEmEspera.getInstance());
        return true;
    }

    public boolean encerrar(ChamadaTelefonica chamada) {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        return true;
    }
}