package view;

import controller.ServisController;
import java.util.Scanner;

public class MenuView {

    private Scanner input;
    private ServisController controller;

    public MenuView() {

        input = new Scanner(System.in);
        controller = new ServisController(input);
    }

    public void jalankan() {

        int pilihan;

        do {

            tampilkanMenu();

            pilihan =
                    inputAngka("Pilih menu: ");

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
                    System.out.println(
                            "\nProgram selesai."
                    );
                    break;

                default:
                    System.out.println(
                            "\nPilihan menu tidak tersedia!"
                    );
            }

        } while (pilihan != 6);
    }

    private void tampilkanMenu() {

        System.out.println();
        System.out.println("================================");
        System.out.println("     SISTEM PENGELOLAAN SERVIS");
        System.out.println("================================");
        System.out.println("1. Tambah Data Servis");
        System.out.println("2. Tampilkan Data Servis");
        System.out.println("3. Ubah Data Servis");
        System.out.println("4. Hapus Data Servis");
        System.out.println("5. Cari Data Servis");
        System.out.println("6. Keluar");
        System.out.println("================================");
    }

    private int inputAngka(String pesan) {

        while (true) {

            try {

                System.out.print(pesan);

                int angka =
                        Integer.parseInt(
                                input.nextLine().trim()
                        );

                return angka;

            } catch (NumberFormatException e) {

                System.out.println(
                        "Input harus berupa angka!"
                );
            }
        }
    }
}