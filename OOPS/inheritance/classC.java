package OOPS.inheritance;
//extends is used for the it will acess the other class file
//it doesn't have multiple inheritance
public class classC extends classB{
    void vishnu(){
        //to call a function
        //if you had super keyword then it will redirect into a another file
        //it will take parent class
        super.keerthi();
        System.out.println("members");
    }
    //  @Override  it is used for paranthesis loading if you want only one class thats why
    public void keerthi(){
        System.out.println("keerthi-void");
    }
}
