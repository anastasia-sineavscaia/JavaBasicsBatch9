package Tasks;
class CreditCardTester{
	
	public static void main(String[] args) {
	    AX ax=new AX();
	    ax.checkInterest(1000);
	    Visa visa=new Visa();
	    visa.checkInterest(1000);
	    CreditCard creditCard=new CreditCard();
	    creditCard.checkInterest(1000);
}




}


