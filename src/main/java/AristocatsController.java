import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/cats", "/cats-jstl"})
public class AristocatsController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
//    List<Map<String, String>> aristocats = new ArrayList<>();
//    Map<String, String> thomas = new HashMap<>();
//    thomas.put("firstName", "Thomas");
//    thomas.put("lastName", "O'Malley");
//    thomas.put("photoUrl", "https://static.wikia.nocookie.net/disney-fan-fiction/images/f/f4/Thomasdisney.jpeg");
//    aristocats.add(thomas);
//    Map<String, String> duchess = new HashMap<>();
//    duchess.put("firstName", "Duchess");
//    duchess.put("lastName", "Bonfamille");
//    duchess.put("photoUrl", "https://static.wikia.nocookie.net/disney/images/e/eb/Profile_-_Duchess.jpeg");
//    aristocats.add(duchess);

    List<Aristocat> aristocats = new ArrayList<>();
    Aristocat thomas = new Aristocat();
    thomas.setFirstName("Thomas");
    thomas.setLastName("O'Malley");
    thomas.setPhotoUrl("https://static.wikia.nocookie.net/disney-fan-fiction/images/f/f4/Thomasdisney.jpeg");
    aristocats.add(thomas);
    Aristocat duchess = new Aristocat();
    duchess.setFirstName("Duchess");
    duchess.setLastName("Bonfamille");
    duchess.setPhotoUrl("https://static.wikia.nocookie.net/disney/images/e/eb/Profile_-_Duchess.jpeg");
    aristocats.add(duchess);

    RequestDispatcher dispatcher = req.getRequestDispatcher("/views/aristocats/index-jstl-objects.jsp");
      req.setAttribute("aristocatsJspVariable", aristocats);
      dispatcher.forward(req, resp);

//    if(req.getServletPath().equals("/cats")) {
//      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/aristocats/index.jsp");
//      req.setAttribute("aristocatsJspVariable", aristocats);
//      dispatcher.forward(req, resp);
//    } else {
//      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/aristocats/index-jstl.jsp");
//      req.setAttribute("aristocatsJspVariable", aristocats);
//      dispatcher.forward(req, resp);
//    }
  }
}