public class AcademicRegistry {
    String name;
    private static int  matriculationNumber;
    private int courseId;
    private int chargePercentage;

    public AcademicRegistry(String name, int courseId, int chargePercentage) {
        AcademicRegistry.matriculationNumber++;
        this.name = name;
        this.courseId = courseId;
        this.chargePercentage = chargePercentage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getMatriculationNumber() {
        return matriculationNumber;
    }

    public static void setMatriculationNumber(int matriculationNumber) {
        AcademicRegistry.matriculationNumber = matriculationNumber;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getChargePercentage() {
        return chargePercentage;
    }

    public void setChargePercentage(int chargePercentage) {
        this.chargePercentage = chargePercentage;
    }
}
