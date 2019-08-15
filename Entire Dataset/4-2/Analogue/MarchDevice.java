package Analogue;

import Coordinator.Caller;
import Server.Procedure;
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

public class MarchDevice {

  public synchronized void pass(String tenants) {
    this.SupportPaperwork = (tenants);
    responsible = (new Caller());
    methodologyRegistry = (new LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      String bareEpithet;
      bareEpithet = (SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf(".")));
      PerformanceArchives =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + bareEpithet + "_output.txt"))));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = ("./out/production/c3063467A1/" + SupportPaperwork);

    try {
      String consultation;
      String purch;
      Pattern cern;
      Matcher dos;
      String exp2;
      Pattern c4;
      Matcher b2;
      consultation = (aloudApplication(SupportPaperwork, StandardCharsets.UTF_8));
      purch = ("DISP:[\\s]+(?<DISP>[\\d]+)");
      cern = (compile(purch));
      dos = (cern.matcher(consultation));
      exp2 =
          ("ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END");
      c4 = (compile(exp2));
      b2 = (c4.matcher(consultation));

      while (dos.find()) {
        responsible.readyRemoveDay(parseInt(dos.group("DISP")));
      }

      while (b2.find()) {
        methodologyRegistry.add(
            new Procedure(
                b2.group("ID"), parseInt(b2.group("Arrive")), parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
    }
    responsible.putProcedure(methodologyRegistry);
    responsible.tallyConsignor();
  }

  private Caller responsible = null;
  public static BufferedWriter PerformanceArchives = null;
  private static String SupportPaperwork = null;
  private LinkedList<Procedure> methodologyRegistry = null;

  private static synchronized String aloudApplication(String step, Charset codified)
      throws IOException {
    byte[] cryptographic = readAllBytes(get(step));
    return new String(cryptographic, codified);
  }
}
