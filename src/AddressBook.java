import java.util.ArrayList;
import java.util.List;
public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	public void addBuddy(BuddyInfo T) {
		if(T != null) {
			this.buddyInfo.add(T);
		}
	}
	
	public BuddyInfo removeBuddy(int index) {
		if(index >= 0 && index<this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String[] args) {
		
		BuddyInfo buddy = new BuddyInfo("Tom",1234);
		AddressBook addressBook1 = new AddressBook();
		addressBook1.addBuddy(buddy);
		addressBook1.removeBuddy(0);
	}
	
	
	

}
