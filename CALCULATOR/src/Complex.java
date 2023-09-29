public class Complex {

    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real = real; // действительное число
        this.imag = imag;// мнимое
    }
        public String toString() {
            if (imag >= 0) {
                return real + "+" + imag + "i";

            }
             else
             {
                return real + "-" + -imag + "i";
            }

        
    }
}
