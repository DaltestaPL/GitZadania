import java.util.List;
import java.util.OptionalLong;

/**
 Używając stworzonej klasy Algorithms oraz klasy testowej napisz:
 1. Pustą definicję metody static int NWD(int,int) wraz z 4 poprawnymi testami do tej
 metody
 2. Pustą definicję metody static int abs(int) wraz z 4 poprawnymi testami do tej metody
 (metoda abs powinna zwracać wartość bezwzględną z liczby)
 3. Robimy commit, pull request, akceptujemy PR osoby B.
 4. Implementujemy metody utworzone przez osobę B tak, aby przechodziły testy
 **/
final class Algorithms {

    static boolean isPalindrom(String s){

        return true;
    }

    static OptionalLong sumof(List<Integer> integers){
        OptionalLong optionalLong = OptionalLong.empty();
        return optionalLong;
    }
    static int NWD(int i, int j) {
        while (i!=j){
            if(i>j){
                i=i-j;
            }
            else {
                j=j-i;
            }
        }
        return i;
    }
    static int abs(int i) {
        if(i<0){
            i=i*(-1);
        }

        return i;
    }
    static long pow(int a, int b){
        return 1L;
    }
    static long silnia(long n){
        return 1L;
    }
}
