public class KubusBalok {
  double sisi, panjang, lebar, tinggi;

  // 1 Parameter untuk kubus
  public KubusBalok(double sisi) {
    this.sisi = sisi;
  }

  // 3 Parameter untuk balok
  public KubusBalok(double panjang, double lebar, double tinggi) {
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }

  public double hitungVolume() {
    if (panjang > 1 && lebar > 1 && tinggi > 1) {
      return panjang * lebar * tinggi;
    } else if (sisi > 1) {
      return sisi * sisi * sisi;
    } else {
      return 0.0;
    }
  }

  public double hitungLuasPermukaan() {
    if (panjang > 1 && lebar > 1 && tinggi > 1) {
      return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    } else if (sisi > 1) {
      return 6 * (sisi * sisi);
    } else {
      return 0.0;
    }
  }
}
