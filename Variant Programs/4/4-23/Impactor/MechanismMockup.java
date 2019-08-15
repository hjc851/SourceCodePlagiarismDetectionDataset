package Impactor;

import Starter.Distributors;
import Parser.Method;
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

public class MechanismMockup {
  private static final double synX1195double = 0.5593597295426925;
  private static final String synX1194String = "Finished reading input file...";
  private static final String synX1193String = "SIZE";
  private static final String synX1192String = "Arrive";
  private static final String synX1191String = "ID";
  private static final String synX1190String = "DISP";
  private static final String synX1189String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1188String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1187String = "./out/production/c3063467A1/";
  private static final String synX1186String = "Unable to generate output file.";
  private static final String synX1185String = "_output.txt";
  private static final String synX1184String = "./out/production/c3063467A1/";
  private static final String synX1183String = ".";
  private static final int synX1182int = 0;
  private static final String synX1181String = "Reading in input file...";
  private static final double synX1180double = 0.2701716856357772;
  public static final String characteristic = "lRE91C8cvzJK0LD";
  public java.util.LinkedList<Method> proceedingsPlaylist;
  public Starter.Distributors resellers;
  public static java.lang.String OpinionExecutable;
  public static java.io.BufferedWriter IntensityReadme;

  public synchronized void pass(java.lang.String establishment) {
    double secDepth = synX1180double;
    this.OpinionExecutable = establishment;
    resellers = new Starter.Distributors();
    proceedingsPlaylist = new java.util.LinkedList<>();
    out.println(synX1181String);

    try {
      java.lang.String abolishedDiscover =
          OpinionExecutable.substring(synX1182int, OpinionExecutable.lastIndexOf(synX1183String));
      IntensityReadme =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX1184String + abolishedDiscover + synX1185String));
    } catch (java.io.IOException libris) {
      out.println(synX1186String);
    }
    OpinionExecutable = synX1187String + OpinionExecutable;

    try {
      java.lang.String feedback = aloudApplication(OpinionExecutable, UTF_8);
      java.lang.String purch = synX1188String;
      java.util.regex.Pattern postscript = compile(purch);
      java.util.regex.Matcher manuscript = postscript.matcher(feedback);
      java.lang.String exp2 = synX1189String;
      java.util.regex.Pattern a3 = compile(exp2);
      java.util.regex.Matcher m1 = a3.matcher(feedback);

      while (manuscript.find()) {
        resellers.adjustDispatchedMonth(parseInt(manuscript.group(synX1190String)));
      }

      while (m1.find()) {
        proceedingsPlaylist.add(
            new Parser.Method(
                m1.group(synX1191String),
                parseInt(m1.group(synX1192String)),
                parseInt(m1.group(synX1193String))));
      }
      out.println(synX1194String);
    } catch (java.lang.Exception adult) {
      out.println(adult.toString());
    }
    resellers.adjustProcedures(proceedingsPlaylist);
    resellers.footraceLimiter();
  }

  public static synchronized java.lang.String aloudApplication(
      java.lang.String curve, java.nio.charset.Charset cryptography) throws IOException {
    double greatestFatty = synX1195double;
    byte[] programmed = readAllBytes(get(curve));
    return new java.lang.String(programmed, cryptography);
  }
}
