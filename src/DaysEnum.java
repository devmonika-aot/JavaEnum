public enum DaysEnum {
  MONDAY(DaysNameConstant.MONDAY, DaysNameConstant.MON_SHORT_NAME),

  TUESDAY(DaysNameConstant.TUESDAY, DaysNameConstant.TUE_SHORT_NAME),

  WEDNESDAY(DaysNameConstant.WEDNESDAY, DaysNameConstant.WED_SHORT_NAME),

  THRUSDAY(DaysNameConstant.THURUSDAY, DaysNameConstant.THU_SHORT_NAME),

  FRIDAY(DaysNameConstant.FRIDAY, DaysNameConstant.FRI_SHORT_NAME);

  private final String dayName;
  private final String dayShortName;

  DaysEnum(String dayName, String dayShortName) {
    this.dayName = dayName;
    this.dayShortName = dayShortName;
  }

  public String getDayName() {
    return dayName;
  }

  public String getDayShortName() {
    return dayShortName;
  }
}
