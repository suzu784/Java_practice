class ctest15{
  public static void main(String args[]){
    B sample = new B();
  }
}

class A{
  A(){
    System.out.println("クラスAのコンストラクタ");
  }

  A(int num){
    System.out.println("クラスAの引数有りコンストラクタ");
  }
}

class B extends A{
  B(){
    super(10);
    System.out.println("クラスBのコンストラクタ");
  }
}