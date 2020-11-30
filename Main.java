class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    byte b = 2;
    int i = 345;
    Boolean boo = true;
    short s = 23;
    float f = 3.4f;
    double d = 4.567;
    long l = 45686884743L;
    String st = "Java";
    boolean no = false;
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
