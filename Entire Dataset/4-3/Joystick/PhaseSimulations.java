package Joystick;

import Forwarder.Shipper;
import Server.Mechanisms;
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

public class PhaseSimulations {
  public static java.io.BufferedWriter ProductivityDocuments = null;
  private static java.lang.String AdviceDocumentation = null;
  private Forwarder.Shipper device = null;
  private java.util.LinkedList<Mechanisms> treatLitany = null;

  public synchronized void lean(java.lang.String adherents) {
    this.AdviceDocumentation = adherents;
    device = new Forwarder.Shipper();
    treatLitany = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String minimalMention;
      minimalMention = AdviceDocumentation.substring(0, AdviceDocumentation.lastIndexOf("."));
      ProductivityDocuments =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (java.io.IOException aba) {
      out.println("Unable to generate output file.");
    }
    AdviceDocumentation = "./out/production/c3063467A1/" + AdviceDocumentation;

    try {
      java.lang.String feedback;
      java.lang.String reciprocal;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher sm;
      java.lang.String exp2;
      java.util.regex.Pattern k;
      java.util.regex.Matcher ff;
      feedback = scanFolders(AdviceDocumentation, UTF_8);
      reciprocal = "DISP:[\\s]+(?<DISP>[\\d]+)";
      postscript = compile(reciprocal);
      sm = postscript.matcher(feedback);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      k = compile(exp2);
      ff = k.matcher(feedback);

      while (sm.find()) {
        device.fixedDeployingOpportunity(parseInt(sm.group("DISP")));
      }

      while (ff.find()) {
        treatLitany.add(
            new Server.Mechanisms(
                ff.group("ID"), parseInt(ff.group("Arrive")), parseInt(ff.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception vet) {
      out.println(vet.toString());
    }
    device.doTechniques(treatLitany);
    device.moveSender();
  }

  private static synchronized java.lang.String scanFolders(
      java.lang.String trajectory, java.nio.charset.Charset cipher) throws IOException {
    byte[] interlaced = readAllBytes(get(trajectory));
    return new java.lang.String(interlaced, cipher);
  }
}
