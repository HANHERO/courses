package HW12;

public class Test {
    public static void main(String[] args) {
        Person[] persons = {new Person("Coach Bob", 27, "M"),
                new Student("Lynne Brooke", 16, "F", "HS95129", 3.3),
                new Student("Tod Howard", 17, "M", "HS95130", 3.0),
                new Student("Vincent Pope", 16, "M", "HS95131", 4.9),
                new Student("Freddie Moody", 16, "M", "HS95128", 4.1),
                new Student("Amy Edwards", 16, "F", "HS95127", 5.0),
                new Student("Irene Bailey", 17, "F", "HS95126", 3.3),
                new Student("Elizabeth Lee", 16, "F", "HS95125", 3.7),
                new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0),
                new Teacher("Judith Barnes", 27, "F", "Math", 45000.0),
                new Teacher("Stephen Kelly", 29, "F", "Chemistry", 45000.0),
                new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.4, 1, "Undeclared"),
                new CollegeStudent("Raymond Bailey", 18, "M", "UCB123", 4.3, 1, "Communications"),
                new CollegeStudent("Phyllis Miller", 19, "F", "UCB123", 4.3, 2, "English"),
                new CollegeStudent("Misha Pilipenko", 23, "M", "UCB101", 5.0, 6, "Electrical Engineering")};

        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}