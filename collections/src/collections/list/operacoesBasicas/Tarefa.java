package collections.list.operacoesBasicas;

public class Tarefa {
	
// atributo
	private String descricao;
	
	public Tarefa(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return descricao;
		}
}
