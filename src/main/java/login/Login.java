package login;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("Login.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("pswd");
        boolean isValid = false;

        for (User user : User.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                resp.sendRedirect("https://www.w3schools.com/");
                isValid = true;
            }
        }
        if (!isValid)
            resp.sendRedirect("Error.html");
    }
}