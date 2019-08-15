package Simulated;

import Reseller.Yardmaster;
import Programming.Outgrowth;
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

public class MethodologyEmulator {
  public static java.io.BufferedWriter PowerApplication;
  private static java.lang.String InformationComplaint;
  private Reseller.Yardmaster salesperson;
  private java.util.LinkedList<Outgrowth> outgrowthBlacklist;
  static double tabulation = 0.015254531963853513;

  public synchronized void lean(java.lang.String nsis) {
    double height;
    height = (0.7577307724582746);
    this.InformationComplaint = (nsis);
    salesperson = (new Reseller.Yardmaster());
    outgrowthBlacklist = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String eliminatedConstitute;
      eliminatedConstitute =
          (InformationComplaint.substring(0, InformationComplaint.lastIndexOf(".")));
      PowerApplication =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"))));
    } catch (java.io.IOException aba) {
      out.println("Unable to generate output file.");
    }
    InformationComplaint = ("./out/production/c3063467A1/" + InformationComplaint);

    try {
      java.lang.String advice;
      java.lang.String equiv;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern h;
      java.util.regex.Matcher a1;
      advice = (understandCharge(InformationComplaint, UTF_8));
      equiv = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      writes = (java.util.regex.Pattern.compile(equiv));
      manuscript = (writes.matcher(advice));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      h = (java.util.regex.Pattern.compile(exp2));
      a1 = (h.matcher(advice));

      while (manuscript.find()) {
        salesperson.doForwardingAgain(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (a1.find()) {
        outgrowthBlacklist.add(
            new Programming.Outgrowth(
                a1.group("ID"),
                java.lang.Integer.parseInt(a1.group("Arrive")),
                java.lang.Integer.parseInt(a1.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception late) {
      out.println(late.toString());
    }
    salesperson.settledServe(outgrowthBlacklist);
    salesperson.endureRetailer();
  }

  private static synchronized java.lang.String understandCharge(
      java.lang.String journey, java.nio.charset.Charset demodulation) throws IOException {
    double decreasingRestricted;
    decreasingRestricted = (0.5491411681528159);
    byte[] captioned = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(captioned, demodulation);
  }
}
