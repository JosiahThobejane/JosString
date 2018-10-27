# JosString
A Java class library with the ability to reverse any String.

### How To Use JosString
  - Download the ```JosString.jar``` file [Here](https://github.com/JosiahThobejane/JosString/releases/download/v1.0-beta/JosString.jar).
  - Import the JosString file to your Java project.
  - To use it, your need to import it into your class like: ``` import static co.za.josiahthobejane.JosString.reverse; ```
  
  ###### Since reverse() is static, you don't have to instantiate a JosString object
  e.g 
  
    import static co.za.josiahthobejane.JosString.reverse;
    
    public class HelloWorld
    {
      public void static main(String[] args)
      {
        System.out.println("Reversed Hello World: " + reverse("HelloWorld") );
      }
    }
  
  ---
  > Author: [Josiah Thobejane](https://twitter.com/josiahthobejane)
