package manajemenkantorpajak.main;

import manajemenkantorpajak.model.Pegawai;
import manajemenkantorpajak.model.WajibPajak;
import manajemenkantorpajak.utils.DataHelper;

public class Main {
    public static void main(String[] args) {
        // Tambah data pegawai
        Pegawai pegawai = new Pegawai("John Doe", "P001", "Admin");
        pegawai.tambah();
        pegawai.tampilkan();

        // Tambah data wajib pajak
        WajibPajak wp = new WajibPajak("Jane Doe", "W001", 60000000);
        wp.tambah();
        wp.tampilkan();

        // Hitung pajak
        System.out.println("Pajak yang harus dibayar Jane: " + DataHelper.hitungPajak(wp.getPendapatanTahunan()));
    }
}
