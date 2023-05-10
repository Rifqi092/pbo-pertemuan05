public class Main {
    public static void main(String[] args) {
    String nama;
    int usia;
    String loreng;
    String ras;

    Kucing kucing = new Kucing();
    kucing.nama = "Lulu";
    kucing.umur = 4;
    kucing.loreng = "Oranye";
    kucing.ras = "Siamase";

    Kucing kucing1 = new Kucing();
    kucing1.nama = "DD";
    kucing1.umur = 6;
    kucing1.loreng = "Cokelat";
    kucing1.ras = "Persia";

    Kucing kucing2 = new Kucing();
    kucing2.nama = "Momo";
    kucing2.umur = 6;
    kucing2.loreng = "Putih";
    kucing2.ras = "Ragdoll";
    kucing1.info();
    kucing.info();
    kucing2.info();
    }
}