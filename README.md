# Sistem Pengelolaan Servis Laptop

------------------------------------------------------------------------

Program ini merupakan aplikasi berbasis **Command Line Interface (CLI)**
yang dibuat menggunakan bahasa pemrograman **Java** dengan menerapkan
konsep **Pemrograman Berorientasi Objek (PBO)**. Program ini dibuat
untuk memenuhi **Tugas UTS Project Pemrograman Berorientasi Objek.**

------------------------------------------------------------------------

## Identitas Mahasiswa

**Nama:** Ghea Aisyah Windraswari\
**NIM:** 2509116022\
**Program Studi:** Sistem Informasi\
**Instansi:** Universitas Mulawarman

------------------------------------------------------------------------

## 1. Studi Kasus

### Sistem Pengelolaan Servis Laptop

Program yang dibuat adalah **Sistem Pengelolaan Servis Laptop**. Program
ini digunakan untuk membantu mencatat dan mengelola data pelanggan, data
perangkat, serta data servis dalam satu sistem sederhana.

Program dijalankan melalui **Command Line Interface (CLI)** atau
terminal. Melalui menu yang tersedia, pengguna dapat menambahkan data
servis, melihat data yang sudah tersimpan, mengubah data servis,
menghapus data servis, dan mencari data berdasarkan ID servis.

Pada pengembangan terbaru, perangkat yang dapat dipilih terdiri dari dua
jenis, yaitu **Laptop** dan **Komputer**. Keduanya merupakan turunan
dari class `Perangkat`.

Dalam pembuatannya, program menggunakan konsep **Pemrograman
Berorientasi Objek (PBO)**. Data dan proses program dibagi ke dalam
beberapa class agar setiap class memiliki tugas yang lebih jelas.

### Fitur Program

Program ini memiliki beberapa fitur utama, yaitu:

1.  **Tambah Data Servis**\
    Digunakan untuk memasukkan data pelanggan, data perangkat, dan
    informasi servis.

2.  **Tampilkan Data Servis**\
    Digunakan untuk melihat seluruh data servis yang sudah tersimpan.

3.  **Ubah Data Servis**\
    Digunakan untuk mengubah tanggal, status, dan biaya servis
    berdasarkan ID servis.

4.  **Hapus Data Servis**\
    Digunakan untuk menghapus data servis. Sebelum data dihapus,
    pengguna akan diminta melakukan konfirmasi.

5.  **Cari Data Servis**\
    Digunakan untuk mencari data servis berdasarkan ID servis.

6.  **Keluar**\
    Digunakan untuk mengakhiri penggunaan program.

Selain fitur tersebut, program juga memiliki validasi input untuk
mengurangi kesalahan ketika pengguna memasukkan data.

------------------------------------------------------------------------

## 2. Struktur Package dan MVC (Nilai Tambah)

Program menggunakan struktur **MVC (Model-View-Controller)** agar bagian
data, tampilan, dan proses program dapat dipisahkan.

Struktur package program adalah:

``` text
ServisLaptop
│
├── model
│   ├── Pelanggan.java
│   ├── Perangkat.java
│   ├── Laptop.java
│   ├── Komputer.java
│   └── Servis.java
│
├── controller
│   └── ServisController.java
│
├── view
│   └── MenuView.java
│
└── com.mycompany.servislaptop
    └── ServisLaptop.java
```

### Penjelasan Package

#### `model`

Package `model` berisi class yang digunakan untuk merepresentasikan data
dalam program.

<img width="122" height="83" alt="image" src="https://github.com/user-attachments/assets/7b76992d-b12a-4258-b51c-5d26987bb13e" />

Class yang terdapat di dalamnya yaitu:

-   `Pelanggan`
-   `Perangkat`
-   `Laptop`
-   `Komputer`
-   `Servis`

#### `controller`

Package `controller` berisi `ServisController`.

<img width="154" height="41" alt="image" src="https://github.com/user-attachments/assets/b49be567-189e-4bf2-bc34-29a2f8eafe0d" />

Class ini bertugas mengatur proses utama pengelolaan data, seperti:

-   tambah data
-   tampil data
-   ubah data
-   hapus data
-   cari data
-   validasi input
-   penyimpanan data pada `ArrayList`
-   dummy data awal

#### `view`

Package `view` berisi `MenuView`.

<img width="118" height="28" alt="image" src="https://github.com/user-attachments/assets/24e6cb42-3d49-4491-bd69-e2b4d505ad21" />

Class ini digunakan untuk menampilkan menu utama dan menerima pilihan
menu dari pengguna.

#### Main Program

Class `ServisLaptop` digunakan sebagai titik awal ketika
program dijalankan. Class ini membuat object `MenuView` kemudian
menjalankan program.

<img width="154" height="27" alt="image" src="https://github.com/user-attachments/assets/9a9feb7e-6e22-4afb-9a71-e2f9d49eabb5" />

