import java.util.Scanner;

public class StringDeclaration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine(); //menggunakan String untuk alfanumerik yang mau di inputkan
        String B = scanner.nextLine();

        System.out.println(A.length() + B.length()); //menggunakan length untuk menghitung berapa jumlah every single world dalam string tersebut

        if (A.compareTo(B) > 0) { //mengecek apakah String A leksiografis daripada String B menggunakan compareTo misalnya hello dan java h tidak lebih besar dari pada j karena h muncul duluan
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + //pada bagian ini untuk huruf awal pada subString A dan juga subString B akan dilakukan uppercase setiap huruf pertama pada string yang ada
                B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
