package assignments1;

public class Mobile {
    public void makeCall() {
    	System.out.println("Make Call");
    	String mobileName="Oneplus";
    	float mobileWeight=2.90f;
    }
    public void sendMsg() {
    	System.out.println("Send Msg");
    	boolean fullCharged=true;
    	int mobileCost=32000;
    }
	public static void main(String[] args) {
		Mobile phone=new Mobile();
		phone.makeCall();
		phone.sendMsg();
		System.out.println("This is my Mobile");
    

	}

}
