class Bank {
  public static void main(String[] args){
    float rateOfInterest = 0.1;
    public void getRateOfInterest(){
      System.out.println(rateOfInterest)
    }
  }
}

class SBI extends Bank {
  float rateOfInterest = 0.08;
  }
}

class ICICI extends Bank {
  float rateOfInterest = 0.07;

}

class AXIS extends Bank {
  float rateOfInterest = 0.09;
}