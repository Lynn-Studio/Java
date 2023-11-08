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

public class Float{
    public static void main(String[] args){
        // float adalah tipe data number yang berupa pecahan atau decimal
        // float memiliki value dimulai dari 3.4e−038 hingga 3.4e+038
        // penggunaan memori pada float lebih sedikit dari double
        float angka = 10.0f;
        System.out.println(angka);  
    }
}

// 1. Program tersebut diberi nama `Float` dan berada dalam package `learn.basic.TipeData`.

// 2. Dalam program ini, Anda mendemonstrasikan penggunaan tipe data primitif `float`.

// 3. Tipe data `float` digunakan untuk menyimpan bilangan pecahan (floating-point) dengan presisi yang lebih rendah daripada tipe data `double`. Rentang nilai tipe data `float` berkisar antara sekitar 3.4e^-38 hingga 3.4e^38.

// 4. Anda mendeklarasikan sebuah variabel bernama `angka` dengan tipe data `float` dan menginisialisasinya dengan nilai 10.0f, yang merupakan bilangan pecahan. Anda perlu menambahkan sufiks 'f' setelah angka literal untuk menunjukkan bahwa itu adalah tipe data `float`.

// 5. Kemudian, Anda menggunakan pernyataan `System.out.println()` untuk mencetak nilai variabel `angka` ke konsol.

// Hasil eksekusi program ini akan mencetak nilai `angka`, yaitu 10.0, ke layar. Program ini menunjukkan penggunaan tipe data `float` untuk menyimpan dan mencetak bilangan pecahan dengan presisi yang lebih rendah daripada tipe data `double`, sehingga memerlukan lebih sedikit ruang memori.