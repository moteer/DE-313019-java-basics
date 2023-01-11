package exercise_4;

import java.util.Random;

public class RandomPerson2 {

    private String[] persons =
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

    private void printAllPerson() {
        System.out.println("Here are all Persons:");
        for (String person : this.persons) {
            System.out.printf("Student: %s%n", person);
        }
    }

    private void addPerson(String name) {
        int newIndex = persons.length;
        String[] copyOfPersons = new String[newIndex + 1];
        System.arraycopy(this.persons, 0, copyOfPersons, 0, newIndex);
        this.persons = copyOfPersons;
        this.persons[newIndex] = name;
    }

    private void printRandomPerson() {
        int randomIndex = new Random().nextInt(persons.length);
        System.out.printf("Your random student is Student Nr: %d Student: %s%n", randomIndex + 1, persons[randomIndex]);
    }

    public static void main(String[] args) {
        RandomPerson2 randomPerson = new RandomPerson2();

        randomPerson.printAllPerson();
        randomPerson.printRandomPerson();

        randomPerson.addPerson("Santa Claus");
        randomPerson.printAllPerson();
    }

}