Dengan pembagian tersebut, setiap bagian program memiliki tugas yang
lebih jelas dan program menjadi lebih terorganisir.

------------------------------------------------------------------------

## 3. Struktur Class

Program menggunakan beberapa class yang memiliki fungsi berbeda.

### Class yang Digunakan

-   **Perangkat** → sebagai superclass yang menyimpan data umum
    perangkat.
-   **Laptop** → subclass dari `Perangkat` untuk jenis perangkat laptop.
-   **Komputer** → subclass dari `Perangkat` untuk jenis perangkat
    komputer.
-   **Pelanggan** → menyimpan informasi mengenai pelanggan.
-   **Servis** → menyimpan informasi mengenai proses servis.
-   **ServisController** → mengatur proses CRUD, validasi, dan
    penyimpanan data.
-   **MenuView** → menangani tampilan menu utama.
-   **ServisLaptop** → menjadi class utama untuk menjalankan
    program.

Hubungan inheritance pada program dapat digambarkan sebagai berikut:

``` text
                 Perangkat
                Superclass
                /        \
               /          \
              ▼            ▼
          Laptop        Komputer
          Subclass       Subclass
```

Class `Laptop` dan `Komputer` sama-sama mewarisi class `Perangkat`.

Class `Servis` memiliki object `Pelanggan` dan `Perangkat` sebagai
bagian dari data servis.

------------------------------------------------------------------------

## 4. Penjelasan Masing-Masing Class

### 4.1 `Perangkat`

Class `Perangkat` digunakan sebagai **superclass**. Class ini menyimpan
data umum yang dimiliki oleh perangkat.

Atribut yang terdapat pada class `Perangkat` yaitu:

-   `idPerangkat`
-   `merk`
-   `tipe`
-   `kerusakan`

Contoh:

``` java
public class Perangkat {

    private String idPerangkat;
    private String merk;
    private String tipe;
    private String kerusakan;

    public Perangkat(String idPerangkat, String merk,
            String tipe, String kerusakan) {

        this.idPerangkat = idPerangkat;
        this.merk = merk;
        this.tipe = tipe;
        this.kerusakan = kerusakan;
    }
}
```

Class ini menjadi dasar bagi jenis perangkat lain seperti `Laptop` dan
`Komputer`.

------------------------------------------------------------------------

### 4.2 `Laptop`

Class `Laptop` merupakan subclass dari `Perangkat`.

``` java
public class Laptop extends Perangkat {
```

Constructor `Laptop` menggunakan `super()` untuk memanggil constructor
dari class `Perangkat`.

``` java
super(idPerangkat, merk, tipe, kerusakan);
```

Class `Laptop` juga melakukan **method overriding** pada method
`tampilkanInfo()`.

``` java
@Override
public void tampilkanInfo() {
    System.out.println("Jenis        : Laptop");
    System.out.println("ID Laptop    : " + getIdPerangkat());
    System.out.println("Merk         : " + getMerk());
    System.out.println("Tipe         : " + getTipe());
    System.out.println("Kerusakan    : " + getKerusakan());
}
```

------------------------------------------------------------------------

### 4.3 `Komputer`

Class `Komputer` merupakan subclass kedua dari `Perangkat`.

``` java
public class Komputer extends Perangkat {
```

Class ini juga melakukan overriding terhadap method `tampilkanInfo()`.

``` java
@Override
public void tampilkanInfo() {
    System.out.println("Jenis        : Komputer");
    System.out.println("ID Komputer  : " + getIdPerangkat());
    System.out.println("Merk         : " + getMerk());
    System.out.println("Tipe         : " + getTipe());
    System.out.println("Kerusakan    : " + getKerusakan());
}
```

Dengan adanya `Laptop` dan `Komputer`, pengguna dapat memilih jenis
perangkat ketika melakukan tambah data servis.

------------------------------------------------------------------------

### 4.4 `Pelanggan`

Class `Pelanggan` digunakan untuk menyimpan data orang yang menggunakan
layanan servis.

Data yang disimpan terdiri dari:

-   `idPelanggan`
-   `nama`
-   `noTelepon`
-   `alamat`

Contoh:

``` java
public class Pelanggan {

    private String idPelanggan;
    private String nama;
    private String noTelepon;
    private String alamat;

    public Pelanggan(String idPelanggan, String nama,
            String noTelepon, String alamat) {

        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
    }
}
```

------------------------------------------------------------------------

### 4.5 `Servis`

Class `Servis` digunakan untuk menyimpan informasi mengenai proses
servis.

Atribut yang digunakan yaitu:

-   `idServis`
-   `tanggal`
-   `status`
-   `biaya`
-   `pelanggan`
-   `perangkat`

Contoh:

``` java
public class Servis {

    private String idServis;
    private String tanggal;
    private String status;
    private int biaya;

    private Pelanggan pelanggan;
    private Perangkat perangkat;
}
```

