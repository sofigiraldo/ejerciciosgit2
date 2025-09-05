import java.util.Random;
import java.util.Scanner;

public class Lanzardados {
    public static void main(String[] args) {
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        while(opcion!=3){

            System.out.print("Menu: ");
            System.out.println("1.Ejercicio dados 2 ");
            System.out.println("2.Ejercicio dados 3 ");
            System.out.println("3.IMC");
            System.out.println("4.");
            System.out.println("5.");
            System.out.println("6.Salir");

        }
    }

    public static void dados2(){

    }
    public static void dados3(){

        Random aleatorio = new Random();
        int dado1 = 0;
        int dado2 = 0;
        int dado3 = 0;
        for (int i = 1; i <= 20; i++) {
            dado1 += aleatorio.nextInt(6) + 1;
            dado2 += aleatorio.nextInt(6) + 1;
            dado3 += aleatorio.nextInt(6) + 1;
        }
            System.out.println("Resultados finales");
            System.out.println("dado1:" + dado1);
            System.out.println("dado2:" + dado2);
            System.out.println("dado3:" + dado3);

            int mejor = dado1;
            String nombreMejor = "dado1";
            if (dado2 > mejor) {
                mejor = dado2;
                nombreMejor = "dado2";
            }
        if (dado3 > mejor) {
            mejor = dado3;
            nombreMejor = "dado3";
        }
            int peor = dado1;
            String nombrePeor = "dado1";
            if (dado2 < peor) {
                peor = dado2;
                nombrePeor = "dado2";
            }
            if (dado3 < peor) {
                peor = dado3;
                nombrePeor = "dado3";
            }

            int mitad = dado1 + dado2 + dado3 - mejor - peor;
            String nombreMitad ="";
            if (mitad == dado1) {
                nombreMitad = "dado1";
            } else if (mitad == dado2) {
                nombreMitad = "dado2";
            } else {
                    nombreMitad = "dado3";
                }

            System.out.println("Mejor:" + nombreMejor + "con" + mejor);
            System.out.println("Mitad:" + nombreMitad + "con" + mitad);
            System.out.println("Peor:" + nombrePeor + "con" + peor);
            }

            public static String IMC() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa tu peso en kg: ");
                double peso = sc.nextDouble();
                System.out.println("Ingresa tu estatura");
                double estatura = sc.nextDouble();
                double imc = peso/ Math.pow(estatura, 2);
                String situacion;
                if (imc < 18.5) {
                    situacion = "Bajo peso";
                } else if (imc < 24.9) {
                    situacion = "Peso normal";
                } else if (imc < 26.9) {
                    situacion = "Sobrepeso grado 1";
                } else if (imc < 29.9) {
                    situacion = "Sobrepeso grado 2";
                } else if (imc < 34.9) {
                    situacion = "Obesidad tipo 1";
                } else if (imc < 39.9) {
                    situacion = "Obesidad tipo 2";
                } else if (imc < 49.9) {
                    situacion = "Obesidad tipo 3 (mórbida)";
                } else {
                    situacion = "Obesidad tipo 4 (extremo)";
                }

                System.out.printf("Tu IMC es: %.2f\n", imc);
                System.out.println("Situación: " + situacion);
                return situacion;
            }
}

