

public class Calculator implements iCalculable{

    public Calculator() {
//  метод сложения комплексных чисел
     public Complex Sum(Complex complexImag){
        Complex sum = new Complex();
        sum.real = real + complexImag.real;
        sum.imag = imag + complexImag.imag;
        return (sum);
    }

// метод умножения комплексных чисел
    public Complex Multi(Complex complexImag) {
        Complex multi = new Complex();
        multi.real = real * complexImag.real - imag *complexImag.imag;
        multi.imag = imag * complexImag.real + real * complexImag.imag;
        return (multi);
    }
//  метод деления комплексных чисел
    public Complex DevisRes(Complex complexImag){
    Complex devisRes = new Complex();
     double dR, dDen; 
     double real;
    if(Math.abs(complexImag.real ) >= Math.abs(complexImag.imag )) { 
        dR = complexImag.imag/complexImag.real;
        dDen = complexImag.real + dR*complexImag.imag; 
        devisRes.real = (real + dR*imag)/dDen;
        devisRes.imag = (imag - dR*real)/dDen;
     }
      else 
      { 
        dR = complexImag.real/complexImag.imag; 
        dDen = complexImag.imag + dR*complexImag.real; 
        devisRes.real = (dR*real + imag)/dDen;
         devisRes.imag = (dR*imag - real)/dDen;
         }
          return (devisRes);
    

        }   
    
    }

  
}

