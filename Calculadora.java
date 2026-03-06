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

        if(operacion.equals("dividir")) {
            return dividir();
        }

        return 0;
    }

    public int dividir() {

    if (num2 == 0) {
        System.out.println("No se puede dividir entre cero");
        return 0;
    }

    return num1 / num2;
}
}