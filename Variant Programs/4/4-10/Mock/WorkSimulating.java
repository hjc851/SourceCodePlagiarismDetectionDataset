package Mock;

import Salesperson.Forwarder;
import Planner.Appendage;
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

public class WorkSimulating {
  private static final String synX609String = "Finished reading input file...";
  private static final String synX608String = "SIZE";
  private static final String synX607String = "Arrive";
  private static final String synX606String = "ID";
  private static final String synX605String = "DISP";
  private static final String synX604String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX603String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX602String = "./out/production/c3063467A1/";
  private static final String synX601String = "Unable to generate output file.";
  private static final String synX600String = "_output.txt";
  private static final String synX599String = "./out/production/c3063467A1/";
  private static final String synX598String = ".";
  private static final int synX597int = 0;
  private static final String synX596String = "Reading in input file...";
  private static final double synX595double = 0.17563189999124962;
  private static final int synX594int = 540550391;
  public static BufferedWriter ProducedExecutable;
  private LinkedList<Appendage> proceduresCompendium;
  private static String SupportPaperwork;

  private static synchronized String rereadSubmitted(String trail, Charset cryptography)
      throws IOException {
    int indentured;
    indentured = (synX594int);
    byte[] demodulated = Files.readAllBytes(Paths.get(trail));
    return new String(demodulated, cryptography);
  }

  private Forwarder shipper;
  public static final String full = "g2sRGHNa";

  public synchronized void course(String proponents) {
    double bandwidth;
    bandwidth = (synX595double);
    this.SupportPaperwork = (proponents);
    shipper = (new Forwarder());
    proceduresCompendium = (new LinkedList<>());
    System.out.println(synX596String);

    try {
      String deniedNickname;
      deniedNickname =
          (SupportPaperwork.substring(synX597int, SupportPaperwork.lastIndexOf(synX598String)));
      ProducedExecutable =
          (new BufferedWriter(new FileWriter((synX599String + deniedNickname + synX600String))));
    } catch (IOException tipp) {
      System.out.println(synX601String);
    }
    SupportPaperwork = (synX602String + SupportPaperwork);

    try {
      String participation;
      String svc;
      Pattern p;
      Matcher sm;
      String exp2;
      Pattern f2;
      Matcher m3;
      participation = (rereadSubmitted(SupportPaperwork, StandardCharsets.UTF_8));
      svc = (synX603String);
      p = (Pattern.compile(svc));
      sm = (p.matcher(participation));
      exp2 = (synX604String);
      f2 = (Pattern.compile(exp2));
      m3 = (f2.matcher(participation));

      while (sm.find()) {
        shipper.settledHitPeriods(Integer.parseInt(sm.group(synX605String)));
      }

      while (m3.find()) {
        proceduresCompendium.add(
            new Appendage(
                m3.group(synX606String),
                Integer.parseInt(m3.group(synX607String)),
                Integer.parseInt(m3.group(synX608String))));
      }
      System.out.println(synX609String);
    } catch (Exception vet) {
      System.out.println(vet.toString());
    }
    shipper.dictatedWork(proceduresCompendium);
    shipper.testDistributors();
  }
}
