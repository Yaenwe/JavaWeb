package com.m2i.formationjava.repositories;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.m2i.formationjava.entities.IMedia;
import com.m2i.formationjava.entities.MediaException;

public interface IRepository<T extends IMedia> {

	String getUri();
	
	void setUri(String uri);
	
	List<T> getAll() throws ClassNotFoundException, SQLException, IOException, MediaException;

	List<T> getByPrice(double price) throws ClassNotFoundException, SQLException, IOException, MediaException;

	List<T> getByTitle(String title) throws ClassNotFoundException, SQLException, IOException, MediaException;

}
