public class Admin extends Employee {
    private String position;
    private int extension;

    public int getExtension() {
        return extension;
    }

    public String getPosition() {
        return position;
    }

    public Admin(String f, String l, int e, double s, String p, int ex) {
        super(f, l, e, s);
        position = p;
        extension = ex;
    }
}
