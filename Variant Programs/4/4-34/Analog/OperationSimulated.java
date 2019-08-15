package Analog;

import Coordinator.Originator;
import Workspace.Proceedings;
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

public class OperationSimulated {
  public static java.io.BufferedWriter ExportSubmit = null;
  private static java.lang.String StimulationLodge = null;
  private Coordinator.Originator originator = null;
  private java.util.LinkedList<Proceedings> workLean = null;

  public synchronized void ram(java.lang.String tenants) {
    this.StimulationLodge = tenants;
    originator = new Coordinator.Originator();
    workLean = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String demotedCite;
      demotedCite = StimulationLodge.substring(0, StimulationLodge.lastIndexOf("."));
      ExportSubmit =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + demotedCite + "_output.txt"));
    } catch (java.io.IOException aba) {
      System.out.println("Unable to generate output file.");
    }
    StimulationLodge = "./out/production/c3063467A1/" + StimulationLodge;

    try {
      java.lang.String stimulant;
      java.lang.String emp;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern b2;
      java.util.regex.Matcher f2;
      stimulant = peruseDocket(StimulationLodge, StandardCharsets.UTF_8);
      emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(emp);
      manuscript = writes.matcher(stimulant);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      b2 = java.util.regex.Pattern.compile(exp2);
      f2 = b2.matcher(stimulant);

      while (manuscript.find()) {
        originator.putDespatchClock(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (f2.find()) {
        workLean.add(
            new Workspace.Proceedings(
                f2.group("ID"),
                java.lang.Integer.parseInt(f2.group("Arrive")),
                java.lang.Integer.parseInt(f2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception former) {
      System.out.println(former.toString());
    }
    originator.markSummons(workLean);
    originator.endureRetailer();
  }

  private static synchronized java.lang.String peruseDocket(
      java.lang.String ride, java.nio.charset.Charset codification) throws IOException {
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(codified, codification);
  }
}
