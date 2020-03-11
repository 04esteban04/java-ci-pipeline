import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class Test_Main {

    @Test
    public void sumar() {
        int suma = 0;
        int num1 = 1, num2 = 2, num3 = 3;

        suma += num1;
        suma += num2;
        suma += num3;

        assertEquals(6, suma);

        //fail(" Provando método de suma ");
    }

    @Test
    public void restar() {
        int resta = 0;
        int num1 = 1, num2 = 2, num3 = 3;

        resta -= num1;
        resta -= num2;
        resta -= num3;

        assertEquals(-6, resta);

        //fail(" Provando método de resta ");
    }

    @Test
    public  void multiplicar() {
        int multiplicacion = 1;
        int num1 = 1, num2 = 2, num3 = 3;

        multiplicacion *= num1;
        multiplicacion *= num2;
        multiplicacion *= num3;

        assertEquals(6, multiplicacion);

        //fail(" Provando método de multiplicacion ");
    }

    @Test
    public  void dividir() {
        int division = 1;
        int num1 = 1, num2 = 2, num3 = 3;

        division /= num1;
        division /= num2;
        division /= num3;

        assertEquals(0, division);

        //fail(" Provando método de division ");
    }
}

