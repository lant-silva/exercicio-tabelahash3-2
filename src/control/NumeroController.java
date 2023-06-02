package control;

import model.Lista;

public class NumeroController {
	Lista[] numero;
	
	public NumeroController() {
		numero = new Lista[10];
		
		for(int i=0;i<10;i++) {
			numero[i] = new Lista();
		}
	}
	
	public void insereNumero(int num) {
		int hash = hashCode(num);
		Lista numX = numero[hash];
		if(numX.isEmpty()) {
			numX.addFirst(num);
		}else {
			try {
				numX.addLast(num);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public Lista getNumero0_10(int num) {
		Lista aux = new Lista();
		if(num<0||num>9) {		
			System.out.println("Apenas numeros de 0 a 9");
			return aux;
		}else {
			int hash = hashCode(num*10);
			int tamanho = numero[hash].size();
			for(int i=0;i<tamanho;i++) {
				try {
					if(aux.isEmpty()) {
						aux.addFirst(numero[hash].get(0));
					}else {
						aux.add(numero[hash].get(i), i);
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			return aux;
		}
	}
	
	
	public int hashCode(int num) {
		return num /= 10;
	}
}
