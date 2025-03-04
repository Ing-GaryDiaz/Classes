import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student gary = new Student("Gary", "62090", 40, 'M');
        Student ana = new Student();
        System.out.println(gary);
        System.out.println(ana);
        System.out.println(gary.studentId);
        System.out.println(ana.studentId);

        gary.tellInfo();
        gary.repeatAfter("Lo mejor aún está por venir !!");

        System.out.print("¿Has cumplido años? (si/no): ");


        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("si")) {
            gary.haveBrithday();
            System.out.println("¡Feliz cumpleaños, " + gary.studentName + "! Ahora tienes " + gary.studentAge + " años.");
        } else {
            System.out.println("No se realizaron cambios en la edad.");
        }

        scanner.close();
        
    }
}



