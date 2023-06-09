/*
* Nama File    : Person.java
* Nama Pembuat : Ihsan Alif Lazuardi Anwar
* NIM          : 24060121140162
* Deskripsi    : File Kelas Person (Model)
* Tanggal      : 06 Juni 2023
*/

public class Person {
    private int id;
    private String name;

    public Person(String n) {
        name = n;
    }

    public Person(int i, String n) {
        id = i;
        name = n;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
