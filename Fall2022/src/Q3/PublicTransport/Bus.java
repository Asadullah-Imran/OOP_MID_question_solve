package Q3.PublicTransport;

import Q3.Transport.Vehicle;
public class Bus extends Vehicle{
    private int licenceNo;
    public Bus(int licenceNo){
    super(4);
    this.licenceNo=licenceNo;
    }

    public int getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(int licenceNo) {
        this.licenceNo = licenceNo;
    }


}