Object `Pelanggan` dan `Perangkat` disimpan di dalam object `Servis`
sehingga satu data servis memiliki informasi pelanggan dan perangkat
yang berkaitan.

------------------------------------------------------------------------

## 5. Inheritance

Inheritance diterapkan dengan menggunakan satu superclass dan dua
subclass.

Struktur inheritance pada program adalah:

``` text
                 Perangkat
                Superclass
                /        \
               /          \
              ▼            ▼
          Laptop        Komputer
          Subclass       Subclass
```

Class `Perangkat` menjadi superclass:

``` java
public class Perangkat {
```

Kemudian `Laptop` menjadi subclass:

``` java
public class Laptop extends Perangkat {
```

Dan `Komputer` menjadi subclass:

``` java
public class Komputer extends Perangkat {
```

Dengan penerapan inheritance, data umum seperti ID perangkat, merk,
tipe, dan kerusakan cukup didefinisikan pada `Perangkat`.

------------------------------------------------------------------------

## 6. Polymorphism (Nilai Tambah)

Program menerapkan **polymorphism melalui method overriding**.

Method `tampilkanInfo()` terdapat pada class `Perangkat`, kemudian
dioverride oleh `Laptop` dan `Komputer`.

``` java
@Override
public void tampilkanInfo()
```

Pada saat program membuat perangkat, tipe object dapat berupa `Laptop`
atau `Komputer`.

Contohnya:

``` java
Perangkat perangkat;

if (pilihanJenis == 1) {

    perangkat = new Laptop(
        idPerangkat,
        merk,
        tipe,
        kerusakan
    );

} else {

    perangkat = new Komputer(
        idPerangkat,
        merk,
        tipe,
        kerusakan
    );
}
```

Kemudian ketika method berikut dipanggil:

``` java
perangkat.tampilkanInfo();
```

Java akan menjalankan `tampilkanInfo()` sesuai dengan object yang
digunakan.

Jika object merupakan `Laptop`, maka method `tampilkanInfo()` dari class
`Laptop` yang digunakan.

Jika object merupakan `Komputer`, maka method `tampilkanInfo()` dari
class `Komputer` yang digunakan.

Dengan demikian, program telah menerapkan polymorphism melalui **method
overriding**.

------------------------------------------------------------------------

## 7. Encapsulation

Encapsulation diterapkan dengan membuat atribut pada class menggunakan
access modifier `private`.

Contohnya:

``` java
private String idPerangkat;
private String merk;
private String tipe;
private String kerusakan;
```

Dengan menggunakan `private`, atribut tidak dapat diakses secara
langsung dari luar class.

Untuk mengakses data tersebut, program menggunakan getter.

Contohnya:

``` java
public String getMerk() {
    return merk;
}
```

Sedangkan untuk mengubah data yang memang dapat diubah, program
menggunakan setter.

Contohnya pada class `Servis`:

``` java
public void setStatus(String status) {
    this.status = status;
}
```

Setter tersebut digunakan ketika proses ubah data servis.

------------------------------------------------------------------------

## 8. Access Modifier

Program menerapkan beberapa access modifier, yaitu `private` dan
`public`.

### `private`

Digunakan pada atribut agar data tidak dapat diakses secara langsung
dari luar class.

Contohnya:

``` java
private String nama;
private String noTelepon;
private String alamat;
```

### `public`

Digunakan pada class, constructor, getter, setter, dan method yang perlu
digunakan oleh bagian program lainnya.

Contohnya:

``` java
public void tambahServis()
```

Penggunaan access modifier mendukung penerapan encapsulation pada
program.

------------------------------------------------------------------------

## 9. Constructor dan Object

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

Contohnya pada class `Pelanggan`:

``` java
Pelanggan pelanggan = new Pelanggan(
    idPelanggan,
    nama,
    noTelepon,
    alamat
);
```

Object perangkat juga dibuat berdasarkan jenis yang dipilih pengguna.

Jika memilih Laptop:

``` java
Perangkat perangkat = new Laptop(
    idPerangkat,
    merk,
    tipe,
    kerusakan
);
```

Jika memilih Komputer:

``` java
Perangkat perangkat = new Komputer(
    idPerangkat,
    merk,
    tipe,
    kerusakan
);
```

Kemudian object tersebut digunakan untuk membuat object `Servis`:

``` java
Servis servis = new Servis(
    idServis,
    tanggal,
    status,
    biaya,
    pelanggan,
    perangkat
);
```

------------------------------------------------------------------------

## 10. Penggunaan ArrayList

Program menggunakan satu `ArrayList` untuk menyimpan data servis.

``` java
private ArrayList<Servis> daftarServis = new ArrayList<>();
```

Data pelanggan dan perangkat disimpan sebagai bagian dari object
`Servis`.

