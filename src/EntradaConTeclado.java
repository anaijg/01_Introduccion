import java.util.Scanner;

public class EntradaConTeclado {
    // cada clase que queramos ejecutar debe contener un método main
    public static void main(String[] args) {
        // dentro {} escribimos las instrucciones -> en java, una instrucción es normalmente una línea de código que finaliza con ;
        // Para introducir un dato por teclado, necesitamos la clase Scanner, así:
        Scanner sc = new Scanner(System.in);



        // ahora tenemos que crear una variable para guardar el dato que introduzcamos por teclado

        // LEER UNA CADENA DE TEXTO (String)
        String nombre = sc.nextLine(); // cuando llegue a esta linea se va a quedar esperando a que escribas algo en la consola y pulses Enter
        // para ver este dato que hemos metido por teclado lo tenemos que mostrar (imprimir)
        System.out.println("Hola, " + nombre);


        // Ejemplo 1: LEER UN VALOR ENTERO
        // Vamos a meter dos números ENTEROS, vamos a sumarlos y vamos a mostrar el resultado
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        // hacemos la suma
        int suma = numero1 + numero2


    }
}
