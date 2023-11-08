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

public class Short{
    public static void main(String []args){
        // short adalah tipe data memiliki value dimulai dari
        // -32768 hingga 32767
        // penggunaan memori pada short sedikit lebih banyak dari byte
        // dan lebih kecil dari int
        
        short angka = 6000;
        System.out.println(angka);
    }
}

// 1. Program tersebut diberi nama `Short` dan berada dalam package `learn.basic.TipeData`.

// 2. Dalam program ini, Anda mendemonstrasikan penggunaan tipe data primitif `short`.

// 3. Tipe data `short` digunakan untuk menyimpan bilangan bulat dalam rentang nilai dari -32.768 hingga 32.767. Ini menggunakan 16 bit (2 byte) untuk representasi.

// 4. Anda mendeklarasikan sebuah variabel bernama `angka` dengan tipe data `short` dan menginisialisasinya dengan nilai 6.000, yang berada dalam rentang yang valid untuk tipe data `short`.

// 5. Kemudian, Anda menggunakan pernyataan `System.out.println()` untuk mencetak nilai variabel `angka` ke konsol.

// Hasil eksekusi program ini akan mencetak nilai `angka`, yaitu 6.000, ke layar. Program ini menunjukkan penggunaan tipe data `short` untuk menyimpan dan mencetak bilangan bulat dalam bahasa Java. Tipe data `short` digunakan ketika Anda perlu menghemat memori dan menginginkan rentang nilai yang lebih besar daripada tipe data `byte`, tetapi lebih kecil daripada tipe data `int`.