import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 Używając stworzonej klasy Algorithms oraz klasy testowej napisz:
 1. Pustą definicję metody static int NWD(int,int) wraz z 4 poprawnymi testami do tej
 metody
 2. Pustą definicję metody static int abs(int) wraz z 4 poprawnymi testami do tej metody
 (metoda abs powinna zwracać wartość bezwzględną z liczby)
 3. Robimy commit, pull request, akceptujemy PR osoby B.
 4. Implementujemy metody utworzone przez osobę B tak, aby przechodziły testy
 **/
final class AlgorithmsTest {
    @Test
    void testNWD() {
        assertEquals(Algorithms.NWD(12,6), 4);
        assertEquals(Algorithms.NWD(24,32), 12);
        assertEquals(Algorithms.NWD(100,10), 10);
        assertEquals(Algorithms.NWD(1,1), 1);
    }

    @Test
    void testABS() {
        assertEquals(Algorithms.abs(-1), 1);
        assertEquals(Algorithms.abs(1), 1);
        assertEquals(Algorithms.abs(0), 0);
        assertEquals(Algorithms.abs(-100), 100);

    }

}
