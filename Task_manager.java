import java.util.ArrayList;
import java.util.Arrays;

public class Task_manager {

	public static void main(String[] args) {
		ArrayList<String> t = new ArrayList<String>();
		t.addAll(Arrays.asList("fazer as compras","lavar o carro","tirar o lixo"));
		lerTarefasPendentes(t);
		t.remove(0);					//retirando uma tarefa concluída
		lerTarefasPendentes(t);
	}
	
	private static void lerTarefasPendentes(ArrayList<String> t) {
		System.out.printf("\n======Tarefas pendentes======\n");
		for(int i=0; i<t.size(); i++) {
			System.out.println(t.get(i));
		}
	}
}