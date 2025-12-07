package setterandgetters;

public class Booleansettersandgetters
{


        private boolean isActive;  // boolean field

        // Setter method
        public void setActive(boolean active) {
            this.isActive = active;
        }

        // Getter method
        public boolean isActive() {
            return this.isActive;
        }


        public static void main(String[] args) {
            Booleansettersandgetters s1 = new Booleansettersandgetters();

            // Use setter to set value
            s1.setActive(true);

            // Use getter to print the value
            System.out.println("Is student active? " + s1.isActive());
        }
    }


