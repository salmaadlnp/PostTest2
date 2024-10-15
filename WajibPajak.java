package manajemenkantorpajak.model;

import manajemenkantorpajak.crud.CrudOperations;
import java.util.ArrayList;

public class WajibPajak extends Orang implements CrudOperations {
    private double pendapatanTahunan;
    private static ArrayList<WajibPajak> daftarWajibPajak = new ArrayList<>();

    public WajibPajak(String nama, String id, double pendapatanTahunan) {
        super(nama, id);
        this.pendapatanTahunan = pendapatanTahunan;
    }

    public double getPendapatanTahunan() {
        return pendapatanTahunan;
    }

    public void setPendapatanTahunan(double pendapatanTahunan) {
        this.pendapatanTahunan = pendapatanTahunan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID Wajib Pajak: " + getId());
        System.out.println("Nama Wajib Pajak: " + getNama());
        System.out.println("Pendapatan Tahunan: " + pendapatanTahunan);
    }

    @Override
    public void tambah() {
        daftarWajibPajak.add(this);
        System.out.println("Wajib Pajak berhasil ditambahkan.");
    }

    @Override
    public void tampilkan() {
        for (WajibPajak wp : daftarWajibPajak) {
            wp.tampilkanInfo();
            System.out.println("------------");
        }
    }

    @Override
    public void hapus(int id) {
        daftarWajibPajak.remove(id);
        System.out.println("Wajib Pajak berhasil dihapus.");
    }

    @Override
    public void ubah(int id) {
        WajibPajak wajibPajak = daftarWajibPajak.get(id);
        wajibPajak.setNama("Nama Baru WP");
        wajibPajak.setPendapatanTahunan(50000000);
        System.out.println("Wajib Pajak berhasil diubah.");
    }
}
