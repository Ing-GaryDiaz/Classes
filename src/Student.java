public class Student {

    String studentName;
    String studentId = "000000000" ;
    int studentAge;
    char studentGender;
    //Constructor vacio
    public Student(){
        System.out.println("Estudiante creado sin datos");

    }
    //Constructor con datos
    public Student(String name,String id,int age,char gender) {
        studentName = name;
        studentId=id;
        studentAge= age;
        studentGender=gender;

        System.out.println("Estudiante \"" + studentName +"\" creado!");

    }
    public void tellInfo() {
        System.out.println("My name is \"" + studentName + "\" and my ID is " + studentId + ".");
        System.out.println("I'm " + studentAge + " years old and my gender is " + studentGender + ".");
    }

    public void repeatAfter(String message) {
        System.out.println("The message is: " + message);
    }

    public void haveBrithday() {
        studentAge++;
    }

    @Override
    public String toString() {
        return "Student with name: " + studentName;
    }
}
