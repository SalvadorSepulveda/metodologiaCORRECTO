package es.ieslosmontecillos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MasGrandeTest {

    @Test
    void maxConNumerosPositivos() {
        assertEquals(5, MasGrande.max(new int[]{3, 4, 5}));
    }

    @Test
    void maxConOrdenDiferenteNoImporta() {
        assertEquals(5, MasGrande.max(new int[]{4, 3, 5}));
        assertEquals(5, MasGrande.max(new int[]{5, 4, 3}));
    }

    @Test
    void maxConUnSoloNumero() {
        assertEquals(3, MasGrande.max(new int[]{3}));
    }

    @Test
    void maxConNumerosNegativos() {
        assertEquals(-1, MasGrande.max(new int[]{-3, -5, -1}));
    }

    @Test
    void maxConArrayVacio() {
        assertThrows(IllegalArgumentException.class, () -> MasGrande.max(new int[]{}));
    }

    @Test
    void maxConArrayNull() {
        assertThrows(NullPointerException.class, () -> MasGrande.max(null));
    }
}
