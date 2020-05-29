

public class Matrix {
//*
/*
Criar uma matriz (toda a zeros) dado o número de linhas e colunas.
● Criar uma matriz quadrada (toda a zeros) dado um único número para linhas/colunas.
● Saber o número de linhas e colunas da matriz.
● Aceder e alterar os seus elementos individualmente, dado o índice de linha e coluna.
● Alterar a matriz, multiplicando todos os seus elementos por inteiro (escalar).
● Saber se a matriz tem a mesma dimensão que outra.
*/
	private int[][] data;

	public Matrix(int line, int col){
		data = new int[line][col]; 
	} 
	public Matrix(int lineCol){
		data = new int[lineCol][lineCol]; 
	}
	public int getLines(){
		return data.length;
	}
	public int getColumns(){
		return data[0].length;		
	}
	public void setValue(int line, int col, int value){
		if(!exists(line, col))
			throw new IllegalArgumentException("Does not exist");
		data[line][col] = value;
	}
	public void spanXD(int value){
		for(int i = 0; i < data.length; i++)
			for(int j = 0; j < data[i].length; j++)
				data[i][j] = data[i][j]*value;
	}
	public boolean isEqual(Matrix m){
		return m.getLines() == getLines() && m.getColumns() == getColumns();
	}
	public int getValue(int line, int col){
		return data[line][col];
	}
	public String toString(){
		return "Matrix : " + getLines() + "x" + getLines();
	}
	public boolean exists(int a, int b){
		return a < getLines() && b < getColumns();
	}
	public void seeMatrix(){
		for(int i = 0; i < getLines(); i++){
			System.out.println();
			for(int j = 0; j < getColumns(); j++)
				System.out.print(" " + data[i][j] + " ");
		}
		System.out.println();
	}
}