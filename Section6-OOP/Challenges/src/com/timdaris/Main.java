package com.timdaris;

public class Main {

    public static void main(String[] args) {
        //Simple calculator:
        //simpleCalculatorChallenge();
        //person();
        //bankAccount();
        //vipCustomer();
        //wallArea();
        //pointChallenge();
        //carpetCostCalculator();
        //complexOperations();
        //inheritance();
        //cylinderChallenge();
        //poolArea();
        //roomOfAHouse();
        //classComposition();
        encapsulationChallenge();
    }

    public static void simpleCalculatorChallenge(){
        /*
        Description:
        Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
        Write the following methods (instance methods):
        Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
        Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
        Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
        Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumber field.
        Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
        Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
        Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
        Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
        */
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
        System.out.println("");
    }

    public static void person(){
        /*
        Write a class with the name Person. The class needs three fields (instance variables) with the names firstName, lastName of type String and age of type int.
        Write the following methods (instance methods):
        Method named getFirstName without any parameters, it needs to return the value of the firstName field.
        Method named getLastName without any parameters, it needs to return the value of the lastName field.
        Method named getAge without any parameters, it needs to return the value of the age field.
        Method named setFirstName with one parameter of type String, it needs to set the value of the firstName field.
        Method named setLastName with one parameter of type String, it needs to set the value of the lastName field.
        Method named setAge with one parameter of type int, it needs to set the value of the age field. If the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
        Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
        Method named getFullName without any parameters, it needs to return the full name of the person.
        In case both firstName and lastName fields are empty, Strings return an empty String.
        In case lastName is an empty String, return firstName.
        In case firstName is an empty String, return lastName.
        */
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        System.out.println("last name" + person.getFullName());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
        System.out.println("");
    }

    public static void bankAccount(){
        /*
        Create a new class for a bank account
        Create fields for the account number, balance, customer name, email, and phone number.

        Create getters and setters for each field
        Create two additional methods
        1. To allow the customer to deposit funds (this should increment the balance field).
        2. To allow the customer to withdraw funds. This should deduct from the balance field,
        but not allow the withdrawal to complete if there are insufficient funds.
        You will want to create various cod in the Main class (the one created by InelliJ) to
        confirm your code is working.
        Add some System.out.println()'s in the two methods above
        */

        BankAccount bankAccount = new BankAccount(); //"12345", 0.0, "Name Lastname", "myEmail@email.com", "000-111-222");
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getBalance());
        System.out.println(bankAccount.getPhoneNumber());
        System.out.println(bankAccount.getCustomerName());
        System.out.println(bankAccount.getEmail());
        bankAccount.depositFunds(1234.56);
        bankAccount.withdrawal(5.0);
        bankAccount.withdrawal(5000.0);

