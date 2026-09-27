package model;

public class Komputer extends Perangkat {

    public Komputer(String idPerangkat, String merk,
            String tipe, String kerusakan) {

        super(idPerangkat, merk, tipe, kerusakan);
    }

    @Override
    public void tampilkanInfo() {

        System.out.println("Jenis        : Komputer");
        System.out.println("ID Komputer  : " + getIdPerangkat());
        System.out.println("Merk         : " + getMerk());
        System.out.println("Tipe         : " + getTipe());
        System.out.println("Kerusakan    : " + getKerusakan());
    }
}