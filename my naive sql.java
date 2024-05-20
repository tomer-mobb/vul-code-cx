import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLInjectionExample extends HttpServlet {
    
    @ResponseBody
    public AttackResult completed(
      @RequestParam String userid, @RequestParam String login_count, HttpServletRequest request)
      throws IOException {
    return runThis(userid);
    }

    protected void runThis(String accountName) throws ServletException {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db");
            String user = request.getParameter("accountName");
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
