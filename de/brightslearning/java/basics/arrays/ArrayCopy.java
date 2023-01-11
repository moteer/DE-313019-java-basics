package de.brightslearning.java.basics.arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        String[] strings = {"Christian",
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

        System.out.println("copy with System.copyArray()");
        String[] copyOfArray = copyArray(strings);
        for (String name : copyOfArray) {
            System.out.println(name);
        }

        System.out.println("copy with clone()");
        String[] copyOfArray2 = copyArrayWithClone(strings);
        for (String name : copyOfArray2) {
            System.out.println(name);
        }

        System.out.println("Copy manual");
        String[] copyOfArray3 = copyManual(strings);
        for (String name : copyOfArray3) {
            System.out.println(name);
        }

        System.out.println("Josefine Case");
        copyOverride(strings);

        System.out.println("--> Josefine Case wieder ausserhalb der methode");
        for (String name : strings) {
            System.out.println(name);
        }

    }

    private static void copyOverride(String[] strings) {
        String[] tmp = new String[strings.length];
        for (int i=0; i<strings.length; i++) {
            tmp[i] = strings[i];
        }
        tmp[0] = "new Student";
        strings = tmp;
        System.out.println("--> in der Methode");
        for (String name : strings) {
            System.out.println(name);
        }
    }


    private static String[] copyManual(String[] strings) {
        String[] tmp = new String[strings.length];
        for (int i=0; i<strings.length; i++) {
            tmp[i] = strings[i];
        }
        return tmp;
    }

    private static String[] copyArrayWithClone(String[] strings) {
        return strings.clone();
    }

    private static String[] copyArray(String[] strings) {
        String[] newArray = new String[strings.length];
        System.arraycopy(strings, 0, newArray, 0, strings.length);
        return newArray;
    }
}
