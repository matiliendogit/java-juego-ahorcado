import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "INTELIGENCIA";

        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        };

        while (palabraAdivinada == false && intentos < intentosMax) {
            
            System.out.println("Adivina la palabra secreta: " + String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");
            
            System.out.println("Ingrese una letra: ");
            char letra = Character.toUpperCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                    
                }
            }

            if (letraCorrecta == false) {
                intentos++;
                System.out.println("Ups, letra incorrecta!!");
            }else{
                System.out.println("Bien, letra correcta!!");
            }

            System.out.println(letrasAdivinadas);
            System.out.println("Intentos restantes: " + (intentosMax - intentos));

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, adivinaste la palabra secreta!!");
            }

            if (letraCorrecta == false && intentos == intentosMax) {
                System.out.println("Lo siento, has perdido. La palabra secreta era: " + palabraSecreta);       
            }
            
            scanner.close();
        }
        
    }
}
