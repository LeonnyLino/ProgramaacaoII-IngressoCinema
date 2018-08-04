package model;

public class Ingresso {
	private long id;
	private String fileira;
	private byte coluna;
	private boolean estudante;
	private long numeroCarteira;
	private boolean flag;
	
	public Ingresso(long id, String fileira, byte coluna, boolean estudante, long numeroCarteira, boolean flag) {
		super();
		this.id = id;
		this.fileira = fileira;
		this.coluna = coluna;
		this.estudante = estudante;
		this.numeroCarteira = numeroCarteira;
		this.flag = flag;
	}
	
	public Ingresso() { }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFileira() {
		return fileira;
	}

	public void setFileira(String fileira) {
		this.fileira = fileira;
	}

	public byte getColuna() {
		return coluna;
	}

	public void setColuna(byte coluna) {
		this.coluna = coluna;
	}

	public boolean isEstudante() {
		return estudante;
	}

	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}

	public long getNumeroCarteira() {
		return numeroCarteira;
	}

	public void setNumeroCarteira(long numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	
	
}
