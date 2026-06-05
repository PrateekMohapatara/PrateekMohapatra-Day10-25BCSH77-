1)Explain Java Exception hierarchy:

Throwable → if we have a certain kind of condition or say error that we know might happen then we throw accordingly
Exception → during execution might or say is a possibility that code will not execute
Error → the point of concern 
Hierarchy will be error(detect it) → Throwable(throw that codition) → Exception(catch it create its alternative)



2)Can we have multiple catch blocks?
Explain with example when it is useful.
ANS : yes we can multiple catch blocks.
EX :  Let we concern about banking system so it will be like ,

        try{
        code accordingly ...
        }
      catch (InputMismatchException e) { // if credentials dont match
            System.out.println("Invalid Input");
        }

        catch (IllegalArgumentException e) { //if invalid credentials
            System.out.println("Invalid Input");
        }

        catch (ArithmeticException e) { // if withdrawal amount is greater than bank balance
            System.out.println("Insufficient Balance");
        }

3)A program crashes when user enters text instead of number.

What exception occurs?

How will you handle it?

Where should try-catch be placed?
ANS : inside we will input our details
        exception will in input mis match(InputMismatchException)
        java will automatically run it if it detects error in input

4)try {
    int a = 10 / 0;
    
    System.out.println("Hello");

}

catch(Exception e) {

    System.out.println("Error handled");

}

System.out.println("End");

Predict the output - 

What prints first?

Does program stop?
ANS : fisrt Error handled will print because at first statement for try error is their so its below code will not execute . programm will stop after print error



