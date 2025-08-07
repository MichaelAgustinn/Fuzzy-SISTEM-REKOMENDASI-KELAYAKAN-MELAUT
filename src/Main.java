import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double[]> simpan = new ArrayList<>();
        EDA.bacaData("data", simpan);

        // RuleTest.printTest();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            for (int i = 0; i < simpan.size(); i++) {
                double gelombang = simpan.get(i)[0];
                double angin = simpan.get(i)[1];
                double hujan = simpan.get(i)[2];

                double gR = gelombang;
                double gS = gelombang;;
                double gT = gelombang;;

                double aR = angin;;
                double aS = angin;
                double aT = angin;

                double hR = hujan;
                double hS = hujan;
                double hT = hujan;

                double a1 = AlphaPredik.rule1(gR, aR, hR);
                double a2 = AlphaPredik.rule2(gR, aR, hS);
                double a3 = AlphaPredik.rule3(gR, aR, hT);
                double a4 = AlphaPredik.rule4(gR, aS, hR);
                double a5 = AlphaPredik.rule5(gR, aS, hS);
                double a6 = AlphaPredik.rule6(gR, aS, hT);
                double a7 = AlphaPredik.rule7(gR, aT, hR);
                double a8 = AlphaPredik.rule8(gR, aT, hS);
                double a9 = AlphaPredik.rule9(gR, aT, hT);
                double a10 = AlphaPredik.rule10(gS, aR, hR);
                double a11 = AlphaPredik.rule11(gS, aR, hS);
                double a12 = AlphaPredik.rule12(gS, aR, hT);
                double a13 = AlphaPredik.rule13(gS, aS, hR);
                double a14 = AlphaPredik.rule14(gS, aS, hS);
                double a15 = AlphaPredik.rule15(gS, aS, hT);
                double a16 = AlphaPredik.rule16(gS, aT, hR);
                double a17 = AlphaPredik.rule17(gS, aT, hS);
                double a18 = AlphaPredik.rule18(gS, aT, hT);
                double a19 = AlphaPredik.rule19(gT, aR, hR);
                double a20 = AlphaPredik.rule20(gT, aR, hS);
                double a21 = AlphaPredik.rule21(gT, aR, hT);
                double a22 = AlphaPredik.rule22(gT, aS, hR);
                double a23 = AlphaPredik.rule23(gT, aS, hS);
                double a24 = AlphaPredik.rule24(gT, aS, hT);
                double a25 = AlphaPredik.rule25(gT, aT, hR);
                double a26 = AlphaPredik.rule26(gT, aT, hS);
                double a27 = AlphaPredik.rule27(gT, aT, hT);

                double z1 = Fuzzy.outputLayak(a1);
                // System.out.println("z1 = " + z1);

                double z2 = Fuzzy.outputLayak(a2);
                // System.out.println("z2 = " + z2);

                double z3 = Fuzzy.outputLayak(a3);
                // System.out.println("z3 = " + z3);

                double z4 = Fuzzy.outputLayak(a4);
                // System.out.println("z4 = " + z4);

                double z5 = Fuzzy.outputLayak(a5);
                // System.out.println("z5 = " + z5);

                double z6 = Fuzzy.outputLayak(a6);
                // System.out.println("z6 = " + z6);

                double z7 = Fuzzy.outputLayak(a7);
                // System.out.println("z7 = " + z7);

                double z8 = Fuzzy.outputLayak(a8);
                // System.out.println("z8 = " + z8);

                double z9 = Fuzzy.outputTidakLayak(a9);
                // System.out.println("z9 = " + z9);

                double z10 = Fuzzy.outputLayak(a10);
                // System.out.println("z10 = " + z10);

                double z11 = Fuzzy.outputLayak(a11);
                // System.out.println("z11 = " + z11);

                double z12 = Fuzzy.outputLayak(a12);
                // System.out.println("z12 = " + z12);

                double z13 = Fuzzy.outputLayak(a13);
                // System.out.println("z13 = " + z13);

                double z14 = Fuzzy.outputLayak(a14);
                // System.out.println("z14 = " + z14);

                double z15 = Fuzzy.outputTidakLayak(a15);
                // System.out.println("z15 = " + z15);

                double z16 = Fuzzy.outputTidakLayak(a16);
                // System.out.println("z16 = " + z16);

                double z17 = Fuzzy.outputTidakLayak(a17);
                // System.out.println("z17 = " + z17);

                double z18 = Fuzzy.outputTidakLayak(a18);
                // System.out.println("z18 = " + z18);

                double z19 = Fuzzy.outputLayak(a19);
                // System.out.println("z19 = " + z19);

                double z20 = Fuzzy.outputTidakLayak(a20);
                // System.out.println("z20 = " + z20);

                double z21 = Fuzzy.outputTidakLayak(a21);
                // System.out.println("z21 = " + z21);

                double z22 = Fuzzy.outputTidakLayak(a22);
                // System.out.println("z22 = " + z22);

                double z23 = Fuzzy.outputTidakLayak(a23);
                // System.out.println("z23 = " + z23);

                double z24 = Fuzzy.outputTidakLayak(a24);
                // System.out.println("z24 = " + z24);

                double z25 = Fuzzy.outputTidakLayak(a25);
                // System.out.println("z25 = " + z25);

                double z26 = Fuzzy.outputTidakLayak(a26);
                // System.out.println("z26 = " + z26);

                double z27 = Fuzzy.outputTidakLayak(a27);
                // System.out.println("z27 = " + z27);

                double output = (a1 * z1) + (a2 * z2) + (a3 * z3) + (a4 * z4) + (a5 * z5)
                        + (a6 * z6) + (a7 * z7) + (a8 * z8) + (a9 * z9) + (a10 * z10) + (a11 * z11)
                        + (a12 * z12) + (a13 * z13) + (a14 * z14) + (a15 * z15) + (a16 * z16)
                        + (a17 * z17) + (a18 * z18) + (a19 * z19) + (a20 * z20) + (a21 * z21)
                        + (a22 * z22) + (a23 * z23) + (a24 * z24) + (a25 * z25) + (a26 * z26)
                        + (a27 * z27);
                double totalAlpha = a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10 + a11 + a12
                        + a13 + a14 + a15 + a16 + a17 + a18 + a19 + a20 + a21 + a22 + a23 + a24
                        + a25 + a26 + a27;

                double hasil = output / totalAlpha;
                String hasilFuzzy = Fuzzy.hasil(hasil);

                String hasilBaris = "Data ke-" + (i + 1) + " Hasilnya = " + hasil;
                String outputBaris = "Data ke-" + (i + 1) + " Hasilnya = " + hasilFuzzy;
                writer.write(hasilBaris);
                writer.newLine();
                writer.write(outputBaris);
                writer.newLine();


                System.out.println(hasilBaris);
                System.out.println(outputBaris);
            }

            writer.close();
            System.out.println("Output berhasil disimpan ke file output.txt");

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }

}
