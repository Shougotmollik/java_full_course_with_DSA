import java.util.*;

public class productBill {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float pencil=sc.nextFloat();
            float pen=sc.nextFloat();
            float eraser=sc.nextFloat();
            float TotalBill=(float)(pencil+pen+eraser);
            System.out.println("The bill : "+TotalBill);

            // biling with 18% gst 
            float GstBill=TotalBill+(0.18f*TotalBill);
            System.out.println("The bill With GST : "+GstBill);
        }

    }
}
