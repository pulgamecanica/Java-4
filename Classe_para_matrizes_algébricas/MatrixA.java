public class MatrixA{
//*
/*
Criar uma matriz (toda a zeros) dado o número de linhas e colunas.
● Criar uma matriz quadrada (toda a zeros) dado um único número para linhas/colunas.
● Saber o número de linhas e colunas da matriz.
● Aceder e alterar os seus elementos individualmente, dado o índice de linha e coluna.
● Alterar a matriz, multiplicando todos os seus elementos por inteiro (escalar).
● Saber se a matriz tem a mesma dimensão que outra.
*/
	private int[] data;
	private int columns;
	public MatrixA(int line, int col){
		data = new int[line*col];
		columns = col;
	} 
	public MatrixA(int lineCol){
		data = new int[lineCol*lineCol]; 
		columns = lineCol;
	}
	public int getLines(){
		return data.length/columns;
	}
	public int getColumns(){
		return columns;		
	}
	public void setValue(int line, int col, int value){
		if(!exists(getIndex(line, col)))
			throw new IllegalArgumentException("Does not exist");
		data[getIndex(line, col)] = value;
	}
	public void spanXD(int value){
		for(int i = 0; i < data.length; i++)
			for(int j = 0; j < columns; j++)
				data[getIndex(i, j)] = data[getIndex(i, j)]*value;
	}
	public boolean isEqual(Matrix m){
		return m.getLines() == getLines() && m.getColumns() == getColumns();
	}
	public int getValue(int line, int col){
		return data[getIndex(line, col)];
	}
	public boolean exists(int a){
		return a < getLines()*getColumns();
	}
	public int getIndex(int line, int col){
		if(line == 0)
			return col;
		return line*columns + col;
	}
	public String toString(){
		return "Matrix : " + getLines() + "x" + getColumns();
	}
	public void seeMatrix(){
		for(int i = 0; i < getLines(); i++){
			System.out.println();
			for(int j = 0; j < getColumns(); j++)
				System.out.print(" " + data[getIndex(i, j)] + " ");
		}
		System.out.println();
	}
}