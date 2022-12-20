package database;

import java.util.List;

import model.Artist;

/**
 * ArtistDaoInterface on rajapinta, joka määrittelee, mitä operaatioita
 * DAO-luokan on toteutattava.
 */
public interface ArtistDaoInterface {

    public List<Artist> getAllItems();

    public Artist getItem(long id);

    public boolean addItem(Artist newItem);

    public boolean removeItem(Artist item);
}