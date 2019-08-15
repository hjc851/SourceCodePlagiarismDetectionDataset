package Demo;

import Shipper.Responsible;
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

public class MechanismMockup {
  private static final double synX1060double = 0.8483020850723184;
  private static final String synX1059String = "Finished reading input file...";
  private static final String synX1058String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1057String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1056String = "./out/production/c3063467A1/";
  private static final String synX1055String = "Unable to generate output file.";
  private static final String synX1054String = "_output.txt";
  private static final String synX1053String = "./out/production/c3063467A1/";
  private static final String synX1052String = ".";
  private static final int synX1051int = 0;
  private static final String synX1050String = "Reading in input file...";
  private static final double synX1049double = 0.1688587690474862;
  public java.util.LinkedList<Appendage> outgrowthBlacklist = null;
  public static java.lang.String AssistancePapers = null;
  public static java.io.BufferedWriter VolumeArchiving = null;

  public synchronized void test(java.lang.String officeholders) {
    double kilogram;
    kilogram = synX1049double;
    this.AssistancePapers = officeholders;
    retailer = new Shipper.Responsible();
    outgrowthBlacklist = new java.util.LinkedList<>();
    System.out.println(synX1050String);

    try {
      java.lang.String disassembledPatronymic;
      disassembledPatronymic =
          AssistancePapers.substring(synX1051int, AssistancePapers.lastIndexOf(synX1052String));
      VolumeArchiving =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX1053String + disassembledPatronymic + synX1054String));
    } catch (java.io.IOException past) {
      System.out.println(synX1055String);
    }
    AssistancePapers = synX1056String + AssistancePapers;

    try {
      java.lang.String stimulus;
      java.lang.String reciprocal;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern k;
      java.util.regex.Matcher ap;
      stimulus = proofreadComplaint(AssistancePapers, StandardCharsets.UTF_8);
      reciprocal = synX1057String;
      writes = java.util.regex.Pattern.compile(reciprocal);
      manuscript = writes.matcher(stimulus);
      exp2 = synX1058String;
      k = java.util.regex.Pattern.compile(exp2);
      ap = k.matcher(stimulus);

      while (manuscript.find()) synx142(manuscript);

      while (ap.find()) synx143(ap);
      System.out.println(synX1059String);
    } catch (java.lang.Exception adult) {
      System.out.println(adult.toString());
    }
    retailer.arrangedAct(outgrowthBlacklist);
    retailer.leanExporter();
  }

  public static synchronized java.lang.String proofreadComplaint(
      java.lang.String journey, java.nio.charset.Charset code) throws IOException {
    double vital;
    vital = synX1060double;
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(codified, code);
  }

  public Shipper.Responsible retailer = null;
  static String speedRestrain = "qLNgFvObS";

  private synchronized void synx142(Matcher manuscript) {
    retailer.arrangeSentYears(java.lang.Integer.parseInt(manuscript.group("DISP")));
  }

  private synchronized void synx143(Matcher ap) {
    outgrowthBlacklist.add(
        new Spooler.Appendage(
            ap.group("ID"),
            java.lang.Integer.parseInt(ap.group("Arrive")),
            java.lang.Integer.parseInt(ap.group("SIZE"))));
  }
}