Dengan cara ini, data yang saling berhubungan tidak disimpan dalam
beberapa `ArrayList` yang terpisah.

Setelah object `Servis` dibuat, object tersebut dimasukkan ke dalam
`ArrayList`:

``` java
daftarServis.add(servis);
```

Data yang sudah tersimpan kemudian dapat digunakan untuk proses:

-   tampil
-   ubah
-   hapus
-   cari

------------------------------------------------------------------------

## 11. Dummy Data Awal

Program memiliki **dummy data awal** di dalam `ArrayList`.

Dummy data dibuat pada constructor `ServisController` sehingga ketika
program pertama kali dijalankan, data sudah tersedia tanpa harus
melakukan input terlebih dahulu.

Program memiliki empat dummy data:

``` text
=== DAFTAR DATA SERVIS ===
================================
           DATA SERVIS
================================

ID Pelanggan : P001
Nama         : James Chao
No Telepon   : 081234567801
Alamat       : Jl. P. Antasari Samarinda

Jenis        : Laptop
ID Laptop    : L001
Merk         : ASUS
Tipe         : VivoBook 14
Kerusakan    : Keyboard beberapa tombol tidak berfungsi

ID Servis    : S001
Tanggal      : 09-09-2026
Status       : Diproses
Biaya        : Rp250000
================================

================================
           DATA SERVIS
================================

ID Pelanggan : P002
Nama         : Alya Putri
No Telepon   : 081234567802
Alamat       : Jl. S. Parman Samarinda

Jenis        : Komputer
ID Komputer  : K001
Merk         : Lenovo
Tipe         : ThinkCentre
Kerusakan    : Komputer tidak menyala

ID Servis    : S002
Tanggal      : 10-09-2026
Status       : Menunggu
Biaya        : Rp300000
================================

================================
           DATA SERVIS
================================

ID Pelanggan : P003
Nama         : Rizky Maulana
No Telepon   : 081234567803
Alamat       : Jl. Juanda Samarinda

Jenis        : Laptop
ID Laptop    : L002
Merk         : Acer
Tipe         : Aspire 5
Kerusakan    : Layar laptop bergaris

ID Servis    : S003
Tanggal      : 11-09-2026
Status       : Selesai
Biaya        : Rp450000
================================

================================
           DATA SERVIS
================================

ID Pelanggan : P004
Nama         : Nadia Safitri
No Telepon   : 081234567804
Alamat       : Jl. Gatot Subroto Samarinda

Jenis        : Komputer
ID Komputer  : K002
Merk         : HP
Tipe         : ProDesk 400
Kerusakan    : Hard disk bermasalah

ID Servis    : S004
Tanggal      : 12-09-2026
Status       : Diproses
Biaya        : Rp500000
================================
```

Contohnya:

``` java
Servis servis1 = new Servis(
    "S001",
    "09-09-2026",
    "Diproses",
    250000,
    pelanggan1,
    perangkat1
);

daftarServis.add(servis1);
```

Dummy data tersebut membuat fitur **Tampilkan Data Servis** dapat
langsung digunakan ketika program baru dijalankan.

------------------------------------------------------------------------

## 12. Menu Utama

Program menggunakan menu sederhana berbasis CLI.

Menu yang tersedia:

``` text
================================
     SISTEM PENGELOLAAN SERVIS
================================
1. Tambah Data Servis
2. Tampilkan Data Servis
3. Ubah Data Servis
4. Hapus Data Servis
5. Cari Data Servis
6. Keluar
================================
```

Pengguna dapat memilih menu dengan memasukkan nomor pilihan.

Menu utama menggunakan `do-while`, sehingga program akan terus berjalan
sampai pengguna memilih menu **6. Keluar**.

------------------------------------------------------------------------

## 13. Percabangan Menu

Pilihan menu diproses menggunakan `switch-case`.

Contohnya:

``` java
switch (pilihan) {

    case 1:
        controller.tambahServis();
        break;

    case 2:
        controller.tampilkanServis();
        break;

    case 3:
        controller.ubahServis();
        break;

    case 4:
        controller.hapusServis();
        break;

    case 5:
        controller.cariData();
        break;

    case 6:
        System.out.println("\nProgram selesai.");
        break;

    default:
        System.out.println("\nPilihan menu tidak tersedia!");
}
```

Jika pengguna memilih angka 1 sampai 5, program akan menjalankan fitur
sesuai pilihan.

Jika pengguna memilih angka yang tidak tersedia, bagian `default` akan
dijalankan.

------------------------------------------------------------------------

## 14. Proses Tambah Data Servis

Proses tambah data dijalankan ketika pengguna memilih menu **1. Tambah
Data Servis**.

### Data Pelanggan

Pengguna memasukkan:

-   ID Pelanggan
-   Nama
-   Nomor Telepon
-   Alamat

### Data Perangkat

