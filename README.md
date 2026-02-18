# Coding Kata Java

Small exercises that give you challenges to explore the Java-language and its frameworks.

## How to get started

### Clone this repository

Use your preferred way to obtain the code.
* **Download a zip** to work locally or for adding the code to your own CVS
* **Fork** to add it to your own git repository, and to get upstream updates if you want
* **Cloning** if you want to be able to pull updates, but you can not push your own commits

### Build the code with maven

* Most IDEs know how to do this
* Or just use your terminal if you prefer that

### Select an exercise folder that you want to work with

They have a standard layout
```
...\[kata suite]
 |-\src
    |-\main <-- this is where you find the code to implement
    |-\test <-- this is where you find the Test-classes, on for each kata
```

Each "kata category" can be build and run on its own.

### Run the tests to see what is expected to happen

* Use your IDE to run the tests in the "kata category" that you are working on
* Or the terminal by using ```mvn test```

### Implement the code to see that the tests are green

Navigate to the class that the Test-class is testing, and implement the code to make the test go green.
