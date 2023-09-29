public class App {
    public App(double real, double imag){

    
    
  
    // Ввод и вывод в консоль двух комплексных чисел 
    Complex complexReal = new Complex( 1.0, 2.0 );
    Complex complexImag = new Complex( 3.0, 4.0 );

    System.out.println("complexReal = " + complexReal.toString());
    System.out.println("complexImag = " + complexImag.toString()); 


    // Вывод операций 
    Complex complexSum = complexReal.Sum(complexImag);
    System.out.println("Complex complexReal + complexImag = " + complexSum.toString());
    Complex complexMult = complexReal.Mult(complexImag);
     System.out.println("Complex complexReal* complexImag = " + complexMult.toString()); 
    Complex complexDevisRes = complexReal.DevisRes(complexImag); 
     System.out.println("Complex complexReal / complexImag = " + complexDevisRes.toString());
     } 
                                        
    }
