package student_rolands_gudels.lesson_3_oop_first_look.level_2_intern;

public class Task_10 {
    /*    }
}

2) Using new Keyword
We can create a new string object by using new operator
that allocates memory for the object.

public class Demo{
    public static void main(String[] args) {
    	String s1 = new String("Hello Java");
    	System.out.println(s1);
    }
}

Concatenating String.

There are 2 methods to concatenate two or more string.
- Using concat() method
- Using + operator

1) Using concat() method
Concat() method is used to add two or more string into
a single string object. It is string class method and
returns a string object.

public class Demo{

    public static void main(String[] args) {
    	String s = "Hello";
    	String str = "Java";
    	String str1 = s.concat(str);
    	System.out.println(str1);
    }
}

2) Using + operator
Java uses "+" operator to concatenate two string objects
into single one. It can also concatenate numeric value
with string object. See the below example.

public class Demo{
    public static void main(String[] args) {
    	String s = "Hello";
    	String str = "Java";
    	String str1 = s+str;
    	String str2 = "Java"+11;
    	System.out.println(str1);
    	System.out.println(str2);
    }
}


String Comparison

To compare string objects, Java provides methods and operators both.
So we can compare string in following three ways:
- Using equals() method
- Using == operator
- By CompareTo() method


Using equals() method

equals() method compares two strings for equality.
Its general syntax is:

boolean equals (Object str)

Example

It compares the content of the strings.
It will return true if string matches, else returns false.

public class Demo{
    public static void main(String[] args) {
    	String s = "Hell";
    	String s1 = "Hello";
    	String s2 = "Hello";
    	boolean b = s1.equals(s2);    //true
    	System.out.println(b);
    	b =	s.equals(s1) ;   //false
    	System.out.println(b);
    }
}


Using == operator.

The double equal (==) operator compares two object references
to check whether they refer to same instance. This also,
will return true on successful match else returns false.

public class Demo{
    public static void main(String[] args) {
    	String s1 = "Java";
    	String s2 = "Java";
    	String s3 = new String ("Java");
    	boolean b = (s1 == s2);     //true
    	System.out.println(b);
    	b =	(s1 == s3);      //false
    	System.out.println(b);
    }
}*/
    //Done
}
