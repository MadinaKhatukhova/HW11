public class Main {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s", fullName);


        // Задача 2

fullName = fullName.toUpperCase();
System.out.printf(" Данные ФИО сотрудника для заполнения отчета — %s", fullName);

// Задача 3

        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё', 'е');
        System.out.printf(" Данные ФИО сотрудника — %s", fullName);

    }
}