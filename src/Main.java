public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        String firstName = "ivan ";
        String middleName = "ivanovich ";
        String lastName = "ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        // Задание 2
        System.out.println("Задание 2");
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

    }
}