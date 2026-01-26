package Projects.Computer.Model;

import Projects.Computer.Enumlar.Color;
import Projects.Computer.Enumlar.Ram;
import Projects.Computer.Enumlar.Size;
import Projects.Computer.Model.Apple;
import Projects.Computer.Model.HP;

import java.util.*;

public class DataAll{
    static String c_RESET  = "\u001B[0m";
    static String c_RED    = "\u001B[31m";
    static String BOLD     = "\033[0;1m";
    static String c_BLUE   = "\u001B[34m";
    static String c_PURPLE = "\u001B[35m";
    @Override
    public String toString() {
        return "DataAll{" +BOLD+
                "laptopID=" + laptopID +
                c_BLUE+", model='" + model + '\'' +
                c_RED+", ram='" + ram + '\'' +
                c_PURPLE+  ", size='" + size + '\'' +
                c_BLUE+ ", renk='" + renk + '\'' +
                '}';
    }

    static Scanner scanner=new Scanner(System.in);
    static int Id = 1000;
    int laptopID;
    public String model, ram, size, renk;
    public static int price=1000;
    public static Map<Integer,DataAll> computers=new LinkedHashMap<>();
    static ArrayList<String> ramList = new ArrayList<>();
    static ArrayList<String> cpuList = new ArrayList<>();
    static ArrayList<String> sizeList = new ArrayList<>();

    static List<Color> colorEnumList = Arrays.asList(Color.values());
    static List<Size> sizeEnumList = Arrays.asList(Size.values());
    static List<Ram> ramEnumList = Arrays.asList(Ram.values());




    public static void choseMenu() {
        System.out.println(BOLD+"Lütfen Almak İstediğiniz Bilgisyar Modelini Seçiniz:");
        System.out.println(c_BLUE+"1-Apple\n" +c_RED+ "2-HP");
        String chooseComputer = scanner.next();
        switch (chooseComputer) {
            case "1":
                System.out.println(c_BLUE+"Selected Apple");
                Apple.setAppleModel();
                break;
            case "2":
                System.out.println(c_RED+"Selected HP");
                HP.setHPModel();
                break;

        }


    }}