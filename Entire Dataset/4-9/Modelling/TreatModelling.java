package Modelling;

import Caller.Responsible;
import Controller.Cycle;
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

public class TreatModelling {
  private static final String synX463String = "h";
  private static final String synX462String = "Finished reading input file...";
  private static final String synX461String = "SIZE";
  private static final String synX460String = "Arrive";
  private static final String synX459String = "ID";
  private static final String synX458String = "DISP";
  private static final String synX457String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX456String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX455String = "./out/production/c3063467A1/";
  private static final String synX454String = "Unable to generate output file.";
  private static final String synX453String = "_output.txt";
  private static final String synX452String = "./out/production/c3063467A1/";
  private static final String synX451String = ".";
  private static final int synX450int = 0;
  private static final String synX449String = "Reading in input file...";
  private static final double synX448double = 0.2114033180907633;
  public LinkedList<Cycle> mechanismAgenda = null;

  public synchronized void melt(String proponents) {
    double identification;
    identification = synX448double;
    this.StimulantCharge = proponents;
    shipper = new Responsible();
    mechanismAgenda = new LinkedList<>();
    System.out.println(synX449String);

    try {
      String degradedPseudonym;
      degradedPseudonym =
          StimulantCharge.substring(synX450int, StimulantCharge.lastIndexOf(synX451String));
      ProductivityDocuments =
          new BufferedWriter(new FileWriter(synX452String + degradedPseudonym + synX453String));
    } catch (IOException libris) {
      System.out.println(synX454String);
    }
    StimulantCharge = synX455String + StimulantCharge;

    try {
      String comments;
      String emp;
      Pattern p;
      Matcher sm;
      String exp2;
      Pattern a3;
      Matcher b;
      comments = readableArchiving(StimulantCharge, StandardCharsets.UTF_8);
      emp = synX456String;
      p = Pattern.compile(emp);
      sm = p.matcher(comments);
      exp2 = synX457String;
      a3 = Pattern.compile(exp2);
      b = a3.matcher(comments);

      while (sm.find()) {
        shipper.laidShipmentClip(Integer.parseInt(sm.group(synX458String)));
      }

      while (b.find()) {
        mechanismAgenda.add(
            new Cycle(
                b.group(synX459String),
                Integer.parseInt(b.group(synX460String)),
                Integer.parseInt(b.group(synX461String))));
      }
      System.out.println(synX462String);
    } catch (Exception abe) {
      System.out.println(abe.toString());
    }
    shipper.primedAppendage(mechanismAgenda);
    shipper.endureRetailer();
  }

  public static String StimulantCharge = null;
  public Responsible shipper = null;

  public static synchronized String readableArchiving(String progression, Charset demodulation)
      throws IOException {
    String diagnose;
    diagnose = synX463String;
    byte[] programmed = Files.readAllBytes(Paths.get(progression));
    return new String(programmed, demodulation);
  }

  static String jesusExtent = "H2vSuoQDCkYwKyPUYsC";
  public static BufferedWriter ProductivityDocuments = null;
}
