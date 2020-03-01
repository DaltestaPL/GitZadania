import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
    void testSumOf(){
        List<Integer> integers =List.of(1,2,3,5);
        assertEquals(Algorithms.sumof(integers),10);
        assertNotEquals(Algorithms.sumof(integers),11);
        assertNotNull(Algorithms.sumof(integers));

    }

    @Test
    void testPalindrom(){
        String s ="Ada";
        assertEquals(Algorithms.isPalindrom("Ada"), s);
        assertNotEquals(Algorithms.isPalindrom("Ada"), "KAmil");
        assertNotNull(Algorithms.isPalindrom("Ada"));
    }
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
