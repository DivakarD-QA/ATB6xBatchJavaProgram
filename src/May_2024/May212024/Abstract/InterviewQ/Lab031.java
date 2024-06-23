package May_2024.May212024.Abstract.InterviewQ;

public class Lab031 {
}

interface I1{}
interface I2{}
class A{}
class B{}
abstract class C{}

class Test1 extends A{}   // OK - Single Inheritance
class Test2 extends B{}   // OK - Single Inheritance
// class Test3 extends A,B{} // NOK - Multiple Inheritance (with Class Not allowed)

class Test4 implements I1,I2{}  // Multiple Inherintance
class Test5 extends A implements I1,I2{}
//class Test6 implements I1 extends A{}  // NOK

//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1{}
interface I7 extends I1,I2{}

//interface I8 extends C{}

