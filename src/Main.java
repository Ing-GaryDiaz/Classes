public class Main {
    public static void main(String[] args) {
        Student gary = new Student("Gary", "62090", 40, 'M');
        Student ana = new Student();
        System.out.println(gary);
        System.out.println(ana);
        System.out.println(gary.studentId);
        System.out.println(ana.studentId);

    }
}
