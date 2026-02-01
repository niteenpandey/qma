package org.example;

import java.util.Objects;

public class QuantityManagementApp {

    public static void main(String[] args) {
     Feet feet1 = new Feet(1);
     Feet feet2 = new Feet(1);


    }

    private static class Feet{

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
    }

}
