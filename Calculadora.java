public class Calculadora {
    double num1;
    double num2;
    
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void somar() {
        System.out.println("A soma dos números é = "+(num1 + num2));
    }
    public void subtracao() {
        System.out.println("A subtração dos números é = "+(num1 - num2));
    }
    public void multi() {
        System.out.println("A multi dos números é = "+(num1 * num2));
    }
    public void divisao() {
        System.out.println("A divisão dos números é = "+(num1 / num2));
    }
}
