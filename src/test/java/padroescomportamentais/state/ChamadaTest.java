package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChamadaTest {

    ChamadaTelefonica chamada;

    @BeforeEach
    public void setUp() {
        chamada = new ChamadaTelefonica();
    }

    // Chamada chamando

    @Test
    public void deveAtenderChamadaChamando() {
        chamada.setEstado(ChamadaEstadoChamando.getInstance());
        assertTrue(chamada.atender());
        assertEquals(ChamadaEstadoEmAndamento.getInstance(), chamada.getEstado());
    }

    @Test
    public void deveRecusarChamadaChamando() {
        chamada.setEstado(ChamadaEstadoChamando.getInstance());
        assertTrue(chamada.recusar());
        assertEquals(ChamadaEstadoRecusada.getInstance(), chamada.getEstado());
    }

    @Test
    public void devePerderChamadaChamando() {
        chamada.setEstado(ChamadaEstadoChamando.getInstance());
        assertTrue(chamada.perder());
        assertEquals(ChamadaEstadoPerdida.getInstance(), chamada.getEstado());
    }

    @Test
    public void naoDeveColocarEmEsperaChamadaChamando() {
        chamada.setEstado(ChamadaEstadoChamando.getInstance());
        assertFalse(chamada.colocarEmEspera());
    }

    @Test
    public void naoDeveRetomarChamadaChamando() {
        chamada.setEstado(ChamadaEstadoChamando.getInstance());
        assertFalse(chamada.retomar());
    }

    @Test
    public void naoDeveEncerrarChamadaChamando() {
        chamada.setEstado(ChamadaEstadoChamando.getInstance());
        assertFalse(chamada.encerrar());
    }

    // Chamada em andamento

    @Test
    public void naoDeveAtenderChamadaEmAndamento() {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        assertFalse(chamada.atender());
    }

    @Test
    public void naoDeveRecusarChamadaEmAndamento() {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        assertFalse(chamada.recusar());
    }

    @Test
    public void naoDevePerderChamadaEmAndamento() {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        assertFalse(chamada.perder());
    }

    @Test
    public void deveColocarEmEsperaChamadaEmAndamento() {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        assertTrue(chamada.colocarEmEspera());
        assertEquals(ChamadaEstadoEmEspera.getInstance(), chamada.getEstado());
    }

    @Test
    public void naoDeveRetomarChamadaEmAndamento() {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        assertFalse(chamada.retomar());
    }

    @Test
    public void deveEncerrarChamadaEmAndamento() {
        chamada.setEstado(ChamadaEstadoEmAndamento.getInstance());
        assertTrue(chamada.encerrar());
        assertEquals(ChamadaEstadoEncerrada.getInstance(), chamada.getEstado());
    }

    // Chamada em espera

    @Test
    public void naoDeveAtenderChamadaEmEspera() {
        chamada.setEstado(ChamadaEstadoEmEspera.getInstance());
        assertFalse(chamada.atender());
    }

    @Test
    public void naoDeveRecusarChamadaEmEspera() {
        chamada.setEstado(ChamadaEstadoEmEspera.getInstance());
        assertFalse(chamada.recusar());
    }

    @Test
    public void naoDevePerderChamadaEmEspera() {
        chamada.setEstado(ChamadaEstadoEmEspera.getInstance());
        assertFalse(chamada.perder());
    }

    @Test
    public void naoDeveColocarEmEsperaChamadaEmEspera() {
        chamada.setEstado(ChamadaEstadoEmEspera.getInstance());
        assertFalse(chamada.colocarEmEspera());
    }

    @Test
    public void deveRetomarChamadaEmEspera() {
        chamada.setEstado(ChamadaEstadoEmEspera.getInstance());
        assertTrue(chamada.retomar());
        assertEquals(ChamadaEstadoEmAndamento.getInstance(), chamada.getEstado());
    }

    @Test
    public void deveEncerrarChamadaEmEspera() {
        chamada.setEstado(ChamadaEstadoEmEspera.getInstance());
        assertTrue(chamada.encerrar());
        assertEquals(ChamadaEstadoEncerrada.getInstance(), chamada.getEstado());
    }

    // Chamada encerrada

    @Test
    public void naoDeveAtenderChamadaEncerrada() {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        assertFalse(chamada.atender());
    }

    @Test
    public void naoDeveRecusarChamadaEncerrada() {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        assertFalse(chamada.recusar());
    }

    @Test
    public void naoDevePerderChamadaEncerrada() {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        assertFalse(chamada.perder());
    }

    @Test
    public void naoDeveColocarEmEsperaChamadaEncerrada() {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        assertFalse(chamada.colocarEmEspera());
    }

    @Test
    public void naoDeveRetomarChamadaEncerrada() {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        assertFalse(chamada.retomar());
    }

    @Test
    public void naoDeveEncerrarChamadaEncerrada() {
        chamada.setEstado(ChamadaEstadoEncerrada.getInstance());
        assertFalse(chamada.encerrar());
    }

    // Chamada perdida

    @Test
    public void naoDeveAtenderChamadaPerdida() {
        chamada.setEstado(ChamadaEstadoPerdida.getInstance());
        assertFalse(chamada.atender());
    }

    @Test
    public void naoDeveRecusarChamadaPerdida() {
        chamada.setEstado(ChamadaEstadoPerdida.getInstance());
        assertFalse(chamada.recusar());
    }

    @Test
    public void naoDevePerderChamadaPerdida() {
        chamada.setEstado(ChamadaEstadoPerdida.getInstance());
        assertFalse(chamada.perder());
    }

    @Test
    public void naoDeveColocarEmEsperaChamadaPerdida() {
        chamada.setEstado(ChamadaEstadoPerdida.getInstance());
        assertFalse(chamada.colocarEmEspera());
    }

    @Test
    public void naoDeveRetomarChamadaPerdida() {
        chamada.setEstado(ChamadaEstadoPerdida.getInstance());
        assertFalse(chamada.retomar());
    }

    @Test
    public void naoDeveEncerrarChamadaPerdida() {
        chamada.setEstado(ChamadaEstadoPerdida.getInstance());
        assertFalse(chamada.encerrar());
    }

    // Chamada recusada

    @Test
    public void naoDeveAtenderChamadaRecusada() {
        chamada.setEstado(ChamadaEstadoRecusada.getInstance());
        assertFalse(chamada.atender());
    }

    @Test
    public void naoDeveRecusarChamadaRecusada() {
        chamada.setEstado(ChamadaEstadoRecusada.getInstance());
        assertFalse(chamada.recusar());
    }

    @Test
    public void naoDevePerderChamadaRecusada() {
        chamada.setEstado(ChamadaEstadoRecusada.getInstance());
        assertFalse(chamada.perder());
    }

    @Test
    public void naoDeveColocarEmEsperaChamadaRecusada() {
        chamada.setEstado(ChamadaEstadoRecusada.getInstance());
        assertFalse(chamada.colocarEmEspera());
    }

    @Test
    public void naoDeveRetomarChamadaRecusada() {
        chamada.setEstado(ChamadaEstadoRecusada.getInstance());
        assertFalse(chamada.retomar());
    }

    @Test
    public void naoDeveEncerrarChamadaRecusada() {
        chamada.setEstado(ChamadaEstadoRecusada.getInstance());
        assertFalse(chamada.encerrar());
    }
}
