public class Modulo{

    public static int calcularModulo(int numero, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return numero % divisor;
    }
}
