# Chain of Responsibility – Tech Support Request Handler

 Overview
This task simulates a tech support system where user issues are passed through multiple support levels. It's a practical implementation of the Chain of Responsibility behavioral design pattern.

Each handler in the chain (FAQ Bot → Junior Support → Senior Support) checks if it can handle the issue. If not, it passes it to the next handler.

 Key Concepts
Handlers work independently but pass requests along the chain.

Promotes loose coupling between sender and receiver.

Makes support logic more flexible and maintainable.

 Tech Stack
Java (OOP principles)

Abstract classes & method overriding


# Command Pattern – Smart Home Remote Control

 Overview
This task models a remote control for smart home devices using the Command design pattern. Each button press triggers a command, which encapsulates the actual logic of a device action like turning on lights or changing the thermostat.

The remote doesn't know how each device works — it just executes commands.

 Key Concepts
Encapsulates a request as an object (Command).

Supports undo/redo functionality.

Decouples the invoker (remote) from the receiver (device).

 Tech Stack
Java (OOP, interface-based design)

Command pattern architecture

Simple undo logic

