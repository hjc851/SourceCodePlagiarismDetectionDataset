package Impactor;

import Device.Plenum;
import Developer.Method;
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

public class OperationSimulated {
  private static final String synX2057String = "Finished reading input file...";
  private static final String synX2056String = "SIZE";
  private static final String synX2055String = "Arrive";
  private static final String synX2054String = "ID";
  private static final String synX2053String = "DISP";
  private static final String synX2052String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2051String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2050String = "./out/production/c3063467A1/";
  private static final String synX2049String = "Unable to generate output file.";
  private static final String synX2048String = "_output.txt";
  private static final String synX2047String = "./out/production/c3063467A1/";
  private static final String synX2046String = ".";
  private static final int synX2045int = 0;
  private static final String synX2044String = "Reading in input file...";
  public Plenum sender = null;
  public static BufferedWriter ThroughputDocument = null;
  public LinkedList<Method> summonsRoster = null;

  public static synchronized String readableArchiving(String route, Charset codifying)
      throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(route));
    return new String(decodes, codifying);
  }

  public static String StimulusRegister = null;

  public synchronized void outpouring(String adherents) {
    this.StimulusRegister = (adherents);
    sender = (new Plenum());
    summonsRoster = (new LinkedList<>());
    out.println(synX2044String);

    try {
      String denudedDiagnose;
      denudedDiagnose =
          (StimulusRegister.substring(synX2045int, StimulusRegister.lastIndexOf(synX2046String)));
      ThroughputDocument =
          (new BufferedWriter(new FileWriter((synX2047String + denudedDiagnose + synX2048String))));
    } catch (IOException combatants) {
      out.println(synX2049String);
    }
    StimulusRegister = (synX2050String + StimulusRegister);

    try {
      String representations;
      String indiv;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern c4;
      Matcher pk;
      representations = (readableArchiving(StimulusRegister, UTF_8));
      indiv = (synX2051String);
      p = (Pattern.compile(indiv));
      esi = (p.matcher(representations));
      exp2 = (synX2052String);
      c4 = (Pattern.compile(exp2));
      pk = (c4.matcher(representations));

      while (esi.find()) {
        sender.fitExpeditiousnessYear(Integer.parseInt(esi.group(synX2053String)));
      }

      while (pk.find()) {
        summonsRoster.add(
            new Method(
                pk.group(synX2054String),
                Integer.parseInt(pk.group(synX2055String)),
                Integer.parseInt(pk.group(synX2056String))));
      }
      out.println(synX2057String);
    } catch (Exception pro) {
      out.println(pro.toString());
    }
    sender.layLitigate(summonsRoster);
    sender.campaignReseller();
  }
}