Pengguna terlebih dahulu memilih jenis perangkat:

``` text
1. Laptop
2. Komputer
```

Kemudian memasukkan:

-   ID Perangkat
-   Merk
-   Tipe
-   Kerusakan

### Data Servis

Selanjutnya pengguna memasukkan:

-   ID Servis
-   Tanggal
-   Status
-   Biaya

Status servis terdiri dari:

``` text
1. Menunggu
2. Diproses
3. Selesai
```

Setelah semua data dinyatakan valid, program membuat object `Pelanggan`,
`Perangkat`, dan `Servis`.

Object `Servis` kemudian dimasukkan ke dalam `ArrayList`.

------------------------------------------------------------------------

## 15. Proses Menampilkan Data

Menu **2. Tampilkan Data Servis** digunakan untuk menampilkan seluruh
data yang tersimpan.

Program melakukan perulangan terhadap `daftarServis`.

``` java
for (Servis servis : daftarServis) {

    servis.tampilkanInfo();

}
```

Informasi yang ditampilkan meliputi:

-   ID Pelanggan
-   Nama
-   Nomor Telepon
-   Alamat
-   Jenis Perangkat
-   ID Perangkat
-   Merk
-   Tipe
-   Kerusakan
-   ID Servis
-   Tanggal
-   Status
-   Biaya

Karena terdapat dummy data, data servis sudah langsung tampil ketika
fitur read dijalankan.

------------------------------------------------------------------------

## 16. Proses Mengubah Data

Menu **3. Ubah Data Servis** digunakan untuk mengubah data servis
berdasarkan ID Servis.

Pengguna memasukkan ID servis terlebih dahulu.

``` text
Masukkan ID Servis: S005
```

Jika data ditemukan, program akan menampilkan data tersebut.

Data yang dapat diubah adalah:

-   Tanggal
-   Status
-   Biaya

Status dapat dipilih kembali melalui pilihan:

``` text
1. Menunggu
2. Diproses
3. Selesai
```

Setter digunakan untuk menyimpan perubahan.

``` java
servis.setTanggal(tanggalBaru);
servis.setStatus(statusBaru);
servis.setBiaya(biayaBaru);
```

Jika ID servis tidak ditemukan, program akan menampilkan:

``` text
Data servis tidak ditemukan.
```

------------------------------------------------------------------------

## 17. Proses Menghapus Data

Menu **4. Hapus Data Servis** digunakan untuk menghapus data servis
berdasarkan ID servis.

Program terlebih dahulu mencari data berdasarkan ID.

Jika data ditemukan, data tersebut ditampilkan dan pengguna diminta
melakukan konfirmasi.

``` text
Yakin ingin menghapus? (y/n):
```

Jika pengguna memilih `y`, data akan dihapus:

``` java
daftarServis.remove(servis);
```

Jika pengguna memilih `n`, penghapusan dibatalkan.

Program juga melakukan validasi agar pengguna hanya memasukkan `y` atau
`n`.

------------------------------------------------------------------------

## 18. Proses Pencarian Data

Menu **5. Cari Data Servis** digunakan untuk mencari data berdasarkan ID
servis.

Pengguna memasukkan ID servis:

``` text
Masukkan ID Servis: S005
```

Program kemudian melakukan pencarian pada `daftarServis`.

Jika data ditemukan, informasi servis akan ditampilkan.

Jika tidak ditemukan:

``` text
Data servis tidak ditemukan.
```

Fitur ini membantu pengguna menemukan data tertentu tanpa harus melihat
seluruh data servis.

------------------------------------------------------------------------

## 19. Validasi Input

Program menerapkan validasi input untuk mengurangi kesalahan ketika
pengguna memasukkan data.

### Validasi Teks

Input teks tidak boleh kosong.

``` text
Input tidak boleh kosong!
```

Validasi ini digunakan pada data seperti:

-   ID Pelanggan
-   Nama
-   Alamat
-   ID Perangkat
-   Merk
-   Tipe
-   Kerusakan
-   ID Servis

### Validasi Nomor Telepon

Nomor telepon harus:

-   tidak kosong
-   hanya berisi angka
-   memiliki panjang 10--13 digit

Contoh:

``` text
No Telepon: fhuiah
Nomor telepon hanya boleh berisi angka!
```

Jika nomor terlalu pendek:

``` text
No Telepon: 0493204
Nomor telepon harus 10-13 digit!
```

### Validasi Jenis Perangkat

Jenis perangkat hanya dapat dipilih:

``` text
1. Laptop
2. Komputer
```

Jika pengguna memasukkan pilihan lain:

``` text
Pilih jenis perangkat: 3
Pilihan hanya 1 atau 2!
```

### Validasi Status

Status hanya dapat dipilih:

``` text
1. Menunggu
2. Diproses
3. Selesai
```

### Validasi Tanggal

