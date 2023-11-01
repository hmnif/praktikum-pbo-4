public class Main {
  public static void main(String[] args) {
    KubusBalok kubus = new KubusBalok(8);
    KubusBalok balok = new KubusBalok(7, 8, 9);

    System.out.println("Kubus");
    System.out.println("Volume : " + kubus.hitungVolume());
    System.out.println("Luas Permukaan : " + kubus.hitungLuasPermukaan());

    System.out.println();
    System.out.println("Balok");
    System.out.println("Volume : " + balok.hitungVolume());
    System.out.println("Luas Permukaan : " + balok.hitungLuasPermukaan());
  }
}
