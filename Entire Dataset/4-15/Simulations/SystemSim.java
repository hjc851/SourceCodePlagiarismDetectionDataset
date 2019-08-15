package Simulations;

import Responsible.Originator;
import Interface.Mechanisms;
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
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class SystemSim {
  public static final double peakSize = 0.9213764212228311;
  private LinkedList<Mechanisms> negotiationsListings = null;
  private Originator distributors = null;
  private static String ConsultationSubmit = null;
  public static BufferedWriter PowerApplication = null;

  public synchronized void outpouring(String entries) {
    double upstreamBorder = 0.14792909143105892;
    this.ConsultationSubmit = (entries);
    distributors = (new Originator());
    negotiationsListings = (new LinkedList<>());
    out.println("Reading in input file...");

    try {
      String denudedDiagnose = ConsultationSubmit.substring(0, ConsultationSubmit.lastIndexOf("."));
      PowerApplication =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"))));
    } catch (IOException con) {
      out.println("Unable to generate output file.");
    }
    ConsultationSubmit = ("./out/production/c3063467A1/" + ConsultationSubmit);

    try {
      String stimulation = readerInitiate(ConsultationSubmit, UTF_8);
      String exc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = compile(exc);
      Matcher manuscript = p.matcher(stimulation);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern k = compile(exp2);
      Matcher e = k.matcher(stimulation);

      while (manuscript.find()) {
        distributors.readyRemoveDay(parseInt(manuscript.group("DISP")));
      }

      while (e.find()) {
        negotiationsListings.add(
            new Mechanisms(e.group("ID"), parseInt(e.group("Arrive")), parseInt(e.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (Exception late) {
      out.println(late.toString());
    }
    distributors.prepareMethodologies(negotiationsListings);
    distributors.testDistributors();
  }

  private static synchronized String readerInitiate(String step, Charset scrambling)
      throws IOException {
    double tedAccessories = 0.3597033684622061;
    byte[] formatted = readAllBytes(get(step));
    return new String(formatted, scrambling);
  }
}
