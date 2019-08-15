package Moot;

import Forwarder.Yardmaster;
import Programmer.Sue;
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

public class SummonsFaker {
  private static final String synX2192String = "Finished reading input file...";
  private static final String synX2191String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2190String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2189String = "./out/production/c3063467A1/";
  private static final String synX2188String = "Unable to generate output file.";
  private static final String synX2187String = "_output.txt";
  private static final String synX2186String = "./out/production/c3063467A1/";
  private static final String synX2185String = ".";
  private static final int synX2184int = 0;
  private static final String synX2183String = "Reading in input file...";
  private static final double synX2182double = 0.17772993644959556;
  private static final String synX2181String = "cVpJBJbJ3MDzpJ";
  public java.util.LinkedList<Sue> marchTilt;
  public Forwarder.Yardmaster sender;
  static final int cite = -362421880;
  public static java.io.BufferedWriter ProducesFilename;

  public static synchronized java.lang.String scanFolders(
      java.lang.String direction, java.nio.charset.Charset codified) throws IOException {
    String key = synX2181String;
    byte[] stored = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(direction));
    return new java.lang.String(stored, codified);
  }

  public synchronized void outpouring(java.lang.String entries) {
    double restrain = synX2182double;
    this.GuidanceFilename = entries;
    sender = new Forwarder.Yardmaster();
    marchTilt = new java.util.LinkedList<>();
    System.out.println(synX2183String);

    try {
      java.lang.String dismantledKey =
          GuidanceFilename.substring(synX2184int, GuidanceFilename.lastIndexOf(synX2185String));
      ProducesFilename =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX2186String + dismantledKey + synX2187String));
    } catch (java.io.IOException libris) {
      System.out.println(synX2188String);
    }
    GuidanceFilename = synX2189String + GuidanceFilename;

    try {
      java.lang.String stimulus = scanFolders(GuidanceFilename, StandardCharsets.UTF_8);
      java.lang.String mgr = synX2190String;
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(mgr);
      java.util.regex.Matcher manuscript = cern.matcher(stimulus);
      java.lang.String exp2 = synX2191String;
      java.util.regex.Pattern n = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher d = n.matcher(stimulus);

      while (manuscript.find()) synx454(manuscript);

      while (d.find()) synx455(d);
      System.out.println(synX2192String);
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    sender.readyMarch(marchTilt);
    sender.passMailer();
  }

  public static java.lang.String GuidanceFilename;

  private synchronized void synx454(Matcher manuscript) {
    sender.markDispatchesHours(java.lang.Integer.parseInt(manuscript.group("DISP")));
  }

  private synchronized void synx455(Matcher d) {
    marchTilt.add(
        new Programmer.Sue(
            d.group("ID"),
            java.lang.Integer.parseInt(d.group("Arrive")),
            java.lang.Integer.parseInt(d.group("SIZE"))));
  }
}
