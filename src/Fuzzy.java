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
      return (b - x) / (b - a);
  }

  static double segitiga(double x, double a, double b, double c) {
    if (x <= a || x >= c)
      return 0;
    else if (x == b)
      return 1;
    else if (x > a && x < b)
      return (x - a) / (b - a);
    else
      return (c - x) / (c - b);
  }

  static double naik(double x, double a, double b) {
    if (x <= a)
      return 0;
    else if (x >= b)
      return 1;
    else
      return (x - a) / (b - a);
  }

  // ! gelombang
  // * rendah = 0 - 1
  // * sedang = 0.75 - 1.5
  // * tinggi = 1.25 - 2
  public static double gelombangRendah(double x) {
    return turun(x, 0, 1);
  }

  public static double gelombangSedang(double x) {
    return segitiga(x, 0.75, 1.125, 1.5);
  }

  public static double gelombangTinggi(double x) {
    return naik(x, 1.25, 2);
  }
  // ! gelombang end

  // ! kecepatan angin
  // * rendah = 0 - 2
  // * sedang = 1.5 - 5
  // * tinggi = 4 - 7.7
  public static double anginRendah(double x) {
    return turun(x, 0, 2);
  }

  public static double anginSedang(double x) {
    return segitiga(x, 1.5, 3.25, 5);
  }

  public static double anginTinggi(double x) {
    return naik(x, 4, 7.7);
  }
  // ! angin end

  // ! curah hujan
  // * rendah = 0 - 2
  // * sedang = 1.0 - 4.0
  // * tinggi = 3.5 - 5.5
  public static double hujanRendah(double x) {
    return turun(x, 0, 2);
  }

  public static double hujanSedang(double x) {
    return segitiga(x, 1.0, 2.5, 4.0);
  }

  public static double hujanTinggi(double x) {
    return naik(x, 3.0, 5.5);
  }
  // ! curah hujan end

}
