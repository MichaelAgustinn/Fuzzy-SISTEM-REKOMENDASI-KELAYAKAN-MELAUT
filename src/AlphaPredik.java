public class AlphaPredik {

  // ! Layak
  public static double rule1(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  public static double rule2(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  public static double rule3(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }

  public static double rule4(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  public static double rule5(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  public static double rule6(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }

  public static double rule7(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  public static double rule8(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }
  // ! Layak end

  // ! Tidak Layak
  public static double rule9(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangRendah(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }
  // ! Tidak Layak End

  // ! Layak
  public static double rule10(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  public static double rule11(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  public static double rule12(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }

  public static double rule13(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  public static double rule14(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  // ! Tidak Layak
  public static double rule15(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }

  public static double rule16(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  public static double rule17(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  public static double rule18(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangSedang(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }
  // ! Tidak Layak End

  // ! Layak
  static double rule19(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }
  // ! Layak End

  // ! Tidak Layak
  static double rule20(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  static double rule21(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginRendah(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }

  static double rule22(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  static double rule23(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  static double rule24(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginSedang(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }

  static double rule25(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanRendah(curahHujan));
    return min;
  }

  static double rule26(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanSedang(curahHujan));
    return min;
  }

  static double rule27(double gelombang, double kecepatanAngin, double curahHujan) {
    double min = EDA.min(Fuzzy.gelombangTinggi(gelombang), Fuzzy.anginTinggi(kecepatanAngin),
        Fuzzy.hujanTinggi(curahHujan));
    return min;
  }
  // ! Tidak Layak End
}
