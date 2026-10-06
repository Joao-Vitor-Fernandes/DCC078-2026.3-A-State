package padroescomportamentais.state;

public abstract class ChamadaEstado {

    public abstract String getEstado();

    public boolean atender(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean recusar(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean perder(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean colocarEmEspera(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean retomar(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean encerrar(ChamadaTelefonica chamada) {
        return false;
    }
}
