package Controller;

import java.io.IOException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import services.MapService;

@WebServlet("/MapServlet")
public class MapServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public MapServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        MapService service=new MapService();
        HashMap<String,String>map=service.getMap();
        // リクエスト属性にセット
        request.setAttribute("maps", map);

        // JSPにフォワード
        request.getRequestDispatcher("/jsp/map.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
