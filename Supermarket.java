import java.util.Date; // Import library untuk bekerja dengan tanggal dan waktu
import java.util.Scanner; // Import library untuk membaca input dari pengguna

public class Supermarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password, inputCaptcha;
        String correctCaptcha = "aBsD35H"; // Captcha tetap

        // Proses Login
        System.out.println("+---------------------------------------------+");
        System.out.println("Log in");
        System.out.println("+---------------------------------------------+");
        do {
            System.out.print("Username : ");
            username = scanner.nextLine(); // Membaca input string untuk username
            System.out.print("Password : ");
            password = scanner.nextLine(); // Membaca input string untuk password
            System.out.println("Captcha  : " + correctCaptcha); // Menampilkan captcha tetap
            System.out.print("Masukkan Captcha : ");
            inputCaptcha = scanner.nextLine(); // Membaca input string untuk captcha

            // Memeriksa validasi login menggunakan method equals() pada String
            if (username.equals("Sherly") && password.equals("1228") && inputCaptcha.equals(correctCaptcha)) {
                System.out.println("Login berhasil!");
                break;
            } else {
                System.out.println("Login gagal, silakan coba lagi.\n");
            }
        } while (true);

        // Proses Transaksi
        System.out.println("\n+---------------------------------------------+");
        System.out.println("Selamat Datang di Supermarket SherlyMart");
        System.out.println("+---------------------------------------------+");
        
        // Menggunakan class Date untuk mendapatkan tanggal dan waktu saat ini
        Date date = new Date();
        System.out.println("Tanggal dan Waktu: " + date.toString()); // Menggunakan method toString() untuk menampilkan tanggal dan waktu dalam format default
        System.out.println("+---------------------------------------------+");

        System.out.print("No. Faktur  : ");
        String noFaktur = scanner.nextLine(); // Membaca input string untuk nomor faktur
        System.out.print("Kode Barang : ");
        String kodeBarang = scanner.nextLine(); // Membaca input string untuk kode barang
        System.out.print("Nama Barang : ");
        String namaBarang = scanner.nextLine(); // Membaca input string untuk nama barang
        System.out.print("Harga Barang: ");
        double hargaBarang = scanner.nextDouble(); // Membaca input angka untuk harga barang
        System.out.print("Jumlah Beli : ");
        int jumlahBeli = scanner.nextInt(); // Membaca input angka untuk jumlah beli
        double total = hargaBarang * jumlahBeli; // Menghitung total harga

        System.out.println("+---------------------------------------------+");
        System.out.println("No. Faktur  : " + noFaktur); // Menampilkan nomor faktur
        System.out.println("Kode Barang : " + kodeBarang); // Menampilkan kode barang
        System.out.println("Nama Barang : " + namaBarang); // Menampilkan nama barang
        System.out.println("Harga Barang: Rp " + hargaBarang); // Menampilkan harga barang
        System.out.println("Jumlah Beli : " + jumlahBeli); // Menampilkan jumlah barang yang dibeli
        System.out.println("TOTAL       : Rp " + total); // Menampilkan total harga barang
        scanner.nextLine(); // Membersihkan buffer input
        System.out.println("+---------------------------------------------+");
        System.out.print("Kasir       : ");
        String namaKasir = scanner.nextLine(); // Membaca input string untuk nama kasir
        System.out.println("Kasir       : " + namaKasir); // Menampilkan nama kasir
        System.out.println("+---------------------------------------------+");


        
        System.out.println("+---------------------------------------------+");
        System.out.println("Terima kasih telah berbelanja di SherlyMart");
        System.out.println("+---------------------------------------------+");

        // Menutup Scanner untuk mencegah kebocoran sumber daya
        scanner.close();
    }
}
