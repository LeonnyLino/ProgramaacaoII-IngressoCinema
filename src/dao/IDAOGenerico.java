package dao;

import java.util.ArrayList;

public interface IDAOGenerico<T> {

	public void inserir(T o);
	public ArrayList<T> listar();
	public void deletar(int id);
	public void atualizar(T o);
}
