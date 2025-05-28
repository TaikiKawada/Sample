package Controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import beans.Player;
import services.PlayerService;
import utils.Db;

//a
@WebServlet("/PlayerServlet")
public class PlayerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       /*
        * 
        */
    public PlayerServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Player> players = null;
        try (Connection con = Db.open();) {
            PlayerService ps = new PlayerService(con);
            players = ps.select();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // リクエスト属性にセット
        request.setAttribute("players", players);

        // JSPにフォワード
        request.getRequestDispatcher("/jsp/player.jsp").forward(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
