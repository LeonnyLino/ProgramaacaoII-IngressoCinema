package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Funcionario;

public class FuncionarioDao implements IDAOGenerico<Funcionario> {

	@Override
	public void inserir(Funcionario o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Funcionario> listar() {
		ArrayList<Funcionario> funcs = new ArrayList<Funcionario>();
		String sql = "select * from funcionario";
		
		try(Connection conn = new ConnectionFactory().getConnection()){
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				Funcionario f = new Funcionario();
				f.setLogin(rs.getString("login"));
				f.setSenha(rs.getString("senha"));
				
				funcs.add(f);
			}
			
			ps.close();
			rs.close();
			
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		return funcs;
	}

	@Override
	public void deletar(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Funcionario o) {
		// TODO Auto-generated method stub
		
	}

}