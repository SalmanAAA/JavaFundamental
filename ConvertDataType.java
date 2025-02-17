public class ConvertDataType {
    static short methodOne(long l) //konversi ketiga Metode methodOne
    {
        int i = (int) l; //nilai l yang sebelumnya long 10 dikonversi menjadi int 10
        return (short)i; //nilai i yang sebelumnya int 10 dikonversi menjadi short 10
    }
    public static void main(String[] args)
    {
        double d = 10.25; //inisiasi pertama
        float f = (float) d;//konversi pertama tipe data double d ke tipe data float
        byte b = (byte) methodOne((long) f);//konversi kedua tipe data itu dengan methodOne dirubah ke long dari 10.25 menjadi 10 //konversi ke empat yang sebelumnya nilai sudah di return menjadi short 10 dikonversi menjadi byte 10
        System.out.println(b); // hasil dari b adalah tipe data byte 10
    }
}
