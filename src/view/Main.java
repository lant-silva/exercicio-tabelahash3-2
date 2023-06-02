package view;

import control.NumeroController;
import model.Lista;

public class Main {
	public static void main(String[] args) {
		
		int[] vetor = {1,7,12,52,23,43,45,56,79,99,21,23,13,19,83,22,59, 33, 46, 45, 77, 88, 99, 96, 43, 12, 9, 2, 7};
		NumeroController control = new NumeroController();
		int tamanho = vetor.length;
		
		for(int index : vetor) {
			control.insereNumero(index);
		}
		
		Lista num = control.getNumero0_10(9); //Aqui onde você busca o número de 0 a 9
		while(!num.isEmpty()) {
			try {
				System.out.println(num.get(0));
				num.removeFirst();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
