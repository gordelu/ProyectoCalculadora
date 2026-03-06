public class Calculadora {

    private int num1;
    private int num2;

    // Constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método suma
    public int suma() {
        return num1 + num2;
    }

    // Método realizarOperacion
    public int realizarOperacion(String operacion) {

        if (operacion.equals("suma")) {
            return suma();
        }

        if (operacion.equals("multiplicar")) {
         return multiplicar();
}

        return 0;
    }

    public int multiplicar() {
    return num1 * num2;
}
}