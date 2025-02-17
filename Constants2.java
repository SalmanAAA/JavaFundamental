public class Constants2{
    public static final double CM_PER_INCH = 2.54; //public static final double memiliki ruang lingkup kelas dan dapat diakses dari mana saja di dalam program, tanpa perlu membuat instance dari kelas tersebut.
    public static void main(String[] args) {
    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " + paperWidth *
            CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}
