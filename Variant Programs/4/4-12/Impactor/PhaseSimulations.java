package Impactor;

import Starter.Yardmaster;
import Interface.Work;
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

public class PhaseSimulations {
  public static double widening = 0.8704329858825751;
  private LinkedList<Work> formalitiesCatalog;
  private Yardmaster coordinator;

  private static synchronized String showDocumentation(String direction, Charset encoders)
      throws IOException {
    double decreaseThresholds;
    decreaseThresholds = 0.9515011014195868;
    byte[] ciphered = Files.readAllBytes(Paths.get(direction));
    return new String(ciphered, encoders);
  }

  private static String OutputSubmitting;

  public synchronized void scarper(String without) {
    double highest;
    highest = 0.4169519002579487;
    this.OutputSubmitting = without;
    coordinator = new Yardmaster();
    formalitiesCatalog = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String peeledFigure;
      peeledFigure = OutputSubmitting.substring(0, OutputSubmitting.lastIndexOf("."));
      ManufacturingComplaint =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + peeledFigure + "_output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    OutputSubmitting = "./out/production/c3063467A1/" + OutputSubmitting;

    try {
      String participatory;
      String emp;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern f;
      Matcher fab;
      participatory = showDocumentation(OutputSubmitting, StandardCharsets.UTF_8);
      emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(emp);
      dos = p.matcher(participatory);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      f = Pattern.compile(exp2);
      fab = f.matcher(participatory);

      while (dos.find()) {
        coordinator.situatedDeploymentMinutes(Integer.parseInt(dos.group("DISP")));
      }

      while (fab.find()) {
        formalitiesCatalog.add(
            new Work(
                fab.group("ID"),
                Integer.parseInt(fab.group("Arrive")),
                Integer.parseInt(fab.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception former) {
      System.out.println(former.toString());
    }
    coordinator.dictatedWork(formalitiesCatalog);
    coordinator.outpouringPlenum();
  }

  public static BufferedWriter ManufacturingComplaint;
}
