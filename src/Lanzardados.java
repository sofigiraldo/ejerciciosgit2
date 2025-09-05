import java.util.Random;

public class Lanzardados {
    public static void main(String[] args) {
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
        }

