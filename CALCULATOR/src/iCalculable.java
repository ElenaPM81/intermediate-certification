public interface iCalculable {
    Calculator Sum(double real, double imag);
    Calculator Multi(double real, double imag);
    Calculator DevisRes(double real, double imag);
    

    double getResult();
}