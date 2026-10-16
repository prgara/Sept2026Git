public class School {
    String schoolName;

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    static void main() {

        School school1 = new School("Conestoga College");
        System.out.println(school1.schoolName);
    }
}
