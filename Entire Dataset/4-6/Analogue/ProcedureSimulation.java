package Analogue;

import Plenum.Dealer;
import Workflow.Treat;
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

public class ProcedureSimulation {
  private static final String synX226String = "Finished reading input file...";
  private static final String synX225String = "SIZE";
  private static final String synX224String = "Arrive";
  private static final String synX223String = "ID";
  private static final String synX222String = "DISP";
  private static final String synX221String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX220String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX219String = "./out/production/c3063467A1/";
  private static final String synX218String = "Unable to generate output file.";
  private static final String synX217String = "_output.txt";
  private static final String synX216String = "./out/production/c3063467A1/";
  private static final String synX215String = ".";
  private static final int synX214int = 0;
  private static final String synX213String = "Reading in input file...";
  public LinkedList<Treat> operationName = null;
  public Dealer consignor = null;
  public static String OpinionsDocuments = null;
  public static BufferedWriter ProductivityDocuments = null;

  public synchronized void endure(String nsi) {
    this.OpinionsDocuments = (nsi);
    consignor = (new Dealer());
    operationName = (new LinkedList<>());
    out.println(synX213String);

    try {
      String disassembledPatronymic =
          OpinionsDocuments.substring(synX214int, OpinionsDocuments.lastIndexOf(synX215String));
      ProductivityDocuments =
          (new BufferedWriter(
              new FileWriter((synX216String + disassembledPatronymic + synX217String))));
    } catch (IOException libris) {
      out.println(synX218String);
    }
    OpinionsDocuments = (synX219String + OpinionsDocuments);

    try {
      String participation = aloudApplication(OpinionsDocuments, UTF_8);
      String explanatory = synX220String;
      Pattern p = Pattern.compile(explanatory);
      Matcher sm = p.matcher(participation);
      String exp2 = synX221String;
      Pattern gpi = Pattern.compile(exp2);
      Matcher a1 = gpi.matcher(participation);

      while (sm.find()) {
        consignor.adjustDispatchedMonth(Integer.parseInt(sm.group(synX222String)));
      }

      while (a1.find()) {
        operationName.add(
            new Treat(
                a1.group(synX223String),
                Integer.parseInt(a1.group(synX224String)),
                Integer.parseInt(a1.group(synX225String))));
      }
      out.println(synX226String);
    } catch (Exception adult) {
      out.println(adult.toString());
    }
    consignor.putProcedure(operationName);
    consignor.extendDealer();
  }

  public static synchronized String aloudApplication(String step, Charset encoders)
      throws IOException {
    byte[] consolidated = Files.readAllBytes(Paths.get(step));
    return new String(consolidated, encoders);
  }
}
