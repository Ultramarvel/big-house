import java.util.*;
public class SwitchExample{
public static void main(String args[]){
	System.out.print("�����¶�");
	Scanner reader=new
Scanner(System.in);
	int c=reader.nextInt();
	switch(c<10?1:c<25?2:c<35?3:4){
	case 1:System.out.println(""+c+"���е���");break;
	case 2:System.out.println(""+c+"��������");break;
	case 3:System.out.println(""+c+"���е���");break;
	default:System.out.println(""+c+"��̫����");
}
}
}