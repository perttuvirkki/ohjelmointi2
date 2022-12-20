package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Album;
import model.Artist;



public class AlbumDao {
	
	private Database db = new Database();

	public List<Album> getAlbums(int ArtistId) {
		String selectAll = "SELECT AlbumId, Title, ArtistId FROM Album WHERE ArtistId = "+ArtistId+";";
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet results = null;
		List<Album> allAlbums = new ArrayList<>();
		
		try {
			connection = db.connect();
			statement = connection.prepareStatement(selectAll);
			results = statement.executeQuery();
			
			while (results.next()) {
				long id = results.getLong("AlbumId");
				String title = results.getString("Title");
				
				Album a = new Album(id, title);
				allAlbums.add(a);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.db.close(connection, statement, results);;
		}
				
		return allAlbums;
	}  
	   
}

