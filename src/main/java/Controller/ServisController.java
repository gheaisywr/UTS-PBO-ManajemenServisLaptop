package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Komputer;
import model.Laptop;
import model.LaptopGaming;
import model.Pelanggan;
import model.Perangkat;
import model.Servis;

public class ServisController {

    private ArrayList<Servis> daftarServis = new ArrayList<>();
    private Scanner input;

    public ServisController(Scanner input) {

        this.input = input;

        // =========================
        // DUMMY DATA 1
        // =========================

        Pelanggan pelanggan1 = new Pelanggan(
                "P001",
                "James Chao",
                "081234567801",
                "Jl. P. Antasari Samarinda"
        );

        Perangkat perangkat1 = new Laptop(
                "L001",
                "ASUS",
                "VivoBook 14",
                "Keyboard beberapa tombol tidak berfungsi"
        );

        Servis servis1 = new Servis(
                "S001",
                "09-09-2026",
                "Diproses",
                250000,
                pelanggan1,
                perangkat1
        );

        daftarServis.add(servis1);

        // =========================
        // DUMMY DATA 2
        // =========================

        Pelanggan pelanggan2 = new Pelanggan(
                "P002",
                "Alya Putri",
                "081234567802",
                "Jl. S. Parman Samarinda"
        );

        Perangkat perangkat2 = new Komputer(
                "K001",
                "Lenovo",
                "ThinkCentre",
                "Komputer tidak menyala"
        );

        Servis servis2 = new Servis(
                "S002",
                "10-09-2026",
                "Menunggu",
                300000,
                pelanggan2,
                perangkat2
        );

        daftarServis.add(servis2);

        // =========================
        // DUMMY DATA 3
        // =========================

        Pelanggan pelanggan3 = new Pelanggan(
                "P003",
                "Rizky Maulana",
                "081234567803",
                "Jl. Juanda Samarinda"
        );

        Perangkat perangkat3 = new LaptopGaming(
                "LG001",
                "ASUS",
                "ROG Strix G15",
                "Layar laptop bergaris"
        );

        Servis servis3 = new Servis(
                "S003",
                "11-09-2026",
                "Selesai",
                450000,
                pelanggan3,
                perangkat3
        );

        daftarServis.add(servis3);

        // =========================
        // DUMMY DATA 4
        // =========================

        Pelanggan pelanggan4 = new Pelanggan(
                "P004",
                "Nadia Safitri",
                "081234567804",
                "Jl. Gatot Subroto Samarinda"
        );

        Perangkat perangkat4 = new Komputer(
                "K002",
                "HP",
                "ProDesk 400",
                "Hard disk bermasalah"
        );

        Servis servis4 = new Servis(
                "S004",
                "12-09-2026",
                "Diproses",
                500000,
                pelanggan4,
                perangkat4
        );

        daftarServis.add(servis4);
    }

    // =========================
    // CREATE
    // =========================

    public void tambahServis() {

        System.out.println("\n=== TAMBAH DATA SERVIS ===");

        // DATA PELANGGAN
        System.out.println("\n--- DATA PELANGGAN ---");

        String idPelanggan =
                inputTeks("ID Pelanggan: ");

        String nama =
                inputTeks("Nama: ");

        String noTelepon =
                inputNomorTelepon("No Telepon: ");

        String alamat =
                inputTeks("Alamat: ");

        // DATA PERANGKAT
        System.out.println("\n--- DATA PERANGKAT ---");

        int pilihanJenis = pilihJenisPerangkat();

        String idPerangkat =
                inputTeks("ID Perangkat: ");

        String merk =
                inputTeks("Merk: ");

        String tipe =
                inputTeks("Tipe: ");

        String kerusakan =
                inputTeks("Kerusakan: ");

        Perangkat perangkat;

        if (pilihanJenis == 1) {

            int pilihanLaptop = pilihJenisLaptop();

            if (pilihanLaptop == 1) {

                perangkat = new Laptop(
                        idPerangkat,
                        merk,
                        tipe,
                        kerusakan
                );

            } else {

                perangkat = new LaptopGaming(
                        idPerangkat,
                        merk,
                        tipe,
                        kerusakan
                );
            }

        } else {

            perangkat = new Komputer(
                    idPerangkat,
                    merk,
                    tipe,
                    kerusakan
            );
        }

        // DATA SERVIS
        System.out.println("\n--- DATA SERVIS ---");

        String idServis =
                inputTeks("ID Servis: ");

        if (cariServis(idServis) != null) {

            System.out.println(
                    "ID Servis sudah digunakan!"
            );

            return;
        }

        String tanggal =
                inputTanggal("Tanggal (DD-MM-YYYY): ");

        String status =
                pilihStatus();

        int biaya =
                inputBiaya("Biaya: Rp");

        // OBJECT PELANGGAN
        Pelanggan pelanggan = new Pelanggan(
                idPelanggan,
                nama,
                noTelepon,
                alamat
        );

        // OBJECT SERVIS
        Servis servis = new Servis(
                idServis,
                tanggal,
                status,
                biaya,
                pelanggan,
                perangkat
        );

        daftarServis.add(servis);

        System.out.println(
                "\nData servis berhasil ditambahkan."
        );
    }

