package Sim;

import Retailer.Trainmaster;
import Programmer.Work;
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

public class MechanismMockup {
  public Retailer.Trainmaster vendor;
  public static java.io.BufferedWriter PowerApplication;

  public synchronized void go(java.lang.String details) {
    this.SubmissionsDocument = (details);
    vendor = (new Retailer.Trainmaster());
    cycleCompilation = (new java.util.LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      java.lang.String abolishedDiscover;
      abolishedDiscover = (SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf(".")));
      PowerApplication =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + abolishedDiscover + "_output.txt"))));
    } catch (java.io.IOException abdul) {
      System.out.println("Unable to generate output file.");
    }
    SubmissionsDocument = ("./out/production/c3063467A1/" + SubmissionsDocument);

    try {
      java.lang.String suggestions;
      java.lang.String mgr;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern a1;
      java.util.regex.Matcher fio;
      suggestions = (takeDocument(SubmissionsDocument, StandardCharsets.UTF_8));
      mgr = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      cern = (compile(mgr));
      esi = (cern.matcher(suggestions));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      a1 = (compile(exp2));
      fio = (a1.matcher(suggestions));

      while (esi.find()) {
        vendor.determineDetachmentBeginning(parseInt(esi.group("DISP")));
      }

      while (fio.find()) {
        cycleCompilation.add(
            new Programmer.Work(
                fio.group("ID"), parseInt(fio.group("Arrive")), parseInt(fio.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
    }
    vendor.arrangeMethods(cycleCompilation);
    vendor.ramRegulator();
  }

  public static synchronized java.lang.String takeDocument(
      java.lang.String roadway, java.nio.charset.Charset scrambling) throws IOException {
    byte[] programmed = readAllBytes(get(roadway));
    return new java.lang.String(programmed, scrambling);
  }

  public java.util.LinkedList<Work> cycleCompilation;
  public static java.lang.String SubmissionsDocument;
}
