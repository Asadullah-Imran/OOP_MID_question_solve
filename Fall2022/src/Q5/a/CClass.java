package Q5.a;

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

//Here Method overriding and overloading both has been occurs
//line 4 it occurs method overriding as for same function with same parameter(no parameter)
//is situated in parent class PClass also and we add addition print and a method .

//and here method overloading occurs in line 8 .. where mFnc function has two parameter
//though parent class has same named function but it doesnot have a function with two parameter
//so here method overloading and overriding both occurs