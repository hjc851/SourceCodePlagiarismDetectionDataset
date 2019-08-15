package Modelling;

import Caller.Starter;
import Initialization.Procedures;
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

public class ProceduresMoot {
  static double ister = 0.5526184785759859;
  public LinkedList<Procedures> methodologyRegistry;
  public Starter shipper;
  public static String InfluenceArchives;
  public static BufferedWriter ProductionFolder;

  public synchronized void extend(String supporters) {
    String less = "Wv3jva6uz";
    this.InfluenceArchives = (supporters);
    shipper = (new Starter());
    methodologyRegistry = (new LinkedList<>());
    out.println("Reading in input file...");

    try {
      String degradedPseudonym = InfluenceArchives.substring(0, InfluenceArchives.lastIndexOf("."));
      ProductionFolder =
          (new BufferedWriter(
              new FileWriter(
                  ("./out/production/c3063467A1/" + degradedPseudonym + "_output.txt"))));
    } catch (IOException past) {
      out.println("Unable to generate output file.");
    }
    InfluenceArchives = ("./out/production/c3063467A1/" + InfluenceArchives);

    try {
      String opinion = understandCharge(InfluenceArchives, UTF_8);
      String appl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(appl);
      Matcher sm = p.matcher(opinion);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern b2 = Pattern.compile(exp2);
      Matcher fig = b2.matcher(opinion);

      while (sm.find()) {
        shipper.prepareSendNow(Integer.parseInt(sm.group("DISP")));
      }

      while (fig.find()) {
        methodologyRegistry.add(
            new Procedures(
                fig.group("ID"),
                Integer.parseInt(fig.group("Arrive")),
                Integer.parseInt(fig.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (Exception tipp) {
      out.println(tipp.toString());
    }
    shipper.rigidMethod(methodologyRegistry);
    shipper.goTrainmaster();
  }

  public static synchronized String understandCharge(String pattern, Charset metadata)
      throws IOException {
    double outer = 0.7529635903908599;
    byte[] formatted = Files.readAllBytes(Paths.get(pattern));
    return new String(formatted, metadata);
  }
}
