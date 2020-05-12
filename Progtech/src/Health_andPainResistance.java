public class Health_andPainResistance {

    //region Fields Properties and Constructor

    private int health_points;
    private int actual_health_points;
    private int pain_resistance_points;
    private int actual_pain_resistance_points;
    private HpAndRpModifiers hrm;

    public int getHealth_points() { return health_points; }
    public void setHealth_points(int health_points) { this.health_points = health_points; }

    public int getActual_health_points() { return actual_health_points; }
    public void setActual_health_points(int actual_health_points) { this.actual_health_points = actual_health_points; }

    public int getPain_resistance_points() { return pain_resistance_points; }
    public void setPain_resistance_points(int pain_resistance_points) { this.pain_resistance_points = pain_resistance_points; }

    public int getActual_pain_resistance_points() { return actual_pain_resistance_points; }
    public void setActual_pain_resistance_points(int actual_pain_resistance_points) { this.actual_pain_resistance_points = actual_pain_resistance_points; }

    public HpAndRpModifiers getHrm() { return hrm; }
    public void setHrm(HpAndRpModifiers hrm) { this.hrm = hrm; }

    public Health_andPainResistance(int health_points, int actual_health_points, int pain_resistance_points, int actual_pain_resistance_points){
        this.health_points = health_points;
        this.actual_health_points = actual_health_points;
        this.pain_resistance_points = pain_resistance_points;
        this.actual_pain_resistance_points = actual_pain_resistance_points;
        this.hrm = new HpAndRpModifiers();
    }

    //endregion

}
