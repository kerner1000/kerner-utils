package net.sf.kerner.utils.math;

public interface StatisticsDescriptiveGaussianDistribution extends StatisticsDescriptive {

    double getStandardDeviation();

    double getStandardErrorOfMean();

    double getVariance();
}
