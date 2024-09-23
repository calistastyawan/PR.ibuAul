import java.util.Scanner;

public class dua {
    public static void main(String[] args) {
        int jumlah_siswa;
        int nilai_siswa;
        int absensi_siswa;
        double Totalsemua_nilai=0;
        double rata_rata_siswa;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jumlah Siswa");
        jumlah_siswa=scanner.nextInt();
        System.out.println("----------------------------------------------");
        for(absensi_siswa=1; absensi_siswa<=jumlah_siswa;absensi_siswa++){
            System.out.println("Masukkan Nilai Siswa ke-"+ absensi_siswa+":");
            nilai_siswa = scanner.nextInt();
            Totalsemua_nilai += nilai_siswa;
        }
        System.out.println("----------------------------------------------");
        rata_rata_siswa = Totalsemua_nilai/jumlah_siswa;
        System.out.println("Rata rata nilai dari"+jumlah_siswa+"siswa adalah:"+rata_rata_siswa);
    }
}
