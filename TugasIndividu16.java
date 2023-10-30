import java.util.Scanner;

public class TugasIndividu16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int banyElm = 0;
        double rata2 = 0;
        int nilTerendah = 0;
        int nilTertinggi = 0;
        int total = 0;

        System.out.println("Masukkan Banyak Elemen :");
        banyElm = sc.nextInt();
        int[] nilElm = new int[banyElm];

        for (int i = 0; i < nilElm.length; i++) {
            System.out.print("Masukkan Nilai Elemen ke-" + (i + 1) + " : ");
            nilElm[i] = sc.nextInt();

            if (i == 0) {
                // Inisialisasi nilai tertinggi dan terendah dengan nilai pertama
                nilTertinggi = nilElm[i];
                nilTerendah = nilElm[i];
            }

            if (nilElm[i] > nilTertinggi) {
                nilTertinggi = nilElm[i];
            }
            if (nilElm[i] < nilTerendah) {
                nilTerendah = nilElm[i];
            }

            total += nilElm[i];
        }

        rata2 = (double) total / banyElm;

        System.out.println("Nilai tertinggi: " + nilTertinggi);
        System.out.println("Nilai terendah: " + nilTerendah);
        System.out.println("Rata-rata nilai: " + rata2);

        sc.close();
    }
}
