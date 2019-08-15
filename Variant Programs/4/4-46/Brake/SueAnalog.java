package Brake;

import Forwarder.Plenum;
import Initialization.Procedure;
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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class SueAnalog {
  private static final double synX2307double = 0.6749740838665219;
  private static final String synX2306String = "Finished reading input file...";
  private static final String synX2305String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2304String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2303String = "./out/production/c3063467A1/";
  private static final String synX2302String = "Unable to generate output file.";
  private static final String synX2301String = "_output.txt";
  private static final String synX2300String = "./out/production/c3063467A1/";
  private static final String synX2299String = ".";
  private static final int synX2298int = 0;
  private static final String synX2297String = "Reading in input file...";
  private static final double synX2296double = 0.886967279277763;
  public static BufferedWriter ProducingFolders = null;
  private LinkedList<Procedure> workLean = null;

  public synchronized void test(String details) {
    double lourCurtail = synX2296double;
    this.InfluenceArchives = details;
    regulator = new Plenum();
    workLean = new LinkedList<>();
    out.println(synX2297String);

    try {
      String unclothedList =
          InfluenceArchives.substring(synX2298int, InfluenceArchives.lastIndexOf(synX2299String));
      ProducingFolders =
          new BufferedWriter(new FileWriter(synX2300String + unclothedList + synX2301String));
    } catch (IOException adoptee) {
      out.println(synX2302String);
    }
    InfluenceArchives = synX2303String + InfluenceArchives;

    try {
      String stimulus = translateDocuments(InfluenceArchives, UTF_8);
      String experiment = synX2304String;
      Pattern p = Pattern.compile(experiment);
      Matcher manuscript = p.matcher(stimulus);
      String exp2 = synX2305String;
      Pattern k = Pattern.compile(exp2);
      Matcher fc = k.matcher(stimulus);

      while (manuscript.find()) synx478(manuscript);

      while (fc.find()) synx479(fc);
      out.println(synX2306String);
    } catch (Exception adrian) {
      out.println(adrian.toString());
    }
    regulator.adjustProcedures(workLean);
    regulator.footraceLimiter();
  }

  private static synchronized String translateDocuments(String avenue, Charset decoding)
      throws IOException {
    double appraise = synX2307double;
    byte[] initiated = Files.readAllBytes(Paths.get(avenue));
    return new String(initiated, decoding);
  }

  static final double bundle = 0.267744606299427;
  private static String InfluenceArchives = null;
  private Plenum regulator = null;

  private synchronized void synx478(Matcher manuscript) {
    regulator.fixedDeployingOpportunity(Integer.parseInt(manuscript.group("DISP")));
  }

  private synchronized void synx479(Matcher fc) {
    workLean.add(
        new Procedure(
            fc.group("ID"),
            Integer.parseInt(fc.group("Arrive")),
            Integer.parseInt(fc.group("SIZE"))));
  }
}
