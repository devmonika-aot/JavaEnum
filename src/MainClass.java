public class MainClass {
  public static void main(String arg[]) {

    String monday = DaysEnum.MONDAY.getDayShortName();
    String desc = DaysEnum.MONDAY.getDayName();
    System.out.println(desc + " :::::: " + monday);

    // Accessing all the enum values
    for (DaysEnum daysEnum : DaysEnum.values()) {
      System.out.println(daysEnum.getDayName() + " :::::: " + daysEnum.getDayShortName());
    }
  }
}
