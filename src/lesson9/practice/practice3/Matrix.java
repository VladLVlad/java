package lesson9.practice.practice3;

public class Matrix {
    private int row;
    private int column;
    private int [][] matrix;

    public Matrix(int row, int column) {
        this.row = row;
        this.column = column;
        this.matrix = new int[row][column];
        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                this.matrix[i][j] = (int) (Math.random() * 6);
            }
        }

    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void setMatrix() {
        this.matrix = new int[this.row][this.column];
        for (int i = 0; i < this.matrix.length; i++){
            for (int j = 0; j < this.matrix[i].length; j++){
                this.matrix[i][j] = (int) (Math.random() * 6);
            }
        }
    }

    public String showMatrix() {
        StringBuilder line = new StringBuilder();
        for (int[] ints : this.matrix) {
            for (int anInt : ints) {
                line.append(anInt).append(" ");
            }
            line.append("\n");
        }
        return line.toString();
    }

    public void sumMatrix(int [][] twoMatrix){
        if(matrix.length == twoMatrix.length &&
                matrix[0].length == twoMatrix[0].length){
            System.out.println("new sum matrix: ");
            int [][] newMatrix = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < newMatrix.length; i++){
                for (int j = 0; j < newMatrix[i].length; j++){
                    newMatrix[i][j] = matrix[i][j] + twoMatrix[i][j];
                    System.out.print(newMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("error!");
        }
    }

    public void multiplyNumber(int number){
        System.out.println("new multiply matrix: ");
        int [][] newMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                newMatrix[i][j] = matrix[i][j] * number;
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void multiplyMatrices(int [][] twoMatrix){
        if(matrix.length == twoMatrix[0].length &&
                matrix[0].length == twoMatrix.length){
            System.out.println("new multiply by matrices matrix: ");
            int [][] newMatrix = new int[matrix.length][matrix.length];
            for (int i = 0; i < matrix.length; i++){
                for (int q = 0; q < matrix[i].length; q++ ){
                    for (int j = 0; j < matrix.length; j++){
                        newMatrix[i][j] += matrix[i][q] * twoMatrix[q][j];

                    }


                }
                for (int m:
                     newMatrix[i]) {
                    System.out.print(m + " ");
                }
                System.out.println();
            }
        }else {
            System.out.println("error!");
        }
    }
}
