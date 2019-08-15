package Moot;

import Vendor.Trainmaster;
import Programming.System;
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
import static java.util.regex.Pattern.compile;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.lang.Integer.parseInt;

public class MethodsRobot {
  private static final String synX744String = "SIZE";
  private static final String synX743String = "Arrive";
  private static final String synX742String = "ID";
  private static final String synX741String = "DISP";
  private static final double synX740double = 0.4015165332506848;
  private static final String synX739String = "Finished reading input file...";
  private static final String synX738String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX737String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX736String = "./out/production/c3063467A1/";
  private static final String synX735String = "Unable to generate output file.";
  private static final String synX734String = "_output.txt";
  private static final String synX733String = "./out/production/c3063467A1/";
  private static final String synX732String = ".";
  private static final int synX731int = 0;
  private static final String synX730String = "Reading in input file...";
  private static final double synX729double = 0.5295804853548575;
  public static java.io.BufferedWriter ExportationPapers = null;
  private static java.lang.String ResponseDatabase = null;
  private Vendor.Trainmaster limiter = null;
  private java.util.LinkedList<System> mechanismAgenda = null;
  static final String kateOuter = "0OAa0";

  public synchronized void operate(java.lang.String proponents) {
    double integral;
    integral = (synX729double);
    this.ResponseDatabase = (proponents);
    limiter = (new Vendor.Trainmaster());
    mechanismAgenda = (new java.util.LinkedList<>());
    System.out.println(synX730String);

    try {
      java.lang.String withdrawnMake;
      withdrawnMake =
          (ResponseDatabase.substring(synX731int, ResponseDatabase.lastIndexOf(synX732String)));
      ExportationPapers =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX733String + withdrawnMake + synX734String))));
    } catch (java.io.IOException adult) {
      System.out.println(synX735String);
    }
    ResponseDatabase = (synX736String + ResponseDatabase);

    try {
      java.lang.String opinion;
      java.lang.String cust;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern f2;
      java.util.regex.Matcher fab;
      opinion = (wrotePapers(ResponseDatabase, StandardCharsets.UTF_8));
      cust = (synX737String);
      cern = (compile(cust));
      esi = (cern.matcher(opinion));
      exp2 = (synX738String);
      f2 = (compile(exp2));
      fab = (f2.matcher(opinion));

      while (esi.find()) synx94(esi);

      while (fab.find()) synx95(fab);
      System.out.println(synX739String);
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    limiter.bentTechnologies(mechanismAgenda);
    limiter.footraceLimiter();
  }

  private static synchronized java.lang.String wrotePapers(
      java.lang.String destiny, java.nio.charset.Charset demodulation) throws IOException {
    double lessMagnitude;
    lessMagnitude = (synX740double);
    byte[] decodes = readAllBytes(get(destiny));
    return new java.lang.String(decodes, demodulation);
  }

  private synchronized void synx94(Matcher esi) {
    limiter.adjustDispatchedMonth(parseInt(esi.group(synX741String)));
  }

  private synchronized void synx95(Matcher fab) {
    mechanismAgenda.add(
        new Programming.System(
            fab.group(synX742String),
            parseInt(fab.group(synX743String)),
            parseInt(fab.group(synX744String))));
  }
}
