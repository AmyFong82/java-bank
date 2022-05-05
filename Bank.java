class Bank {
  static double getRateOfInterest(){return 0.1;}
  // public void getRateOfInterest(){
  //   System.out.println(rateOfInterest);
  // }
  public static void main(String[] args){
    System.out.println(getRateOfInterest());
  }
}

class SBI extends Bank {
  static double getRateOfInterest(){return 0.08;}
}

// class ICICI extends Bank {
//   double rateOfInterest = 0.07;
// }

// class AXIS extends Bank {
//   double rateOfInterest = 0.09;
// }

class PrintAllInterests{
  public static void main(String[] args){
    Bank b = new Bank();
    b.getRateOfInterest();
    SBI a = new SBI();
    a.getRateOfInterest();
  }
}