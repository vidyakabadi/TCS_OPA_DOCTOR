

package TCS2;
import java.util.Scanner;

public class TCS2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String DoctorID;
        String DoctorName;
        String Specialization;
        double ConsultationFee;
        
        DOCTOR d[]=new DOCTOR[5];
        
        for(int i=0;i<4;i++)
        {
            DoctorID=sc.nextLine();
            DoctorName=sc.nextLine();
            Specialization=sc.nextLine();
            ConsultationFee=sc.nextDouble();sc.nextLine();
            d[i]=new DOCTOR(DoctorID,DoctorName,Specialization,ConsultationFee);
        }
        String reqid=sc.nextLine();

        System.out.println(getTotalConsultationFee(d));
        System.out.println(getDoctor(d,reqid));
	}
	 public static double getTotalConsultationFee(DOCTOR d[])
	    {
	        double sum=0;
	        for(int i=0;i<4;i++)
	        {
	            if(d[i].getConsultationFee()>=0)
	            {
	                sum=sum+d[i].getConsultationFee();
	            }
	        }
	        return sum;
	    }
	    
	    public static DOCTOR getDoctor(DOCTOR d[],String DoctorID)
	    {
	        int j=0;
	        for(int i=0;i<4;i++)
	        {
	           if(d[i].getDoctorID().equals(DoctorID))
	           {
	               j=i;
	           }
	        }
	        return d[j];
	    }
	    

}

class DOCTOR{
	
	
	private String DoctorID;
	private String DoctorName;
private String Specialization;
	private double ConsultationFee;
	public DOCTOR(String doctorID, String doctorName, String specialization, double consultationFee) {
		super();
		DoctorID = doctorID;
		DoctorName = doctorName;
		Specialization = specialization;
		ConsultationFee = consultationFee;
	}
	public String getDoctorID() {
		return DoctorID;
	}
	public void setDoctorID(String doctorID) {
		DoctorID = doctorID;
	}
	public String getDoctorName() {
		return DoctorName;
	}
	public void setDoctorName(String doctorName) {
		DoctorName = doctorName;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public double getConsultationFee() {
		return ConsultationFee;
	}
	public void setConsultationFee(double consultationFee) {
		ConsultationFee = consultationFee;
	}


	
}
/*
DR001
Ram
Cardiologist
1000
DR002
Krish
Neurologist
1500
DR003
vijay
ENT
500
DR004
Anil
Dermalogist
400
dr001


*/