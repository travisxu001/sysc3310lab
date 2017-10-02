

public class BuddyInfo {
	public String name;
	public int pNo;

	
	
	
	public String getName() {
		return name;
	}

	public  void setName(String name) {
		this.name = name;
	}

	public BuddyInfo() {
		
		this.name = null;
		this.pNo = 0;
	}
	public BuddyInfo(String name, int pNo) {
		super();
		this.name = name;
		this.pNo = pNo;
	}

	public int getpNo() {
		return pNo;
	}

	public void setpNo(int pNo) {
		this.pNo = pNo;
	}
	
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		BuddyInfo TT = new BuddyInfo();
		TT.setName("Travis");
		System.out.println(TT.getName());
		TT.setpNo(78888888);
		System.out.println(TT.getpNo());
		
	}

}
