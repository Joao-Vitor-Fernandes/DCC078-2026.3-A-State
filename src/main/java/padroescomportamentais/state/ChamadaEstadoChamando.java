package padroescomportamentais.state;

public class ChamadaEstadoChamando extends ChamadaEstado {

    private ChamadaEstadoChamando() {}
    private static final ChamadaEstadoChamando instance = new ChamadaEstadoChamando();
    public static ChamadaEstadoChamando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Chamando";
    }

    public boolean atender(ChamadaTelefonica chamada) {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        return true;
    }

    public boolean recusar(ChamadaTelefonica chamada) {
        chamada.setEstado(ChamadaEstadoRecusada.getInstance());
        return true;
    }

    public boolean perder(ChamadaTelefonica chamada) {
        chamada.setEstado(ChamadaEstadoPerdida.getInstance());
        return true;
    }
}
