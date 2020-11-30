class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    byte b = 2;
    int i = 345;
    Boolean boo = true;
    short bags = 23;
    float length = 3.4f;
    double area = 4.567;
    long price = 45686884743L;
    char letter = 't';
    String course = "Java";
    boolean isOpen = false;
    System.out.print(Tolulope.haveEaten(null));

  }
}
class Tolulope{
  public boolean test(){
    String[] likes = {"movies","food","games"};
    Main.main(likes);
    return true;
  }

 // A function that checks if I have eaten
  public static boolean haveEaten(String food){
    if(food == null || food.isEmpty()){
      return false;
    }
    else{
      return true;
    }
  }
}
