package Simulating;

import Yardmaster.Forwarder;
import Debugging.Proceedings;
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

public class NegotiationsAvionics {
  private static final String synX836String = "Finished reading input file...";
  private static final String synX835String = "SIZE";
  private static final String synX834String = "Arrive";
  private static final String synX833String = "ID";
  private static final String synX832String = "DISP";
  private static final String synX831String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX830String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX829String = "./out/production/c3063467A1/";
  private static final String synX828String = "Unable to generate output file.";
  private static final String synX827String = "_output.txt";
  private static final String synX826String = "./out/production/c3063467A1/";
  private static final String synX825String = ".";
  private static final int synX824int = 0;
  private static final String synX823String = "Reading in input file...";
  public static java.io.BufferedWriter ExportationPapers;
  public static java.lang.String PerspectiveApplication;
  public Yardmaster.Forwarder device;
  public java.util.LinkedList<Proceedings> proceedingRosters;

  public synchronized void extend(java.lang.String cbs) {
    this.PerspectiveApplication = cbs;
    device = new Yardmaster.Forwarder();
    proceedingRosters = new java.util.LinkedList<>();
    System.out.println(synX823String);

    try {
      java.lang.String deprivedAppoint;
      deprivedAppoint =
          PerspectiveApplication.substring(
              synX824int, PerspectiveApplication.lastIndexOf(synX825String));
      ExportationPapers =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX826String + deprivedAppoint + synX827String));
    } catch (java.io.IOException exwife) {
      System.out.println(synX828String);
    }
    PerspectiveApplication = synX829String + PerspectiveApplication;

    try {
      java.lang.String suggestions;
      java.lang.String supp;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher dos;
      java.lang.String exp2;
      java.util.regex.Pattern c2;
      java.util.regex.Matcher fab;
      suggestions = learnRegister(PerspectiveApplication, StandardCharsets.UTF_8);
      supp = synX830String;
      postscript = java.util.regex.Pattern.compile(supp);
      dos = postscript.matcher(suggestions);
      exp2 = synX831String;
      c2 = java.util.regex.Pattern.compile(exp2);
      fab = c2.matcher(suggestions);

      while (dos.find()) {
        device.putDespatchClock(java.lang.Integer.parseInt(dos.group(synX832String)));
      }

      while (fab.find()) {
        proceedingRosters.add(
            new Debugging.Proceedings(
                fab.group(synX833String),
                java.lang.Integer.parseInt(fab.group(synX834String)),
                java.lang.Integer.parseInt(fab.group(synX835String))));
      }
      System.out.println(synX836String);
    } catch (java.lang.Exception vet) {
      System.out.println(vet.toString());
    }
    device.settledServe(proceedingRosters);
    device.endureRetailer();
  }

  public static synchronized java.lang.String learnRegister(
      java.lang.String trail, java.nio.charset.Charset codified) throws IOException {
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(scrambled, codified);
  }
}
