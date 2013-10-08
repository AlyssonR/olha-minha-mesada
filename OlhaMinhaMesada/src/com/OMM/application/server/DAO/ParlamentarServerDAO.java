package com.OMM.application.server.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.OMM.application.server.model.Parlamentar;

public class ParlamentarServerDAO {

	private final static String GET_ALL_PARLAMENTARES = "";
	private final static String GET_ALL_PARLAMENTARES_BY_PARTIDO = "";
	private final static String GET_ALL_PARLAMENTARES_BY_UF = "";
	private final static String GET_ALL_PARLAMENTARES_BY_NAME = "";
	
	private Connection conexao;
	private static ParlamentarServerDAO instance;
	
	private ParlamentarServerDAO() {
		
		this.conexao = new ConnectionFactory().getConnection();
	}
	
	// SINGLETON
	public static ParlamentarServerDAO getInstance() {
		
		if( instance == null ) {
			
			instance = new ParlamentarServerDAO();
			
		} else
		{
		}
		
		return instance;
	}
	
	public ArrayList<Parlamentar> listarParlamentares() {
		
		ArrayList<Parlamentar> parlamentares = new ArrayList<Parlamentar>();
		
		try {
			
			PreparedStatement declaracao = conexao.prepareStatement(GET_ALL_PARLAMENTARES);
			ResultSet resultado = declaracao.executeQuery();
			
			while(resultado.next()) {
				
				Parlamentar parlamentar = new Parlamentar(resultado.getString("nome"));
				
				parlamentar.setIdParlamentar(resultado.getInt("id"));
				parlamentar.setPartidoParlamentar(resultado.getString("partido"));
				parlamentar.setSalarioParlamentar(resultado.getDouble("salario"));
				parlamentar.setTipoParlamentar(resultado.getInt("tipo"));
				parlamentar.setUfParlamentar(resultado.getString("UF"));
				
				parlamentares.add(parlamentar);
			}
			
			resultado.close();
			declaracao.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return parlamentares;
	}
}
