package Device;

import Forwarder.Salesperson;
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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.regex.Pattern.compile;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.lang.Integer.parseInt;

public class SummonsFaker {
  private static final String synX134String = "SIZE";
  private static final String synX133String = "Arrive";
  private static final String synX132String = "ID";
  private static final String synX131String = "DISP";
  private static final String synX130String = "rzv";
  private static final String synX129String = "Finished reading input file...";
  private static final String synX128String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX127String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX126String = "./out/production/c3063467A1/";
  private static final String synX125String = "Unable to generate output file.";
  private static final String synX124String = "_output.txt";
  private static final String synX123String = "./out/production/c3063467A1/";
  private static final String synX122String = ".";
  private static final int synX121int = 0;
  private static final String synX120String = "Reading in input file...";
  private static final double synX119double = 0.9649847470362273;
  public static java.io.BufferedWriter EfficiencyDocket;
  public static java.lang.String ResponseDatabase;
  public Forwarder.Salesperson vendor;
  public java.util.LinkedList<Cycle> litigateLeaning;
  static int marxRoll = 152070336;

  public synchronized void pass(java.lang.String nsis) {
    double identification;
    identification = (synX119double);
    this.ResponseDatabase = (nsis);
    vendor = (new Forwarder.Salesperson());
    litigateLeaning = (new java.util.LinkedList<>());
    out.println(synX120String);

    try {
      java.lang.String disassembledPatronymic;
      disassembledPatronymic =
          (ResponseDatabase.substring(synX121int, ResponseDatabase.lastIndexOf(synX122String)));
      EfficiencyDocket =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX123String + disassembledPatronymic + synX124String))));
    } catch (java.io.IOException tipp) {
      out.println(synX125String);
    }
    ResponseDatabase = (synX126String + ResponseDatabase);

    try {
      java.lang.String opinions;
      java.lang.String lic;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern aj;
      java.util.regex.Matcher fig;
      opinions = (interpretLodge(ResponseDatabase, UTF_8));
      lic = (synX127String);
      postscript = (compile(lic));
      esi = (postscript.matcher(opinions));
      exp2 = (synX128String);
      aj = (compile(exp2));
      fig = (aj.matcher(opinions));

      while (esi.find()) synx22(esi);

      while (fig.find()) synx23(fig);
      out.println(synX129String);
    } catch (java.lang.Exception pro) {
      out.println(pro.toString());
    }
    vendor.determineProces(litigateLeaning);
    vendor.operateStarter();
  }

  public static synchronized java.lang.String interpretLodge(
      java.lang.String avenue, java.nio.charset.Charset encrypt) throws IOException {
    String cksMaterials;
    cksMaterials = (synX130String);
    byte[] entered = readAllBytes(get(avenue));
    return new java.lang.String(entered, encrypt);
  }

  private synchronized void synx22(Matcher esi) {
    vendor.adjustDispatchedMonth(parseInt(esi.group(synX131String)));
  }

  private synchronized void synx23(Matcher fig) {
    litigateLeaning.add(
        new Controller.Cycle(
            fig.group(synX132String),
            parseInt(fig.group(synX133String)),
            parseInt(fig.group(synX134String))));
  }
}
