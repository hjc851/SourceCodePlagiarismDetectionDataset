package Moot;

import Caller.Starter;
import Writer.Negotiations;
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
import static java.util.regex.Pattern.compile;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.lang.Integer.parseInt;

public class ProceedingsKinematics {
  private static final String synX1755String = "SIZE";
  private static final String synX1754String = "Arrive";
  private static final String synX1753String = "ID";
  private static final String synX1752String = "DISP";
  private static final String synX1751String = "Finished reading input file...";
  private static final String synX1750String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1749String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1748String = "./out/production/c3063467A1/";
  private static final String synX1747String = "Unable to generate output file.";
  private static final String synX1746String = "_output.txt";
  private static final String synX1745String = "./out/production/c3063467A1/";
  private static final String synX1744String = ".";
  private static final int synX1743int = 0;
  private static final String synX1742String = "Reading in input file...";
  public static java.io.BufferedWriter InputInitiate = null;
  private static java.lang.String InvolvementData = null;
  private Caller.Starter reseller = null;
  private java.util.LinkedList<Negotiations> summonsRoster = null;

  public synchronized void play(java.lang.String immigration) {
    this.InvolvementData = immigration;
    reseller = new Caller.Starter();
    summonsRoster = new java.util.LinkedList<>();
    out.println(synX1742String);

    try {
      java.lang.String removedIdentify;
      removedIdentify =
          InvolvementData.substring(synX1743int, InvolvementData.lastIndexOf(synX1744String));
      InputInitiate =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX1745String + removedIdentify + synX1746String));
    } catch (java.io.IOException admittedly) {
      out.println(synX1747String);
    }
    InvolvementData = synX1748String + InvolvementData;

    try {
      java.lang.String opinions;
      java.lang.String reciprocal;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern b2;
      java.util.regex.Matcher p4;
      opinions = understandCharge(InvolvementData, UTF_8);
      reciprocal = synX1749String;
      writes = compile(reciprocal);
      manuscript = writes.matcher(opinions);
      exp2 = synX1750String;
      b2 = compile(exp2);
      p4 = b2.matcher(opinions);

      while (manuscript.find()) synx358(manuscript);

      while (p4.find()) synx359(p4);
      out.println(synX1751String);
    } catch (java.lang.Exception adrian) {
      out.println(adrian.toString());
    }
    reseller.adjustProcedures(summonsRoster);
    reseller.raceShipper();
  }

  private static synchronized java.lang.String understandCharge(
      java.lang.String ride, java.nio.charset.Charset codifying) throws IOException {
    byte[] scrambled = readAllBytes(get(ride));
    return new java.lang.String(scrambled, codifying);
  }

  private synchronized void synx358(Matcher manuscript) {
    reseller.solidifyingOfficeJuncture(parseInt(manuscript.group(synX1752String)));
  }

  private synchronized void synx359(Matcher p4) {
    summonsRoster.add(
        new Writer.Negotiations(
            p4.group(synX1753String),
            parseInt(p4.group(synX1754String)),
            parseInt(p4.group(synX1755String))));
  }
}
