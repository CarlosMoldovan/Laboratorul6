# Project README

## Description of the Operations Class

The `Manager` class is part of this project, and it is responsible for handling user input and displaying messages. The class interacts with the `CititorTastatura` class to achieve its functionality.

### `Manager` Class

The `Manager` class contains the following methods:

#### `Manager(CititorTastatura cititor)`

Constructor that takes an instance of the `CititorTastatura` class as a parameter to initialize its behavior.

#### `String afiseazaMesaj()`

This method returns the message stored in the `cool_message` field.

#### `String citesteMesaj()`

This method reads a message from the user via the keyboard and stores it in the `cool_message` field.

### `CititorTastatura` Class

The `CititorTastatura` class handles reading input from the keyboard. It is used by the `Manager` class to read user input.

#### `CititorTastatura(String message, String source)`

Constructor that takes two strings, `message` and `source`, as parameters to initialize the class.

#### `void citesteTastatura()`

This method reads a line of text from the keyboard and stores it in the `message` field.

## Usage

To use these classes in your project, you can follow the example in the `Main` class provided below:

```java
package lab6;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the CititorTastatura class
        CititorTastatura cititorTastatura = new CititorTastatura(null, null);

        // Create an instance of the Manager class and provide the CititorTastatura instance as a parameter
        Manager manager = new Manager(cititorTastatura);

        // You can now use the manager object to read and display messages
        System.out.println("Enter a message:");
        manager.citesteMesaj();
        System.out.println("The entered message is: " + manager.afiseazaMesaj());
    }
}
