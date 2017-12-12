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
	
    //�ж�����Ľ���Ƿ���ϸ�ʽ
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
					System.out.println("�������˶��С����");
					check = false;
					break;
				}
			}
			else {
				System.out.println("�������˳����ֺ�С����֮����ַ�");
				check = false;
				break;
			}
		}
		return check;
		
	}
	
	//��������ַ�����С����Ϊ�ָ����ֱ𴢴�������������
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
        	case 0 : chinesearray1[i]='��';break;
        	case 1 : chinesearray1[i]='Ҽ';break;
        	case 2 : chinesearray1[i]='��';break;
        	case 3 : chinesearray1[i]='��';break;
        	case 4 : chinesearray1[i]='��';break;
        	case 5 : chinesearray1[i]='��';break;
        	case 6 : chinesearray1[i]='½';break;
        	case 7 : chinesearray1[i]='��';break;
        	case 8 : chinesearray1[i]='��';break;
        	case 9 : chinesearray1[i]='��';
        	}
    	}
   
    }
    
    public static void copytochinese2(int[] array) {
    	chinesearray2 = new char[array.length];
    	for(int i = 0;i < array.length; i++) {
        	switch(array[i]) {
        	case 0 : chinesearray2[i]='��';break;
        	case 1 : chinesearray2[i]='Ҽ';break;
        	case 2 : chinesearray2[i]='��';break;
        	case 3 : chinesearray2[i]='��';break;
        	case 4 : chinesearray2[i]='��';break;
        	case 5 : chinesearray2[i]='��';break;
        	case 6 : chinesearray2[i]='½';break;
        	case 7 : chinesearray2[i]='��';break;
        	case 8 : chinesearray2[i]='��';break;
        	case 9 : chinesearray2[i]='��';
        	}
    	}
   
    }
    
    public static void print1(){
    	               
    	String[] unit = {"Ԫ","ʰ","��","Ǫ","��","ʰ","��","Ǫ","��"};
    	for(int i = 0;i < chinesearray1.length; i++) {
    		if(((chinesearray1.length)-i-1) >= 4 &&((chinesearray1.length)-i-1) <= 7 && chinesearray1[chinesearray1.length-5] == '��' && i == chinesearray1.length-5) {
    			System.out.print("��");
    		}
    	    else if(chinesearray1[i] == '��') {
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
    		if(chinesearray1[i] == '��') {
    			checkzero(i+1);
    		}
    		else {
    			System.out.print("��");
    		}
    	}
        return i;
    }

    public static void print2() {
    	String[] decimal = {"��","��"};
        for(int i = 0;i < chinesearray2.length; i++) {
        	System.out.print(chinesearray2[i] + decimal[i]);
        }
    }
	       
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    

}
