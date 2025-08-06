public class RuleTest {
  public static void printTest() {
    double a1 = AlphaPredik.rule1(0.74, 1.4, 0.9);

    double a2 = AlphaPredik.rule2(0.74, 1.4, 2.1);
    double a2s = AlphaPredik.rule2(0.74, 1.4, 2.9);

    double a3 = AlphaPredik.rule3(0.74, 1.4, 4.1);

    double a4 = AlphaPredik.rule4(0.74, 2.1, 0.9);
    double a4s = AlphaPredik.rule4(0.74, 2.9, 0.9);

    double a5 = AlphaPredik.rule5(0.74, 2.1, 2.1);
    double a5s = AlphaPredik.rule5(0.74, 3.9, 2.1);
    double a51 = AlphaPredik.rule5(0.74, 2.1, 2.9);
    double a5s1 = AlphaPredik.rule5(0.74, 3.9, 2.9);

    double a6 = AlphaPredik.rule6(0.74, 2.1, 4.1);
    double a6s = AlphaPredik.rule6(0.74, 3.9, 4.1);

    double a7 = AlphaPredik.rule7(0.74, 5.1, 0.9);

    double a8 = AlphaPredik.rule8(0.74, 5.1, 2.1);
    double a8s = AlphaPredik.rule8(0.74, 5.1, 2.9);

    double a9 = AlphaPredik.rule9(0.74, 5.1, 4.1);

    double a10 = AlphaPredik.rule10(1.01, 1.4, 0.9);
    double a10s = AlphaPredik.rule10(1.24, 1.4, 0.9);

    double a11 = AlphaPredik.rule11(1.01, 1.4, 2.1);
    double a11s = AlphaPredik.rule11(1.01, 1.4, 2.9);
    double a11n = AlphaPredik.rule11(1.24, 1.4, 2.1);
    double a11ns = AlphaPredik.rule11(1.24, 1.4, 2.9);

    double a12 = AlphaPredik.rule12(1.01, 1.4, 4.1);
    double a12s = AlphaPredik.rule12(1.24, 1.4, 4.1);

    double a13 = AlphaPredik.rule13(1.01, 2.1, 0.9);
    double a13s = AlphaPredik.rule13(1.01, 3.9, 0.9);
    double a131 = AlphaPredik.rule13(1.24, 2.1, 0.9);
    double a13s1 = AlphaPredik.rule13(1.24, 3.9, 0.9);

    double a14 = AlphaPredik.rule14(1.01, 2.1, 2.1);
    double a14s = AlphaPredik.rule14(1.01, 2.1, 2.9);
    double a141 = AlphaPredik.rule14(1.01, 3.9, 2.1);
    double a14s1 = AlphaPredik.rule14(1.01, 3.9, 2.9);
    double a142 = AlphaPredik.rule14(1.24, 2.1, 2.1);
    double a14s2 = AlphaPredik.rule14(1.24, 2.1, 2.9);
    double a143 = AlphaPredik.rule14(1.24, 3.9, 2.1);
    double a14s3 = AlphaPredik.rule14(1.24, 3.9, 2.9);

    double a15 = AlphaPredik.rule13(1.01, 2.1, 4.1);
    double a15s = AlphaPredik.rule13(1.01, 3.9, 4.1);
    double a151 = AlphaPredik.rule13(1.24, 2.1, 4.1);
    double a15s1 = AlphaPredik.rule13(1.24, 3.9, 4.1);

    double a16 = AlphaPredik.rule16(1.01, 5.1, 0.9);
    double a16s = AlphaPredik.rule16(1.24, 5.1, 0.9);

    double a17 = AlphaPredik.rule17(1.01, 5.1, 2.1);
    double a17s = AlphaPredik.rule17(1.01, 5.1, 2.9);
    double a171 = AlphaPredik.rule17(1.24, 5.1, 2.1);
    double a17s1 = AlphaPredik.rule17(1.24, 5.1, 2.9);

    double a18 = AlphaPredik.rule18(1.01, 5.1, 4.1);
    double a18s = AlphaPredik.rule18(1.24, 5.1, 4.1);

    double a19 = AlphaPredik.rule19(1.51, 1.4, 0.9);

    double a20 = AlphaPredik.rule20(1.51, 1.4, 2.1);
    double a20s = AlphaPredik.rule20(1.51, 1.4, 2.9);

    double a21 = AlphaPredik.rule21(1.51, 1.4, 4.1);

    double a22 = AlphaPredik.rule22(1.51, 2.1, 0.9);
    double a22s = AlphaPredik.rule22(1.51, 3.9, 0.9);

    double a23 = AlphaPredik.rule23(1.51, 2.1, 2.1);
    double a23s = AlphaPredik.rule23(1.51, 2.1, 2.9);
    double a231 = AlphaPredik.rule23(1.51, 3.9, 2.1);
    double a23s1 = AlphaPredik.rule23(1.51, 3.9, 2.9);

    double a24 = AlphaPredik.rule24(1.51, 2.1, 4.1);
    double a24s = AlphaPredik.rule24(1.51, 3.9, 4.1);

    double a25 = AlphaPredik.rule25(1.51, 5.1, 0.9);

    double a26 = AlphaPredik.rule26(1.51, 5.1, 2.1);
    double a26s = AlphaPredik.rule26(1.51, 5.1, 2.9);

    double a27 = AlphaPredik.rule27(1.51, 5.1, 4.1);

    System.out.println("Rule1 | Layak");
    System.out.println("z ke-1= " + Fuzzy.outputLayak(a1));
    System.out.println();
    System.out.println("Rule2 kondisi 1 | Layak");
    System.out.println("z ke-2= " + Fuzzy.outputLayak(a2));
    System.out.println("Rule2 kondisi 2 | Layak");
    System.out.println("z ke-2= " + Fuzzy.outputLayak(a2s));
    System.out.println();
    System.out.println("Rule3 | Layak");
    System.out.println("z ke-3= " + Fuzzy.outputLayak(a3));
    System.out.println();

    System.out.println("Rule4 kondisi 1 | Layak");
    System.out.println("z ke-4= " + Fuzzy.outputLayak(a4));
    System.out.println("Rule4 kondisi 2 | Layak");
    System.out.println("z ke-4= " + Fuzzy.outputLayak(a4s));
    System.out.println();

    System.out.println("Rule5 kondisi 1 | Layak");
    System.out.println("z ke-5= " + Fuzzy.outputLayak(a5));
    System.out.println("Rule5 kondisi 2 | Layak");
    System.out.println("z ke-5= " + Fuzzy.outputLayak(a5s));
    System.out.println("Rule5 kondisi 3 | Layak");
    System.out.println("z ke-5= " + Fuzzy.outputLayak(a51));
    System.out.println("Rule5 kondisi 4 | Layak");
    System.out.println("z ke-5= " + Fuzzy.outputLayak(a5s1));
    System.out.println();

    System.out.println("Rule6 kondisi 1 | Layak");
    System.out.println("z ke-6= " + Fuzzy.outputLayak(a6));
    System.out.println("Rule6 kondisi 2 | Layak");
    System.out.println("z ke-6= " + Fuzzy.outputLayak(a6s));
    System.out.println();

    System.out.println("Rule7 | Layak");
    System.out.println("z ke-7= " + Fuzzy.outputLayak(a7));
    System.out.println();

    System.out.println("Rule8 kondisi 1 | Layak");
    System.out.println("z ke-8= " + Fuzzy.outputLayak(a8));
    System.out.println("Rule8 kondisi 2 | Layak");
    System.out.println("z ke-8= " + Fuzzy.outputLayak(a8s));
    System.out.println();

    System.out.println("Rule9 | Tidak Layak");
    System.out.println("z ke-9= " + Fuzzy.outputTidakLayak(a9));
    System.out.println();

    System.out.println("Rule10 kondisi 1 | Layak");
    System.out.println("z ke-10= " + Fuzzy.outputLayak(a10));
    System.out.println("Rule10 kondisi 2 | Layak");
    System.out.println("z ke-10= " + Fuzzy.outputLayak(a10s));
    System.out.println();

    System.out.println("Rule11 kondisi 1 | Layak");
    System.out.println("z ke-11= " + Fuzzy.outputLayak(a11));
    System.out.println("Rule11 kondisi 2 | Layak");
    System.out.println("z ke-11= " + Fuzzy.outputLayak(a11s));
    System.out.println("Rule11 kondisi 3 | Layak");
    System.out.println("z ke-11= " + Fuzzy.outputLayak(a11n));
    System.out.println("Rule11 kondisi 4 | Layak");
    System.out.println("z ke-11= " + Fuzzy.outputLayak(a11ns));
    System.out.println();

    System.out.println("Rule12 kondisi 1 | Layak");
    System.out.println("z ke-12= " + Fuzzy.outputLayak(a12));
    System.out.println("Rule12 kondisi 2 | Layak");
    System.out.println("z ke-12= " + Fuzzy.outputLayak(a12s));
    System.out.println();

    System.out.println("Rule13 kondisi 1 | Layak");
    System.out.println("z ke-13= " + Fuzzy.outputLayak(a13));
    System.out.println("Rule13 kondisi 2 | Layak");
    System.out.println("z ke-13= " + Fuzzy.outputLayak(a13s));
    System.out.println("Rule13 kondisi 3 | Layak");
    System.out.println("z ke-13= " + Fuzzy.outputLayak(a131));
    System.out.println("Rule13 kondisi 4 | Layak");
    System.out.println("z ke-13= " + Fuzzy.outputLayak(a13s1));
    System.out.println();

    System.out.println("Rule14 kondisi 1 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a14));
    System.out.println("Rule14 kondisi 2 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a14s));
    System.out.println("Rule14 kondisi 3 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a141));
    System.out.println("Rule14 kondisi 4 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a14s1));
    System.out.println("Rule14 kondisi 5 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a142));
    System.out.println("Rule14 kondisi 6 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a14s2));
    System.out.println("Rule14 kondisi 7 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a143));
    System.out.println("Rule14 kondisi 8 | Layak");
    System.out.println("z ke-14= " + Fuzzy.outputLayak(a14s3));
    System.out.println();

    System.out.println("Rule15 kondisi 1 | Tidak Layak");
    System.out.println("z ke-15= " + Fuzzy.outputTidakLayak(a15));
    System.out.println("Rule15 kondisi 2 | Tidak Layak");
    System.out.println("z ke-15= " + Fuzzy.outputTidakLayak(a15s));
    System.out.println("Rule15 kondisi 3 | Tidak Layak");
    System.out.println("z ke-15= " + Fuzzy.outputTidakLayak(a151));
    System.out.println("Rule15 kondisi 4 | Tidak Layak");
    System.out.println("z ke-15= " + Fuzzy.outputTidakLayak(a15s1));
    System.out.println();

    System.out.println("Rule16 kondisi 1 | Tidak Layak");
    System.out.println("z ke-16= " + Fuzzy.outputTidakLayak(a16));
    System.out.println("Rule16 kondisi 2 | Tidak Layak");
    System.out.println("z ke-16= " + Fuzzy.outputTidakLayak(a16s));
    System.out.println();

    System.out.println("Rule17 kondisi 1 | Tidak Layak");
    System.out.println("z ke-17= " + Fuzzy.outputTidakLayak(a17));
    System.out.println("Rule17 kondisi 2 | Tidak Layak");
    System.out.println("z ke-17= " + Fuzzy.outputTidakLayak(a17s));
    System.out.println("Rule17 kondisi 3 | Tidak Layak");
    System.out.println("z ke-17= " + Fuzzy.outputTidakLayak(a171));
    System.out.println("Rule17 kondisi 4 | Tidak Layak");
    System.out.println("z ke-17= " + Fuzzy.outputTidakLayak(a17s1));
    System.out.println();

    System.out.println("Rule18 kondisi 1 | Tidak Layak");
    System.out.println("z ke-18= " + Fuzzy.outputTidakLayak(a18));
    System.out.println("Rule18 kondisi 2 | Tidak Layak");
    System.out.println("z ke-18= " + Fuzzy.outputTidakLayak(a18s));
    System.out.println();

    System.out.println("Rule19 | Layak");
    System.out.println("z ke-19= " + Fuzzy.outputLayak(a19));
    System.out.println();

    System.out.println("Rule20 kondisi 1 | Tidak Layak");
    System.out.println("z ke-20= " + Fuzzy.outputTidakLayak(a20));
    System.out.println("Rule20 kondisi 2 | Tidak Layak");
    System.out.println("z ke-20= " + Fuzzy.outputTidakLayak(a20s));
    System.out.println();

    System.out.println("Rule21 | Tidak Layak");
    System.out.println("z ke-21= " + Fuzzy.outputTidakLayak(a21));
    System.out.println();

    System.out.println("Rule22 kondisi 1 | Tidak Layak");
    System.out.println("z ke-22= " + Fuzzy.outputTidakLayak(a22));
    System.out.println("Rule22 kondisi 2 | Tidak Layak");
    System.out.println("z ke-22= " + Fuzzy.outputTidakLayak(a22s));
    System.out.println();

    System.out.println("Rule23 kondisi 1 | Tidak Layak");
    System.out.println("z ke-23= " + Fuzzy.outputTidakLayak(a23));
    System.out.println("Rule23 kondisi 2 | Tidak Layak");
    System.out.println("z ke-23= " + Fuzzy.outputTidakLayak(a23s));
    System.out.println("Rule23 kondisi 3 | Tidak Layak");
    System.out.println("z ke-23= " + Fuzzy.outputTidakLayak(a231));
    System.out.println("Rule23 kondisi 4 | Tidak Layak");
    System.out.println("z ke-23= " + Fuzzy.outputTidakLayak(a23s1));
    System.out.println();

    System.out.println("Rule24 kondisi 1 | Tidak Layak");
    System.out.println("z ke-24= " + Fuzzy.outputTidakLayak(a24));
    System.out.println("Rule24 kondisi 2 | Tidak Layak");
    System.out.println("z ke-24= " + Fuzzy.outputTidakLayak(a24s));
    System.out.println();

    System.out.println("Rule25 | Tidak Layak");
    System.out.println("z ke-25= " + Fuzzy.outputTidakLayak(a25));
    System.out.println();

    System.out.println("Rule26 kondisi 1 | Tidak Layak");
    System.out.println("z ke-26= " + Fuzzy.outputTidakLayak(a26));
    System.out.println("Rule26 kondisi 2 | Tidak Layak");
    System.out.println("z ke-26= " + Fuzzy.outputTidakLayak(a26s));
    System.out.println();

    System.out.println("Rule27 | Tidak Layak");
    System.out.println("z ke-27= " + Fuzzy.outputTidakLayak(a27));
    System.out.println();

  }

  public static void main(String[] args) {
    for (int i = 1; i < 28; i++) {
      // System.out.println("\nSystem.out.println(\"Rule" + i + "\");");
      // System.out.print("System.out.println(\"z ke-" + i + "= \" +");
      // if (i == 9 || (i > 14 && i < 19) || (i > 19)) {
      //   System.out.println("Fuzzy.outputTidakLayak(a" + i + "));");
      // } else {
      //   System.out.println("Fuzzy.outputLayak(a" + i + "));");
      // }

      // System.out.println(
      // "System.out.println(\"" + "a" + i + " " + "\" + AlphaPredik.rule" + i + "(0,0,0)" + ");");

    }
  }
}
