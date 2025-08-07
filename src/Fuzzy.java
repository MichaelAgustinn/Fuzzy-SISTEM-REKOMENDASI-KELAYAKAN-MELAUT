public class Fuzzy {
  // ! gelombang
  // * rendah = 0 - 1
  // * sedang = 0.75 - 1.5
  // * tinggi = 1.25 - 2

  // ! kecepatan angin
  // * rendah = 0 - 2
  // * sedang = 1.5 - 5
  // * tinggi = 4 - 7.7

  // ! curah hujan
  // * rendah = 0 - 2
  // * sedang = 1.0 - 4.0
  // * tinggi = 3.5 - 5.5

  static double turun(double x, double a, double b) {
    if (x <= a)
      return 1;
    else if (x >= b)
      return 0;
    else
      return (b - x + 0.0) / (b - a);
  }

  // 0, 1.5, 2.0, 4.0, 5.0
  static double bahu(double x, double a, double b, double c, double d) {
    if (x <= a || x >= d) {
      return 0.0;
    } else if (x >= b && x <= c) {
      return 1.0;
    } else if (x > a && x < b) {
      return (x - a) / (b - a);
    } else { // x > c && x < d
      return (d - x) / (d - c);
    }
  }


  static double naik(double x, double a, double b) {
    if (x <= a)
      return 0;
    else if (x >= b)
      return 1;
    else
      return (x - a + 0.0) / (b - a);
  }

  // ! gelombang
  // * rendah = 0 - 1
  // * sedang = 0.75 - 1.5
  // * tinggi = 1.25 - 2
  public static double gelombangRendah(double x) {
    return turun(x, 0.0, 1.0);
  }

  public static double gelombangSedang(double x) {
    return bahu(x, 0.75, 1, 1.25, 1.50);
  }

  public static double gelombangTinggi(double x) {
    return naik(x, 1.25, 2.0);
  }
  // ! gelombang end

  // ! kecepatan angin
  // * rendah = 0 - 2
  // * sedang = 1.5 - 5
  // * tinggi = 4 - 7.7
  public static double anginRendah(double x) {
    return turun(x, 0.0, 2.0);
  }

  public static double anginSedang(double x) {
    return bahu(x, 1.5, 2.0, 4.0, 5.0);
  }

  public static double anginTinggi(double x) {
    return naik(x, 4.0, 7.7);
  }
  // ! angin end

  // ! curah hujan
  // * rendah = 0 - 2
  // * sedang = 1.0 - 4.0
  // * tinggi = 3.5 - 5.5
  public static double hujanRendah(double x) {
    return turun(x, 0.0, 2.0);
  }

  public static double hujanSedang(double x) {
    return bahu(x, 1.0, 2.0, 3.0, 4.0);
  }

  public static double hujanTinggi(double x) {
    return naik(x, 3.0, 5.5);
  }
  // ! curah hujan end

  // ! output aman
  public static double outputLayak(double alp) {
    return 40.0 - alp * (40.0 - 0.0);// range 0 - 40 (grafik turun)
  }
  // !otuput aman end

  // ! output bahaya
  public static double outputTidakLayak(double alp) {
    return alp * (100 - 60) + 60.0; // range 60 - 100 (grafik naik)
  }
  // !otuput bahaya end

  public static String hasil(double output) {
    if (output < 44.8) {
      return "Layak";
    } else {
      return "Tidak Layak";
    }
  }
}
