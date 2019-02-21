package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Money)) {
			return false;
		}else if(obj == this) {
			return true;
		}
		return false;
	}



	@Override
	public int hashCode() {
		return super.hashCode();
	}



	public Money add(Money money) {
		Money mon = money;
		
		
		return money;
	}

	public Money minus(Money money) {
		return null;
	}

	public Money multiply(Money money) {
		return null;
	}

	public Money devide(Money money) {
		return null;
	}
}