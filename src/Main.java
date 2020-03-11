
public class Main {

    public static void sumar(int... args) {
        int suma = 0;
        for (int numero : args) {
            suma += numero;
        }
        System.out.println("La suma es de:" + suma);
    }

    public static void restar(int... args) {
        int resta = 0;
        for (int numero : args) {
            resta -= numero;
        }
        System.out.println("La resta es de:" + resta);
    }

    public static void multiplicar(int... args) {
        int multiplicacion = 1;
        for (int numero : args) {
            multiplicacion *= numero;
        }
        System.out.println("La multiplicacion es de:" + multiplicacion);
    }

    public static void dividir(int... args) {
        float division = 1;
        for (int numero : args) {
            division /= numero;
        }
        System.out.printf("La division es de: %.2f", division);
    }



    public static void main(String[] args){
        sumar(1,2,3);
        restar(1,2,3);
        multiplicar(1,2,3);
        dividir(1,2,3);
    }
}
