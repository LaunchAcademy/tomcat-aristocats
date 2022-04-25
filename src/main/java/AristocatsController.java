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

@WebServlet(urlPatterns = {"/cats", "/cats-jstl", "/cats-objects"})
public class AristocatsController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {

    List<Map<String, String>> aristocats = getAristocratsMaps();
    List<Aristocat> cats = getAristocratObjects();

    if(req.getServletPath().equals("/cats")){
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/aristocats/index.jsp");
      req.setAttribute("aristocats", aristocats);
      dispatcher.forward(req, resp);
    } else if (req.getServletPath().equals("/cats-jstl")){
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/aristocats/index-jstl.jsp");
      req.setAttribute("aristocats", aristocats);
      dispatcher.forward(req, resp);
    } else if (req.getServletPath().equals("/cats-objects")) {
      RequestDispatcher dispatcher = req.getRequestDispatcher("/views/aristocats/index-jstl-objects.jsp");
      req.setAttribute("aristocats", cats);
      dispatcher.forward(req, resp);
    }



  }

  private List<Map<String, String>> getAristocratsMaps(){
    List<Map<String, String>> aristocats = new ArrayList<>();
    Map<String, String> thomas = new HashMap<>();
    thomas.put("firstName", "Thomas");
    thomas.put("lastName", "O'Malley");
    thomas.put("photoUrl",
        "https://static.wikia.nocookie.net/disney-fan-fiction/images/f/f4/Thomasdisney.jpeg");
    aristocats.add(thomas);

    Map<String, String> duchess = new HashMap<>();
    duchess.put("firstName", "Duchess");
    duchess.put("lastName", "Bonfamille");
    duchess.put("photoUrl",
        "https://static.wikia.nocookie.net/disney/images/e/eb/Profile_-_Duchess.jpeg");
    aristocats.add(duchess);

    return aristocats;
  }

  private List<Aristocat> getAristocratObjects() {
    List<Aristocat> aristocats = new ArrayList<>();

    Aristocat thomas2 = new Aristocat();
    thomas2.setFirstName("Thomas");
    thomas2.setLastName("O'Malley");
    thomas2.setPhotoUrl(
        "https://static.wikia.nocookie.net/disney-fan-fiction/images/f/f4/Thomasdisney.jpeg");
    aristocats.add(thomas2);

    Aristocat duchess2 = new Aristocat();
    duchess2.setFirstName("Duchess");
    duchess2.setLastName("Bonfamille");
    duchess2.setPhotoUrl(
        "https://static.wikia.nocookie.net/disney/images/e/eb/Profile_-_Duchess.jpeg");
    aristocats.add(duchess2);

    return aristocats;
  }
}