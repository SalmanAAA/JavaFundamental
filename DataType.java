import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        boolean isValid = false;

        try {
            long T = Long.parseLong(n); //parseLong(n): Ini adalah metode statis dalam kelas Long yang mengonversi string n menjadi nilai long. Metode ini mengembalikan tipe data primitif long.

            System.out.println(n + " can be fitted in:");

            if (T >= Byte.MIN_VALUE && T <= Byte.MAX_VALUE) {
                isValid = true;
                System.out.println("* byte");
            }if (T >= Short.MIN_VALUE && T <= Short.MAX_VALUE) {
                isValid = true;
                System.out.println("* short");
            }if (T >= Integer.MIN_VALUE && T <= Integer.MAX_VALUE) {
                isValid = true;
                System.out.println("* int");
            }if (T >= Long.MIN_VALUE && T <= Long.MAX_VALUE) {
                isValid = true;
                System.out.println("* long");
            }
        }catch (NumberFormatException e) {//digunakan untuk menangani pengecualian yang terjadi ketika sebuah string tidak dapat diubah menjadi tipe numerik.
            System.out.println(n + " can't be fitted anywhere.");
        }
    }
}
