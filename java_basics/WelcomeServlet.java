// import java.io.IOException;
// import java.io.PrintWriter;

// import jakarta.servlet.ServletException;
// import jakarta.servlet.annotation.WebServlet;
// import jakarta.servlet.http.HttpServlet;
// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpServletResponse;

// @WebServlet("/welcome")
// public class WelcomeServlet extends HttpServlet {

//     protected void doPost(
//             HttpServletRequest request,
//             HttpServletResponse response)
//             throws ServletException, IOException {

//         // Get data from user
//         String name = request.getParameter("name");

//         // Set response type
//         response.setContentType("text/html");

//         // Send output to browser
//         PrintWriter out = response.getWriter();

//         out.println("<h1>Welcome " + name + "</h1>");
//     }
// }