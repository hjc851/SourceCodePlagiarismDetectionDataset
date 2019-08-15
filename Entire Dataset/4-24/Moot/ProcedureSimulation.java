package Moot;

import Exporter.Limiter;
import Workspace.Formalities;
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
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ProcedureSimulation {
  private static final int synX1344int = 843466783;
  private static final String synX1343String = "Finished reading input file...";
  private static final String synX1342String = "SIZE";
  private static final String synX1341String = "Arrive";
  private static final String synX1340String = "ID";
  private static final String synX1339String = "DISP";
  private static final String synX1338String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1337String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1336String = "./out/production/c3063467A1/";
  private static final String synX1335String = "Unable to generate output file.";
  private static final String synX1334String = "_output.txt";
  private static final String synX1333String = "./out/production/c3063467A1/";
  private static final String synX1332String = ".";
  private static final int synX1331int = 0;
  private static final String synX1330String = "Reading in input file...";
  private static final double synX1329double = 0.37608630573155355;
  private LinkedList<Formalities> litigateLeaning = null;

  public synchronized void work(String nsi) {
    double beacon;
    beacon = synX1329double;
    this.StimulationLodge = nsi;
    coordinator = new Limiter();
    litigateLeaning = new LinkedList<>();
    System.out.println(synX1330String);

    try {
      String dismantledKey;
      dismantledKey =
          StimulationLodge.substring(synX1331int, StimulationLodge.lastIndexOf(synX1332String));
      ManufacturingComplaint =
          new BufferedWriter(new FileWriter(synX1333String + dismantledKey + synX1334String));
    } catch (IOException abdul) {
      System.out.println(synX1335String);
    }
    StimulationLodge = synX1336String + StimulationLodge;

    try {
      String submissions;
      String exc;
      Pattern cern;
      Matcher dos;
      String exp2;
      Pattern n;
      Matcher p4;
      submissions = registerSubmit(StimulationLodge, StandardCharsets.UTF_8);
      exc = synX1337String;
      cern = compile(exc);
      dos = cern.matcher(submissions);
      exp2 = synX1338String;
      n = compile(exp2);
      p4 = n.matcher(submissions);

      while (dos.find()) {
        coordinator.situatedDeploymentMinutes(parseInt(dos.group(synX1339String)));
      }

      while (p4.find()) {
        litigateLeaning.add(
            new Formalities(
                p4.group(synX1340String),
                parseInt(p4.group(synX1341String)),
                parseInt(p4.group(synX1342String))));
      }
      System.out.println(synX1343String);
    } catch (Exception officio) {
      System.out.println(officio.toString());
    }
    coordinator.orderedMechanisms(litigateLeaning);
    coordinator.scarperCaller();
  }

  private static String StimulationLodge = null;
  public static BufferedWriter ManufacturingComplaint = null;
  private Limiter coordinator = null;

  private static synchronized String registerSubmit(String footpath, Charset code)
      throws IOException {
    int valuation;
    valuation = synX1344int;
    byte[] demodulated = readAllBytes(get(footpath));
    return new String(demodulated, code);
  }

  public static double gauge = 0.28999766699022234;
}
