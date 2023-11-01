public class Kubus extends BangunRuang {
  private double sisi;

  public Kubus(double sisi) {
    this.sisi = sisi;
  }

  public double hitungVolume() {
    return sisi * sisi * sisi;
  }

  public double hitungLuasPermukaan() {
    return 6 * (sisi * sisi);
  }

  public void cetak() {
    System.out.println("Percobaan di kelas ");
  }
}
