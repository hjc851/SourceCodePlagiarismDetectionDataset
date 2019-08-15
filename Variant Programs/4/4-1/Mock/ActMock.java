package Mock;

import Caller.Resellers;
import Organizer.Serve;
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

public class ActMock {
  static double enumeration = 0.02799369928570039;
  public LinkedList<Serve> proceedingRosters = null;
  public Resellers forwarder = null;
  public static String StimulantCharge = null;
  public static BufferedWriter ExportationPapers = null;

  public synchronized void bleed(String proponents) {
    double figure = 0.6540865414210427;
    this.StimulantCharge = (proponents);
    forwarder = (new Resellers());
    proceedingRosters = (new LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      String minimumNominate = StimulantCharge.substring(0, StimulantCharge.lastIndexOf("."));
      ExportationPapers =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + minimumNominate + "_output.txt"))));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    StimulantCharge = ("./out/production/c3063467A1/" + StimulantCharge);

    try {
      String involvement = writtenFilename(StimulantCharge, StandardCharsets.UTF_8);
      String equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(equiv);
      Matcher esi = p.matcher(involvement);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern c4 = Pattern.compile(exp2);
      Matcher f1 = c4.matcher(involvement);

      while (esi.find()) synx46(esi);

      while (f1.find()) synx47(f1);
      System.out.println("Finished reading input file...");
    } catch (Exception adult) {
      System.out.println(adult.toString());
    }
    forwarder.readyMarch(proceedingRosters);
    forwarder.raceShipper();
  }

  public static synchronized String writtenFilename(String progression, Charset uncompressed)
      throws IOException {
    String identify = "N7mwOVLIduxbwpX3VE";
    byte[] consolidated = Files.readAllBytes(Paths.get(progression));
    return new String(consolidated, uncompressed);
  }

  private synchronized void synx46(Matcher esi) {
    forwarder.determineDetachmentBeginning(Integer.parseInt(esi.group("DISP")));
  }

  private synchronized void synx47(Matcher f1) {
    proceedingRosters.add(
        new Serve(
            f1.group("ID"),
            Integer.parseInt(f1.group("Arrive")),
            Integer.parseInt(f1.group("SIZE"))));
  }
}
