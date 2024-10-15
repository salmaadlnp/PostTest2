package manajemenkantorpajak.model;

public abstract class Orang {
    private String nama;
    private final String id;

    public Orang(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public abstract void tampilkanInfo();
}
