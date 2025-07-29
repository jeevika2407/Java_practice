
package com.Comparable;
import java.util.*;
import java.lang.*;

class Mobile implements Comparable<Mobile> {
    private String name;
    private int ram;
    private int price;

    Mobile(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getRam() {
        return ram;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(Mobile o) {
        return Integer.compare(this.ram, o.getRam()); // Sort by RAM in ascending order
    }
}

class PriceCompare implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        return Integer.compare(m1.getPrice(), m2.getPrice()); // Ascending order
    }
}

class NameCompare implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        return m1.getName().compareTo(m2.getName()); // Ascending order (A-Z)
    }
}
public class ComparatorDemo {

	public static void main(String[] args) {
		List<Mobile>mobileList=new ArrayList<>();
		mobileList.add(new Mobile("redme",16,800));
		mobileList.add(new Mobile("apple",18,10000));
		mobileList.add(new Mobile("samsung",13,100));
		
		System.out.println("soreted by price");
		PriceCompare priceCompare=new PriceCompare();
		Collections.sort(mobileList,priceCompare);
		System.out.println("mobiles after price sorting");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		
		
		for(Mobile mb:mobileList) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
		
		System.out.println("soreted by price");
		NameCompare nameCompare=new NameCompare();
		Collections.sort(mobileList,nameCompare);
		System.out.println("mobiles after price sorting");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		
		
		for(Mobile mb:mobileList) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
	}
}





/*

package com.Comparable;
import java.util.*;

class Mobile implements Comparable<Mobile> {
    private String name;
    private int ram;
    private int price;

    Mobile(String name, int ram, int price) {
        this.name = name;
        this.ram = ram;
        this.price = price;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getRam() {
        return ram;
    }

    void setRam(int ram) {
        this.ram = ram;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    public int compareTo(Mobile o) {
        return Integer.compare(this.ram, o.getRam()); // Sort by RAM in ascending order
    }
}

class PriceCompare implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        return Integer.compare(m1.getPrice(), m2.getPrice()); // Ascending order
    }
}

class NameCompare implements Comparator<Mobile> {
    public int compare(Mobile m1, Mobile m2) {
        return m1.getName().compareTo(m2.getName()); // Ascending order (A-Z)
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Mobile> mobileList = new ArrayList<>();
        mobileList.add(new Mobile("Redmi", 16, 800));
        mobileList.add(new Mobile("Apple", 18, 10000));
        mobileList.add(new Mobile("Samsung", 13, 100));

        System.out.println("Sorted by Price (Ascending Order):");
        Collections.sort(mobileList, new PriceCompare());
        System.out.println("Name\tRam\tPrice");

        for (Mobile mb : mobileList) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }
        
        System.out.println("\nSorted by Name (Ascending Order):");
        Collections.sort(mobileList, new NameCompare());
        System.out.println("Name\tRam\tPrice");

        for (Mobile mb : mobileList) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }
        
        System.out.println("\nSorted by RAM (Ascending Order):");
        Collections.sort(mobileList);
        System.out.println("Name\tRam\tPrice");

        for (Mobile mb : mobileList) {
            System.out.println(mb.getName() + "\t" + mb.getRam() + "\t" + mb.getPrice());
        }
    }
}
*/