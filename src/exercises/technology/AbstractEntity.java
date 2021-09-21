package exercises.technology;

public abstract class AbstractEntity {

    //TO DO: Consider the group of classes that you designed.
    // Suppose you had a web program that used these classes,
    // and you needed to assign a unique ID to every object created from one of these classes within the application.
    // Therefore, each such class should have an Id property,
    // and no two objects created from any of the classes may have the same value for Id.
    // Create an abstract class, AbstractEntity, that contains the behavior for assigning and accessing such a unique ID for each class that extends it.
    // Add this class to your program above, and add AbstractEntity to the class hierarchy in the correct place.

    public AbstractEntity() {

    }

    public boolean checkID (){
        if (Laptop.specificID == SmartPhone.specificID){
            return false;
        }
        else {
            return true;
        }
    }
}
