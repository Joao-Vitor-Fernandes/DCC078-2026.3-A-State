package padroescomportamentais.state;

public abstract class ChamadaEstado {

    public abstract String getEstado();

    public boolean tocar(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean atender(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean cairNaCaixaPostal(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean colocarEmEspera(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean retomar(ChamadaTelefonica chamada) {
        return false;
    }

    public boolean desligar(ChamadaTelefonica chamada) {
        return false;
    }
}
