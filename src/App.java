import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sizeInput = new Scanner(System.in);
        System.out.println("Qual o tamanho da pirâmide?");
        int size = sizeInput.nextInt();
        System.out.println("");

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
