package q3.a;

public class CClass extends PClass{
    void mFnc(){
        System.out.println("Hello from C Class");
        super.mFnc(11.22);
    }
    void mFnc(int a2, double d2){
        mFnc(d2);
        System.out.println("Integer Value: "+a2);
    }
}
