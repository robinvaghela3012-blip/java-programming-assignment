class MatrixOps {
    int[][] a = {{1,2},{3,4}};
    int[][] b = {{5,6},{7,8}};

    void transpose() {
        System.out.println("Transpose:");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }

    void multiply() {
        int[][] res = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<2;k++){
                    res[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        System.out.println("Multiplication:");
        for(int[] row: res){
            for(int val: row){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MatrixOps m = new MatrixOps();
        m.transpose();
        m.multiply();
    }
}