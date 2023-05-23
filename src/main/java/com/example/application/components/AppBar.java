package com.example.application.components;

import com.example.application.utilities.Gap;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class AppBar extends Header {

    private Layout start;
    private Layout middle;
    private Layout end;

    public AppBar(Component... components) {
        addClassNames(LumoUtility.Background.BASE, LumoUtility.Display.FLEX, LumoUtility.Height.XLARGE, LumoUtility.Padding.Horizontal.MEDIUM);

        this.start = new Layout();
        this.start.setAlignItems(FlexComponent.Alignment.CENTER);
        this.start.setGap(Gap.LARGE);

        this.middle = new Layout();
        this.middle.setAlignItems(FlexComponent.Alignment.CENTER);
        this.middle.setFlexGrow(1, this.middle);

        this.end = new Layout();
        this.end.setAlignItems(FlexComponent.Alignment.CENTER);
        this.end.setGap(Gap.SMALL);

        add(this.start, this.middle, this.end);

        addToStart(components);
    }

    public void addToStart(Component... components) {
        this.start.add(components);
    }

    public void addToMiddle(Component... components) {
        this.middle.add(components);
    }

    public void addToEnd(Component... components) {
        this.end.add(components);
    }

}