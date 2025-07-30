import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class EDA {

  void printData(ArrayList<Double[]> simpan) {
    for (int i = 0; i < simpan.size(); i++) {
      Double[] baris = simpan.get(i);
      System.out.print("Baris ke-" + i + ": ");
      for (int j = 0; j < baris.length; j++) {
        System.out.print(baris[j] + " ");
      }
      System.out.println();
    }
  }

  ArrayList<Double[]> bacaData(String namaFile, ArrayList<Double[]> simpan) {
    // ArrayList<Double[]> simpan = new ArrayList<>();
    String line;
    try (
        BufferedReader br = new BufferedReader(new FileReader("src/resource/" + "data" + ".csv"))) {
      br.readLine();
      while ((line = br.readLine()) != null) {
        String[] baca = line.split(",");
        Double[] data = new Double[baca.length - 2];
        for (int i = 2; i < baca.length; i++) {
          data[i - 2] = Double.parseDouble(baca[i]);
        }
        simpan.add(data);
      }
    } catch (IOException e) {
      System.out.println("Terjadi kesalahan saat membaca file.");
      e.printStackTrace();
    }
    return simpan;
  }
}
