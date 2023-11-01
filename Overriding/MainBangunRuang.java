public class MainBangunRuang {
  public static void main(String[] args) {
    Kubus kbs = new Kubus(8);
    Balok blk = new Balok(4, 7, 9);

    System.out.println("Kubus");
    System.out.println("Luas : " + kbs.hitungVolume());
    System.out.println("Luas Permukaan : " + kbs.hitungLuasPermukaan());
    kbs.cetak();

    System.out.println();
    System.out.println("Balok");
    System.out.println("Luas : " + blk.hitungVolume());
    System.out.println("Luas Permukaan : " + blk.hitungLuasPermukaan());
    blk.cetak();
  }
}