Format tanggal yang digunakan adalah:

``` text
DD-MM-YYYY
```

Contoh format yang benar:

``` text
22-04-2026
```

Program menolak format lain seperti:

``` text
04/06/2026
```

Program juga memeriksa bulan agar berada pada rentang `01-12`.

Contoh:

``` text
20-13-2026
Bulan harus 01-12!
```

### Validasi Biaya

Biaya harus berupa angka dan tidak boleh negatif.

Contoh ketika memasukkan huruf:

``` text
Biaya: Rpabcde
Biaya harus berupa angka!
```

### Validasi ID Servis

ID Servis tidak boleh sama dengan ID servis yang sudah tersimpan.

Jika ID sudah digunakan:

``` text
ID Servis sudah digunakan!
```

------------------------------------------------------------------------

## 20. Perulangan Program

Program menggunakan beberapa jenis perulangan.

### `do-while`

Digunakan pada menu utama agar program terus berjalan sampai pengguna
memilih menu 6.

``` java
do {

    tampilkanMenu();

    pilihan = inputAngka("Pilih menu: ");

    switch (pilihan) {
        // proses menu
    }

} while (pilihan != 6);
```

### `for`

Digunakan untuk membaca data yang terdapat dalam `ArrayList`.

``` java
for (Servis servis : daftarServis) {
    servis.tampilkanInfo();
}
```

### `while`

Digunakan pada proses validasi input.

``` java
while (true) {
    // meminta input
    // memeriksa input
}
```

Jika input salah, program akan meminta pengguna memasukkan data kembali.

------------------------------------------------------------------------

## 21. Percabangan `if-else`

Selain `switch-case`, program juga menggunakan `if-else` untuk
menentukan kondisi tertentu.

Contohnya pada pemilihan jenis perangkat:

``` java
if (pilihanJenis == 1) {

    perangkat = new Laptop(
        idPerangkat,
        merk,
        tipe,
        kerusakan
    );

} else {

    perangkat = new Komputer(
        idPerangkat,
        merk,
        tipe,
        kerusakan
    );
}
```

`if-else` juga digunakan pada proses validasi, pencarian data, dan
pengecekan kondisi lainnya.

------------------------------------------------------------------------

# 22. Dokumentasi Output Program

Berikut merupakan dokumentasi hasil pengujian program terbaru.

## 22.1 Tambah Data Servis

Pada pengujian ini, pengguna memilih menu **1. Tambah Data Servis**.

Pengguna memasukkan data pelanggan, memilih jenis perangkat **Laptop**,
memasukkan data perangkat, kemudian memasukkan data servis.

Data berhasil ditambahkan dengan ID servis `S005`.

<img width="191" height="284" alt="Screenshot 2026-09-24 072932" src="https://github.com/user-attachments/assets/c0a6fb14-3ca1-4470-8cae-f133f97c61ef" />


Program menampilkan:

``` text
Data servis berhasil ditambahkan.
```
<img width="193" height="113" alt="Screenshot 2026-09-24 072941" src="https://github.com/user-attachments/assets/039f0cc9-1106-442f-9aee-6024cf2a294a" />

------------------------------------------------------------------------

## 22.2 Tampilkan Data Servis

Pengguna memilih menu **2. Tampilkan Data Servis**.

Program menampilkan dummy data yang sudah tersedia serta data `S005`
yang baru ditambahkan.

<img width="317" height="299" alt="Screenshot 2026-09-24 073011" src="https://github.com/user-attachments/assets/99b0f1b4-c1d9-4509-990c-2fa7b74a443b" />

<img width="223" height="266" alt="Screenshot 2026-09-24 073022" src="https://github.com/user-attachments/assets/97e33d83-fe08-4bf5-a41d-a080cf4c5c61" />

<img width="247" height="266" alt="Screenshot 2026-09-24 073044" src="https://github.com/user-attachments/assets/ca387ffd-3f01-4dc2-9f61-695215d54dc6" />

<img width="212" height="262" alt="Screenshot 2026-09-24 073034" src="https://github.com/user-attachments/assets/b078e1fd-46d5-41f6-a570-a83f254903cb" />

<img width="199" height="263" alt="Screenshot 2026-09-24 073057" src="https://github.com/user-attachments/assets/d833f3b1-4531-4167-9311-e9d7b2bda53e" />

Data yang ditampilkan terdiri dari data pelanggan, perangkat, dan
servis.

------------------------------------------------------------------------

## 22.3 Ubah Data Servis

Pengguna memilih menu **3. Ubah Data Servis** dan memasukkan ID `S005`.

Data ditemukan kemudian pengguna mengubah:

<img width="203" height="335" alt="Screenshot 2026-09-24 073227" src="https://github.com/user-attachments/assets/0e4916c6-25d8-494a-b2fc-5304da16c39f" />

