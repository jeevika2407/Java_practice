package oops.practice;
import java.util.*;
class Member {
    int memid;
    String memName;
    String memLocation;

    public Member(int memid, String memName, String memLocation) {
        this.memid = memid;
        this.memName = memName;
        this.memLocation = memLocation;
    }

    public void memberProfile() {
        System.out.println("ID: " + memid + " Name: " + memName + " Location: " + memLocation);
    }

    public double getUsage() {
        return 0;
    }

    public double setBill() {
        return 0;
    }
}

class PrimeMember extends Member {
    double weekRent;

    public PrimeMember(int memid, String memName, String memLocation, double weekRent) {
        super(memid, memName, memLocation);
        this.weekRent = weekRent;
    }

    @Override
    public void memberProfile() {
        super.memberProfile();
        System.out.println("Prime Member Weekly Rent: Rs " + weekRent + " Monthly Bill: Rs " + setBill());
    }

    @Override
    public double setBill() {
        return weekRent * 4;
    }
}

class NormalMember extends Member {
    int hour;
    double rate = 50;

    public NormalMember(int memid, String memName, String memLocation, int hour) {
        super(memid, memName, memLocation);
        this.hour = hour;
    }

    @Override
    public void memberProfile() {
        super.memberProfile();
        System.out.println("Normal Member Hours Used: " + hour + " Monthly Bill: Rs " + setBill());
    }

    @Override
    public double getUsage() {
        return hour;
    }

    @Override
    public double setBill() {
        return hour * rate;
    }
}

public class BrowsingCentre {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of members:");
        int n = sc.nextInt();

        Member[] members = new Member[n];
        NormalMember[] highpayer = new NormalMember[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for member " + (i + 1));
            System.out.println("Enter ID:");
            int memid = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name:");
            String memName = sc.nextLine();
            System.out.println("Enter Location:");
            String memLocation = sc.nextLine();
            System.out.println("1-prime 2-normal");
            int type = sc.nextInt();

            if (type==1) {
                System.out.print("weekly rent: ");
                double weeklyRent = sc.nextDouble();
                members[i] = new PrimeMember(memid, memName, memLocation, weeklyRent);
            } else if (type==2) {
                System.out.print("hour in a Month: ");
                int hoursUsed = sc.nextInt();
                NormalMember nm = new NormalMember(memid, memName, memLocation, hoursUsed);
                members[i] = nm;
                if (nm.setBill()>2000) {
                    highpayer[count++] = nm;
                }
            } else {
                System.out.println("invalid type");
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println("ID: " + highpayer[i].memid + " Name: " + highpayer[i].memName);
        }
        sc.close();
    }
}

