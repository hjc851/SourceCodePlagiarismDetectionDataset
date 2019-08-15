package Joystick;

import Salesperson.Retailer;
import Debugging.Operation;
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

public class OperationSimulated {
  private java.util.LinkedList<Operation> serveNames = null;
  private Salesperson.Retailer dealer = null;
  private static java.lang.String ResponseDatabase = null;
  public static java.io.BufferedWriter ManufacturingComplaint = null;

  public synchronized void campaign(java.lang.String nsis) {
    this.ResponseDatabase = (nsis);
    dealer = (new Salesperson.Retailer());
    serveNames = (new java.util.LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      java.lang.String deprivedAppoint =
          ResponseDatabase.substring(0, ResponseDatabase.lastIndexOf("."));
      ManufacturingComplaint =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + deprivedAppoint + "_output.txt"))));
    } catch (java.io.IOException past) {
      System.out.println("Unable to generate output file.");
    }
    ResponseDatabase = ("./out/production/c3063467A1/" + ResponseDatabase);

    try {
      java.lang.String opinions = quoteData(ResponseDatabase, StandardCharsets.UTF_8);
      java.lang.String ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = compile(ope);
      java.util.regex.Matcher sm = vig.matcher(opinions);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern ribulose = compile(exp2);
      java.util.regex.Matcher ap = ribulose.matcher(opinions);

      while (sm.find()) synx190(sm);

      while (ap.find()) synx191(ap);
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
    }
    dealer.solidifyingOperations(serveNames);
    dealer.goTrainmaster();
  }

  private static synchronized java.lang.String quoteData(
      java.lang.String footpath, java.nio.charset.Charset encryption) throws IOException {
    byte[] codified = readAllBytes(get(footpath));
    return new java.lang.String(codified, encryption);
  }

  private synchronized void synx190(Matcher sm) {
    dealer.markDispatchesHours(parseInt(sm.group("DISP")));
  }

  private synchronized void synx191(Matcher ap) {
    serveNames.add(
        new Debugging.Operation(
            ap.group("ID"), parseInt(ap.group("Arrive")), parseInt(ap.group("SIZE"))));
  }
}
