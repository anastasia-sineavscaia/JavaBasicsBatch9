package Tasks;

public class CreditCard {

	double balance;
    double interest;
    void checkInterest(double balance){
        interest=balance*0.24;
        System.out.println(interest);
    }
}
class Visa extends CreditCard{
}
class AX extends CreditCard{
    void checkInterest(double balance){
        interest=balance*0.23;
        System.out.println(interest);
    }
   
}
