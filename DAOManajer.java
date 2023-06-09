/*
* Nama File    : DAOManager.java
* Nama Pembuat : Ihsan Alif Lazuardi Anwar
* NIM          : 24060121140162
* Deskripsi    : File kelas DAOManager
* Tanggal      : 06 Juni 2023
*/

public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}
