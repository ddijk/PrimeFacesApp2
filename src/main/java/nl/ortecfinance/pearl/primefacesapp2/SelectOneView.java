package nl.ortecfinance.pearl.primefacesapp2;

import javax.enterprise.inject.Model;

@Model
public class SelectOneView {

    private ChartValueType option;

    public ChartValueType getOption() {
        return option;
    }

    public void setOption(ChartValueType option) {
        System.out.println("Set option to " + option);
        this.option = option;
    }
}
