import javax.swing.ImageIcon;

import com.AdminSide.Run;
import com.misc.ProjectObj;

public class App {
    public static void main(String[] args)  throws Exception {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	ProjectObj.appImageUrl=App.class.getResource("NavBar_Logo.png");
    	ProjectObj.appImageIcon=new ImageIcon(ProjectObj.appImageUrl);
    	Run.main();
    }
}
