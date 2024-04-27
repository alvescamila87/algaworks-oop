package com.algaworks.curso.fjoo.enums;

public enum OperacoesAritmetica {
	
	ADICAO {
		@Override
		public int operacao(int x, int y) {			
			return x + y;
		}
	},
	SUBTRACAO {
		@Override
		public int operacao(int x, int y) {
			return x - y;
		}
	},
	MULTIPLICACAO {
		@Override
		public int operacao(int x, int y) {
			return x * y;
		}
	},
	DIVISAO {
		@Override
		public int operacao(int x, int y) {
			if(y == 0) {
				System.out.println("Não é possível realizar divisão por ZERO.");
				return 0;
			}
			return x / y;
		}
	};
	
	public abstract int operacao(int x, int y);

}
