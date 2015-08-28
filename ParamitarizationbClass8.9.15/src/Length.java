import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

 class StringLengthComparator implements Comparator<String>

{

@Override

public int compare(String s1, String s2)

{
/*
int l=s1.length();

int l1=s2.length();

if(l>l1)

{

return 1;

}

else if(l<l1)

{

return -1;

}

return 0;

}*/

    return s1.compareTo(s2);

}
}

public class Length {

    @Test

    public void m1()

    {

        List<String> animals=new ArrayList<String>();

        animals.add("chicken");

        animals.add("deer");

        animals.add("ant");

        animals.add("tiger");

        Collections.sort(animals,new StringLengthComparator());
       

        for(String animal:animals)

        {

        System.out.println(animal);

        }

        List<Integer> number=new ArrayList<Integer>();

        number.add(16);

        number.add(6);

        number.add(26);

        Collections.sort(number);

        for(Integer n:number)

        {

        System.out.println(n);

        }

        

        

 

    }

    @Test

    public void m2()

    {

        String s3="how are u";

        System.out.println(s3.trim());

        System.out.println(s3.replace("u", "rizbi"));

        String a[]=s3.split(" ");

        System.out.println(a[0]);

        System.out.println(s3.charAt(5));

    }

 

}

 

 