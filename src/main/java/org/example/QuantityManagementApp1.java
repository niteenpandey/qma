package org.example;

import java.util.Objects;

public class QuantityManagementApp1 {

    public static void main(String[] args) {
     Feet feet1 = new Feet(1);
     Feet feet2 = new Feet(2);

        System.out.println("feet1 adn feet 2 are similar ? "+Feet.comapiarToObj(feet1,feet2));

    }

    static class Feet{

        private double feet;

        public Feet(double feet) {
            this.feet = feet;
        }

        public void setFeet(double feet) {
            this.feet = feet;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o){
                return true;
            }

            if (o == null || getClass() != o.getClass()) return false;

            Feet feet1 = (Feet) o;
            return Double.compare(feet, feet1.feet) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(feet);
        }

        public static boolean comapiarToObj(Feet ft1,Feet ft2){
            return ft1.equals(ft2);

        }
    }

}
