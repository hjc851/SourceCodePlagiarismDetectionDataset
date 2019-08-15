package Robot;

import Distributors.Plenum;
import Spooler.Appendage;
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

public class MechanismsManikin {
  private static final String synX1571String = "SIZE";
  private static final String synX1570String = "Arrive";
  private static final String synX1569String = "ID";
  private static final String synX1568String = "DISP";
  private static final String synX1567String = "Finished reading input file...";
  private static final String synX1566String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1565String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1564String = "./out/production/c3063467A1/";
  private static final String synX1563String = "Unable to generate output file.";
  private static final String synX1562String = "_output.txt";
  private static final String synX1561String = "./out/production/c3063467A1/";
  private static final String synX1560String = ".";
  private static final int synX1559int = 0;
  private static final String synX1558String = "Reading in input file...";
  private LinkedList<Appendage> marchTilt;
  private Plenum resellers;
  private static String InfluenceArchives;
  public static BufferedWriter EfficiencyDocket;

  public synchronized void carry(String without) {
    this.InfluenceArchives = without;
    resellers = new Plenum();
    marchTilt = new LinkedList<>();
    System.out.println(synX1558String);

    try {
      String confiscatedDistinguish =
          InfluenceArchives.substring(synX1559int, InfluenceArchives.lastIndexOf(synX1560String));
      EfficiencyDocket =
          new BufferedWriter(
              new FileWriter(synX1561String + confiscatedDistinguish + synX1562String));
    } catch (IOException officio) {
      System.out.println(synX1563String);
    }
    InfluenceArchives = synX1564String + InfluenceArchives;

    try {
      String stimulant = scanFolders(InfluenceArchives, StandardCharsets.UTF_8);
      String lic = synX1565String;
      Pattern p = Pattern.compile(lic);
      Matcher sm = p.matcher(stimulant);
      String exp2 = synX1566String;
      Pattern a = Pattern.compile(exp2);
      Matcher fio = a.matcher(stimulant);

      while (sm.find()) synx286(sm);

      while (fio.find()) synx287(fio);
      System.out.println(synX1567String);
    } catch (Exception past) {
      System.out.println(past.toString());
    }
    resellers.prepareMethodologies(marchTilt);
    resellers.goTrainmaster();
  }

  private static synchronized String scanFolders(String route, Charset scrambling)
      throws IOException {
    byte[] initiated = Files.readAllBytes(Paths.get(route));
    return new String(initiated, scrambling);
  }

  private synchronized void synx286(Matcher sm) {
    resellers.primedExpeditionPeriod(Integer.parseInt(sm.group(synX1568String)));
  }

  private synchronized void synx287(Matcher fio) {
    marchTilt.add(
        new Appendage(
            fio.group(synX1569String),
            Integer.parseInt(fio.group(synX1570String)),
            Integer.parseInt(fio.group(synX1571String))));
  }
}
