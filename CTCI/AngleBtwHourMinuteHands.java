import java.util.*;

public class AngleBtwHourMinuteHands {
    
    public static double findAngle (double hour, double min) {        
        /* minute hand rotates 360 degrees for 60 minutes, so for m minutes it rotates an angle of (m * 360 / 60) */
        double min_angle = min * 360 / 60;
        
        /* hour hand rotates 360 degrees for 12 hours, so for h hours it rotates an angle of (h * 360 / 12) */
        double h_angle = hour * 360 / 12;
        
        /* hour hand rotates 30 degrees (1 * 360 / 12)  in 60 minutes, so for m minutes it rotates an angle of (m * 30 / 60) */
        double hour_angle = h_angle + min * 30 / 60;
                
        return Math.abs(min_angle - hour_angle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        if (sc.hasNextLine()) {
            String[] in     = sc.nextLine().split(":");
            int      h      = Integer.parseInt(in[0]);
            int      m      = Integer.parseInt(in[1]);
            double   angle  = findAngle(h, m);
            System.out.println(angle == (int) angle ? (int) angle + " degrees" : angle + " degrees");
        }        
        sc.close();
    }

}
