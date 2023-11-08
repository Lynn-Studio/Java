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

public class Int{
    public static void main(String[] args){
        // int adalah tipe data number yang memiliki value dimulai dari
        // -2147483648 hingga 2147483648
        // penggunaan memori pada int sedikit lebih banyak dari short
        // dan lebih kecil dari long
        int angka = 10000;
        System.out.println(angka);
    }
}

// 1. Program tersebut diberi nama `Int` dan berada dalam package `learn.basic.TipeData`.

// 2. Dalam program ini, Anda mendemonstrasikan penggunaan tipe data primitif `int`.

// 3. Tipe data `int` digunakan untuk menyimpan bilangan bulat dalam rentang nilai dari -2.147.483.648 hingga 2.147.483.647. Ini menggunakan 32 bit (4 byte) untuk representasi.

// 4. Anda mendeklarasikan sebuah variabel bernama `angka` dengan tipe data `int` dan menginisialisasinya dengan nilai 10.000, yang berada dalam rentang yang valid untuk tipe data `int`.

// 5. Kemudian, Anda menggunakan pernyataan `System.out.println()` untuk mencetak nilai variabel `angka` ke konsol.

// Hasil eksekusi program ini akan mencetak nilai `angka`, yaitu 10.000, ke layar. Program ini menunjukkan penggunaan tipe data `int` untuk menyimpan dan mencetak bilangan bulat dalam bahasa Java. Tipe data `int` umumnya digunakan untuk operasi bilangan bulat sehari-hari karena memiliki kisaran nilai yang cukup luas dan penggunaan memori yang efisien.