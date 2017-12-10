package cal;
import java.util.ArrayList;

public class EigjhtQueen {  
	    private static final short N=8;       
	    static ArrayList<short [][]> chessList = new ArrayList<>();
	    
	    public static void main(String[] args) {
	        //初始化棋盘，全部置0
	        short chess[][]=new short[N][N];
	        for(int i=0;i<N;i++){
	            for(int j=0;j<N;j++){
	                chess[i][j]=0;
	            }
	        }
	        putQueenAtRow(chess,0);
	        
	    }

	    private static void putQueenAtRow(short[][] chess, int row) {        

	         // 递归终止判断：如果row==N，则说明已经成功摆放了8个皇后
	        if(row==N){
	            chessList.add(chess);
	          
	            for(int i=0;i<N;i++){
	                for(int j=0;j<N;j++){
	                    System.out.print(chess[i][j]+" ");
	                }
	                System.out.println();
	            }
	       
	            return;
	        }
	        
	        short[][] chessTemp=chess.clone();
	        
	        for(int i=0;i<N;i++){
	            // 摆放这一行的皇后，之前要清掉所有这一行摆放的记录，防止污染棋盘
	            for(int j=0;j<N;j++)
	                chessTemp[row][j]=0;
	            chessTemp[row][i]=1;
	            
	            if( isSafety( chessTemp,row,i ) ){
	                putQueenAtRow(chessTemp,row+1);
	            }
	        }
	    }

	    private static boolean isSafety(short[][] chess,int row,int col) {
	        //判断中上、左上、右上是否安全
	        int step=1;
	        while(row-step>=0){
	            if(chess[row-step][col]==1)                //中上
	                return false;
	            if(col-step>=0 && chess[row-step][col-step]==1)        //左上
	                return false;
	            if(col+step<N && chess[row-step][col+step]==1)        //右上
	                return false;
	            
	            step++;
	        }
	        return true;
	    }
	}