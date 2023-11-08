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

public class Byte{
    public static void main(String[] args){
        // byte adalah salah satu tipe data yang panjang valuenya
        // adalah -128 hingga 127
        // penggunaan memori tipe data bye lebih hemat daripada menggunakan
        // tipe data int
        
        byte angka = 100;
        System.out.println(angka);
    }
}

// 1. Program tersebut diberi nama `Byte` dan berada dalam package `learn.basic.TipeData`.

// 2. Dalam program ini, Anda mendemonstrasikan penggunaan tipe data primitif `byte`.

// 3. Tipe data `byte` adalah tipe data yang digunakan untuk menyimpan bilangan bulat dalam rentang nilai dari -128 hingga 127. Ini menggunakan 8 bit (1 byte) untuk representasi.

// 4. Anda mendeklarasikan sebuah variabel bernama `angka` dengan tipe data `byte` dan menginisialisasinya dengan nilai 100, yang berada dalam rentang yang valid untuk tipe data `byte`.

// 5. Kemudian, Anda menggunakan pernyataan `System.out.println()` untuk mencetak nilai variabel `angka` ke konsol.

// Hasil eksekusi program ini akan mencetak nilai `angka`, yaitu 100, ke layar. Program ini menunjukkan bahwa Anda telah berhasil menggunakan tipe data `byte` untuk menghemat memori karena rentang nilai yang lebih terbatas dibandingkan dengan tipe data `int`.