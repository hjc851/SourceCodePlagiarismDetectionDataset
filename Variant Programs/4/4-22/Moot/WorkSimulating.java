package Moot;

import Caller.Mailer;
import Database.Mechanisms;
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

public class WorkSimulating {

  public synchronized void endure(String whys) {
    String ceilingSlot = "mcyYCI5Cl7VcYscRv";
    this.OutputSubmitting = (whys);
    plenum = (new Mailer());
    proceedingRosters = (new LinkedList<>());
    out.println("Reading in input file...");

    try {
      String deniedNickname = OutputSubmitting.substring(0, OutputSubmitting.lastIndexOf("."));
      TurnoutCharge =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + deniedNickname + "_output.txt"))));
    } catch (IOException officio) {
      out.println("Unable to generate output file.");
    }
    OutputSubmitting = ("./out/production/c3063467A1/" + OutputSubmitting);

    try {
      String stimulus = learnRegister(OutputSubmitting, UTF_8);
      String mgr = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(mgr);
      Matcher dos = p.matcher(stimulus);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern bl = Pattern.compile(exp2);
      Matcher p4 = bl.matcher(stimulus);

      while (dos.find()) synx214(dos);

      while (p4.find()) synx215(p4);
      out.println("Finished reading input file...");
    } catch (Exception exwife) {
      out.println(exwife.toString());
    }
    plenum.dictatedWork(proceedingRosters);
    plenum.moveSender();
  }

  public static String OutputSubmitting = null;
  public LinkedList<Mechanisms> proceedingRosters = null;
  static String depth = "lCfCfLaBJwNxsFrTK4g";

  public static synchronized String learnRegister(String pathways, Charset cryptographic)
      throws IOException {
    String throttle = "SMF6ZiLC";
    byte[] scrambled = Files.readAllBytes(Paths.get(pathways));
    return new String(scrambled, cryptographic);
  }

  public static BufferedWriter TurnoutCharge = null;
  public Mailer plenum = null;

  private synchronized void synx214(Matcher dos) {
    plenum.determinedDischargeDays(Integer.parseInt(dos.group("DISP")));
  }

  private synchronized void synx215(Matcher p4) {
    proceedingRosters.add(
        new Mechanisms(
            p4.group("ID"),
            Integer.parseInt(p4.group("Arrive")),
            Integer.parseInt(p4.group("SIZE"))));
  }
}
