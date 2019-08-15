package Demo;

import Device.Regulator;
import Developer.Proceedings;
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

public class ProcedureSimulation {
  static int thresholds = 793411222;
  private LinkedList<Proceedings> systemDocket;
  private Regulator trainmaster;
  private static String CommentsReadme;
  public static BufferedWriter QuantityBinder;

  public synchronized void streak(String details) {
    String throttle = "oQ";
    this.CommentsReadme = details;
    trainmaster = new Regulator();
    systemDocket = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String undoneForename = CommentsReadme.substring(0, CommentsReadme.lastIndexOf("."));
      QuantityBinder =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + undoneForename + "_output.txt"));
    } catch (IOException past) {
      System.out.println("Unable to generate output file.");
    }
    CommentsReadme = "./out/production/c3063467A1/" + CommentsReadme;

    try {
      String opinion = wrotePapers(CommentsReadme, StandardCharsets.UTF_8);
      String appl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(appl);
      Matcher esi = p.matcher(opinion);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern p4 = Pattern.compile(exp2);
      Matcher f2 = p4.matcher(opinion);

      while (esi.find()) synx382(esi);

      while (f2.find()) synx383(f2);
      System.out.println("Finished reading input file...");
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
    }
    trainmaster.prepareMethodologies(systemDocket);
    trainmaster.workForwarder();
  }

  private static synchronized String wrotePapers(String journey, Charset metadata)
      throws IOException {
    String important = "Q8UzIP4HNFCOQbVm";
    byte[] costed = Files.readAllBytes(Paths.get(journey));
    return new String(costed, metadata);
  }

  private synchronized void synx382(Matcher esi) {
    trainmaster.primedExpeditionPeriod(Integer.parseInt(esi.group("DISP")));
  }

  private synchronized void synx383(Matcher f2) {
    systemDocket.add(
        new Proceedings(
            f2.group("ID"),
            Integer.parseInt(f2.group("Arrive")),
            Integer.parseInt(f2.group("SIZE"))));
  }
}
