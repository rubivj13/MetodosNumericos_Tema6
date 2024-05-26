/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MetodoDeEuler;

/**
 *
 * @author Rub_1
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        double x0 = 0.0;  // Valor inicial de x
        double y0 = 1.0;  // Valor inicial de y
        double h = 0.1;   // Tamaño del paso
        int n = 10;       // Número de pasos

        double[] resultadosX = new double[n + 1];
        double[] resultadosY = new double[n + 1];

        resultadosX[0] = x0;
        resultadosY[0] = y0;

        for (int i = 1; i <= n; i++) {
            resultadosX[i] = resultadosX[i - 1] + h;
            resultadosY[i] = resultadosY[i - 1] + h * funcion(resultadosX[i - 1], resultadosY[i - 1]);
        }

        System.out.println("\nResultados:");
        System.out.println("i\t\tx\t\t\ty");
        for (int i = 0; i <= n; i++) {
            System.out.printf("%d\t\t%.5f\t\t%.5f\n", i, resultadosX[i], resultadosY[i]);
        }
    }

    public static double funcion(double x, double y) {
        return x - y;
    }
}
