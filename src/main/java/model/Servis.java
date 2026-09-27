package model;

public class Servis {

    private String idServis;
    private String tanggal;
    private String status;
    private int biaya;

    private Pelanggan pelanggan;
    private Perangkat perangkat;

    public Servis(String idServis, String tanggal,
            String status, int biaya,
            Pelanggan pelanggan, Perangkat perangkat) {

        this.idServis = idServis;
        this.tanggal = tanggal;
        this.status = status;
        this.biaya = biaya;
        this.pelanggan = pelanggan;
        this.perangkat = perangkat;
    }

    public String getIdServis() {
        return idServis;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getStatus() {
        return status;
    }

    public int getBiaya() {
        return biaya;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public Perangkat getPerangkat() {
        return perangkat;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public void tampilkanInfo() {

        System.out.println("================================");
        System.out.println("           DATA SERVIS");
        System.out.println("================================");

        System.out.println();

        System.out.println("ID Pelanggan : "
                + pelanggan.getIdPelanggan());

        System.out.println("Nama         : "
                + pelanggan.getNama());

        System.out.println("No Telepon   : "
                + pelanggan.getNoTelepon());

        System.out.println("Alamat       : "
                + pelanggan.getAlamat());

        System.out.println();

        perangkat.tampilkanInfo();

        System.out.println();

        System.out.println("ID Servis    : " + idServis);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Status       : " + status);
        System.out.println("Biaya        : Rp" + biaya);

        System.out.println("================================");
    }
}