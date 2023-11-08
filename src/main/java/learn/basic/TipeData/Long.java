package learn.basic.TipeData;

// tipe data primitif pada java
// byte     5
// short    5
// int      5
// long     5
// float    5.0
// double   5.0
// boolean  true / false
// char     'A'

public class Long{
    public static void main(String[] args){
        // pada tipe data long akan mengeluarkan value
        // yang sangat besar
        // -9223372036854775808 ke 9223372036854775807
        // ini digunakan jika value integer tidak mencukupi
        // pastikan kamu menggunakan L pada akhir value long

        long angka = 150000000L;
        System.out.println(angka);
    }
}


// 1. Program tersebut diberi nama `Long` dan berada dalam package `learn.basic.TipeData`.

// 2. Dalam program ini, Anda mendemonstrasikan penggunaan tipe data primitif `long`.

// 3. Tipe data `long` digunakan untuk menyimpan bilangan bulat yang memiliki rentang nilai yang sangat besar. Rentang nilai tipe data `long` berkisar dari -9.223.372.036.854.775.808 hingga 9.223.372.036.854.775.807. Ini menggunakan 64 bit (8 byte) untuk representasi.

// 4. Anda mendeklarasikan sebuah variabel bernama `angka` dengan tipe data `long` dan menginisialisasinya dengan nilai 150.000.000L. Anda perlu menambahkan sufiks 'L' (atau 'l') pada akhir nilai `long` untuk menunjukkan bahwa itu adalah tipe data `long`.

// 5. Kemudian, Anda menggunakan pernyataan `System.out.println()` untuk mencetak nilai variabel `angka` ke konsol.

// Hasil eksekusi program ini akan mencetak nilai `angka`, yaitu 150.000.000, ke layar. Program ini menunjukkan penggunaan tipe data `long` untuk menyimpan dan mencetak bilangan bulat dengan rentang nilai yang sangat besar, yang melebihi kisaran tipe data `int`. Tipe data `long` digunakan ketika Anda memerlukan kapasitas yang lebih besar untuk merepresentasikan bilangan bulat.