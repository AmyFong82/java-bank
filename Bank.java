class Bank {
  float rateOfInterest = 0.1f; // float numbers has f at the end.
  // static double getRateOfInterest(){return rateOfInterest;}
  // public static void main(String[] args){
  //   System.out.println(getRateOfInterest());
  // }
}

class SBI extends Bank {
  float rateOfInterest = 0.08f;
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