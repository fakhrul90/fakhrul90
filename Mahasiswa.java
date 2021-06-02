/**
 * class Mahasiswa.
 *
 * @author Fakhrul Razi
 * @version 0.1
 */
public class Mahasiswa
{
    // instance variables - replace the example below with your own
    private int nim;
    private String nama;
    private String kelas;
    private int umur;
    private String alamat;
    
    public Mahasiswa(int nim, int umur, String nama,String kelas, String alamat)
    {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.alamat = alamat;
        this.umur = umur;
                
    }
   
    public int getnimMhs()
    {
         return this.nim;
    }
    
   public String getnamaMhs()
    {
         return this.nama;
    }
    
    public String getkelasMhs()
    {
         return this.kelas;
    }
    
    public String getalamatMhs()
    {
         return this.alamat;
    }
     
    public int getumurMhs()
    {
         return this.umur;
    }
    
    public void setnamaMhs(String nama)
    {
        this.nama = nama;
    }
    


    
}