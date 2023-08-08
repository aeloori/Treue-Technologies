import com.AdminSide.Run;

public class App {
    public static void main(String[] args) throws Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Run.main();
    }
}
