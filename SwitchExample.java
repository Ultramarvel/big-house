import java.util.*;
public class SwitchExample{
public static void main(String args[]){
	System.out.print("输入温度");
	Scanner reader=new
Scanner(System.in);
	int c=reader.nextInt();
	switch(c<10?1:c<25?2:c<35?3:4){
	case 1:System.out.println(""+c+"℃有点冷");break;
	case 2:System.out.println(""+c+"℃正合适");break;
	case 3:System.out.println(""+c+"℃有点热");break;
	default:System.out.println(""+c+"℃太热了");
}
}
}