package padroescomportamentais.state;

public class ChamadaTelefonica {

    private String numeroDestino;
    private ChamadaEstado estado;

    public ChamadaTelefonica() {
        this.estado = ChamadaEstadoDiscando.getInstance();
    }

    public void setEstado(ChamadaEstado estado) {
        this.estado = estado;
    }

    public boolean tocar() {
        return estado.tocar(this);
    }

    public boolean atender() {
        return estado.atender(this);
    }

    public boolean cairNaCaixaPostal() {
        return estado.cairNaCaixaPostal(this);
    }

    public boolean colocarEmEspera() {
        return estado.colocarEmEspera(this);
    }

    public boolean retomar() {
        return estado.retomar(this);
    }

    public boolean desligar() {
        return estado.desligar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
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
