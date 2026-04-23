# Builder Design Pattern

The **Builder** pattern is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

> [!NOTE]
> **Implementation Note:** In this project, we do not implement the Builder pattern manually as a practice exercise. In modern Java development, the Builder pattern is typically generated automatically using the **Lombok** library via the `@Builder` annotation. This approach significantly reduces boilerplate code and makes generating a builder extremely simple.

## 🎯 Purpose

Imagine a complex object that requires laborious, step-by-step initialization of many fields and nested objects. Such initialization code is usually buried inside a monstrous constructor with lots of parameters. Or even worse: scattered all over the client code. The Builder pattern extracts the object construction code out of its own class and moves it to separate objects called builders.
## 🏗️ Structure and Mechanics

In Java, implementing the Builder pattern manually requires creating a nested static class (the Builder) with methods to set each field, which return the builder itself for method chaining, and finally a `build()` method to instantiate the product object.

By using Lombok's `@Builder`, all of this boilerplate is generated at compile time, allowing you to use the builder pattern seamlessly without having to write or maintain the builder class yourself.

## ✅ Advantages

* You can construct objects step-by-step, defer construction steps or run steps recursively.
* You can reuse the same construction code when building various representations of products.
* **Single Responsibility Principle:** You can isolate complex construction code from the business logic of the product.

## ❌ Disadvantages

* The overall complexity of the code increases since the pattern requires creating multiple new classes (unless mitigated by tools like Lombok).
