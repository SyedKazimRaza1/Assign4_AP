# Assign4_AP  
Creational design patterns
These design patterns are all about class instantiation. This pattern can be further divided into class-creation patterns and object-creational patterns. While class-creation patterns use inheritance effectively in the instantiation process, object-creation patterns use delegation effectively to get the job done.

Example of Abstract Factory
Abstract Factory
Creates an instance of several families of classes
Builder
Separates object construction from its representation
Factory Method
Creates an instance of several derived classes
Object Pool
Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
Prototype
A fully initialized instance to be copied or cloned
Singleton
A class of which only a single instance can exist

# Singleton pattern

Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

Implementation
We're going to create a SingleObject class. SingleObject class have its constructor as private and have a static instance of itself.

SingleObject class provides a static method to get its static instance to outside world. SingletonPatternDemo, our demo class will use SingleObject class to get a SingleObject object.
