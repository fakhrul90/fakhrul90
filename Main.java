import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
/**
 * class Main.
 *
 * @author Fakhrul Razi
 * @version 0.1
 */
public class Main
{
    public static void main(String args[])
    {
                
        ArrayList<Mahasiswa> arrm = new ArrayList<Mahasiswa>();
        
              
        // arrm.add(new Mahasiswa(1001,"Doni"));
        // arrm.add(new Mahasiswa(1002,"Bayu"));
        // arrm.add(new Mahasiswa(1003,"Fikri"));
        
        System.out.println("Data Mahasiswa");
        System.out.print("Jumlah Mahasiswa: ");
        Scanner input = new Scanner(System.in);
        int jumlah=0, nim=0, umur=0;
        String nama=null, kelas=null, alamat=null;
        jumlah = input.nextInt();
        
        for (int i=0; i < jumlah ; i++) 
        {
            System.out.print("nim mahasiswa ke-"+(i+1)+": ");
            nim = input.nextInt();
            System.out.print("nama mahasiswa ke-"+(i+1)+": ");
            nama = input.next();
            System.out.print("kelas mahasiswa ke-"+(i+1)+":  ");
            kelas = input.next();
            System.out.print("alamat mahasiswa ke-"+(i+1)+":  ");
            alamat = input.next();
            System.out.print("umur mahasiswa ke-"+(i+1)+":  ");
            umur = input.nextInt();


            arrm.add(new Mahasiswa(nim, nama, kelas, alamat, umur));
        }
        
        
        System.out.println("Menampilkan Data Mahasiswa");
        for (Mahasiswa mhs: arrm)
        {
              System.out.println("nim = "+ mhs.getnimMhs());
              System.out.println("nama = "+ mhs.getnamaMhs());
              System.out.println("kelas = "+ mhs.getkelasMhs());
              System.out.println("alamat = "+ mhs.getalamatMhs());
              System.out.println("umur = "+ mhs.getumurMhs());
        }
        System.out.println("\nUpdate Data Mahasiswa");
        int cariNim;
        System.out.print("Cari NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arrm)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.print("Set Nama = ");    
        nama = input.next();
        mhs.setnamaMhs(nama);
        }
        }
         
        System.out.println("\nData Mahasiswa Setelah di Update");
        for(Mahasiswa mhs:arrm)
        {
            System.out.println("nim = "+ mhs.getnimMhs());
             System.out.println("nama = "+ mhs.getnamaMhs());
              System.out.println("kelas = "+ mhs.getkelasMhs());
             System.out.println("alamat = "+ mhs.getalamatMhs());
              System.out.println("umur = "+ mhs.getumurMhs());
            
        }
        
        System.out.println("\nSearch Data Mahasiswa");
        System.out.print("Cari NIM = ");
        cariNim = input.nextInt();
        System.out.println("\nData Mahasiswa setelah di search");
        for(Mahasiswa mhs:arrm)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        System.out.println("nim = "+ mhs.getnimMhs());
             System.out.println("nama = "+ mhs.getnamaMhs());
              System.out.println("kelas = "+ mhs.getalamatMhs());
             System.out.println("alamat = "+ mhs.getalamatMhs());
              System.out.println("umur = "+ mhs.getumurMhs());
        }
        }
        
        
        System.out.println("\nMemeriksa apakah array list kosong: ");
        System.out.println(arrm.isEmpty()); 
        
        System.out.println("\nMemeriksa ada berapa array list: ");
        System.out.println(arrm.size());
        
        System.out.println("\nRemove Data Mahasiswa");
        System.out.print("Masukkan NIM = ");
        cariNim = input.nextInt();
        for(Mahasiswa mhs:arrm)
        {
        if (mhs.getnimMhs() == cariNim)
        {
        arrm.indexOf(mhs);
        arrm.remove(arrm.indexOf(mhs));
        break;
        }
        }
        
        System.out.println("\nData Mahasiswa Setelah di Hapus");
        for(Mahasiswa mhs:arrm)
        {
             System.out.println("nim = "+ mhs.getnimMhs());
             System.out.println("nama = "+ mhs.getnamaMhs());
             System.out.println("kelas = "+ mhs.getkelasMhs());
             System.out.println("alamat = "+ mhs.getalamatMhs());
             System.out.println("umur = "+ mhs.getumurMhs());
        }
    } 
        
        
        
        
}