package model;

public class LaptopGaming extends Laptop {

    public LaptopGaming(String idPerangkat, String merk,
            String tipe, String kerusakan) {

        super(idPerangkat, merk, tipe, kerusakan);
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("Jenis        : Laptop Gaming");
        System.out.println("ID Perangkat : " + getIdPerangkat());
        System.out.println("Merk         : " + getMerk());
        System.out.println("Tipe         : " + getTipe());
        System.out.println("Kerusakan    : " + getKerusakan());
    }
}
