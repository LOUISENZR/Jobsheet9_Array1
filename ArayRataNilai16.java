import java.util.Scanner;
public class ArayRataNilai16 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double total = 0;
    double rata2 = 0;
    int jumlahLulus = 0;
    int jumlahMahasiswa = 0;

    System.out.println("Masukan Jumlah mahasiswa :");
    jumlahMahasiswa = sc.nextInt();
    int[] nilaiMhs = new int [jumlahMahasiswa];

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukan nilai mahasiswa ke="+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i  < nilaiMhs.length; i++){

            if (nilaiMhs[i] > 70){
                jumlahLulus++;
            }
            total += nilaiMhs[i];
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa lulus :" +jumlahLulus);;
        sc.close();
 }   
}
