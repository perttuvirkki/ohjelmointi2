package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import database.ArtistDao;
import model.Artist;

@WebServlet("/search")
public class SearchServlet {

	private ArtistDao dao = new ArtistDao();

	public void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Artist> artists = this.dao.searchArtists();
		req.setAttribute("artists", artists);
		req.getRequestDispatcher("/WEB-INF/search.jsp").forward(req, resp);
	}
}