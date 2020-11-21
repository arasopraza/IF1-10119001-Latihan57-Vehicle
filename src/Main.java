/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: program menampilkan teks vehicle
 * ke layar berbasis OOP dan implementasi pewarisan.
 */

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);

        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        System.out.print("\n");

        Skateboard board = new Skateboard();
        board.setMyBrand("Ally Skate");
        board.setMyModel("Rocket");
        board.setMyBoardLength(54.5);
        System.out.println("Brand : " + board.getMyBrand());
        System.out.println("Model : " + board.getMyModel());
        System.out.println("Panjangnya Board : " + board.getMyBoardLength());
    }
}
