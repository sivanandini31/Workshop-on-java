
public class Tester {
	public static void main(String arg[]) {
		ContactOperations op =new ContactOperations();
		Contact c = new Contact("Raj",1234,"Family");
		Contact c1=new Contact("Ram",4532,"Family");
		Contact c2=new Contact("Chinna",6856,"Friends");
		Contact c3=new Contact("Chintu",8654,"Family");
		Contact c4=new Contact("Chinnu",6755,"Others");
		Contact c5 =new Contact("Chintu",6543,"Friends");
		 System.out.println(op.addContact(c2));
		 System.out.println(op.addContact(c4));
		 
		 op.addContact(c);
		 op.addContact(c1);
		 op.addContact(c2);
		 op.addContact(c3);
		 op.addContact(c4);
		 op.addContact(c5);
	}
}
