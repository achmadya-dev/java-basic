public class Inventori{
  Barang[] barangs;
  void initBarang(){
    barangs = new Barang[2];
    barangs[0] = new Barang("001", "Baju", 10);  
    barangs[1] = new Barang("002", "Celana",20);
  }
  void showBarang(){
    barangs[0].getBarang();
    barangs[1].getBarang();
  }
  void pengadaan(){
  initBarang();
    // barangs[0].stok += 20;
    // barangs[0].stok -= 30; //Bisa juga dikurangi dong? 
    // barangs[0].stok *= 30; //dikali juga bisa dong??
    barangs[0].setStok(20);
    showBarang();
  }
  public static void main(String[] args) {  
    Inventori beli = new Inventori(); 
    beli.pengadaan();
  }
}
