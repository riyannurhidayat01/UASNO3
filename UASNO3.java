import java.util.ArrayList;
        import java.util.Calendar;

    public class UASNO3 {
        public static void main(String[] args) {
            ArrayList<String> namaPasien = new ArrayList<>();
            ArrayList<Integer> umurPasien = new ArrayList<>();
            ArrayList<Boolean> statusVaksin = new ArrayList<>();

            // Mengisi ArrayList dengan data pasien
            for (int i = 0; i < 105; i++) {
                namaPasien.add("Pasien " + (i + 1));
                umurPasien.add((int) (Math.random() * 60) + 20); // Umur antara 20-79 tahun
                statusVaksin.add(false); // Semua pasien belum divaksin
            }

            // Menampilkan data pasien
            System.out.println("Data Pasien COVID-19:");
            for (int i = 0; i < 105; i++) {
                System.out.println("Nama: " + namaPasien.get(i) +
                        ", Umur: " + umurPasien.get(i) +
                        ", Status Vaksin: " + (statusVaksin.get(i) ? "Sudah" : "Belum"));
            }

            // Menghitung dan menampilkan perkiraan tahun lahir
            System.out.println("\nPerkiraan Tahun Lahir Pasien:");
            ArrayList<Integer> tahunLahir = new ArrayList<>();
            int tahunSekarang = Calendar.getInstance().get(Calendar.YEAR);
            for (int i = 0; i < 105; i++) {
                tahunLahir.add(tahunSekarang - umurPasien.get(i));
                System.out.println("Pasien " + (i + 1) + ": " + tahunLahir.get(i));

            }
        }
    }




