
public class AddressBook {
	BuddyInfo buddyInfo = new BuddyInfo();
	BuddyInfo T2 = new BuddyInfo();
	BuddyInfo T3 = new BuddyInfo();
	
	public void addBuddy(BuddyInfo T) {
		if(T != null) {
			buddyInfo.add(T);
		}
	}
	
	public void removeBuddy(BuddyInfo T) {
		buddyInfo.remove(T);
		
	}
	
	public static void main(String[] args) {
		System.out.println("Address Book");
	}
	
	
	

}