    // =========================
    // READ
    // =========================

    public void tampilkanServis() {

        System.out.println("\n=== DAFTAR DATA SERVIS ===");

        if (daftarServis.isEmpty()) {

            System.out.println(
                    "Belum ada data servis."
            );

            return;
        }

        for (Servis servis : daftarServis) {

            servis.tampilkanInfo();

            System.out.println();
        }
    }

    // =========================
    // UPDATE
    // =========================

    public void ubahServis() {

        System.out.println("\n=== UBAH DATA SERVIS ===");

        String id =
                inputTeks("Masukkan ID Servis: ");

        Servis servis =
                cariServis(id);

        if (servis == null) {

            System.out.println(
                    "Data servis tidak ditemukan."
            );

            return;
        }

        System.out.println("\nData ditemukan:");

        servis.tampilkanInfo();

        System.out.println("\n--- Ubah Data Servis ---");

        String tanggalBaru =
                inputTanggal("Tanggal baru (DD-MM-YYYY): ");

        String statusBaru =
                pilihStatus();

        int biayaBaru =
                inputBiaya("Biaya baru: Rp");

        servis.setTanggal(tanggalBaru);
        servis.setStatus(statusBaru);
        servis.setBiaya(biayaBaru);

        System.out.println(
                "\nData servis berhasil diubah."
        );
    }

    // =========================
    // DELETE
    // =========================

    public void hapusServis() {

        System.out.println("\n=== HAPUS DATA SERVIS ===");

        String id =
                inputTeks("Masukkan ID Servis: ");

        Servis servis =
                cariServis(id);

        if (servis == null) {

            System.out.println(
                    "Data servis tidak ditemukan."
            );

            return;
        }

        System.out.println(
                "\nData yang akan dihapus:"
        );

        servis.tampilkanInfo();

        System.out.print(
                "\nYakin ingin menghapus? (y/n): "
        );

        String pilihan =
                input.nextLine().trim();

        while (!pilihan.equalsIgnoreCase("y")
                && !pilihan.equalsIgnoreCase("n")) {

            System.out.println(
                    "Masukkan hanya y atau n!"
            );

            System.out.print(
                    "Yakin ingin menghapus? (y/n): "
            );

            pilihan =
                    input.nextLine().trim();
        }

        if (pilihan.equalsIgnoreCase("y")) {

            daftarServis.remove(servis);

            System.out.println(
                    "Data servis berhasil dihapus."
            );

        } else {

            System.out.println(
                    "Penghapusan dibatalkan."
            );
        }
    }

    // =========================
    // SEARCH
    // =========================

    public void cariData() {

        System.out.println("\n=== CARI DATA SERVIS ===");

        String id =
                inputTeks("Masukkan ID Servis: ");

        Servis servis =
                cariServis(id);

        if (servis == null) {

            System.out.println(
                    "Data servis tidak ditemukan."
            );

        } else {

            System.out.println(
                    "\nData ditemukan:"
            );

            servis.tampilkanInfo();
        }
    }

    // =========================
    // CARI SERVIS
    // =========================

    private Servis cariServis(String id) {

        for (Servis servis : daftarServis) {

            if (servis.getIdServis()
                    .equalsIgnoreCase(id)) {

                return servis;
            }
        }

        return null;
    }

    // =========================
    // PILIH JENIS PERANGKAT
    // =========================

    private int pilihJenisPerangkat() {

        System.out.println("1. Laptop");
        System.out.println("2. Komputer");

        while (true) {

            int pilihan =
                    inputAngka("Pilih jenis perangkat: ");

            if (pilihan == 1 || pilihan == 2) {

                return pilihan;

            } else {

                System.out.println(
                        "Pilihan hanya 1 atau 2!"
                );
            }
        }
    }