``` text
Tanggal : 22-04-2026 → 23-04-2026
Status  : Menunggu → Diproses
Biaya   : Rp200000 → Rp205000
```

Program menampilkan:

``` text
Data servis berhasil diubah.
```
<img width="215" height="155" alt="Screenshot 2026-09-24 073235" src="https://github.com/user-attachments/assets/04cc43e2-522a-4cec-a2b6-8113930cf348" />

------------------------------------------------------------------------

## 22.4 Cari Data Servis

Pengguna memilih menu **5. Cari Data Servis** dan memasukkan ID `S005`.

Program berhasil menemukan data dan menampilkan data terbaru setelah
proses perubahan.

<img width="185" height="335" alt="Screenshot 2026-09-24 073314" src="https://github.com/user-attachments/assets/8df42577-8a6c-4ed6-b5a4-8e3fa3be18c3" />


------------------------------------------------------------------------

## 22.5 Hapus Data Servis

Pengguna memilih menu **4. Hapus Data Servis** dan memasukkan ID `S005`.

Program menampilkan data yang akan dihapus dan meminta konfirmasi:

``` text
Yakin ingin menghapus? (y/n):
```

<img width="183" height="37" alt="Screenshot 2026-09-24 073441" src="https://github.com/user-attachments/assets/732ccaec-c116-46d6-9cb3-3cb2764a60de" />

Ketika pengguna memilih `n`, program membatalkan penghapusan.


<img width="188" height="359" alt="Screenshot 2026-09-24 073419" src="https://github.com/user-attachments/assets/6cd50d26-20f7-471e-868b-519a503cd3ab" />


Setelah data dihapus dengan pilihan `y`, data `S005` tidak lagi
ditemukan ketika dilakukan pencarian.

<img width="167" height="74" alt="Screenshot 2026-09-24 073506" src="https://github.com/user-attachments/assets/5ec9c626-0658-4479-b42a-eb50b70e5bd9" />
<img width="229" height="52" alt="Screenshot 2026-09-24 073552" src="https://github.com/user-attachments/assets/c57b3bcc-c34a-4816-9eab-22eb20d2130a" />

------------------------------------------------------------------------

# 23. Pengujian Validasi Input

Program juga diuji menggunakan beberapa input yang tidak sesuai.

### 1. Validasi Nomor Telepon

Ketika pengguna memasukkan huruf:

``` text
No Telepon: fhuiah
Nomor telepon hanya boleh berisi angka!
```

<img width="229" height="52" alt="Screenshot 2026-09-24 073552" src="https://github.com/user-attachments/assets/722e3fe4-98c2-471d-9b91-8badeeafa7e6" />


Ketika nomor kurang dari 10 digit:

``` text
No Telepon: 0493204
Nomor telepon harus 10-13 digit!
```

<img width="186" height="28" alt="Screenshot 2026-09-24 073607" src="https://github.com/user-attachments/assets/a300417f-1fa1-4ca6-9eee-adf3cfc493d9" />

------------------------------------------------------------------------

### 2. Validasi Jenis Perangkat

Ketika pengguna memasukkan pilihan `3`:

``` text
Pilih jenis perangkat: 3
Pilihan hanya 1 atau 2!
```

<img width="144" height="62" alt="Screenshot 2026-09-24 073640" src="https://github.com/user-attachments/assets/89cf593f-e6eb-4047-997d-847ea6bdd29b" />

------------------------------------------------------------------------

### 3. Validasi Tanggal

Program menggunakan format:

``` text
DD-MM-YYYY
```

Ketika pengguna memasukkan:

``` text
04/06/2026
```

program menampilkan:

``` text
Format tanggal harus DD-MM-YYYY!
```

<img width="184" height="26" alt="format " src="https://github.com/user-attachments/assets/b8bd2c87-1f71-4deb-b837-9ed8a95df164" />


Program juga memeriksa bulan.

Contohnya:

``` text
20-13-2026
Bulan harus 01-12!
```

<img width="184" height="26" alt="bulan" src="https://github.com/user-attachments/assets/c160ea79-f2c7-4ff8-a969-d012e4d2f324" />

------------------------------------------------------------------------

### 4. Validasi Biaya

Ketika pengguna memasukkan huruf pada biaya:

``` text
Biaya: Rpabcde
Biaya harus berupa angka!
```

<img width="149" height="53" alt="Screenshot 2026-09-24 074104" src="https://github.com/user-attachments/assets/0dc400a2-8a8b-4d89-9de3-9ea7f5bd134a" />

------------------------------------------------------------------------

### 5. Validasi Input Kosong

Program juga menolak input yang kosong.

Contohnya:

``` text
Tanggal (DD-MM-YYYY):
Tanggal tidak boleh kosong!
```


<img width="184" height="26" alt="kosong" src="https://github.com/user-attachments/assets/b8ad9abf-1157-409d-a7b5-f3d6de88445d" />


