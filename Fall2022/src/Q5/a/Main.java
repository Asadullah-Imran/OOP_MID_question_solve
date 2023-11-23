package Q5.a;

public class Main {
    public static void main(String[] args) {
        PClass pObj= new PClass();
        CClass cObj= new CClass();

        pObj.mFnc();
        cObj.mFnc();
        cObj.mFnc(10,2.99);
        cObj.mFnc(3.145);

    }
}
//              expeceted output:
//        Hello from P class!
//        Hello from C Class
//        Double value: 11.22
//        Double value: 2.99
//        Integer Value: 10
//        Double value: 3.145


//for geting answer for qstion 2 fo to CClass