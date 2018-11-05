/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hybriddeduplication;

/**
 *
 * @author ETPL7
 */
import hybriddeduplication.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import net.proteanit.sql.DbUtils;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

/**
 * A simple demonstration application showing how to create a bar chart.
 *
 */
public class BarChartDemo_1 extends ApplicationFrame {
    public static String val;
   public static ArrayList<Integer> ar1=new ArrayList<Integer>();
   /* void enc(){
        try{
            File f=new File("./doc2.txt");
            System.out.println(f.length());
            File f1=new File("./doc2.txt.ENC");
           // System.out.println(f1.length());
            
        }catch(Exception e){}
    }*/
   public static long a1=AlgorithmComp.x;
   public static long a2=AlgorithmComp.y;
   
    /**
     * Creates a new demo instance.
     *
     * @param title  the frame title.
     */
    public BarChartDemo_1(final String title) {

        super(title);

        final CategoryDataset dataset = createDataset();
        final JFreeChart chart = createChart(dataset);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));
        setContentPane(chartPanel);

    }

    /**
     * Returns a sample dataset.
     * 
     * @return The dataset.
     */
    public static int cc;
    public static int cc1;
    private CategoryDataset createDataset() {
        
        // row keys...
        final String series1 = "DES";
        final String series2 = "AES";
        final String series3 = "Third";
        
 
           // File f=new File("./doc2.txt");
         
       //   System.out.println(c);
          
           
           //System.out.println(c1);
           
       
        // column keys...
        final String category1 = "DES";
        final String category2 = "AES";
      /*  final String category3 = "Packet3";
        final String category4 = "Packet4";
        final String category5 = "Packet5";
         final String category6 = "Packet6";
          final String category7 = "Packet7";
           final String category8 = "Packet8";
            /*final String category9 = "s9";
             final String category10 = "s10";*/

        // create the dataset...
        Connection conn;
ResultSet rs;
PreparedStatement pst;
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(a1, series1, category1);
        dataset.addValue(a2, series1, category2);
       
       /*  dataset.addValue(605231%10, series1, category9);
         dataset.addValue(563431%10, series1, category10);*/

      //  dataset.addValue(5.0, series2, category1);
       // dataset.addValue(7.0, series2, category2);
        //dataset.addValue(6.0, series2, category3);//
      // dataset.addValue(8.0, series2, category4);
       // dataset.addValue(4.0, series2, category5);

        //dataset.addValue(4.0, series3, category1);
        //dataset.addValue(3.0, series3, category2);
        //dataset.addValue(2.0, series3, category3);
        //dataset.addValue(3.0, series3, category4);
        //dataset.addValue(6.0, series, category5);
        
        return dataset;
      
    }
    
    /**
     * Creates a sample chart.
     * 
     * @param dataset  the dataset.
     * 
     * @return The chart.
     */
    private JFreeChart createChart(final CategoryDataset dataset) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Algorithm Comparision",         // chart title
            "",               // domain axis label
            "Block Size",                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.red, 
            0.0f, 0.0f, Color.lightGray
        );
        renderer.setSeriesPaint(0, gp0);
        renderer.setSeriesPaint(1, gp1);
        renderer.setSeriesPaint(2, gp2);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.
        
        return chart;
        
    }
    
    // ****************************************************************************
    // * JFREECHART DEVELOPER GUIDE                                               *
    // * The JFreeChart Developer Guide, written by David Gilbert, is available   *
    // * to purchase from Object Refinery Limited:                                *
    // *                                                                          *
    // * http://www.object-refinery.com/jfreechart/guide.html                     *
    // *                                                                          *
    // * Sales are used to provide funding for the JFreeChart project - please    * 
    // * support us so that we can continue developing free software.             *
    // ****************************************************************************
    
    /**
     * Starting point for the demonstration application.
     *
     * @param args  ignored.
     */
    public static void main(final String[] args) {

        final BarChartDemo_1 demo = new BarChartDemo_1("Bar Chart Demo");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);
        

 }

}