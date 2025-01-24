import java.util.ArrayList;

public class ContactOperations {
	ArrayList<Contact> contacts =new ArrayList();
	public boolean addContact(Contact c) {
		for(Contact temp:contacts) {
			if(temp.getMobileNumber()==c.getMobileNumber()) {
				System.out.println("duplicate mobile number");
				return false;
			}
		}
		contacts.add(c);
		return false;
		
	}
	public ArrayList<Contact> searchByType(String type){
		ArrayList<Contact> list=new ArrayList();
		for(Contact temp : contacts) {
			if(temp.getType().equals(type)) {
				list.add(temp);
			}
		}
		return list;
	}
	public ArrayList<Contact> searchByName(String name){
		ArrayList<Contact> list=new ArrayList();
		for(Contact temp: contacts) {
			if(temp.getName().contains(name)) {
				list.add(temp);
			}
		}
		return list;
	}
	public ArrayList<Contact> seachByKey(String key){
		ArrayList<Contact> list =new arrayList();
		for(Contact a:contacts) {
			if(a.toString().contains(key)) {
				list.add(a);
			}
		}
	}
}
