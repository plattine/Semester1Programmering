package Lesson17.GuineaFarm.util;

import Lesson17.GuineaFarm.model.GuineaPig;

import java.util.Comparator;

class AgeComparator implements Comparator<GuineaPig> {
        @Override
        public int compare(GuineaPig g1, GuineaPig g2) {
            return Integer.compare(g1.getAge(), g2.getAge());
        }
}
