package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

   mvc (new Multiplicacao());
   mvc (new Divisao());
   mvc (new Soma());
   mvc (new Subtracao());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
