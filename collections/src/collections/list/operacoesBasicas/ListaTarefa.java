package collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

	private List<Tarefa> tarefaList;
	
	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	public void adcionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao)); 
	}
	
	public void removerTarefa(String descricao) {
		
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		
		for (Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		
		
		listaTarefa.adcionarTarefa("tarefa 1");
		listaTarefa.adcionarTarefa("tarefa 2");
		listaTarefa.adcionarTarefa("tarefa 3");
		
		listaTarefa.removerTarefa("tarefa 2");
		System.out.println("o numero total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());
		listaTarefa.obterDescricoesTarefas();
	}
}
