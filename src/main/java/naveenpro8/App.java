package naveenpro8;

public class App 
{
    public static void main( String[] args )
     {
     Object chatServer = null;//from w w w.  j  ava  2  s.  c  o  m

    try {
      call("Hello, how are you?");
    } catch (MyException e) {
      System.out.println("Caught a connection unavailable Exception!");
    }

    disconnectChatServer(chatServer);
  }

  private static void disconnectChatServer(Object chatServer) {
    throw new Myexception2("Chat server is empty");
  }

  private static void call(String chatMessage)
      throws MyException {
    throw new MyException("Can't find the chat server");
  }

}

class MyException extends Exception {
  MyException(String message) {
    super(message);
  }
}

class Myexception2 extends RuntimeException {
  Myexception2(String message) {
    super(message);
  }
}
