/*
* Nama File    : MainDAO.java
* Nama Pembuat : Ihsan alif Lazuardi Anwar
* NIM          : 24060121140162
* Deskripsi    : File Main untuk menjalankan program
* Tanggal      : 06 Juni 2023
*/

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
