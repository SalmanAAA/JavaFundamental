public class FloatingPoint {
    public static void main(String[] args)
    { double x = 92.98;
        int nx = (int) Math.round(x); //casting menggunakan tipe int karena Math.round(x) akan menghasilkan tipe data long.
        System.out.println("value of x: " + nx); //Fungsi Math.round(x) membulatkan nilai x ke bilangan bulat terdekat. Dalam kasus ini, 92.98 dibulatkan ke 93 karena 92.98 lebih dekat ke 93 daripada ke 92.
    }
}
