public class Teacher extends Employee {
    private String department;
    private int homeroom;

    public String getDepartment() {
        return department;
    }

    public int getHomeroom() {
        return homeroom;
    }

    public Teacher(String f, String l, int e, double s, String d, int h) {
        super(f, l, e, s);
        department = d;
        homeroom = h;
    }
}
