# Prototype Design Pattern

The **Prototype** pattern is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

> [!NOTE]
> **Implementation Note:** In this project, we do not implement the Prototype pattern manually as a practice exercise. Java provides built-in, native support for this pattern through the `Cloneable` interface and the `Object.clone()` method, making a custom implementation unnecessary in most standard scenarios.

## 🎯 Purpose

When we have an already configured object and we want to create an exact copy of it, we normally have to instantiate a new object of the same class and copy the values of all its fields one by one. However, this presents serious problems:
1. Some fields may be private and inaccessible from outside the object itself.
2. The client code performing the copy becomes tightly coupled to the concrete class of the object.
3. If the object belongs to a class hierarchy and we only know its interface or base class, it's impossible to know which concrete class to instantiate.

The Prototype pattern delegates the cloning process to the actual objects that are being cloned.

## 🏗️ Structure and Mechanics

In Java, this pattern is natively implemented by leveraging the `Cloneable` interface. By implementing `Cloneable` and overriding the `clone()` method from the `Object` class, any object can return an exact copy of itself.

## ✅ Advantages

* **Decoupling:** You can clone objects without coupling to their concrete classes.
* **Elimination of repetitive initialization code:** You can clone pre-configured objects (prototypes) instead of initializing them from scratch each time.
* **Flexibility:** You can add new types of prototypes at runtime.
* **Alternative to deep inheritance:** Provides an alternative to creating subclasses just to pre-configure complex objects.

## ❌ Disadvantages

* Cloning complex objects that have **circular references** can be very complicated (requires implementing deep cloning or *Deep Copy* instead of a simple *Shallow Copy*).

## 🌍 Real-World Use Cases

1. **Games:** Cloning generic enemies in a level. Instead of building a "Level 50 Orc with golden armor" from scratch, a prototype is configured once and the "Spawner" simply clones it, multiplying the enemies on the screen.
2. **Graphic Editors:** When the user chooses to copy/paste a shape (rectangle, circle, group of shapes), the editor invokes the `clone()` method on the `Shape` interface of the selected shape.
3. **Java Core:** The `Object.clone()` method in Java is the native implementation of this pattern. Collections like `ArrayList` implement this method to duplicate lists.
