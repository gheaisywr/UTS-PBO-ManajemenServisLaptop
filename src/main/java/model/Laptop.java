package model;

public class Laptop extends Perangkat {

    public Laptop(String idPerangkat, String merk,
            String tipe, String kerusakan) {

        super(idPerangkat, merk, tipe, kerusakan);
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("Jenis        : Laptop");
        System.out.println("ID Laptop    : " + getIdPerangkat());
        System.out.println("Merk         : " + getMerk());
        System.out.println("Tipe         : " + getTipe());
        System.out.println("Kerusakan    : " + getKerusakan());
    }
}