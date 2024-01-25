public class ZombiePlant {

    private int maxPotency;
    private int treatmentsNeeded;

    public ZombiePlant(int maxPotency, int treatmentsNeeded) {

        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;

    }

    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }

    public boolean isDangerous() {

        return treatmentsNeeded > 0;

    }

    public void treat(int potency) {

        if(potency <= maxPotency && potency > 0) {

            treatmentsNeeded--;

        } else if (potency > maxPotency){

            treatmentsNeeded++;

        }

        if(treatmentsNeeded < 0) {

            treatmentsNeeded = 0;

        }

    }

}
