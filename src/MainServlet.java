import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainServlet")
public class MainServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "";
        //System.out.println("It works");
        String fromWhere = request.getParameter("guess");

        if(fromWhere.equals("signup")){

            String fn = request.getParameter("firstName");
            String ln = request.getParameter("lastName");
            String un = request.getParameter("userN");
            String pw = request.getParameter("passU");

            pw = SimpleEncryption.AlgMD5(pw);

            User u1 = new User (fn, ln, un, pw);

            SqlTools.insert(u1);

            request.setAttribute("aUser", u1);

            url = "/confirmation.jsp";
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
