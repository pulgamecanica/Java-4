

public class ClassB{

	static Matrix sumAndScale(MatrixA a, MatrixA b, int scalar) {
		Matrix result = sumMatrix(a, b);
		result.spanXD(scalar);
		return result;
	}
	static Matrix sumMatrix(MatrixA a, MatrixA b){
    	if(!sumVerification(a, b))
    		throw new IllegalArgumentException("You can't sum MAtrixes with different proportions");
    	Matrix result = new Matrix(a.getLines(), a.getColumns());
    	for(int i = 0; i<a.getLines(); i++){
    		for(int j = 0; j < a.getColumns(); j++){
    			int box = a.getValue(i, j) + b.getValue(i, j);
    			result.setValue(i, j, box);
    		}
    	}
    	return result;
	}
	static boolean sumVerification(MatrixA a, MatrixA b){
		return a.getColumns() == b.getColumns() && a.getLines() ==  b.getLines();
	}
	public static void main(String[] args){
		ClassB a = new ClassB();
		MatrixA m1 = new MatrixA(3);
		MatrixA m2 = new MatrixA(3, 3);
		//m1
		m1.setValue(0, 0, 1);
		m1.setValue(0, 1, 0);
		m1.setValue(0, 2, 0);
		m1.setValue(1, 0, 0);
		m1.setValue(1, 1, 1);
		m1.setValue(1, 2, 0);
		m1.setValue(2, 0, 0);
		m1.setValue(2, 1, 0);
		m1.setValue(2, 2, 1);
		//m2
		m2.setValue(0, 0, 0);
		m2.setValue(0, 1, 0);
		m2.setValue(0, 2, 1);
		m2.setValue(1, 0, 0);
		m2.setValue(1, 1, 1);
		m2.setValue(1, 2, 0);
		m2.setValue(2, 0, 1);
		m2.setValue(2, 1, 0);
		m2.setValue(2, 2, 0);

		m1.seeMatrix();
		m2.seeMatrix();
		Matrix m3 = a.sumAndScale(m1, m2, 3);
		m3.seeMatrix();
	}
}