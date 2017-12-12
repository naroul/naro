package cal;
import java.util.Scanner;

public class my_experiment_two {
	
	public static int[] moneyarray1;
	public static int[] moneyarray2;
	public static char[] chinesearray1;
	public static char[] chinesearray2;
	
	public static void main(String[] args) {

		System.out.println("Please input a long number:");
		Scanner input = new Scanner(System.in);
		String sumofmoney = input.next();
		toarray(sumofmoney);
		copytochinese1(moneyarray1);
		copytochinese2(moneyarray2);
		print1();
		print2();
		
	}
	
    //判断输入的金额是否符合格式
	public static boolean check(String sumofmoney) {
		
		int count = 0;
		boolean check = false;
		for(int i = 0; i < sumofmoney.length(); i++) {
			if(sumofmoney.charAt(i) >= '0' && sumofmoney.charAt(i) <= '9') {
				if(i == (sumofmoney.length()-1) ) {
					check = true;
					break;
				}
			}
			else if(sumofmoney.charAt(i) == '.') {
				count++;
				if(count <= 1 && i == (sumofmoney.length()-1)) {
					check = true;
					break;
				}
				else if(count > 1) {
					System.out.println("您输入了多个小数点");
					check = false;
					break;
				}
			}
			else {
				System.out.println("你输入了除数字和小数点之外的字符");
				check = false;
				break;
			}
		}
		return check;
		
	}
	
	//将输入的字符串以小数点为分隔符分别储存在两个数组中
    public static void toarray(String sumofmoney) {
		
    	String[] moneyarray = sumofmoney.split("\\.");
    	moneyarray1 = new int [moneyarray[0].length()];
    	moneyarray2 = new int [moneyarray[1].length()];
		for(int i = 0 ; i < moneyarray[0].length() ; i++) {
			moneyarray1[i] = Integer.parseInt(String.valueOf(moneyarray[0].charAt(i)));
		}
		for(int i = 0 ; i < moneyarray[1].length() ; i++) {
			moneyarray2[i] = Integer.parseInt(String.valueOf(moneyarray[1].charAt(i)));
		}
    	
	}
    
    public static void copytochinese1(int[] array) {
    	chinesearray1 = new char[array.length];
    	for(int i = 0;i < array.length; i++) {
        	switch(array[i]) {
        	case 0 : chinesearray1[i]='零';break;
        	case 1 : chinesearray1[i]='壹';break;
        	case 2 : chinesearray1[i]='贰';break;
        	case 3 : chinesearray1[i]='叁';break;
        	case 4 : chinesearray1[i]='肆';break;
        	case 5 : chinesearray1[i]='伍';break;
        	case 6 : chinesearray1[i]='陆';break;
        	case 7 : chinesearray1[i]='柒';break;
        	case 8 : chinesearray1[i]='捌';break;
        	case 9 : chinesearray1[i]='玖';
        	}
    	}
   
    }
    
    public static void copytochinese2(int[] array) {
    	chinesearray2 = new char[array.length];
    	for(int i = 0;i < array.length; i++) {
        	switch(array[i]) {
        	case 0 : chinesearray2[i]='零';break;
        	case 1 : chinesearray2[i]='壹';break;
        	case 2 : chinesearray2[i]='贰';break;
        	case 3 : chinesearray2[i]='叁';break;
        	case 4 : chinesearray2[i]='肆';break;
        	case 5 : chinesearray2[i]='伍';break;
        	case 6 : chinesearray2[i]='陆';break;
        	case 7 : chinesearray2[i]='柒';break;
        	case 8 : chinesearray2[i]='捌';break;
        	case 9 : chinesearray2[i]='玖';
        	}
    	}
   
    }
    
    public static void print1(){
    	               
    	String[] unit = {"元","拾","佰","仟","万","拾","佰","仟","亿"};
    	for(int i = 0;i < chinesearray1.length; i++) {
    		if(((chinesearray1.length)-i-1) >= 4 &&((chinesearray1.length)-i-1) <= 7 && chinesearray1[chinesearray1.length-5] == '零' && i == chinesearray1.length-5) {
    			System.out.print("万");
    		}
    	    else if(chinesearray1[i] == '零') {
    	    	i = checkzero(i+1);
    			continue;
    		}
    		else {
    			System.out.print(chinesearray1[i] + unit[(chinesearray1.length)-i-1]);
    		}
    	}
    	
    }
    
    public static int checkzero(int i) {
    	
    	if(i < chinesearray1.length) {
    		if(chinesearray1[i] == '零') {
    			checkzero(i+1);
    		}
    		else {
    			System.out.print("零");
    		}
    	}
        return i;
    }

    public static void print2() {
    	String[] decimal = {"角","分"};
        for(int i = 0;i < chinesearray2.length; i++) {
        	System.out.print(chinesearray2[i] + decimal[i]);
        }
    }
	       
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

}
