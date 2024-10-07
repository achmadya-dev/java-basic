public class Barang{
  private String kode_barang;
  private String nama_barang;
  private int stok;
  public Barang(String kode, String nama, int stk) 
  {  
    kode_barang =kode;
    nama_barang =nama;  
    stok =stk;
  }

  void getBarang(){
    System.out.println(this.kode_barang+ " " +this.nama_barang + "(" + this.stok + ")");  
  }

  void setStok(int stok){
    this.stok = stok;
  }
}