        BankAccount myAccount = new BankAccount("Name", "my@email.com", "000-000");
        System.out.println(myAccount.getAccountNumber() + " name " + myAccount.getCustomerName());
        System.out.println("");
    }

    public static void vipCustomer(){
        /*
        Create a new class VipCustomer
        it should have 3 fields name, credit limit, and email address
        create 3 constructors
        1st constructor empty should call the constructor with 3 parameters with default values
        2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        3rd constructor should save all fields
        */

        VipCustomer unknown = new VipCustomer();
        VipCustomer jack = new VipCustomer("Jack", 15.09);
        VipCustomer jill = new VipCustomer("Jill", 70.00, "jill@email.com");

        System.out.println(unknown.getCustomerName());
        System.out.println(jack.getCustomerName());
        System.out.println(jill.getCustomerName());
        System.out.println("");
    }

    public static void wallArea(){
        /*
        Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
        The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
        The second constructor has parameters width and height of type double and it needs to initialize the fields.
        In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.

        Write the following methods (instance methods):
        Method named getWidth without any parameters, it needs to return the value of width field.
        Method named getHeight without any parameters, it needs to return the value of height field.
        Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
        Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
        Method named getArea without any parameters, it needs to return the area of the wall.
        */
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
        System.out.println("");
    }

    public static void pointChallenge(){
        /*
        You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
        The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor).
        The second constructor has parameters x and y of type int and it needs to initialize the fields.
        Write the following methods (instance methods):
        Method named getX without any parameters, it needs to return the value of x field.
        Method named getY without any parameters, it needs to return the value of y field.
        Method named setX with one parameter of type int, it needs to set the value of the x field.
        Method named setY with one parameter of type int, it needs to set the value of the y field.
        Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
        Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
        Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
        */

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());
        System.out.println("");
    }

    public static void carpetCostCalculator(){
        /*
        The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.

        1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.
        The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.
        In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.
        Write the following methods (instance methods):
        Method named getArea without any parameters, it needs to return the calculated area (width * length).

        2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.
        The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.
        In case the cost parameter is less than 0 it needs to set the cost field value to 0.
        Write the following methods (instance methods):
        Method named getCost without any parameters, it needs to return the value of cost field

        3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
        The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
        Write the following methods (instance methods):
        Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
        */

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        System.out.println("");
    }

    public static void complexOperations(){
        /*
        Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary of type double. It represents the Complex Number.
        The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
        Write the following methods (instance methods):
        Method named getReal without any parameters, it needs to return the value of real field.
        Method named getImaginary without any parameters, it needs to return the value of imaginary field.
        Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
        Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
        Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
        Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.
        */

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());
        System.out.println("");
    }

    public static void inheritance(){
        /*
        Start with a base class of a Vehicle, then create a Car class that inherits from the base class.
        Finally, create another class, a specific type of Car that inherits from the Car class.
        You should be able to hand steering, changing gears, and moving (speed in other words).
        You will want to decide where to put the appropriate state and behaviours (fields and methods).
        As mentioned above, changing gears, increasing/decreasing speed should be included.
        For your specific type of vehicle you will want to add something specific for that type of car.
        */

        Car honda = new Car("Honda", "Civic", 5, 1, 0);
        honda.changeGear(1);
        honda.changeSpeed(15);
        honda.steering(-45);


        SkodaSuperb skoda = new SkodaSuperb(6, 1, 0, 1, false);
        skoda.changeGear(1);
        skoda.changeSpeed(15);
        skoda.steering(-45);
        skoda.umbrellaCompartmentInUse();
        System.out.println("");
    }

    public static void cylinderChallenge(){
        /*
        1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
        The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
        In case the radius parameter is less than 0 it needs to set the radius field value to 0.
        Write the following methods (instance methods):
        Method named getRadius without any parameters, it needs to return the value of radius field.
        Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.

        2. Write a class with the name Cylinder that extends Circle class. The class needs one field (instance variable) with name height of type double.
        The class needs to have one constructor with two parameters radius and height both of type double. It needs to call parent constructor and initialize a height field.
        In case the height parameter is less than 0 it needs to set the height field value to 0.
        Write the following methods (instance methods):
        Method named getHeight without any parameters, it needs to return the value of height field.
        Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
        */

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("");
    }

    public static void poolArea(){
        /*
        The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.

        1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
        The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
        In case the width parameter is less than 0 it needs to set the width field value to 0.
        In case the length parameter is less than 0 it needs to set the length field value to 0.
        Write the following methods (instance methods):
        Method named getWidth without any parameters, it needs to return the value of width field.
        Method named getLength without any parameters, it needs to return the value of length field.
        Method named getArea without any parameters, it needs to return the calculated area (width * length).

        2. Write a class with the name Cuboid that extends Rectangle class. The class needs one field (instance variable) with name height of type double.
        The class needs to have one constructor with three parameters width, length, and height all of type double. It needs to call parent constructor and initialize a height field.
        In case the height parameter is less than 0 it needs to set the height field value to 0.
        Write the following methods (instance methods):
        Method named getHeight without any parameters, it needs to return the value of height field.
        Method named getVolume without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.
        */

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5,10,5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("");
    }

    public static void roomOfAHouse(){
        /*
        Create a single room of a house using composition.
        Think about the things that should be included in the room.
        Maybe physical parts of the house but furniture as well.
        Add at least one method to access an object via a getter and
        then that objects public method as you saw in the previous video
        then add at least one method to hide the object e.g. not using a getter
        but access the object used in composition within the main class
        like you saw in this video.
        */

        Curtain curtain = new Curtain("White", "Flax", 15.7, 6.9, 0.7);
        Window window = new Window("PVC", "A known manufacturer", 2, true);

        Room livingRoom = new Room(window, curtain, new Door(12.0, 6.5, true, 1, "Wood", "A good onw", "Brown"));

        livingRoom.enterRoom();
        livingRoom.getDoor().closeDoor();
        livingRoom.checkIfWindowOpened();
        System.out.println("");
    }

    public static void classComposition(){
        /*
        This is an exercise in Class Composition. To complete the exercise, you must create five classes with associated member variables and methods.
        The five classes should be created as follows:
        1) Create a class and name it Lamp. Inside this class should be declared three member variables: style of type String, battery of type boolean, and globRating of
            type int. All variables should be marked private. A constructor needs to be created which accepts the three member variables as parameters.
            In addition, four methods should also be created: turnOn() has no return type and should print a message that the lamp is being turned on;
            getStyle() returns the lamp style; isBattery returns the value of battery; and getGlobRating() returns the globRating of the lamp.
        2) Create a class and name it Bed. Five private member variables should be declared: style of type String, and pillows, height, sheets, quilt of type int.
            A constructor should be coded which accepts these five member variables as parameters.
            Also, six methods should be defined: make() has no return type and prints a message to the effect that the bed is being made;
            getStyle() which returns the value of style; getPillows() returns the number of pillows;
            getHeight() returns the height of the bed; getSheets() returns the number of sheets on the bed; and getQuilt() returns the value of quilt.
        3) Create a class with the name Ceiling. There are two member variables for this one, height and paintedColor, both of type int.
            There should also be a constructor which accepts both member variables as parameters.
            There are also two additional methods which should be defined: getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.
        4) Create a class with the name Wall. It contains one member variable, direction, and is of type String.
            A constructor for Wall should accept one parameter for the member variable direction.
            A getter should also be defined for the direction field called getDirection().
        5) Create a class with the name Bedroom. This class contains eight member variables:
        name of type String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and lamp of type Lamp.
        The class constructor should accept all eight of the member variables as parameters, and there should also be two additional methods:
        getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is being made and also calls the make() method in the Bed class.
        */
        AnotherWall wall1 = new AnotherWall("West");
        AnotherWall wall2 = new AnotherWall("East");
        AnotherWall wall3 = new AnotherWall("South");
        AnotherWall wall4 = new AnotherWall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling,bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();
        System.out.println("");
    }

    public static void encapsulationChallenge(){
        /*
        Create a class and demonstrate proper encapsulation techniques
        the class will be called Printer
        It will simulate the real Computer Printer
        It should have fields for the toner level, number of pages printed, and also whether its a duplex printer (capable of printing on both sides of the paper).
        Add methods to fill up the toner (up to a maximum of 100%), another method to
        simulate printing a page (which should increase the number of pages printed).
        Decide the scope, whether to use constructors, and everything else you think is needed.
        */
        Printer printer = new Printer(0, true);
        printer.print(5, true, true);
        printer.checkTonerLevels();
        printer.refill("Black");
        System.out.println("");
        printer.print(15, true, false);
        printer.checkTonerLevels();
        printer.refill();
        System.out.println("");
    }
}
