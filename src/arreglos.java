import java.util.Scanner;
class Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creo tres arreglos con 7 posiciones cada uno
        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];

        // Pido los datos al usuario
        for (int i = 0; i < 7; i++) {
            System.out.println("Ingrese el valor para el arreglo 1");
            arreglo1[i] = entrada.nextInt();
            System.out.println("Ingrese el valor para el arreglo 2");
            arreglo2[i] = entrada.nextInt();
        }

        // Calculamos la diferencia entre los arreglos y acumulamos la suma
        double suma = 0;
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
            suma += arreglo3[i];
        }

        // Calculamos el promedio de la suma
        double promedio = suma / 7;

        // Mostramos los valores de arreglo 3
        System.out.println("Los valores del arreglo 3 son: ");
        for (int i = 0; i < 7; i++) {
            System.out.println(arreglo3[i]);
        }

        // Mostramos el promedio
        System.out.println("El promedio de la suma es: " + promedio);

        entrada.close();
    }
}
