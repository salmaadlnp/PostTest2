package manajemenkantorpajak.model;

import manajemenkantorpajak.crud.CrudOperations;
import java.util.ArrayList;

public class Pegawai extends Orang implements CrudOperations {
    private String jabatan;
    private static ArrayList<Pegawai> daftarPegawai = new ArrayList<>();

    public Pegawai(String nama, String id, String jabatan) {
        super(nama, id);
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID Pegawai: " + getId());
        System.out.println("Nama Pegawai: " + getNama());
        System.out.println("Jabatan: " + jabatan);
    }

    @Override
    public void tambah() {
        daftarPegawai.add(this);
        System.out.println("Pegawai berhasil ditambahkan.");
    }

    @Override
    public void tampilkan() {
        for (Pegawai p : daftarPegawai) {
            p.tampilkanInfo();
            System.out.println("------------");
        }
    }

    @Override
    public void hapus(int id) {
        daftarPegawai.remove(id);
        System.out.println("Pegawai berhasil dihapus.");
    }

    @Override
    public void ubah(int id) {
        Pegawai pegawai = daftarPegawai.get(id);
        pegawai.setNama("Nama Baru");
        pegawai.setJabatan("Jabatan Baru");
        System.out.println("Pegawai berhasil diubah.");
    }
}
