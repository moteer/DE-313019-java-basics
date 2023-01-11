package exercise_4;

import java.util.Random;

/**
 * Write a command line tool, that returns a random Persons name out of our class. done :)
 * <p>
 * use primitive arrays and no Collections please :)
 * Create a method that allows you to add a new Person to the class
 * <p>
 * (Bonus) Create a method that allows you removes a Person from class
 * <p>
 * (Bonus) Create another method, that creates random studies buddie groups. It should take in a parameter which defines the group size.
 */
public class AccedemyClass {

    private String[] students =
            new String[]{"Christian",
                    "Marc",
                    "Minh",
                    "Nikita",
                    "Rene",
                    "Sebastian B",
                    "Tamayo",
                    "Tarik",
                    "Sebastian",
                    "Josefine",
                    "Bacdasch",
                    "Alina"};


    private void printRandomStudent() {
        System.out.println(getRandomStudentFrom());
    }

    private String getRandomStudentFrom() {
        int randomNumber = new Random().nextInt(this.students.length);
        return this.students[randomNumber];
    }
    public static void main(String[] args) {
        AccedemyClass accedemyClass = new AccedemyClass();
        accedemyClass.printRandomStudent();
    }

}
