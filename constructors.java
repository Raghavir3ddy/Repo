class Constructors{

void add(){
System.out.println("sample1");
}
}
class Child extends Constructors{

void add(){
System.out.println("sample2");
}
public static void main(String args[]){

new Child().add();
}
}


//just execute this method by removing add method in Child class and see the output.
//remove add() from child object and see the output.