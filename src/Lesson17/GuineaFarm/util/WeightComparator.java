package Lesson17.GuineaFarm.util;


import Lesson17.GuineaFarm.model.GuineaPig;

import java.util.Comparator;

    // Comparator to sort fish by weight
    public class WeightComparator implements Comparator<GuineaPig> {
        @Override
        public int compare(GuineaPig g1, GuineaPig g2) {
            return Double.compare(g1.getWeight(), g2.getWeight());
        }

}
