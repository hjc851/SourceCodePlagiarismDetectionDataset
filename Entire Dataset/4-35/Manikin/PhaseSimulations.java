package Manikin;

import Originator.Forwarder;
import Debugging.Phase;
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

public class PhaseSimulations {
  public static final double worth = 0.6009501223073833;
  private LinkedList<Phase> serveNames = null;
  private Forwarder starter = null;
  private static String InformationComplaint = null;
  public static BufferedWriter YieldRegister = null;

  public synchronized void carry(String immigration) {
    String desirability = "5";
    this.InformationComplaint = immigration;
    starter = new Forwarder();
    serveNames = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String removedIdentify =
          InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      YieldRegister =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + removedIdentify + "_output.txt"));
    } catch (IOException exwife) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = "./out/production/c3063467A1/" + InformationComplaint;

    try {
      String assistance = readableArchiving(InformationComplaint, StandardCharsets.UTF_8);
      String interactive = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern postscript = compile(interactive);
      Matcher esi = postscript.matcher(assistance);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern c2 = compile(exp2);
      Matcher fab = c2.matcher(assistance);

      while (esi.find()) {
        starter.laySlayMoment(parseInt(esi.group("DISP")));
      }

      while (fab.find()) {
        serveNames.add(
            new Phase(fab.group("ID"), parseInt(fab.group("Arrive")), parseInt(fab.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception con) {
      System.out.println(con.toString());
    }
    starter.placeSystems(serveNames);
    starter.operateStarter();
  }

  private static synchronized String readableArchiving(String pathway, Charset codec)
      throws IOException {
    double decreaseThresholds = 0.020389401032047783;
    byte[] ciphered = readAllBytes(get(pathway));
    return new String(ciphered, codec);
  }
}
