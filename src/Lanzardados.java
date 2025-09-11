import java.util.Random;
import java.util.Scanner;
//natalia sofia giraldo gallego
public class Lanzardados {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        while(opcion!=6){

            System.out.print("\n Menú principal: ");

            System.out.println("\n 1.Ejercicio dados 2 ");
            System.out.println("\n 2.Ejercicio dados 3 ");
            System.out.println("\n 3.Calcular IMC");
            System.out.println("\n 4.Ejercicio estudiantes");
            System.out.println("\n 5.");
            System.out.println("\n 6.Salir");
            System.out.println("\n Elige una opción");
            opcion = sc.nextInt();
            switch (opcion){
                case 1 -> dados2();
                case 2 -> dados3();
                case 3 -> IMC();
                case 4 -> ejercicio4();
                case 5 -> ejercicio5();
                case 6 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }


    public static void dados2(){
        Random rand = new Random();

        int dado1 = 0, dado2 = 0;

        for (int i = 1; i <= 20; i++) {
            int tiro1 = rand.nextInt(6) + 1;
            int tiro2 = rand.nextInt(6) + 1;
            dado1 += tiro1;
            dado2 += tiro2;
            System.out.println("Tiro " + i + ": Dado1=" + tiro1 + " | Dado2=" + tiro2);
        }
        System.out.println("Resultados finales");
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);

        if (dado1 > dado2) {
            System.out.println("Ganador: Dado 1 ");
            System.out.println("Perdedor: Dado 2 ");
        } else if (dado2 > dado1) {
            System.out.println("Ganador: Dado 2 ");
            System.out.println("Perdedor: Dado 1 ");
        } else {
            System.out.println("Empate entre los dos dados ");
        }
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

            System.out.println("Mejor:" + nombreMejor + "\ncon" + mejor);
            System.out.println("Mitad:" + nombreMitad + "\ncon" + mitad);
            System.out.println("Peor:" + nombrePeor + "\ncon" + peor);
            }
            public static String IMC() {
                Scanner sc = new Scanner(System.in);
                System.out.println("Ingresa tu peso en kg: ");
                double peso = sc.nextDouble();
                System.out.println("Ingresa tu estatura en metros");
                double estatura = sc.nextDouble();
                double imc = peso/ Math.pow(estatura, 2);
                String situacion;
                if (imc < 18.5) {
                    situacion = "Bajo peso";
                } else if (imc >= 18.5 && imc <= 24.9) {
                    situacion = "Peso normal";
                } else if (imc >= 25 && imc <= 26.9) {
                    situacion = "Sobrepeso grado 1";
                } else if (imc >= 27 && imc <= 29.9) {
                    situacion = "Sobrepeso grado 2";
                } else if (imc >= 30 && imc <= 34.9) {
                    situacion = "Obesidad tipo 1";
                } else if (imc >= 35 && imc <= 39.9) {
                    situacion = "Obesidad tipo 2";
                } else if (imc >= 40 && imc <= 49.9) {
                    situacion = "Obesidad tipo 3 (mórbida)";
                } else {
                    situacion = "Obesidad tipo 4 (extrema)";
                }

                System.out.printf("Tu IMC es: %.2f\n", imc);
                System.out.println("Situación: " + situacion);
                return situacion;
            }

public static void ejercicio4(){
    Scanner sc = new Scanner(System.in);
    String repetir;
    do {
        System.out.println("Ingresa la cantidad de estudiantes");
        int cantidad = sc.nextInt();

        String[] nombres = new String[cantidad];
        double[] promedios = new double[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = sc.next();

            double suma = 0;
            for (int j = 1; j <= 3; j++) {
                System.out.println("Ingrese la nota " + j + " de " + nombres[i] + ": ");
                double nota = sc.nextDouble();
                suma += nota;
            }

            promedios[i] = suma / 3;
        }

        System.out.println("Resultados Finales");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Estudiante: " + nombres[i]);
            System.out.println("Promedio: " + promedios[i]);

            int rango = (int) promedios[i];
            switch (rango) {
                case 0, 1, 2:
                    System.out.println("Estado: Reprobado");
                    break;
                case 3:
                    System.out.println("Estado: Aprobado");
                    break;
                case 4, 5:
                    System.out.println("Estado: Excelente");
                    break;
                default:
                    System.out.println("Nota inválida");
            }
            System.out.println("----------------------");
        }
        System.out.println("¿Desea registrar otro grupo de estudiantes? (si/no): ");
        repetir = sc.next();
    } while (repetir.equalsIgnoreCase("si"));

    System.out.println("Programa finalizado.");
    }

    public static void ejercicio5(){
        Scanner sc= new Scanner(System.in);
        Random rand= new Random();
        int jugador1=0;
        int jugador2=0;
        int ronda=1;
        System.out.println("Juego de dados");
        System.out.println("Reglas");
        System.out.println("Gana el jugador que logre una diferencia de 3 o mas puntos");
        System.out.println("Pierdes un punto si sacas 1");
        System.out.println("si sale 6, sumas 6 puntos");

        while (jugador1 - jugador2 < 3 && jugador2 - jugador1 < 3) {
            int tiro1 = rand.nextInt(6) + 1;
            int tiro2 = rand.nextInt(6) + 1;

            if (tiro1 == 1) {
                jugador1 -= 1;
            } else if (tiro1 == 6) {
                jugador1 += 6;
            } else {
                jugador1 += tiro1;
            }

            if (tiro2 == 1) {
                jugador2 -= 1;
            } else if (tiro2 == 6) {
                jugador2 += 6;
            } else {
                jugador2 += tiro2;
            }

            System.out.println("Jugador 1 tiene: " + jugador1);
            System.out.println("Jugador 2 tiene: " + jugador2);
            System.out.println("---------------------");
        }

        if (jugador1 > jugador2) {
            System.out.println("Ganó el Jugador 1 con " + jugador1 + " puntos");
        } else {
            System.out.println("Ganó el Jugador 2 con " + jugador2 + " puntos");
        }
    }
}







