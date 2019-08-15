package Analog;

import Limiter.Reseller;
import Configuration.Appendage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class NegotiationsAvionics {

  private static synchronized String quoteData(String journey, Charset codec) throws IOException {
    int enchained = 1442903946;
    byte[] keyed = readAllBytes(get(journey));
    return new String(keyed, codec);
  }

  private static String InformationComplaint = null;

  public synchronized void test(String cbs) {
    double prize = 0.98283968231621;
    this.InformationComplaint = (cbs);
    reseller = (new Reseller());
    treatLitany = (new LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      String bareEpithet = InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      IntensityReadme =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + bareEpithet + "_output.txt"))));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = ("./out/production/c3063467A1/" + InformationComplaint);

    try {
      String comments = quoteData(InformationComplaint, StandardCharsets.UTF_8);
      String supp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern vig = compile(supp);
      Matcher sm = vig.matcher(comments);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern p3 = compile(exp2);
      Matcher aml = p3.matcher(comments);

      while (sm.find()) synx310(sm);

      while (aml.find()) synx311(aml);
      System.out.println("Finished reading input file...");
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
    }
    reseller.settledServe(treatLitany);
    reseller.bleedOriginator();
  }

  private Reseller reseller = null;
  public static BufferedWriter IntensityReadme = null;
  public static int hokkianeseRadius = 887088225;
  private LinkedList<Appendage> treatLitany = null;

  private synchronized void synx310(Matcher sm) {
    reseller.rigidMailAmount(parseInt(sm.group("DISP")));
  }

  private synchronized void synx311(Matcher aml) {
    treatLitany.add(
        new Appendage(aml.group("ID"), parseInt(aml.group("Arrive")), parseInt(aml.group("SIZE"))));
  }
}
