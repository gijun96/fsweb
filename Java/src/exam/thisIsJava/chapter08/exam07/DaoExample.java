package exam.thisIsJava.chapter08.exam07;

public class DaoExample {
    public static void dbWork(DataAccessObject dao){
        dao.select();
        dao.insert();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDAO());
        dbWork(new MySqlDAO());
    }
}
