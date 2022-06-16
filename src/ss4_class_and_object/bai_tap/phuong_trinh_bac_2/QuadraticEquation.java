package ss4_class_and_object.bai_tap.phuong_trinh_bac_2;


    class QuadraticEquation{
        double a, b,c;
        public QuadraticEquation() {
        }
        public QuadraticEquation(double a, double b, double c){
                this.a = a;
                this.b = b;
                this.c = c;
            }

        public double getA() {
            return a;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getB() {
            return b;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getC() {
            return c;
        }

        public void setC(double c) {
            this.c = c;
        }
        public double getDiscriminant(){
            return (this.b*this.b + 4*this.a*this.c);
        }
        public double getRoot1(){
            return (-this.b + Math.sqrt(getDiscriminant()))/(this.a/2);
        }
        public double getRoot2(){
            return (-this.b - Math.sqrt((getDiscriminant())))/(this.a/2);
        }
        public String disPlay(){
            return a+ "X2 +" + b + "X +"+ c + "=0";
        }
    }
