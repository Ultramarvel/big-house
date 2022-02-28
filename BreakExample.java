import java.util.*;
public class BreakExample{
public static void main(String args[]){
	System.out.print("输入一组整数：");
	Scanner reader=new
Scanner(System.in);
	reader.useDelimiter("\\s");
	boolean found = false;
	while(reader.hasNextInt()){
	int searchInt = reader.nextInt();
	if(searchInt/10%10==3){
	found = true;
	System.out.println("第一个十位数为3的数为"+searchInt);
	break;
}
}
	if(!found)System.out.println("没有查到十位数为3的数");
}
}