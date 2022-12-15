/*
 * MenuException.java
 * This class contains syntax errors.
 */
public class MenuException extends Exception
  {
    public MenuException(String choice)
    {
      super(choice);
    }
  }