------------------------------------------------------------------------

# 24. Penerapan Konsep PBO

Dalam program ini, beberapa konsep dasar Pemrograman Berorientasi Objek
diterapkan secara langsung.

### 1. Class

Program memiliki beberapa class:

``` text
Pelanggan
Perangkat
Laptop
Komputer
Servis
ServisController
MenuView
ManajemenServisLaptop
```

Setiap class memiliki tugas masing-masing.

### 2. Object

Object dibuat menggunakan keyword `new`.

Contohnya:

``` java
Pelanggan pelanggan = new Pelanggan(...);
```

dan:

``` java
Perangkat perangkat = new Laptop(...);
```

### 3. Constructor

Constructor digunakan untuk memberikan nilai awal ketika object dibuat.

### 4. Encapsulation

Encapsulation diterapkan dengan membuat atribut menggunakan `private`
dan mengaksesnya menggunakan getter dan setter.

### 5. Access Modifier

Program menggunakan `private` dan `public` untuk mengatur hak akses
terhadap class, atribut, constructor, dan method.

### 6. Inheritance

Inheritance diterapkan dengan hubungan:

``` text
Perangkat
   ├── Laptop
   └── Komputer
```

### 7. Polymorphism

Polymorphism diterapkan menggunakan method overriding pada
`tampilkanInfo()` di class `Laptop` dan `Komputer`.

### 8. ArrayList

`ArrayList<Servis>` digunakan untuk menyimpan kumpulan data servis
selama program berjalan.

### 9. Validasi Input

Validasi digunakan untuk memastikan data yang dimasukkan pengguna sesuai
dengan kebutuhan program.

------------------------------------------------------------------------

# 25. Alur Program

Alur program secara sederhana adalah:

``` text
                    MULAI
                      │
                      ▼
                Tampilkan Menu
                      │
                      ▼
              Pilih Menu 1 - 6
                      │
       ┌──────────────┼──────────────┐
       │              │              │
       ▼              ▼              ▼
     Tambah         Tampil          Ubah
       │              │              │
       └──────────────┼──────────────┘
                      │
              ┌───────┴───────┐
              │               │
              ▼               ▼
            Hapus            Cari
              │               │
              └───────┬───────┘
                      │
                      ▼
                Kembali ke Menu
                      │
                      ▼
              Pilih Menu 6
                      │
                      ▼
                   SELESAI
```

Program akan terus menampilkan menu sampai pengguna memilih pilihan **6.
Keluar**.

------------------------------------------------------------------------

# 26. Cara Menjalankan Program

Program dapat dijalankan menggunakan NetBeans.

1. Buka project `ManajemenServisLaptop` di NetBeans.
2. Pastikan seluruh package dan class sudah tersedia.
3. Buka class `ManajemenServisLaptop`.
4. Jalankan program dengan memilih **Run Project** atau menekan tombol **Run**.
5. Program akan menampilkan menu utama pada terminal.
6. Masukkan nomor menu sesuai fitur yang ingin digunakan.

Menu utama terdiri dari:
- 1. Tambah Data Servis
- 2. Tampilkan Data Servis
- 3. Ubah Data Servis
- 4. Hapus Data Servis
- 5. Cari Data Servis
- 6. Keluar

# 27. Kesimpulan

Berdasarkan program yang telah dibuat, **Sistem Manajemen Servis
Laptop** dapat digunakan untuk membantu proses pencatatan dan
pengelolaan data pelanggan, perangkat, serta servis melalui terminal.

Program menyediakan fitur tambah, tampil, ubah, hapus, dan cari data
servis. Data disimpan menggunakan `ArrayList<Servis>` sehingga data
pelanggan dan perangkat yang berkaitan dapat disimpan dalam satu object
servis.

Dalam pengembangannya, program menerapkan konsep Pemrograman
Berorientasi Objek seperti class, object, constructor, encapsulation,
access modifier, getter dan setter.

Program juga menerapkan **inheritance** dengan `Perangkat` sebagai
superclass dan `Laptop` serta `Komputer` sebagai subclass.

Selain itu, program menerapkan **polymorphism melalui method
overriding**, karena `Laptop` dan `Komputer` memiliki implementasi
`tampilkanInfo()` masing-masing.

Program juga menggunakan struktur **MVC** yang memisahkan bagian model,
controller, dan view agar program lebih terorganisir.

Untuk mengurangi kesalahan input, program dilengkapi dengan berbagai
validasi seperti validasi input kosong, nomor telepon, jenis perangkat,
status, tanggal, biaya, dan ID servis.

Program juga memiliki **dummy data awal sebanyak empat data** sehingga
data langsung dapat ditampilkan ketika fitur read dijalankan.

Dengan penerapan tersebut, program dapat menjalankan proses CRUD
sekaligus menerapkan konsep PBO dan struktur program yang lebih
terorganisir.
