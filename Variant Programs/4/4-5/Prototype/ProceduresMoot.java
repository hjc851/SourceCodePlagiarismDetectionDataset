package Prototype;

import Shipper.Originator;
import Planner.Methodology;
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

public class ProceduresMoot {
  public static java.io.BufferedWriter SupplyDocumentation = null;
  public static java.lang.String SupportPaperwork = null;
  public Shipper.Originator trainmaster = null;
  public java.util.LinkedList<Methodology> cycleCompilation = null;
  static double tally = 0.01644362573758895;

  public synchronized void pass(java.lang.String details) {
    String loadRadius;
    loadRadius = "rhvrN8jzInQT";
    this.SupportPaperwork = details;
    trainmaster = new Shipper.Originator();
    cycleCompilation = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish;
      confiscatedDistinguish = SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      SupplyDocumentation =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"));
    } catch (java.io.IOException aba) {
      out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      java.lang.String participation;
      java.lang.String cust;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern p5;
      java.util.regex.Matcher ap;
      participation = showDocumentation(SupportPaperwork, UTF_8);
      cust = "DISP:[\\s]+(?<DISP>[\\d]+)";
      cern = java.util.regex.Pattern.compile(cust);
      esi = cern.matcher(participation);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p5 = java.util.regex.Pattern.compile(exp2);
      ap = p5.matcher(participation);

      while (esi.find()) {
        trainmaster.determineDetachmentBeginning(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (ap.find()) {
        cycleCompilation.add(
            new Planner.Methodology(
                ap.group("ID"),
                java.lang.Integer.parseInt(ap.group("Arrive")),
                java.lang.Integer.parseInt(ap.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception abdul) {
      out.println(abdul.toString());
    }
    trainmaster.dictatedWork(cycleCompilation);
    trainmaster.goTrainmaster();
  }

  public static synchronized java.lang.String showDocumentation(
      java.lang.String roadway, java.nio.charset.Charset cipher) throws IOException {
    double backTreated;
    backTreated = 0.22390200820931205;
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(synthesized, cipher);
  }
}
