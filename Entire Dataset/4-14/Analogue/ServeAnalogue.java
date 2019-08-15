package Analogue;

import Yardmaster.Originator;
import Workflow.Operation;
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

public class ServeAnalogue {
  public LinkedList<Operation> cycleCompilation;
  public Originator device;
  public static String InvolvementData;
  public static BufferedWriter TurnoutCharge;

  public synchronized void play(String immigration) {
    this.InvolvementData = immigration;
    device = new Originator();
    cycleCompilation = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String undoneForename = InvolvementData.substring(0, InvolvementData.lastIndexOf("."));
      TurnoutCharge =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + undoneForename + "_output.txt"));
    } catch (IOException exwife) {
      System.out.println("Unable to generate output file.");
    }
    InvolvementData = "./out/production/c3063467A1/" + InvolvementData;

    try {
      String influence = writtenFilename(InvolvementData, StandardCharsets.UTF_8);
      String experiment = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(experiment);
      Matcher dos = p.matcher(influence);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern aj = Pattern.compile(exp2);
      Matcher pk = aj.matcher(influence);

      while (dos.find()) {
        device.prepareSendNow(Integer.parseInt(dos.group("DISP")));
      }

      while (pk.find()) {
        cycleCompilation.add(
            new Operation(
                pk.group("ID"),
                Integer.parseInt(pk.group("Arrive")),
                Integer.parseInt(pk.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abdul) {
      System.out.println(abdul.toString());
    }
    device.fixMechanism(cycleCompilation);
    device.ramRegulator();
  }

  public static synchronized String writtenFilename(String footpath, Charset codec)
      throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(footpath));
    return new String(costed, codec);
  }
}
