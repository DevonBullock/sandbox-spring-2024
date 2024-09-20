package org.example.sandbox.inheritance;

public class GrandCherokee extends Jeep {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GrandCherokee{");
        sb.append("gasMileage=").append(gasMileage);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void Transport() {

    }
}
