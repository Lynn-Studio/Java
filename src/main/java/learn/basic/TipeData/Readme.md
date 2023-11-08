# Tipe Data Pada Java

Tipe Data pada java adalah konsep yang digunakan untuk mendefinisikan jenis nilai yang dapat disimpan dalam variabel. Tipe data menggambarkan jenis nilai yang variabel dapat miliki, seperti bilangan bulat, bilangan desimal, karakter, dan sebagainya. Java memiliki beberapa tipe data yang berbeda
| Tipe Data | Ukuran | Panjang Value |
| :---------------------- | ------ | :------------------------------------------------------------------------- |
| [byte](Byte.java) | 1 byte | -128 ke 127 |
| [short](Short.java) | 2 byte | -32,768 ke 32,767 |
| [int](Int.java) | 4 byte | -2,147,583,684 ke 2,147,483,647 |
| [long](Long.java) | 8 byte | -9,223,372,036,854,775,808 ke 9,223,372,036,854,775,807127 |
| [float](Float.java) | 4 byte | Menyimpan bilangan pecahan, cukup untuk menyimpan 6 sampai 7 digit desimal |
| [double](Double.java) | 8 byte | Menyimpan bilangan pecahan, cukup untuk mentimpan 15 digit desimal |
| [boolean](Boolean.java) | 1 bit | Value antara ture atau false |
| [char](Character.java) | 2 byte | Value dari ascii |

## Byte

Tipe data byte dalam bahasa pemrograman Java adalah tipe data primitif yang digunakan untuk menyimpan angka bulat dalam rentang nilai dari `-128` hingga `127`. Tipe data byte mengambil 8 bit atau 1 byte dalam memori komputer. Karena ukuran yang relatif kecil ini, byte umumnya digunakan ketika Anda perlu menghemat memori, terutama saat Anda bekerja dengan sejumlah besar data yang memiliki rentang nilai yang sesuai. Penggunaan yang umum dari tipe data byte termasuk membaca atau menulis data biner, seperti file, dan juga ketika Anda bekerja dengan jaringan komputer atau perangkat keras yang mengharuskan Anda untuk memanipulasi data dalam bentuk byte. Selain itu, Anda dapat menggunakan tipe data byte untuk menghemat memori saat mengolah data yang memiliki rentang nilai yang sesuai.

## Short

Tipe data short dalam bahasa pemrograman Java adalah tipe data primitif yang digunakan untuk menyimpan angka bulat dalam rentang nilai yang lebih besar daripada byte. Tipe data short menggunakan `16 bit` atau `2 byte` dalam memori komputer. Rentang nilai yang dapat disimpan dalam tipe data short adalah dari `-32,768` hingga `32,767`

Short digunakan ketika Anda perlu menyimpan angka bulat yang lebih besar daripada yang dapat disimpan dalam tipe data byte, tetapi masih ingin menghemat memori dibandingkan dengan penggunaan tipe data int. Penggunaan yang umum dari tipe data short adalah dalam situasi di mana memori sangat penting dan nilai yang akan disimpan dalam variabel tidak melebihi rentang nilai yang disediakan oleh tipe data ini.

Contoh penggunaan tipe data short mungkin termasuk menyimpan data sensor, pengolahan audio, dan aplikasi yang memerlukan penggunaan memori yang lebih efisien daripada tipe data int. Namun, perlu diingat bahwa tipe data int lebih umum digunakan dalam sebagian besar aplikasi karena ukurannya yang cukup besar dan bisa menampung rentang nilai yang cukup besar.

## Int

Tipe data `int` dalam bahasa pemrograman Java adalah tipe data primitif yang digunakan untuk menyimpan angka bulat. `int` adalah singkatan dari "integer" yang berarti bilangan bulat. Tipe data `int` menggunakan 32 bit atau 4 byte dalam memori komputer.

Rentang nilai yang dapat disimpan dalam tipe data `int` adalah dari `-2.147.483.648` hingga `2.147.483.647` Tipe data `int` sangat umum digunakan dalam banyak aplikasi karena memiliki rentang nilai yang lebih dari cukup untuk sebagian besar kebutuhan. Ini adalah pilihan default yang baik ketika Anda perlu menyimpan angka bulat.

```java
public class NamaFile{
    public static void main(String [] args){
        int AngkaSaya = 70;
        System.out.println(AngkaSaya);
    }
}
```

## Long

Tipe data `long` dalam bahasa pemrograman Java adalah tipe data primitif yang digunakan untuk menyimpan angka bulat dalam rentang nilai yang lebih besar daripada `int`. `long` digunakan ketika Anda perlu menyimpan angka bulat yang lebih besar dan memerlukan rentang nilai yang lebih luas daripada yang disediakan oleh `int`. Tipe data `long` menggunakan 64 bit atau 8 byte dalam memori komputer.

Rentang nilai yang dapat disimpan dalam tipe data `long` sangat besar dan berkisar dari `-9.223.372.036.854.775.808` hingga `9.223.372.036.854.775.807` Ini membuatnya cocok untuk aplikasi yang memerlukan penyimpanan bilangan bulat yang sangat besar, seperti waktu dalam satuan nanodetik atau penghitungan yang sangat besar.

```java
public class NamaFile{
    public static void main(String[] args){
        long AngkaSaya = 1672841124524L;
        System.out.println(AngkaSaya)
    }
}
```

## Float

Dalam bahasa pemrograman Java, tipe data float digunakan untuk merepresentasikan bilangan desimal (floating-point) dengan presisi yang lebih rendah daripada tipe data double. Tipe data float menggunakan 32 bit dalam representasinya dan memiliki kisaran nilai yang lebih terbatas daripada double.

Float adalah tipe data pecahan yang memliki value dari `3.4e-038` sampai `3.4e+038`, penggunaan float diakhiri dengan value yang bertanda `f`:

```java
public class NamaFile{
    public static void main(String[] args){
        float AngkaSaya = 5.21f;
        System.out.println(AngkaSaya);
    }
}

```

- double

  double adalah tipe data pecahanyang memiliki value dari `1.7e−308` sampai `1.7e+308`, penggunaan double diakhiri dengan value yang bertanda **d**:

  ```java
  public class NamaFile{
      public static void main(String[] args){
          double AngkaSaya = 24.92d;
          System.out.println(AngkaSaya);
      }
  }
  ```
