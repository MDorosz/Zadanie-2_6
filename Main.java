class Main {
  public static void main(String[] args) {
    
    int C=0;
    int F=0;

    for (int x=0;x<16;x++){

      F = (C*9/5)+32;

      System.out.println("temp w C: " + C + " temp w F: " + F);
      C=C +20;
      
    }
    
  }
}