    // =========================
    // PILIH JENIS LAPTOP
    // =========================

    private int pilihJenisLaptop() {

        System.out.println("\n--- JENIS LAPTOP ---");
        System.out.println("1. Laptop");
        System.out.println("2. Laptop Gaming");

        while (true) {

            int pilihan =
                    inputAngka("Pilih jenis laptop: ");

            if (pilihan == 1 || pilihan == 2) {

                return pilihan;

            } else {

                System.out.println(
                        "Pilihan hanya 1 atau 2!"
                );
            }
        }
    }

    // =========================
    // PILIH STATUS
    // =========================

    private String pilihStatus() {

        System.out.println("\nPilih Status Proses:");
        System.out.println("1. Menunggu");
        System.out.println("2. Diproses");
        System.out.println("3. Selesai");

        while (true) {

            int pilihan =
                    inputAngka("Pilih status: ");

            if (pilihan == 1) {

                return "Menunggu";

            } else if (pilihan == 2) {

                return "Diproses";

            } else if (pilihan == 3) {

                return "Selesai";

            } else {

                System.out.println(
                        "Pilihan hanya 1, 2, atau 3!"
                );
            }
        }
    }

    // =========================
    // VALIDASI TEKS
    // =========================

    private String inputTeks(String pesan) {

        while (true) {

            System.out.print(pesan);

            String hasil =
                    input.nextLine().trim();

            if (!hasil.isEmpty()) {

                return hasil;
            }

            System.out.println(
                    "Input tidak boleh kosong!"
            );
        }
    }

    // =========================
    // VALIDASI ANGKA
    // =========================

    private int inputAngka(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);

                int angka =
                        Integer.parseInt(
                                input.nextLine().trim()
                        );

                if (angka > 0) {

                    return angka;
                }

                System.out.println(
                        "Input harus lebih dari 0!"
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Input harus berupa angka!"
                );
            }
        }
    }

    // =========================
    // VALIDASI NOMOR TELEPON
    // =========================

    private String inputNomorTelepon(String pesan) {

        while (true) {

            System.out.print(pesan);

            String nomor =
                    input.nextLine().trim();

            if (nomor.isEmpty()) {

                System.out.println(
                        "Nomor telepon tidak boleh kosong!"
                );

            } else if (!nomor.matches("\\d+")) {

                System.out.println(
                        "Nomor telepon hanya boleh berisi angka!"
                );

            } else if (nomor.length() < 10
                    || nomor.length() > 13) {

                System.out.println(
                        "Nomor telepon harus 10-13 digit!"
                );

            } else {

                return nomor;
            }
        }
    }

    // =========================
    // VALIDASI TANGGAL
    // =========================

    private String inputTanggal(String pesan) {

        while (true) {

            System.out.print(pesan);

            String tanggal =
                    input.nextLine().trim();

            if (tanggal.isEmpty()) {

                System.out.println(
                        "Tanggal tidak boleh kosong!"
                );

            } else if (!tanggal.matches(
                    "\\d{2}-\\d{2}-\\d{4}"
            )) {

                System.out.println(
                        "Format tanggal harus DD-MM-YYYY!"
                );

            } else {

                String[] bagian =
                        tanggal.split("-");

                int hari =
                        Integer.parseInt(bagian[0]);

                int bulan =
                        Integer.parseInt(bagian[1]);

                int tahun =
                        Integer.parseInt(bagian[2]);

                if (bulan < 1 || bulan > 12) {

                    System.out.println(
                            "Bulan harus 01-12!"
                    );

                } else if (hari < 1 || hari > 31) {

                    System.out.println(
                            "Tanggal harus 01-31!"
                    );

                } else if (tahun < 2000
                        || tahun > 2100) {

                    System.out.println(
                            "Tahun tidak valid!"
                    );

                } else {

                    return tanggal;
                }
            }
        }
    }

    // =========================
    // VALIDASI BIAYA
    // =========================

    private int inputBiaya(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);

                int biaya =
                        Integer.parseInt(
                                input.nextLine().trim()
                        );

                if (biaya >= 0) {

                    return biaya;
                }

                System.out.println(
                        "Biaya tidak boleh negatif!"
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Biaya harus berupa angka!"
                );
            }
        }
    }
}
