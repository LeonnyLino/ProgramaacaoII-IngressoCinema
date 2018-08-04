package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Ingresso;

public class IngressoDao implements IDAOGenerico<Ingresso> {

	@Override
	public void inserir(Ingresso i) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement("insert into ingresso(fileira, coluna, estudante, numeroCarteria, flag) values(?,?,?,?,?)");
			ps.setString(1, i.getFileira());
			ps.setByte(2, i.getColuna());
			ps.setBoolean(3, i.isEstudante());
			ps.setLong(4, i.getNumeroCarteira());
			ps.setBoolean(5, i.isFlag());
			
			ps.execute();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public ArrayList<Ingresso> listar() {
		ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
		String sql = "select * from ingresso";
		
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Ingresso i = new Ingresso();
				i.setId(rs.getLong("id"));
				i.setFileira(rs.getString("fileira"));
				i.setColuna(rs.getByte("coluna"));
				i.setEstudante(rs.getBoolean("estudante"));
				i.setNumeroCarteira(rs.getLong("numeroCarteira"));
				i.setFlag(rs.getBoolean("flag"));
				ingressos.add(i);
			}
			
			ps.close();
			rs.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return ingressos;
	}

	@Override
	public void deletar(int id) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement("delete from ingresso where id = ?");
			ps.setLong(1, id);
			ps.execute();
			ps.close();
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void atualizar(Ingresso i) {
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement
					("update ingresso set fileira = ?, coluna = ?, estudante = ?, numeroCarteira = ?, flag = ? where id = ?");
			ps.setString(1, i.getFileira());
			ps.setByte(2, i.getColuna());
			ps.setBoolean(3, i.isEstudante());
			ps.setLong(4, i.getNumeroCarteira());
			ps.setBoolean(5, i.isFlag());
			ps.setLong(5, i.getId());
			
			ps.execute();
			ps.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
			
		}
	}
	
}
