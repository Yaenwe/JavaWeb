package com.m2i.formationjava.repositories;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.m2i.formationjava.entities.*;

public abstract class AbstractRepository<T extends IMedia> implements IRepository<T> {

	private String uri;
	
	@Override
	public String getUri() {
		return this.uri;
	}

	@Override
	public void setUri(String uri) {
		this.uri = uri;
	}

	protected List<T> getBySql(String sql) throws ClassNotFoundException, SQLException, MediaException {
		 Connection conn = getConnection();
		 Statement st = conn.createStatement();
		 ResultSet rs = st.executeQuery(sql);
		 List<T> list = new ArrayList<T>();
		 while(rs.next()) {
			 T entity = getByResultSet(rs);
		 	 list.add(entity);
		 }
		 conn.close(); 
		 return list;
	}
	
	protected Connection getConnection() throws ClassNotFoundException, SQLException {
		 Class.forName("org.postgresql.Driver");
		 return DriverManager.getConnection(getUri());
	}

	protected abstract T getByResultSet(ResultSet rs) throws SQLException, MediaException;

	@Override
	public void delete(T entity) throws ClassNotFoundException, SQLException {
		Connection conn = getConnection();
		Statement st = conn.createStatement();
		st.executeUpdate("delete from media where id="+entity.getId());
		conn.close();
	}


}
