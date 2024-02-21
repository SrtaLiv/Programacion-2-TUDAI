package CLASES.CLASE3;
    public class Rectangulo extends Figura{
        //YA LO RECIBE
        //private String nombre;
        private int lado1;
        private int lado2;

        public Rectangulo(int l1, int l2) {
            //nombre = "Rectangulo";
            this.setNombre("Rectangulo");
            lado1 = l1;
            lado2 = l2;
        }

        public int getLado1() {
            return lado1;
        }

        public void setLado1(int lado1) {
            this.lado1 = lado1;
        }

        public int getLado2() {
            return lado2;
        }

        public void setLado2(int lado2) {
            this.lado2 = lado2;
        }

        public double getArea() {
            return lado1*lado2;
        }

        public double getPerimetro() {
            return lado1*2+lado2*2;
        }


}
