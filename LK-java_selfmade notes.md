
### java notes

##1.ArrayLIst
it store items in ordered collection acess through index number
it is a resizable array while comparing with array

ArrayList<String> cars = new ArrayList<>();
car.add("bmw");
cars.get(0)       //to acessing
cars.set(0,"lambo") // to change an item
cars.remove(0);
cars.clear();    // to remove all the
cars.size();     // to find how many elemtns

for (String i : cars) // to interate thorugh
collection.sort(cars);

2.LinkedList

it is a linkedlist class is a collection which can contains
many objects of the same type just like arryalist

it same as arrraylist becuase it implentnts List interface


ARRAYLIST use a regularu array inside it
LINKEDLIST stores it items in container each container linked to next
container

use array list to store and acessing data
use linke list to manipulate data

LinkedList<integer> cars = new LinkedList<integer>();
cars.add("bmw");
cars.addFirst(lambo);  //changed to lambo first
cats.addlast()

MAP interface have two classes  Hashmap\\\hashset

java hashMap

in arraylist you store items in ordere so you acess through index val
wile hashmap store items in key:Value pairs so acessing throuh index
 
HashMap<String,String> capCities = new HashMap<>();
capcities.put("engnland","London"); //add using put method

capcities.get("engnland");   //for acess a value

hashSet is a collection of items where evey item is unique

HashSet<String> cars = new HashSet<>();
cars.add("bmw");
cars.add("bmw");  // bmw appears once in the set bcz of uniqueness
cars.contains("bmw")  // to check it exists

Iterator is used to loop through the collections
getting a iterator is so easy

ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

Iterator<String> it = cars.iterator();
sopln("it.next()"); // it prints Volov only

 while(it.hasNext()){  // it print all the elements
sopln("it.next()")}

1.whatis Jshel

it is a command line tool which execute java code

2.what is VAr
from java 11 onwards it allows to declare a variable
  withour mention their Datetype

3.waht is typecast?
it is like conversion of datetype
through implixiSlty or explicitly
  like biger DT to smaller DT with data loss= narrowing
  like smaller DT to Larer DT with no DATE loss= widening

4.this keyword uses?

it is an reference variable that refer to current Object
use to invoke the current class variable
ivoke current class method, constructor
main use of this() is constructor call from one const
to anothre const

5.regurlar Expresson?
it is pattern mattcing or like to validate based up on some
constraints

5.what is DateTimeAPI?


what is variale arguent?

 internally it works as an array of elemts
usually we use this arguments in last one like
by indicating ... in front of variable

what is Exception Handling?


 exception hanlding is like hadnling the runtime errors
is of two types
checked exception   it checked at compile time
unchecked exception means checked at runtime

try block it excecute the block of code and it
wont exceute alone
catch block   it catch the exception thrown by try
finally block it execute even exceptionis handle or not
throw   used within method used for throw an exceptio
throws use in method signature / used to declare         exception


what is Iterators?
 
 it is an object which is used to loop through
the collections it has
 to print the 1st item ...next() and
to print the continuos ..>hasNext() method
to itrate


what is method referencing?

it is an alternative for Lambda expressoin
indicatedd thorugh :: double colon symbol


what is lambda expression?

 it introduce in java 8 onwards
way of implementing the interfaces
which is an anonymus function= fuction with out function name
lambda is a fucnitonal type programming not an object type one
passing the entire method as a Variable
sytnex parameter -> expression.

paraller processing problme slove using this
it is an anonymous method not bound to any identifiers
lamda expression enables a method to be passed as
an argument to other method
syntax
(argument) -> {body}    -> token operator

lambdaExpression are the type of funtionalInterface
where they follow the definition of the
abstract functional method of the interface
kk
what is functional interfacea
 means which should have only one abstract method
and any number of default method is called fI
and lambda expression are the implemtation for that method

some finctionalINterface
Runnable
comparator
prdicate<T> kind of testing like if else true or false
supplier
consumer<T> thers is no output for this






1.what is String

we use String in java to make more memory
efficient bcz no new obj is created if it is
already in the String Constant Pool.
        in java String is basically an object that represent the
        sequence of character value

String are immutable in nature
it cnnt be changed
for muttable we use {StringBuffer,StringBuilder}

in java we can create String by
  Literal
      new keyword
the Jvm checks the String Constant Pool if
the String already present it use the reference
instead creating a new object for it

2.Java String Compare

by using equal() method
by using == operator
by using compareTo() method.

comparting using equla() method
comparing using equalsIgnoreCase() method


== operator
here it compare the references not the values

compareTo()method

compare the values and return an Integer value
like

== means 0
> positive value
< negative value


3.String concatenation in java


using + operator to concat/add string
after the Stirng Literal all the + will be
treated as Stirng concatenation operator

or by using the concat() method

STringBuilder is the fastest way to concatenate
Strings in java we use append() method to
concatenate

using Join() format()
using StringJoiner class we can concatenat

1.what is string class?

String is a sequence of characeter
which is a BuildIn class
we can create string using
string Literal > String n= "lkakil"
 or using new()keyword > String n = new String("LK")

String class provide a lot of inbuild methods for
perforing various operations

String in java is immutable in nature which means
values cannot be changed.
to overcome this we use StringBuilder and StringBuffer
StringBuilder which are muttable in nature

2.what is wrapper Class?


