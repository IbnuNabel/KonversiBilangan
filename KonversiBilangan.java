package KonversiBilangan;

import java.util.Scanner;

// Nama         : Ibnu Nabel Fauzi
// NIM          : 235150201111040
// Kelas        : TIF - C
// Mata Kuliah  : Arsitektur dan Organisasi Komputer

// Sumber Referensi //
// Biner ke Desimal             : https://www.duniailkom.com/latihan-kode-program-java-cara-konversi-biner-ke-desimal/
// Desimal ke Biner             : https://www.duniailkom.com/latihan-kode-program-java-cara-konversi-desimal-ke-biner/
// Konversi Bilangan yang Lain  : https://www.elangsakti.com/2013/03/konversi-bilangan-biner-desimal-dan.html#:~:text=String%20bin2%20%3D%20Integer.toBinaryString%28Integer.valueOf%28hex%2C%2016%29%29%3B%20System.out.println%28bin2%29%3B%20%2F%2F,biner%20ke%20hexa%20String%20hex2%20%3D%20Integer.toHexString%28Integer.valueOf%28bin%2C%202%29%29%3B

public class KonversiBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int pilihan, angka_masukan, angka_konversi=0, digit, a=1;
        int[] arr = new int[32];
        String biner, hexa;
                
        do{
        System.out.println("""
                           Menu Konversi Bilangan :
                           1. Biner ke Desimal
                           2. Desimal ke Biner
                           3. Biner ke Hexadesimal
                           4. Hexadesimal ke Biner
                           5. Desimal ke Hexadesimal
                           6. Hexadesimal ke Desimal
                           0. Keluar""");
        System.out.print("User : ");
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 0:
                break;
                
            case 1:
                System.out.println("======================================================");
                System.out.print("Masukkan bilangan biner : ");
                angka_masukan = input.nextInt();
                System.out.print("Bilangan desimal dari " + angka_masukan + " adalah ");
                while (angka_masukan != 0){
                    digit = angka_masukan % 10;
                    angka_konversi += (digit*a);
                    a*=2;
                    angka_masukan/=10;
                }
                System.out.println(angka_konversi);
                break;
            
            case 2:
                System.out.println("======================================================");
                System.out.print("Masukkan bilangan desimal : ");
                angka_masukan = input.nextInt();
                System.out.print("Bilangan biner dari " + angka_masukan + " adalah ");
                for (angka_konversi=0; angka_masukan > 0; angka_konversi++){
                    arr[angka_konversi] = angka_masukan % 2;
                    angka_masukan /= 2;
                }
                for (angka_konversi = angka_konversi-1; angka_konversi >= 0; angka_konversi--){
                    System.out.print(arr[angka_konversi]);
                }
                System.out.println("");
                break;
                
            case 3:
                System.out.println("======================================================");
                System.out.print("Masukkan bilangan biner : ");
                biner = input.next();
                hexa = Integer.toHexString(Integer.valueOf(biner, 2));
                System.out.println("Bilangan hexadesimal dari " + biner + " adalah " + hexa);
                break;
                
            case 4:
                System.out.println("======================================================");
                System.out.print("Masukkan bilangan hexadesimal : ");
                hexa = input.next();
                biner = Integer.toBinaryString(Integer.valueOf(hexa, 16));
                System.out.println("Bilangan biner dari " + hexa + " adalah " + biner);
                break;
                
            case 5:
                System.out.println("======================================================");
                System.out.print("Masukkan bilangan desimal : ");
                angka_masukan = input.nextInt();
                hexa = Integer.toHexString(angka_masukan);
                System.out.println("Bilangan hexadesimal dari " + angka_masukan + " adalah " + hexa);
                break;
                
            case 6:
                System.out.println("======================================================");
                System.out.print("Masukkan bilangan hexadesimal : ");
                hexa = input.next();
                angka_konversi = Integer.valueOf (hexa, 16);
                System.out.println("Bilangan desimal dari " + hexa + " adalah " + angka_konversi);
                break;
                
            default:
                System.out.println("Error.. Silahkan pilih angka yang sesuai.");
                break;
        }
        System.out.println("======================================================");
        } while (pilihan != 0);
        }
    }

