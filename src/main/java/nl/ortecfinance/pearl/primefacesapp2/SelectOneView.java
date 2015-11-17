package nl.ortecfinance.pearl.primefacesapp2;

import javax.enterprise.inject.Model;

@Model
public class SelectOneView {

    private String option;

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        System.out.println("Set option to " + option);
        this.option = option;
    }
}