all the time we use primitive Dt but at some occasion we
need to represent them as object
which wraps the primitive data types

it have autoboxing and unboxing mechanism
Autoboxing the automatic conversion of primitive datatype to
corresponding wrapper class called Auto
Unboxing means vice versa of autoboxing

   use full method in wrapper class is =toString()

what is serialization?

we need to convert object into streams to perform the
serialization it can be done through the wrapper class

what is an Array
it is a collection of contigeou memoy location
it is an object created dynamically.
array can hold onlu reference of objects
we can also have array of arrays that is
multidimensional array datas were stored here
in tabular form.
ARRAY IS HOMOGENOUS ELEMENT
readymade APi is not in array


Collections framewrk?
Collection INterface
Sub interface like
LIST ==ArrayList \ linked List
QUEUE
SET
MAP == HASHMAP LINKEDHASHMAP

List interface

follows insertion order
acessing through index numbrs
allows duplicate elemetns

ARRayList== it is a dynamic array
internall use array to store elements
cannot able to create arrayList of primitive
ONLY FOR boxed type
LINKEDliST== contains duplicate order
MAINTAINS ORDERS
implemetns queue and Dequeue interfaces

arraylist vs linked list
IF WE add elements in betewnn the list lot of shiftng is
required so linked list is faster

SET order is scattered/unordered
accept duplicate element

hashset == cannot contain duplicate element
unordered colections
it use hashmap internally to store its element

what is Enumeration?
 it is a group of named constants. here filds are implicitly
static and final and so that it shows enum is a Datatype
which contains a fixed set of constants value



what is debugging?

it is a Systematic process of spotting and fixing the num
of bugs in our program or process of identifying and removing
errors

OOps concept shhort notes


oops means it is a metodology to design a prgm
using classes and objects

Object which means instance of the class
Class  Blueprint of object
Encapsulation protectiong our data /privat getterSetter
Polymorphism Different behaviours at different instnces
Abstraction hiding our relevant data
Inheritance one property of object is acquiring to
   another property of object

Inheritance
when one obj acquire all the properties and behaviour
of parent class

1.polymrphism?
if one task is performed in different ways
        differnrt behaviour at different instance
poly means many mophism means form
to achieve polymorphism we use methodoverload/override

method overloading--------
means having same name with different arguments
static polymorphism
private method can be overload


method overriding----------
dynamic polymorphism
means redifine a method in child class
        which already defined in parent class
    private method cannot be overridden

2.Abstraction
hiding internal detalis and showing only functionality
    process of hiding the implementation part and showing only
the functionality to the user

or showing only the essential details to the user not
hiding the Implementation part and showing
 only the def calld abstraction

Encapsulations
binding or wrapping the data together into
single unit are know as encapsulation
encapsulated class like a private
we use getter Setter method in encapsulation

getter>>> accessormethod
Setter>>> mutatorMethod




Super keyword

which is used to invoke the parent class constructor
to access instance variable of parent class
to acess method of parent class


static keyword is mainly used for memeory management
it is a non acess modifiers

what is Static Variable

a single copy of the vaiable is created and shared among all objects at the class level. static variable are global variable all instance
of the class share the same static variable.
 
which is not only for the certain object it is also for the
entire clas

Static method

there is no need to create an object for the class
while invoking the static method

static block

got executed exactly once when the class is loaded
executed bfore the constructor is executed,
also used to initialize the static variable


what is abstract class

it is javamodifier applicabel for methods and classes
 which means it doesn;t have any body or defn
its implementations were provided in a sub class

if a class that contains any abastract method then
we need to declare that class also as abstract class

we cannot create an instance for abst class
we can have reference of abstct class but not object for it
we can decalre static , final methods too

what is interface

the variable declared inside the interface is public static and
final. we cannot declare static method inside the interface
multiple inheritacnce can achieved through interface

in interface the declared
variable by default [public static and Final]
method by default [public and abstract]


Optional Class?

every java program is familiar with nullPointerException
it can crash you code to avoid this.
optional class if final class which means this class
cannot be extended and it is a generic class

what is stream?

which breaks the bigger problems into smaller chunks
these smaller chunks are solved seperately and combined
together to obtain the final solution.
stream are executale both serially and parallely
we can create a stream using stream() method
also create it directly using Of() method

Streams are lazy once stream is operated it cannot operated
so far it works like a pipeline of

in stream the different operations are streamed together to
obtain unique results on a stream.
stream is an non-reusable nature so
once stream is operatd it cannot operatd once again..

what is properties file
 it is a text file used to store any kind of informa
in key value pair
used to store configuraiton relatd data
storing information which can be changed frequently
we can read a properties file using libraries
like a third partie libraries like ApacheCommons to read a file
ApcaheCommon provide propertisConfiguraiton Class used to read

 Stream concept
 it is a sequence of objects that supports various methods which
can be pipelined to produce the desired result.

map()

 method used to return a stream




List number = Arrays.asList(2,3,4,5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());
     
filter() method

 is use to select elements as per the predicate
passed as arguments

List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());

sorted: The sorted method is used to sort the stream.

List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());



collect: The collect method is used to return the result
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());


forEach: The forEach method is used to iterate through every element of the stream.

List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));


reduce: The reduce method is used to reduce the elements of a stream to a single value.
The reduce method takes a BinaryOperator as a parameter.

