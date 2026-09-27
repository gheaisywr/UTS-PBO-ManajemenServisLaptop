package model;

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

    public String getIdPerangkat() {
        return idPerangkat;
    }

    public String getMerk() {
        return merk;
    }

    public String getTipe() {
        return tipe;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public void tampilkanInfo() {

        System.out.println("ID Perangkat : " + idPerangkat);
        System.out.println("Merk         : " + merk);
        System.out.println("Tipe         : " + tipe);
        System.out.println("Kerusakan    : " + kerusakan);
    }
}