package padroescomportamentais.state;

public class ChamadaTelefonica {

    private String numeroOrigem;
    private String numeroDestino;
    private ChamadaEstado estado;

    public ChamadaTelefonica() {
        this.estado = ChamadaEstadoChamando.getInstance();
    }

    public void setEstado(ChamadaEstado estado) {
        this.estado = estado;
    }

    public boolean atender() {
        return estado.atender(this);
    }

    public boolean recusar() {
        return estado.recusar(this);
    }

    public boolean perder() {
        return estado.perder(this);
    }

    public boolean colocarEmEspera() {
        return estado.colocarEmEspera(this);
    }

    public boolean retomar() {
        return estado.retomar(this);
    }

    public boolean encerrar() {
        return estado.encerrar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNumeroOrigem() {
        return numeroOrigem;
    }

    public void setNumeroOrigem(String numeroOrigem) {
        this.numeroOrigem = numeroOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public ChamadaEstado getEstado() {
        return estado;
    }
}
