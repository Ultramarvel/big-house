import java.util.*;
public class BreakExample{
public static void main(String args[]){
	System.out.print("����һ��������");
	Scanner reader=new
Scanner(System.in);
	reader.useDelimiter("\\s");
	boolean found = false;
	while(reader.hasNextInt()){
	int searchInt = reader.nextInt();
	if(searchInt/10%10==3){
	found = true;
	System.out.println("��һ��ʮλ��Ϊ3����Ϊ"+searchInt);
	break;
}
}
	if(!found)System.out.println("û�в鵽ʮλ��Ϊ3����");
}
}