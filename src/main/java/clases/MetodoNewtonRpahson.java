package clases;

public class MetodoNewtonRpahson {

    public MetodoNewtonRpahson() {
    }

    public double funcion(double x) {
        return Math.pow(x, 2);
    }

    public double derivadaFuncion(double x) {
        return 2 * x;
    }

    public void evaluarMetodoNewtonRaphson(int iteraciones, double x) {
        for (int i = 1; i <= iteraciones; i++) {
            x = x - funcion(x) / derivadaFuncion(x);
            System.out.println(String.format("%.10f", x));
        }
    }

}
