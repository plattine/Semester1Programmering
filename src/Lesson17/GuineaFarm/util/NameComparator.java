package Lesson17.GuineaFarm.util;

import Lesson17.GuineaFarm.model.GuineaPig;

import java.util.Comparator;


public class NameComparator {

    class NameComparator implements Comparator<GuineaPig> {
        @Override
        public int compare(GuineaPig g1, GuineaPig g2) {
            return String.compare(g1.getName(), g2.getName());
        }
}
